package jetbrains.mps.baseLanguage.editor;

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
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.actions.ExpectedType_FactoryUtil;
import jetbrains.mps.baseLanguage.behavior.Type__BehaviorDescriptor;
import jetbrains.mps.lang.editor.menus.substitute.SingleItemSubstituteMenuPart;
import org.apache.log4j.Logger;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.runtime.IconResource;
import jetbrains.mps.smodel.runtime.IconResourceUtil;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import jetbrains.mps.editor.runtime.selection.SelectionUtil;
import jetbrains.mps.openapi.editor.selection.SelectionManager;

public class new_ extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new new_.SMP_Param_1076n_a(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, "jetbrains.mps.baseLanguage.structure.GenericNewExpression")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("named substitute menu " + "new_", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586960802")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  private class SMP_Param_1076n_a extends ParameterizedMenuPart<SNode, SubstituteMenuItem, SubstituteMenuContext> {
    @NotNull
    @Override
    protected List<SubstituteMenuItem> createItems(SNode parameter, SubstituteMenuContext context) {
      return new new_.SMP_Param_1076n_a.SMP_Action_1076n_a0(parameter).createItems(context);
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("parameterized substitute menu part", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586960804")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }
    @Nullable
    @Override
    protected Iterable<? extends SNode> getParameters(SubstituteMenuContext _context) {
      SNode sampleNode = _context.getCurrentTargetNode();
      //  copied from BL_nodeFactories 
      if (SNodeOperations.isInstanceOf(sampleNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"))) {
        // Looking for the original node is required because sampleNode is just a copy 
        SNode originalExpression = ExpectedType_FactoryUtil.getOriginalExpression(_context.getParentNode(), SNodeOperations.cast(sampleNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")));
        if ((originalExpression != null)) {
          SNode expectedType = ExpectedType_FactoryUtil.createExpectedType(SNodeOperations.cast(originalExpression, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")));
          if ((expectedType != null)) {
            return Type__BehaviorDescriptor.getAbstractCreators_id6A07P3f4z36.invoke(expectedType, _context.getModel());
          }
        }
      }
      return null;
    }
    private class SMP_Action_1076n_a0 extends SingleItemSubstituteMenuPart {
      private final SNode myParameterObject;
      public SMP_Action_1076n_a0(SNode parameterObject) {
        myParameterObject = parameterObject;
      }

      @Nullable
      @Override
      protected SubstituteMenuItem createItem(SubstituteMenuContext _context) {
        new_.SMP_Param_1076n_a.SMP_Action_1076n_a0.Item item = new new_.SMP_Param_1076n_a.SMP_Action_1076n_a0.Item(_context);
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
          _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase(description, new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586960881")));
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
          super(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, "jetbrains.mps.baseLanguage.structure.GenericNewExpression"), context.getParentNode(), context.getCurrentTargetNode(), context.getEditorContext());
          _context = context;
        }

        private void setTraceInfo(EditorMenuTraceInfo traceInfo) {
          myTraceInfo = traceInfo;
        }

        @Nullable
        @Override
        public SNode createNode(@NotNull String pattern) {
          SNode gne = SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, "jetbrains.mps.baseLanguage.structure.GenericNewExpression")), null);
          SLinkOperations.setTarget(gne, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, 0x10ab847b486L, "creator"), myParameterObject);
          return gne;
        }

        @Override
        public EditorMenuTraceInfo getTraceInfo() {
          return myTraceInfo;
        }
        @Nullable
        @Override
        public IconResource getIcon(@NotNull String pattern) {
          if (myParameterObject instanceof SNode) {
            return IconResourceUtil.getIconResourceForNode(((SNode) myParameterObject));
          }
          return null;
        }
        @Nullable
        @Override
        public String getMatchingText(@NotNull String pattern) {
          return "new " + BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(myParameterObject);
        }
        @Override
        public void select(@NotNull SNode createdNode, @NotNull String pattern) {
          SelectionUtil.selectLabelCellAnSetCaret(_context.getEditorContext(), createdNode, SelectionManager.LAST_CELL, 0);
        }
        @Nullable
        @Override
        public String getDescriptionText(@NotNull String pattern) {
          return "";
        }
      }
    }

  }
}
