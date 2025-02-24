package jetbrains.mps.make.facet.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.substitute.SubstituteMenuBase;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuContext;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.ParameterizedMenuPart;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import org.jetbrains.mps.openapi.language.SEnumerationLiteral;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.make.facet.behavior.FacetDeclaration__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.lang.editor.menus.substitute.SingleItemSubstituteMenuPart;
import org.apache.log4j.Logger;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.runtime.IconResource;

public class TargetDependency_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new TargetDependency_SubstituteMenu.SMP_Param_70edxa_a(), MetaAdapterFactory.getConcept(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c60L, "jetbrains.mps.make.facet.structure.TargetDependency")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for " + "TargetDependency", new SNodePointer("r:53dc5a43-c15e-4a00-8af6-c42420ba30d9(jetbrains.mps.make.facet.editor)", "1741258697587108850")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  private class SMP_Param_70edxa_a extends ParameterizedMenuPart<Tuples._2<SEnumerationLiteral, SNode>, SubstituteMenuItem, SubstituteMenuContext> {
    @NotNull
    @Override
    protected List<SubstituteMenuItem> createItems(Tuples._2<SEnumerationLiteral, SNode> parameter, SubstituteMenuContext context) {
      return new TargetDependency_SubstituteMenu.SMP_Param_70edxa_a.SMP_Action_70edxa_a0(parameter).createItems(context);
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("parameterized substitute menu part", new SNodePointer("r:53dc5a43-c15e-4a00-8af6-c42420ba30d9(jetbrains.mps.make.facet.editor)", "1741258697587108852")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }
    @Nullable
    @Override
    protected Iterable<? extends Tuples._2<SEnumerationLiteral, SNode>> getParameters(SubstituteMenuContext _context) {
      final Iterable<SNode> relatedFacets = FacetDeclaration__BehaviorDescriptor.allRelated_id7fB872uckWE.invoke(SNodeOperations.getNodeAncestor(_context.getParentNode(), MetaAdapterFactory.getConcept(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c13L, "jetbrains.mps.make.facet.structure.FacetDeclaration"), false, false));
      return ListSequence.fromList(SModelOperations.nodesIncludingImported(_context.getModel(), MetaAdapterFactory.getConcept(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c3dL, "jetbrains.mps.make.facet.structure.TargetDeclaration"))).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode fct) {
          return Sequence.fromIterable(relatedFacets).contains(SNodeOperations.getNodeAncestor(fct, MetaAdapterFactory.getConcept(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c13L, "jetbrains.mps.make.facet.structure.FacetDeclaration"), false, false));
        }
      }).translate(new ITranslator2<SNode, Tuples._2<SEnumerationLiteral, SNode>>() {
        public Iterable<Tuples._2<SEnumerationLiteral, SNode>> translate(final SNode td) {
          return new Iterable<Tuples._2<SEnumerationLiteral, SNode>>() {
            public Iterator<Tuples._2<SEnumerationLiteral, SNode>> iterator() {
              return new YieldingIterator<Tuples._2<SEnumerationLiteral, SNode>>() {
                private int __CP__ = 0;
                protected boolean moveToNext() {
__loop__:
                  do {
__switch__:
                    switch (this.__CP__) {
                      case -1:
                        assert false : "Internal error";
                        return false;
                      case 2:
                        this._2_em_it = SEnumOperations.getMembers(0x696c11654a59463bL, 0xbc5d902caab85dd0L, "jetbrains.mps.make.facet", 0x73e720709e3139e2L, "TargetDependencyQualifier").iterator();
                      case 3:
                        if (!(this._2_em_it.hasNext())) {
                          this.__CP__ = 1;
                          break;
                        }
                        this._2_em = this._2_em_it.next();
                        this.__CP__ = 4;
                        break;
                      case 5:
                        this.__CP__ = 3;
                        this.yield(MultiTuple.<SEnumerationLiteral,SNode>from(_2_em, td));
                        return true;
                      case 0:
                        this.__CP__ = 2;
                        break;
                      case 4:
                        this.__CP__ = 5;
                        break;
                      default:
                        break __loop__;
                    }
                  } while (true);
                  return false;
                }
                private SEnumerationLiteral _2_em;
                private Iterator<SEnumerationLiteral> _2_em_it;
              };
            }
          };
        }
      }).toListSequence();
    }
    private class SMP_Action_70edxa_a0 extends SingleItemSubstituteMenuPart {
      private final Tuples._2<SEnumerationLiteral, SNode> myParameterObject;
      public SMP_Action_70edxa_a0(Tuples._2<SEnumerationLiteral, SNode> parameterObject) {
        myParameterObject = parameterObject;
      }

      @Nullable
      @Override
      protected SubstituteMenuItem createItem(SubstituteMenuContext _context) {
        TargetDependency_SubstituteMenu.SMP_Param_70edxa_a.SMP_Action_70edxa_a0.Item item = new TargetDependency_SubstituteMenu.SMP_Param_70edxa_a.SMP_Action_70edxa_a0.Item(_context);
        String description;
        try {
          description = "Substitute item: " + item.getMatchingText("");
          description += ". Parameter object: " + myParameterObject;
        } catch (Throwable t) {
          Logger.getLogger(getClass()).error("Exception while executing getMatchingText() of the item " + item, t);
          return null;
        }

        _context.getEditorMenuTrace().pushTraceInfo();
        try {
          _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase(description, new SNodePointer("r:53dc5a43-c15e-4a00-8af6-c42420ba30d9(jetbrains.mps.make.facet.editor)", "1741258697587108934")));
          item.setTraceInfo(_context.getEditorMenuTrace().getTraceInfo());
        } finally {
          _context.getEditorMenuTrace().popTraceInfo();
        }

        return item;
      }
      private class Item extends DefaultSubstituteMenuItem {
        private final SubstituteMenuContext _context;
        private EditorMenuTraceInfo myTraceInfo;
        public Item(SubstituteMenuContext context) {
          super(MetaAdapterFactory.getConcept(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c60L, "jetbrains.mps.make.facet.structure.TargetDependency"), context.getParentNode(), context.getCurrentTargetNode(), context.getEditorContext());
          _context = context;
        }

        private void setTraceInfo(EditorMenuTraceInfo traceInfo) {
          myTraceInfo = traceInfo;
        }

        @Nullable
        @Override
        public SNode createNode(@NotNull String pattern) {
          SNode dep = SNodeFactoryOperations.createNewNode(_context.getModel(), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c60L, "jetbrains.mps.make.facet.structure.TargetDependency")), null);
          SPropertyOperations.set(dep, MetaAdapterFactory.getProperty(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c60L, 0x73e720709e3139e9L, "qualifier"), SEnumOperations.getMemberValue(myParameterObject._0()));
          SLinkOperations.setTarget(dep, MetaAdapterFactory.getReferenceLink(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c60L, 0x5912a2ab1cd24c63L, "dependsOn"), myParameterObject._1());
          return dep;
        }

        @Override
        public EditorMenuTraceInfo getTraceInfo() {
          return myTraceInfo;
        }
        @Nullable
        @Override
        public String getDescriptionText(@NotNull String pattern) {
          return "";
        }
        @Nullable
        @Override
        public IconResource getIcon(@NotNull String pattern) {
          return null;
        }
        @Nullable
        @Override
        public String getMatchingText(@NotNull String pattern) {
          return SEnumOperations.getMemberName(myParameterObject._0()) + " " + SPropertyOperations.getString(myParameterObject._1(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
        }
      }
    }

  }
}
