package jetbrains.mps.lang.structure.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import jetbrains.mps.smodel.LanguageAspect;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.module.SModule;
import java.util.Set;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.util.Pair;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.util.annotation.ToRemove;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.kernel.model.SModelUtil;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.module.SModuleId;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.smodel.search.ConceptAndSuperConceptsCache;
import java.util.LinkedHashSet;
import java.util.Objects;
import jetbrains.mps.smodel.adapter.MetaAdapterByDeclaration;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class AbstractConceptDeclaration__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  /*package*/ static final SMethod<SModel> getAspectModel_id7g4OXB0yli3 = new SMethodBuilder<SModel>(new SJavaCompoundTypeImpl((Class<SModel>) ((Class) Object.class))).name("getAspectModel").modifiers(SModifiersImpl.create(0, AccessPrivileges.PRIVATE)).concept(CONCEPT).id("7g4OXB0yli3").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(LanguageAspect.class, ""));
  public static final SMethod<List<SNode>> findConceptAspectCollection_id1n18fON7w20 = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("findConceptAspectCollection").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1n18fON7w20").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(LanguageAspect.class, ""));
  public static final SMethod<SNode> findConceptAspect_id7g4OXB0ykew = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("findConceptAspect").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7g4OXB0ykew").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(LanguageAspect.class, ""));
  public static final SMethod<Void> setLanguageIdFromModule_id7NTi8jM8SJY = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("setLanguageIdFromModule").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7NTi8jM8SJY").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(SModule.class, ""));
  public static final SMethod<SNode> findConceptAspect_id7g4OXB0yku$ = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("findConceptAspect").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7g4OXB0yku$").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SModel>) ((Class) Object.class), ""));
  public static final SMethod<Void> findConceptAspectCollection_id7g4OXB0yl26 = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("findConceptAspectCollection").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7g4OXB0yl26").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SModel>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<List<SNode>>) ((Class) Object.class), ""));
  public static final SMethod<Iterable<SNode>> findConceptAspects_id4G9PD8$NvPM = new SMethodBuilder<Iterable<SNode>>(new SJavaCompoundTypeImpl((Class<Iterable<SNode>>) ((Class) Object.class))).name("findConceptAspects").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4G9PD8$NvPM").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SModel>) ((Class) Object.class), ""));
  public static final SMethod<List<SNode>> findGeneratorFragments_id5zMz2aJEI4B = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("findGeneratorFragments").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5zMz2aJEI4B").registry(REGISTRY).build();
  public static final SMethod<String> getPresentation_id280s3ZNTXNS = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getPresentation").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("280s3ZNTXNS").registry(REGISTRY).build();
  public static final SMethod<List<SNode>> getAvailableConceptMethods_idhEwILGo = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getAvailableConceptMethods").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwILGo").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<Iterable<SNode>> getVisibleConceptMethods_idwrIPXhfIPX = new SMethodBuilder<Iterable<SNode>>(new SJavaCompoundTypeImpl((Class<Iterable<SNode>>) ((Class) Object.class))).name("getVisibleConceptMethods").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("wrIPXhfIPX").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<List<SNode>> getVirtualConceptMethods_idhEwILHM = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getVirtualConceptMethods").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwILHM").registry(REGISTRY).build();
  public static final SMethod<List<SNode>> getNotImplementedConceptMethods_idhEwILIz = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getNotImplementedConceptMethods").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwILIz").registry(REGISTRY).build();
  public static final SMethod<SNode> findLinkDeclaration_idhEwILKz = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("findLinkDeclaration").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwILKz").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""));
  public static final SMethod<List<SNode>> getLinkDeclarations_idhEwILKK = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getLinkDeclarations").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwILKK").registry(REGISTRY).build();
  public static final SMethod<List<SNode>> getReferenceLinkDeclarations_idhEwILL0 = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getReferenceLinkDeclarations").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwILL0").registry(REGISTRY).build();
  public static final SMethod<List<SNode>> getAggregationLinkDeclarations_idhEwILLp = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getAggregationLinkDeclarations").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwILLp").registry(REGISTRY).build();
  public static final SMethod<List<SNode>> getPropertyDeclarations_idhEwILLM = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getPropertyDeclarations").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwILLM").registry(REGISTRY).build();
  public static final SMethod<SNode> findPropertyDeclaration_idhK3S4A1 = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("findPropertyDeclaration").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hK3S4A1").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""));
  public static final SMethod<Boolean> isSubconceptOf_id73yVtVlWOga = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isSubconceptOf").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("73yVtVlWOga").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<List<SNode>> getImmediateSuperconcepts_idhMuxyK2 = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getImmediateSuperconcepts").modifiers(SModifiersImpl.create(12, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hMuxyK2").registry(REGISTRY).build();
  public static final SMethod<Iterable<SNode>> getAllSuperConcepts_id2A8AB0rAWpG = new SMethodBuilder<Iterable<SNode>>(new SJavaCompoundTypeImpl((Class<Iterable<SNode>>) ((Class) Object.class))).name("getAllSuperConcepts").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2A8AB0rAWpG").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(Boolean.TYPE, ""));
  /*package*/ static final SMethod<Void> collectSuperConcepts_id2A8AB0rB3NH = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("collectSuperConcepts").modifiers(SModifiersImpl.create(0, AccessPrivileges.PRIVATE)).concept(CONCEPT).id("2A8AB0rB3NH").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<Set<SNode>>) ((Class) Object.class), ""));
  public static final SMethod<SNode> computeInHierarchy_id3CiBrVcn5fe = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("computeInHierarchy").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("3CiBrVcn5fe").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<_FunctionTypes._return_P1_E0<? extends SNode, ? super SNode>>) ((Class) Object.class), ""));
  public static final SMethod<Pair<Set<SNode>, Set<SNode>>> getInLanguageAndNotInLanguageAncestors_id54xSEBmK0MK = new SMethodBuilder<Pair<Set<SNode>, Set<SNode>>>(new SJavaCompoundTypeImpl(Pair.class)).name("getInLanguageAndNotInLanguageAncestors").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("54xSEBmK0MK").registry(REGISTRY).build();
  public static final SMethod<Boolean> is_id4MKjpUYmGW0 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("is").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4MKjpUYmGW0").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(SAbstractConcept.class, ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getAspectModel_id7g4OXB0yli3, findConceptAspectCollection_id1n18fON7w20, findConceptAspect_id7g4OXB0ykew, setLanguageIdFromModule_id7NTi8jM8SJY, findConceptAspect_id7g4OXB0yku$, findConceptAspectCollection_id7g4OXB0yl26, findConceptAspects_id4G9PD8$NvPM, findGeneratorFragments_id5zMz2aJEI4B, getPresentation_id280s3ZNTXNS, getAvailableConceptMethods_idhEwILGo, getVisibleConceptMethods_idwrIPXhfIPX, getVirtualConceptMethods_idhEwILHM, getNotImplementedConceptMethods_idhEwILIz, findLinkDeclaration_idhEwILKz, getLinkDeclarations_idhEwILKK, getReferenceLinkDeclarations_idhEwILL0, getAggregationLinkDeclarations_idhEwILLp, getPropertyDeclarations_idhEwILLM, findPropertyDeclaration_idhK3S4A1, isSubconceptOf_id73yVtVlWOga, getImmediateSuperconcepts_idhMuxyK2, getAllSuperConcepts_id2A8AB0rAWpG, collectSuperConcepts_id2A8AB0rB3NH, computeInHierarchy_id3CiBrVcn5fe, getInLanguageAndNotInLanguageAncestors_id54xSEBmK0MK, is_id4MKjpUYmGW0);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  @Deprecated
  @ToRemove(version = 3.3)
  /*package*/ static SModel getAspectModel_id7g4OXB0yli3(@NotNull SNode __thisNode__, LanguageAspect aspect) {
    // [MM] this usage of LanguageAspect is reviewed 
    Language language = SModelUtil.getDeclaringLanguage(__thisNode__);
    if (language == null) {
      return null;
    }
    SModel md = aspect.get(language);
    if (md == null) {
      return null;
    }
    return md;
  }
  @Deprecated
  @ToRemove(version = 3.3)
  /*package*/ static List<SNode> findConceptAspectCollection_id1n18fON7w20(@NotNull SNode __thisNode__, LanguageAspect aspect) {
    // [MM] this usage of LanguageAspect is reviewed 
    List<SNode> result = new ArrayList<SNode>();
    SModel model = AbstractConceptDeclaration__BehaviorDescriptor.getAspectModel_id7g4OXB0yli3.invoke(__thisNode__, aspect);
    AbstractConceptDeclaration__BehaviorDescriptor.findConceptAspectCollection_id7g4OXB0yl26.invoke(__thisNode__, model, result);
    return result;
  }
  @Deprecated
  @ToRemove(version = 3.3)
  /*package*/ static SNode findConceptAspect_id7g4OXB0ykew(@NotNull SNode __thisNode__, LanguageAspect aspect) {
    SModel model = AbstractConceptDeclaration__BehaviorDescriptor.getAspectModel_id7g4OXB0yli3.invoke(__thisNode__, aspect);
    return AbstractConceptDeclaration__BehaviorDescriptor.findConceptAspect_id7g4OXB0yku$.invoke(__thisNode__, model);
  }
  /*package*/ static void setLanguageIdFromModule_id7NTi8jM8SJY(@NotNull SNode __thisNode__, SModule m) {
    SModuleId mid = m.getModuleId();
    assert mid instanceof ModuleId.Regular;
    SPropertyOperations.set(__thisNode__, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x7cf94884f2237423L, "languageId"), ((ModuleId.Regular) mid).getUUID().toString());
  }
  /*package*/ static SNode findConceptAspect_id7g4OXB0yku$(@NotNull SNode __thisNode__, SModel model) {
    if (model == null) {
      return null;
    }
    for (SNode aspectConcept : SModelOperations.roots(model, MetaAdapterFactory.getInterfaceConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x24614259e94f0c84L, "jetbrains.mps.lang.structure.structure.IConceptAspect"))) {
      if ((IConceptAspect__BehaviorDescriptor.getBaseConcept_id2hxg_BDjKM8.invoke(aspectConcept) != null) && IConceptAspect__BehaviorDescriptor.getBaseConcept_id2hxg_BDjKM8.invoke(aspectConcept) == __thisNode__) {
        return aspectConcept;
      }
    }
    return null;
  }
  @Deprecated
  @ToRemove(version = 3.3)
  /*package*/ static void findConceptAspectCollection_id7g4OXB0yl26(@NotNull SNode __thisNode__, SModel model, List<SNode> collection) {
    if (model == null) {
      return;
    }
    for (SNode aspectConcept : SModelOperations.roots(model, MetaAdapterFactory.getInterfaceConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x24614259e94f0c84L, "jetbrains.mps.lang.structure.structure.IConceptAspect"))) {
      if (ListSequence.fromList(IConceptAspect__BehaviorDescriptor.getBaseConceptCollection_id4$$3zrO3UBG.invoke(aspectConcept)).contains(__thisNode__)) {
        ListSequence.fromList(collection).addElement(aspectConcept);
      }
    }
  }
  /*package*/ static Iterable<SNode> findConceptAspects_id4G9PD8$NvPM(@NotNull final SNode __thisNode__, @NotNull SModel model) {
    return ListSequence.fromList(SModelOperations.roots(model, MetaAdapterFactory.getInterfaceConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x24614259e94f0c84L, "jetbrains.mps.lang.structure.structure.IConceptAspect"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return ListSequence.fromList(IConceptAspect__BehaviorDescriptor.getBaseConceptCollection_id4$$3zrO3UBG.invoke(it)).contains(__thisNode__);
      }
    });
  }
  /*package*/ static List<SNode> findGeneratorFragments_id5zMz2aJEI4B(@NotNull SNode __thisNode__) {
    Language language = SModelUtil.getDeclaringLanguage(__thisNode__);
    List<SNode> result = new ArrayList<SNode>();
    if (language == null) {
      return result;
    }
    for (Generator g : language.getGenerators()) {
      for (SModel sd : g.getOwnTemplateModels()) {
        SModel m = sd;
        for (SNode node : ListSequence.fromList(SModelOperations.roots(m, null))) {
          if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0xfe43cb41d0L, "jetbrains.mps.lang.generator.structure.TemplateDeclaration")) && SLinkOperations.getTarget(SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0xfe43cb41d0L, "jetbrains.mps.lang.generator.structure.TemplateDeclaration")), MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0xfe43cb41d0L, 0x1100343ad9eL, "applicableConcept")) == __thisNode__ || SLinkOperations.getTarget(AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11017244494L, "jetbrains.mps.lang.generator.structure.RootTemplateAnnotation"))), MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11017244494L, 0x11017255ccfL, "applicableConcept")) == __thisNode__) {
            ListSequence.fromList(result).addElement(node);
          } else if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0xff0bea0475L, "jetbrains.mps.lang.generator.structure.MappingConfiguration")) || SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10313ed7688L, "jetbrains.mps.lang.generator.structure.TemplateSwitch"))) {
            // generator rules 
            for (SNode r : ListSequence.fromList(SNodeOperations.getNodeDescendants(node, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fc0b64647L, "jetbrains.mps.lang.generator.structure.BaseMappingRule"), false, new SAbstractConcept[]{}))) {
              if (SLinkOperations.getTarget(r, MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fc0b64647L, 0x10fc0b6e730L, "applicableConcept")) == __thisNode__ || (SPropertyOperations.getBoolean(r, MetaAdapterFactory.getProperty(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fc0b64647L, 0x10fc6d8f674L, "applyToConceptInheritors")) && Sequence.fromIterable(AbstractConceptDeclaration__BehaviorDescriptor.getAllSuperConcepts_id2A8AB0rAWpG.invoke(__thisNode__, ((boolean) false))).contains(SLinkOperations.getTarget(r, MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fc0b64647L, 0x10fc0b6e730L, "applicableConcept"))))) {
                ListSequence.fromList(result).addElement(r);
              }
            }
            for (SNode r : ListSequence.fromList(SNodeOperations.getNodeDescendants(node, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11c0acf58efL, "jetbrains.mps.lang.generator.structure.DropRootRule"), false, new SAbstractConcept[]{}))) {
              if (Sequence.fromIterable(AbstractConceptDeclaration__BehaviorDescriptor.getAllSuperConcepts_id2A8AB0rAWpG.invoke(__thisNode__, ((boolean) true))).contains(SLinkOperations.getTarget(r, MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11c0acf58efL, 0x11c0ad36598L, "applicableConcept")))) {
                ListSequence.fromList(result).addElement(r);
              }
            }
          }
        }
      }
    }
    return result;
  }
  /*package*/ static String getPresentation_id280s3ZNTXNS(@NotNull SNode __thisNode__) {
    return (isNotEmptyString(SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x46ab0ad5826c74caL, "conceptAlias"))) ? SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x46ab0ad5826c74caL, "conceptAlias")) : SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
  }
  @Deprecated
  /*package*/ static List<SNode> getAvailableConceptMethods_idhEwILGo(@NotNull SNode __thisNode__, SNode context) {
    return Sequence.fromIterable(AbstractConceptDeclaration__BehaviorDescriptor.getVisibleConceptMethods_idwrIPXhfIPX.invoke(__thisNode__, context)).toListSequence();
  }
  /*package*/ static Iterable<SNode> getVisibleConceptMethods_idwrIPXhfIPX(@NotNull SNode __thisNode__, SNode context) {
    Set<SNode> methods = SetSequence.fromSet(new HashSet<SNode>());
    if (__thisNode__ == null) {
      return methods;
    }

    SNode contextBehaviour = SNodeOperations.getNodeAncestor(context, MetaAdapterFactory.getConcept(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d43447b1aL, "jetbrains.mps.lang.behavior.structure.ConceptBehavior"), true, false);
    List<SNode> allSupers = Sequence.fromIterable(AbstractConceptDeclaration__BehaviorDescriptor.getAllSuperConcepts_id2A8AB0rAWpG.invoke(__thisNode__, ((boolean) true))).toListSequence();
    ListSequence.fromList(allSupers).addElement(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)", "1133920641626"));
    for (SNode concept : allSupers) {
      SNode behaviour = SNodeOperations.cast(AbstractConceptDeclaration__BehaviorDescriptor.findConceptAspect_id7g4OXB0ykew.invoke(concept, LanguageAspect.BEHAVIOR), MetaAdapterFactory.getConcept(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d43447b1aL, "jetbrains.mps.lang.behavior.structure.ConceptBehavior"));
      if (behaviour != null) {
        for (SNode method : SLinkOperations.getChildren(behaviour, MetaAdapterFactory.getContainmentLink(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d43447b1aL, 0x11d43447b25L, "method"))) {
          if (SLinkOperations.getTarget(method, MetaAdapterFactory.getReferenceLink(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d4348057eL, 0x11d4348057fL, "overriddenMethod")) != null) {
            continue;
          }
          if (SLinkOperations.getTarget(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility")) == null) {
            if (SNodeOperations.getModel(contextBehaviour) == SNodeOperations.getModel(method)) {
              SetSequence.fromSet(methods).addElement(method);
            }
          }
          if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10af9586f0cL, "jetbrains.mps.baseLanguage.structure.PrivateVisibility"))) {
            if (SNodeOperations.getNodeAncestor(method, MetaAdapterFactory.getConcept(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d43447b1aL, "jetbrains.mps.lang.behavior.structure.ConceptBehavior"), true, false) == contextBehaviour) {
              SetSequence.fromSet(methods).addElement(method);
            }
          }
          if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10af9581ff1L, "jetbrains.mps.baseLanguage.structure.PublicVisibility"))) {
            SetSequence.fromSet(methods).addElement(method);
          }
          if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10af958b686L, "jetbrains.mps.baseLanguage.structure.ProtectedVisibility"))) {
            if (Sequence.fromIterable(AbstractConceptDeclaration__BehaviorDescriptor.getAllSuperConcepts_id2A8AB0rAWpG.invoke(SLinkOperations.getTarget(contextBehaviour, MetaAdapterFactory.getReferenceLink(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d43447b1aL, 0x11d43447b1fL, "concept")), ((boolean) true))).contains(SLinkOperations.getTarget(SNodeOperations.getNodeAncestor(method, MetaAdapterFactory.getConcept(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d43447b1aL, "jetbrains.mps.lang.behavior.structure.ConceptBehavior"), true, false), MetaAdapterFactory.getReferenceLink(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d43447b1aL, 0x11d43447b1fL, "concept")))) {
              SetSequence.fromSet(methods).addElement(method);
            }
          }
        }
      }
    }
    return methods;
  }
  /*package*/ static List<SNode> getVirtualConceptMethods_idhEwILHM(@NotNull SNode __thisNode__) {
    List<SNode> methods = new ArrayList<SNode>();
    for (SNode concept : AbstractConceptDeclaration__BehaviorDescriptor.getAllSuperConcepts_id2A8AB0rAWpG.invoke(__thisNode__, ((boolean) false))) {
      SNode behaviour = SNodeOperations.cast(AbstractConceptDeclaration__BehaviorDescriptor.findConceptAspect_id7g4OXB0ykew.invoke(concept, LanguageAspect.BEHAVIOR), MetaAdapterFactory.getConcept(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d43447b1aL, "jetbrains.mps.lang.behavior.structure.ConceptBehavior"));
      if (behaviour != null) {
        for (SNode method : SLinkOperations.getChildren(behaviour, MetaAdapterFactory.getContainmentLink(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d43447b1aL, 0x11d43447b25L, "method"))) {
          if (SPropertyOperations.getBoolean(method, MetaAdapterFactory.getProperty(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d4348057eL, 0x11d43480580L, "isVirtual"))) {
            ListSequence.fromList(methods).addElement(method);
          }
        }
      }
    }
    return methods;
  }
  /*package*/ static List<SNode> getNotImplementedConceptMethods_idhEwILIz(@NotNull SNode __thisNode__) {
    List<SNode> abstractMethods = new ArrayList<SNode>();
    List<SNode> implementedMethods = new ArrayList<SNode>();
    List<SNode> concepts = ListSequence.fromListWithValues(new ArrayList<SNode>(), AbstractConceptDeclaration__BehaviorDescriptor.getAllSuperConcepts_id2A8AB0rAWpG.invoke(__thisNode__, ((boolean) false)));
    ListSequence.fromList(concepts).addElement(__thisNode__);
    for (SNode concept : concepts) {
      SNode behavior = SNodeOperations.cast(AbstractConceptDeclaration__BehaviorDescriptor.findConceptAspect_id7g4OXB0ykew.invoke(concept, LanguageAspect.BEHAVIOR), MetaAdapterFactory.getConcept(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d43447b1aL, "jetbrains.mps.lang.behavior.structure.ConceptBehavior"));
      for (SNode method : SLinkOperations.getChildren(behavior, MetaAdapterFactory.getContainmentLink(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d43447b1aL, 0x11d43447b25L, "method"))) {
        if (SPropertyOperations.getBoolean(method, MetaAdapterFactory.getProperty(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d4348057eL, 0x11d43480582L, "isAbstract"))) {
          ListSequence.fromList(abstractMethods).addElement(method);
        }
        if (SLinkOperations.getTarget(method, MetaAdapterFactory.getReferenceLink(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d4348057eL, 0x11d4348057fL, "overriddenMethod")) != null && !(SPropertyOperations.getBoolean(method, MetaAdapterFactory.getProperty(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d4348057eL, 0x11d43480582L, "isAbstract")))) {
          ListSequence.fromList(implementedMethods).addElement(SLinkOperations.getTarget(method, MetaAdapterFactory.getReferenceLink(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d4348057eL, 0x11d4348057fL, "overriddenMethod")));
        }
      }
    }
    ListSequence.fromList(abstractMethods).removeSequence(ListSequence.fromList(implementedMethods));
    return abstractMethods;
  }
  /*package*/ static SNode findLinkDeclaration_idhEwILKz(@NotNull SNode __thisNode__, String role) {
    return SNodeOperations.cast(ConceptAndSuperConceptsCache.getInstance(__thisNode__).getLinkDeclarationByRole(role), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, "jetbrains.mps.lang.structure.structure.LinkDeclaration"));
  }
  /*package*/ static List<SNode> getLinkDeclarations_idhEwILKK(@NotNull SNode __thisNode__) {
    return (List<SNode>) ConceptAndSuperConceptsCache.getInstance(__thisNode__).getLinkDeclarationsExcludingOverridden();
  }
  /*package*/ static List<SNode> getReferenceLinkDeclarations_idhEwILL0(@NotNull SNode __thisNode__) {
    List<SNode> links = AbstractConceptDeclaration__BehaviorDescriptor.getLinkDeclarations_idhEwILKK.invoke(__thisNode__);
    return ListSequence.fromList(links).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.hasValue(it, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf980556927L, "metaClass"), "reference", "reference");
      }
    }).toListSequence();
  }
  /*package*/ static List<SNode> getAggregationLinkDeclarations_idhEwILLp(@NotNull SNode __thisNode__) {
    List<SNode> links = AbstractConceptDeclaration__BehaviorDescriptor.getLinkDeclarations_idhEwILKK.invoke(__thisNode__);
    return ListSequence.fromList(links).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.hasValue(it, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf980556927L, "metaClass"), "aggregation", "reference");
      }
    }).toListSequence();
  }
  /*package*/ static List<SNode> getPropertyDeclarations_idhEwILLM(@NotNull SNode __thisNode__) {
    return (List<SNode>) ConceptAndSuperConceptsCache.getInstance(__thisNode__).getPropertyDeclarations();
  }
  /*package*/ static SNode findPropertyDeclaration_idhK3S4A1(@NotNull SNode __thisNode__, String name) {
    return SNodeOperations.cast(ConceptAndSuperConceptsCache.getInstance(__thisNode__).getPropertyDeclarationByName(name), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086bL, "jetbrains.mps.lang.structure.structure.PropertyDeclaration"));
  }
  /*package*/ static boolean isSubconceptOf_id73yVtVlWOga(@NotNull SNode __thisNode__, SNode superconcept) {
    if (superconcept == SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)", "1133920641626")) {
      return true;
    }
    return Sequence.fromIterable(AbstractConceptDeclaration__BehaviorDescriptor.getAllSuperConcepts_id2A8AB0rAWpG.invoke(__thisNode__, ((boolean) true))).contains(superconcept);
  }
  /*package*/ static Iterable<SNode> getAllSuperConcepts_id2A8AB0rAWpG(@NotNull SNode __thisNode__, boolean includeSelf) {
    Set<SNode> concepts = SetSequence.fromSet(new LinkedHashSet<SNode>());
    AbstractConceptDeclaration__BehaviorDescriptor.collectSuperConcepts_id2A8AB0rB3NH.invoke(__thisNode__, __thisNode__, concepts);
    if (!(includeSelf)) {
      SetSequence.fromSet(concepts).removeElement(__thisNode__);
    }
    return concepts;
  }
  /*package*/ static void collectSuperConcepts_id2A8AB0rB3NH(@NotNull SNode __thisNode__, SNode concept, Set<SNode> result) {
    if (SetSequence.fromSet(result).contains(concept) || (concept == null)) {
      return;
    }
    SetSequence.fromSet(result).addElement(concept);
    for (SNode superConcept : ListSequence.fromList(AbstractConceptDeclaration__BehaviorDescriptor.getImmediateSuperconcepts_idhMuxyK2.invoke(concept))) {
      AbstractConceptDeclaration__BehaviorDescriptor.collectSuperConcepts_id2A8AB0rB3NH.invoke(__thisNode__, superConcept, result);
    }
  }
  /*package*/ static SNode computeInHierarchy_id3CiBrVcn5fe(@NotNull SNode __thisNode__, _FunctionTypes._return_P1_E0<? extends SNode, ? super SNode> predicate) {
    // todo: comment method!, use generics 
    SNode result = predicate.invoke(__thisNode__);
    if (result != null) {
      return result;
    }

    for (SNode superconcept : ListSequence.fromList(AbstractConceptDeclaration__BehaviorDescriptor.getImmediateSuperconcepts_idhMuxyK2.invoke(__thisNode__)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (it != null);
      }
    })) {
      SNode superconceptResult = AbstractConceptDeclaration__BehaviorDescriptor.computeInHierarchy_id3CiBrVcn5fe.invoke(superconcept, predicate);
      if (superconceptResult != null) {
        return superconceptResult;
      }
    }

    return null;
  }
  /*package*/ static Pair<Set<SNode>, Set<SNode>> getInLanguageAndNotInLanguageAncestors_id54xSEBmK0MK(@NotNull SNode __thisNode__) {
    // todo: use tuple 
    Set<SNode> inLanguageAncestors = SetSequence.fromSet(new HashSet<SNode>());
    Set<SNode> notInLanguageAncestors = SetSequence.fromSet(new HashSet<SNode>());

    for (SNode superconcept : AbstractConceptDeclaration__BehaviorDescriptor.getImmediateSuperconcepts_idhMuxyK2.invoke(__thisNode__)) {
      if ((superconcept != null)) {
        if (SNodeOperations.getModel(superconcept) == SNodeOperations.getModel(__thisNode__)) {
          Pair<Set<SNode>, Set<SNode>> superconceptResult = AbstractConceptDeclaration__BehaviorDescriptor.getInLanguageAndNotInLanguageAncestors_id54xSEBmK0MK.invoke(superconcept);
          SetSequence.fromSet(inLanguageAncestors).addElement(superconcept);

          SetSequence.fromSet(inLanguageAncestors).addSequence(SetSequence.fromSet(superconceptResult.o1));
          SetSequence.fromSet(notInLanguageAncestors).addSequence(SetSequence.fromSet(superconceptResult.o2));
        } else {
          // other language 
          SetSequence.fromSet(notInLanguageAncestors).addElement(superconcept);
        }
      }
    }

    return new Pair(inLanguageAncestors, notInLanguageAncestors);
  }
  /*package*/ static boolean is_id4MKjpUYmGW0(@NotNull SNode __thisNode__, SAbstractConcept concept) {
    return Objects.equals(MetaAdapterByDeclaration.getConcept(__thisNode__), concept);
  }

  /*package*/ AbstractConceptDeclaration__BehaviorDescriptor() {
    super(REGISTRY);
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((SModel) getAspectModel_id7g4OXB0yli3(node, (LanguageAspect) parameters[0]));
      case 1:
        return (T) ((List<SNode>) findConceptAspectCollection_id1n18fON7w20(node, (LanguageAspect) parameters[0]));
      case 2:
        return (T) ((SNode) findConceptAspect_id7g4OXB0ykew(node, (LanguageAspect) parameters[0]));
      case 3:
        setLanguageIdFromModule_id7NTi8jM8SJY(node, (SModule) parameters[0]);
        return null;
      case 4:
        return (T) ((SNode) findConceptAspect_id7g4OXB0yku$(node, (SModel) parameters[0]));
      case 5:
        findConceptAspectCollection_id7g4OXB0yl26(node, (SModel) parameters[0], (List<SNode>) parameters[1]);
        return null;
      case 6:
        return (T) ((Iterable<SNode>) findConceptAspects_id4G9PD8$NvPM(node, (SModel) parameters[0]));
      case 7:
        return (T) ((List<SNode>) findGeneratorFragments_id5zMz2aJEI4B(node));
      case 8:
        return (T) ((String) getPresentation_id280s3ZNTXNS(node));
      case 9:
        return (T) ((List<SNode>) getAvailableConceptMethods_idhEwILGo(node, (SNode) parameters[0]));
      case 10:
        return (T) ((Iterable<SNode>) getVisibleConceptMethods_idwrIPXhfIPX(node, (SNode) parameters[0]));
      case 11:
        return (T) ((List<SNode>) getVirtualConceptMethods_idhEwILHM(node));
      case 12:
        return (T) ((List<SNode>) getNotImplementedConceptMethods_idhEwILIz(node));
      case 13:
        return (T) ((SNode) findLinkDeclaration_idhEwILKz(node, (String) parameters[0]));
      case 14:
        return (T) ((List<SNode>) getLinkDeclarations_idhEwILKK(node));
      case 15:
        return (T) ((List<SNode>) getReferenceLinkDeclarations_idhEwILL0(node));
      case 16:
        return (T) ((List<SNode>) getAggregationLinkDeclarations_idhEwILLp(node));
      case 17:
        return (T) ((List<SNode>) getPropertyDeclarations_idhEwILLM(node));
      case 18:
        return (T) ((SNode) findPropertyDeclaration_idhK3S4A1(node, (String) parameters[0]));
      case 19:
        return (T) ((Boolean) isSubconceptOf_id73yVtVlWOga(node, (SNode) parameters[0]));
      case 21:
        return (T) ((Iterable<SNode>) getAllSuperConcepts_id2A8AB0rAWpG(node, ((boolean) (Boolean) parameters[0])));
      case 22:
        collectSuperConcepts_id2A8AB0rB3NH(node, (SNode) parameters[0], (Set<SNode>) parameters[1]);
        return null;
      case 23:
        return (T) ((SNode) computeInHierarchy_id3CiBrVcn5fe(node, (_FunctionTypes._return_P1_E0<? extends SNode, ? super SNode>) parameters[0]));
      case 24:
        return (T) ((Pair<Set<SNode>, Set<SNode>>) getInLanguageAndNotInLanguageAncestors_id54xSEBmK0MK(node));
      case 25:
        return (T) ((Boolean) is_id4MKjpUYmGW0(node, (SAbstractConcept) parameters[0]));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }
  private static boolean isNotEmptyString(String str) {
    return str != null && str.length() > 0;
  }
}
