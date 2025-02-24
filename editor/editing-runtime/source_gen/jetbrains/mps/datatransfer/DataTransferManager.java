package jetbrains.mps.datatransfer;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRegistryListener;
import jetbrains.mps.smodel.language.LanguageRegistry;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.openapi.actions.descriptor.CopyPreProcessor;
import jetbrains.mps.openapi.actions.descriptor.PastePostProcessor;
import jetbrains.mps.openapi.actions.descriptor.PasteWrapper;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.smodel.language.LanguageRuntime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Iterator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.function.Consumer;
import jetbrains.mps.openapi.actions.descriptor.ActionAspectDescriptor;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;

public final class DataTransferManager implements LanguageRegistryListener {

  /**
   * TODO In fact, it is an editor component. When editor components will be introduced, implement initialization in proper way.
   */
  private static DataTransferManager INSTANCE = new DataTransferManager(LanguageRegistry.getInstance());

  private LanguageRegistry myLanguageRegistry;

  private final Map<SAbstractConcept, CopyPreProcessor> myCopyPreProcessors;
  private final Map<SAbstractConcept, PastePostProcessor> myPastePostProcessors;
  private final Map<SAbstractConcept, Map<SAbstractConcept, PasteWrapper>> myPasteWrappers;
  private boolean myLoaded;

  public DataTransferManager(LanguageRegistry languageRegistry) {
    myLanguageRegistry = languageRegistry;
    myCopyPreProcessors = MapSequence.fromMap(new HashMap<SAbstractConcept, CopyPreProcessor>());
    myPastePostProcessors = MapSequence.fromMap(new HashMap<SAbstractConcept, PastePostProcessor>());
    myPasteWrappers = MapSequence.fromMap(new HashMap<SAbstractConcept, Map<SAbstractConcept, PasteWrapper>>());
    myLoaded = false;
    languageRegistry.addRegistryListener(this);
  }

  public static DataTransferManager getInstance() {
    return INSTANCE;
  }

  @Override
  public void afterLanguagesLoaded(Iterable<LanguageRuntime> iterable) {
    // nop. cache will be builded lazily 
  }

  @Override
  public void beforeLanguagesUnloaded(Iterable<LanguageRuntime> iterable) {
    myLoaded = false;
    MapSequence.fromMap(myCopyPreProcessors).clear();
    MapSequence.fromMap(myPastePostProcessors).clear();
    MapSequence.fromMap(myPasteWrappers).clear();
  }

  public void preProcessNode(SNode copy, Map<SNode, SNode> copyToOriginalMap) {
    CopyPreProcessor preProcessor = getCopyPreProcessor(SNodeOperations.getConcept(copy));
    if (preProcessor != null) {
      preProcessor.preProcessNode(copy, MapSequence.fromMap(copyToOriginalMap).get(copy));
      return;
    }

    for (SNode copyChild : ListSequence.fromList(SNodeOperations.getChildren(copy))) {
      preProcessNode(copyChild, copyToOriginalMap);
    }
  }

  /**
   * 
   * @deprecated Do not use it if children in {@code copy} and {@code original} may differ (E.g. when not all attributes has been copied). Use {@link jetbrains.mps.datatransfer.DataTransferManager#preProcessNode(SNode, Map<SNode, SNode>) } instead.
   */
  @Deprecated
  public void preProcessNode(SNode copy, SNode original) {
    CopyPreProcessor preProcessor = getCopyPreProcessor(SNodeOperations.getConcept(copy));
    if (preProcessor != null) {
      preProcessor.preProcessNode(copy, original);
      return;
    }

    Iterator<SNode> originalChildrenIterator = ListSequence.fromList(SNodeOperations.getChildren(original)).iterator();
    Iterator<SNode> copyChildrenIterator = ListSequence.fromList(SNodeOperations.getChildren(copy)).iterator();
    while (originalChildrenIterator.hasNext()) {
      preProcessNode(copyChildrenIterator.next(), originalChildrenIterator.next());
    }
  }


  public void postProcessNode(SNode pastedNode) {
    PastePostProcessor postProcessor = getPastePostProcessor(SNodeOperations.getConcept(pastedNode));
    if (postProcessor != null) {
      postProcessor.postProcessNode(pastedNode);
      return;
    }

    for (SNode pastedChild : ListSequence.fromList(SNodeOperations.getChildren(pastedNode))) {
      postProcessNode(pastedChild);
    }
  }

  public boolean canWrapInto(SNode node, SAbstractConcept targetConcept) {
    return getPasteWrapper(SNodeOperations.getConcept(node), targetConcept) != null;
  }

  public SNode wrapInto(SNode node, SAbstractConcept targetConcept) {
    PasteWrapper pasteWrapper = getPasteWrapper(SNodeOperations.getConcept(node), targetConcept);

    if (pasteWrapper != null) {
      SNode newNode = pasteWrapper.wrap(node);
      SNodeOperations.deleteNode(newNode);
      return newNode;
    }
    return null;
  }

  private CopyPreProcessor getCopyPreProcessor(SAbstractConcept concept) {
    buildCache();
    return MapSequence.fromMap(myCopyPreProcessors).get(concept);
  }

  private PastePostProcessor getPastePostProcessor(SAbstractConcept concept) {
    buildCache();
    return MapSequence.fromMap(myPastePostProcessors).get(concept);
  }

  private PasteWrapper getPasteWrapper(SAbstractConcept source, SAbstractConcept target) {
    buildCache();
    Map<SAbstractConcept, PasteWrapper> wrappers = MapSequence.fromMap(myPasteWrappers).get(target);
    for (SAbstractConcept src : ListSequence.fromList(SConceptOperations.getAllSuperConcepts(source, true))) {
      PasteWrapper pasteWrapper = MapSequence.fromMap(wrappers).get(src);
      if (pasteWrapper != null) {
        return pasteWrapper;
      }
    }
    return null;
  }

  public void buildCache() {
    if (myLoaded) {
      return;
    }
    myLoaded = true;
    myLanguageRegistry.withAvailableLanguages(new Consumer<LanguageRuntime>() {
      public void accept(LanguageRuntime lang) {
        ActionAspectDescriptor actionAscpect = lang.getAspect(ActionAspectDescriptor.class);
        if (actionAscpect == null) {
          return;
        }
        for (CopyPreProcessor copyPreProcessor : CollectionSequence.fromCollection(actionAscpect.getCopyPreProcessors())) {
          MapSequence.fromMap(myCopyPreProcessors).put(copyPreProcessor.getApplicableConcept(), copyPreProcessor);
        }
        for (PastePostProcessor pastePostProcessor : CollectionSequence.fromCollection(actionAscpect.getPastePostProcessors())) {
          MapSequence.fromMap(myPastePostProcessors).put(pastePostProcessor.getApplicableConcept(), pastePostProcessor);
        }
        for (PasteWrapper pasteWrapper : CollectionSequence.fromCollection(actionAscpect.getPasteWrappers())) {
          if (!(MapSequence.fromMap(myPasteWrappers).containsKey(pasteWrapper.getTargetConcept()))) {
            MapSequence.fromMap(myPasteWrappers).put(pasteWrapper.getTargetConcept(), MapSequence.fromMap(new HashMap<SAbstractConcept, PasteWrapper>()));
          }
          MapSequence.fromMap(MapSequence.fromMap(myPasteWrappers).get(pasteWrapper.getTargetConcept())).put(pasteWrapper.getSourceConcept(), pasteWrapper);
        }
      }
    });
  }
}
