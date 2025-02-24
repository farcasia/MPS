package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.substitute.SubstituteMenuBase;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuContext;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.GroupMenuPart;
import jetbrains.mps.util.Computable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Objects;
import java.util.Arrays;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.lang.editor.menus.ParameterizedMenuPart;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.menus.substitute.SingleItemSubstituteMenuPart;
import org.apache.log4j.Logger;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import jetbrains.mps.smodel.presentation.NodePresentationUtil;
import jetbrains.mps.smodel.runtime.IconResource;
import jetbrains.mps.smodel.runtime.IconResourceUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.scopes.ClassifierScopes;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.editor.menus.ConceptMenusPart;
import java.util.Collection;
import jetbrains.mps.smodel.ConceptDescendantsCache;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class Type_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new Type_SubstituteMenu.SMP_Group_mqq6an_a());
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for " + "Type", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586959319")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public class SMP_Group_mqq6an_a extends GroupMenuPart<SubstituteMenuItem, SubstituteMenuContext> {
    private boolean condition;
    @Override
    protected void initialize(SubstituteMenuContext _context) {
      super.initialize(_context);
      condition = new Computable<Boolean>() {
        public Boolean compute() {
          return SNodeOperations.isInstanceOf(_context.getParentNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")) && Objects.equals(_context.getLink(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0x10f383d6949L, "throwsItem"));
        }
      }.compute();
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("substitute menu group", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586959320")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @Override
    protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts() {
      return Arrays.<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>asList(new Type_SubstituteMenu.SMP_Group_mqq6an_a.SMP_Group_mqq6an_a0(), new Type_SubstituteMenu.SMP_Group_mqq6an_a.SMP_Group_mqq6an_b0());
    }
    public class SMP_Group_mqq6an_a0 extends GroupMenuPart<SubstituteMenuItem, SubstituteMenuContext> {
      @Override
      protected boolean isApplicable(SubstituteMenuContext _context) {
        return condition;
      }
      @NotNull
      @Override
      public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
        context.getEditorMenuTrace().pushTraceInfo();
        context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("substitute menu group", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586959370")));
        try {
          return super.createItems(context);
        } finally {
          context.getEditorMenuTrace().popTraceInfo();
        }
      }

      @Override
      protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts() {
        return Arrays.<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>asList(new ConstraintsFilteringSubstituteMenuPartDecorator(new Type_SubstituteMenu.SMP_Group_mqq6an_a.SMP_Group_mqq6an_a0.SMP_Param_mqq6an_a0a(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102467229d8L, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")), new ConstraintsFilteringSubstituteMenuPartDecorator(new Type_SubstituteMenu.SMP_Group_mqq6an_a.SMP_Group_mqq6an_a0.SMP_Param_mqq6an_b0a(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, "jetbrains.mps.baseLanguage.structure.ClassifierType")));
      }
      private class SMP_Param_mqq6an_a0a extends ParameterizedMenuPart<SNode, SubstituteMenuItem, SubstituteMenuContext> {
        @NotNull
        @Override
        protected List<SubstituteMenuItem> createItems(SNode parameter, SubstituteMenuContext context) {
          return new Type_SubstituteMenu.SMP_Group_mqq6an_a.SMP_Group_mqq6an_a0.SMP_Param_mqq6an_a0a.SMP_Action_mqq6an_a0a0(parameter).createItems(context);
        }
        @NotNull
        @Override
        public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
          context.getEditorMenuTrace().pushTraceInfo();
          context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("parameterized substitute menu part", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586959375")));
          try {
            return super.createItems(context);
          } finally {
            context.getEditorMenuTrace().popTraceInfo();
          }
        }
        @Nullable
        @Override
        protected Iterable<? extends SNode> getParameters(SubstituteMenuContext _context) {
          return ListSequence.fromList(SNodeOperations.getNodeAncestors(_context.getParentNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102463b447aL, "jetbrains.mps.baseLanguage.structure.GenericDeclaration"), true)).translate(new ITranslator2<SNode, SNode>() {
            public Iterable<SNode> translate(SNode it) {
              return SLinkOperations.getChildren(it, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102463b447aL, 0x102463bb98eL, "typeVariableDeclaration"));
            }
          }).toListSequence();
        }
        private class SMP_Action_mqq6an_a0a0 extends SingleItemSubstituteMenuPart {
          private final SNode myParameterObject;
          public SMP_Action_mqq6an_a0a0(SNode parameterObject) {
            myParameterObject = parameterObject;
          }

          @Nullable
          @Override
          protected SubstituteMenuItem createItem(SubstituteMenuContext _context) {
            Type_SubstituteMenu.SMP_Group_mqq6an_a.SMP_Group_mqq6an_a0.SMP_Param_mqq6an_a0a.SMP_Action_mqq6an_a0a0.Item item = new Type_SubstituteMenu.SMP_Group_mqq6an_a.SMP_Group_mqq6an_a0.SMP_Param_mqq6an_a0a.SMP_Action_mqq6an_a0a0.Item(_context);
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
              _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase(description, new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586959425")));
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
              super(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102467229d8L, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), context.getParentNode(), context.getCurrentTargetNode(), context.getEditorContext());
              _context = context;
            }

            private void setTraceInfo(EditorMenuTraceInfo traceInfo) {
              myTraceInfo = traceInfo;
            }

            @Nullable
            @Override
            public SNode createNode(@NotNull String pattern) {
              return _quotation_createNode_mqq6an_a0a0a0a0(myParameterObject);
            }

            @Override
            public EditorMenuTraceInfo getTraceInfo() {
              return myTraceInfo;
            }
            @Nullable
            @Override
            public String getMatchingText(@NotNull String pattern) {
              if (myParameterObject instanceof SNode) {
                return NodePresentationUtil.visibleMatchingText((SNode) myParameterObject, null);
              }
              return "" + myParameterObject;
            }
            @Nullable
            @Override
            public String getDescriptionText(@NotNull String pattern) {
              if (myParameterObject instanceof SNode) {
                return NodePresentationUtil.descriptionText((SNode) myParameterObject);
              }
              return "" + myParameterObject;
            }
            @Nullable
            @Override
            public IconResource getIcon(@NotNull String pattern) {
              if (myParameterObject instanceof SNode) {
                return IconResourceUtil.getIconResourceForNode(((SNode) myParameterObject));
              }
              return null;
            }
          }
        }

      }
      private class SMP_Param_mqq6an_b0a extends ParameterizedMenuPart<SNode, SubstituteMenuItem, SubstituteMenuContext> {
        @NotNull
        @Override
        protected List<SubstituteMenuItem> createItems(SNode parameter, SubstituteMenuContext context) {
          return new Type_SubstituteMenu.SMP_Group_mqq6an_a.SMP_Group_mqq6an_a0.SMP_Param_mqq6an_b0a.SMP_Action_mqq6an_a1a0(parameter).createItems(context);
        }
        @NotNull
        @Override
        public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
          context.getEditorMenuTrace().pushTraceInfo();
          context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("parameterized substitute menu part", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586959461")));
          try {
            return super.createItems(context);
          } finally {
            context.getEditorMenuTrace().popTraceInfo();
          }
        }
        @Nullable
        @Override
        protected Iterable<? extends SNode> getParameters(SubstituteMenuContext _context) {
          return (List<SNode>) Sequence.fromIterable(ClassifierScopes.getThrowablesScope(_context.getParentNode()).getAvailableElements(null)).toListSequence();
        }
        private class SMP_Action_mqq6an_a1a0 extends SingleItemSubstituteMenuPart {
          private final SNode myParameterObject;
          public SMP_Action_mqq6an_a1a0(SNode parameterObject) {
            myParameterObject = parameterObject;
          }

          @Nullable
          @Override
          protected SubstituteMenuItem createItem(SubstituteMenuContext _context) {
            Type_SubstituteMenu.SMP_Group_mqq6an_a.SMP_Group_mqq6an_a0.SMP_Param_mqq6an_b0a.SMP_Action_mqq6an_a1a0.Item item = new Type_SubstituteMenu.SMP_Group_mqq6an_a.SMP_Group_mqq6an_a0.SMP_Param_mqq6an_b0a.SMP_Action_mqq6an_a1a0.Item(_context);
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
              _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase(description, new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586959503")));
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
              super(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, "jetbrains.mps.baseLanguage.structure.ClassifierType"), context.getParentNode(), context.getCurrentTargetNode(), context.getEditorContext());
              _context = context;
            }

            private void setTraceInfo(EditorMenuTraceInfo traceInfo) {
              myTraceInfo = traceInfo;
            }

            @Nullable
            @Override
            public SNode createNode(@NotNull String pattern) {
              SNode result = SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, "jetbrains.mps.baseLanguage.structure.ClassifierType")), null);
              SLinkOperations.setTarget(result, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), myParameterObject);
              return result;
            }

            @Override
            public EditorMenuTraceInfo getTraceInfo() {
              return myTraceInfo;
            }
            @Nullable
            @Override
            public String getMatchingText(@NotNull String pattern) {
              if (myParameterObject instanceof SNode) {
                return NodePresentationUtil.visibleMatchingText((SNode) myParameterObject, null);
              }
              return "" + myParameterObject;
            }
            @Nullable
            @Override
            public String getDescriptionText(@NotNull String pattern) {
              if (myParameterObject instanceof SNode) {
                return NodePresentationUtil.descriptionText((SNode) myParameterObject);
              }
              return "" + myParameterObject;
            }
            @Nullable
            @Override
            public IconResource getIcon(@NotNull String pattern) {
              if (myParameterObject instanceof SNode) {
                return IconResourceUtil.getIconResourceForNode(((SNode) myParameterObject));
              }
              return null;
            }
          }
        }

      }
    }
    public class SMP_Group_mqq6an_b0 extends GroupMenuPart<SubstituteMenuItem, SubstituteMenuContext> {
      @Override
      protected boolean isApplicable(SubstituteMenuContext _context) {
        return !((condition));
      }
      @NotNull
      @Override
      public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
        context.getEditorMenuTrace().pushTraceInfo();
        context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("substitute menu group", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586964738")));
        try {
          return super.createItems(context);
        } finally {
          context.getEditorMenuTrace().popTraceInfo();
        }
      }

      @Override
      protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts() {
        return Arrays.<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>asList(new Type_SubstituteMenu.SMP_Group_mqq6an_a.SMP_Group_mqq6an_b0.SMP_Subconcepts_mqq6an_a1a());
      }
      public class SMP_Subconcepts_mqq6an_a1a extends ConceptMenusPart<SubstituteMenuItem, SubstituteMenuContext> {
        protected Collection getConcepts(final SubstituteMenuContext _context) {
          return ConceptDescendantsCache.getInstance().getDirectDescendants(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL, "jetbrains.mps.baseLanguage.structure.Type"));
        }
        @NotNull
        @Override
        public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
          context.getEditorMenuTrace().pushTraceInfo();
          context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include menus for all the direct subconcepts of " + "Type", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586964742")));
          try {
            return super.createItems(context);
          } finally {
            context.getEditorMenuTrace().popTraceInfo();
          }
        }

        @Override
        protected Collection<SubstituteMenuItem> createItemsForConcept(SubstituteMenuContext context, SAbstractConcept concept) {
          return context.createItems(new DefaultSubstituteMenuLookup(LanguageRegistry.getInstance(context.getEditorContext().getRepository()), concept));
        }
      }
    }
  }
  private static SNode _quotation_createNode_mqq6an_a0a0a0a0(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x102467229d8L, "TypeVariableReference"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102467229d8L, 0x1024673a581L, "typeVariableDeclaration"), (SNode) parameter_1);
    return quotedNode_2;
  }
}
