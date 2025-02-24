package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.transformation.TransformationMenuBase;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.editor.menus.transformation.MenuLocations;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuItem;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuContext;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.MenuPart;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.editor.menus.GroupMenuPart;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Arrays;
import jetbrains.mps.util.Computable;
import jetbrains.mps.lang.editor.menus.transformation.IncludeTransformationMenuTransformationMenuPart;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.editor.menus.transformation.ConstraintsFilteringTransformationMenuPartDecorator;
import jetbrains.mps.lang.editor.menus.SingleItemMenuPart;
import org.apache.log4j.Logger;
import jetbrains.mps.openapi.editor.menus.transformation.ActionItemBase;
import jetbrains.mps.nodeEditor.cellMenu.SideTransformCompletionActionItem;
import jetbrains.mps.openapi.editor.menus.transformation.ConstraintsVerifiableActionItem;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import jetbrains.mps.baseLanguage.behavior.ParenthesisUtil;
import java.util.Objects;
import jetbrains.mps.editor.runtime.selection.SelectionUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.openapi.editor.selection.SelectionManager;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class IRefConceptArg_TransformationMenu extends TransformationMenuBase {
  private final Set<String> myLocations = SetSequence.fromSetAndArray(new HashSet<String>(), MenuLocations.RIGHT_SIDE_TRANSFORM);
  @Override
  public boolean isApplicableToLocation(@NotNull String location) {
    return SetSequence.fromSet(myLocations).contains(location);
  }

  @NotNull
  @Override
  public List<TransformationMenuItem> createMenuItems(@NotNull TransformationMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default transformation menu for " + "IRefConceptArg", new SNodePointer("r:00000000-0000-4000-0000-011c895902fd(jetbrains.mps.lang.smodel.editor)", "8725780192476471527")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }

  @Override
  @NotNull
  protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts(TransformationMenuContext _context) {
    List<MenuPart<TransformationMenuItem, TransformationMenuContext>> result = new ArrayList<MenuPart<TransformationMenuItem, TransformationMenuContext>>();
    if (ListSequence.fromListAndArray(new ArrayList<String>(), MenuLocations.RIGHT_SIDE_TRANSFORM).contains(_context.getMenuLocation())) {
      result.add(new IRefConceptArg_TransformationMenu.TMP_Group_9e3ftz_a0());
    }
    return result;
  }

  public class TMP_Group_9e3ftz_a0 extends GroupMenuPart<TransformationMenuItem, TransformationMenuContext> {
    @Override
    protected boolean isApplicable(TransformationMenuContext _context) {
      return SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));
    }

    @NotNull
    @Override
    public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("transformation menu group", new SNodePointer("r:00000000-0000-4000-0000-011c895902fd(jetbrains.mps.lang.smodel.editor)", "1741258697586941459")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }
    @Override
    protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts() {
      return Arrays.<MenuPart<TransformationMenuItem, TransformationMenuContext>>asList(new IRefConceptArg_TransformationMenu.TMP_Group_9e3ftz_a0.TMP_Group_9e3ftz_a0a());
    }
    public class TMP_Group_9e3ftz_a0a extends GroupMenuPart<TransformationMenuItem, TransformationMenuContext> {
      private boolean isCastExpression;
      @Override
      protected void initialize(TransformationMenuContext _context) {
        super.initialize(_context);
        isCastExpression = new Computable<Boolean>() {
          public Boolean compute() {
            return SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x1871b2e3b0ef0078L, "jetbrains.mps.lang.smodel.structure.SConceptTypeCastExpression")) || SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x10975850da7L, "jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression"));
          }
        }.compute();
      }

      @NotNull
      @Override
      public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
        context.getEditorMenuTrace().pushTraceInfo();
        context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("transformation menu group", new SNodePointer("r:00000000-0000-4000-0000-011c895902fd(jetbrains.mps.lang.smodel.editor)", "2091957167096898850")));
        try {
          return super.createItems(context);
        } finally {
          context.getEditorMenuTrace().popTraceInfo();
        }
      }
      @Override
      protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts() {
        return Arrays.<MenuPart<TransformationMenuItem, TransformationMenuContext>>asList(new IRefConceptArg_TransformationMenu.TMP_Group_9e3ftz_a0.TMP_Group_9e3ftz_a0a.TMP_Group_9e3ftz_a0a0(), new IRefConceptArg_TransformationMenu.TMP_Group_9e3ftz_a0.TMP_Group_9e3ftz_a0a.TMP_Group_9e3ftz_b0a0());
      }
      public class TMP_Group_9e3ftz_a0a0 extends GroupMenuPart<TransformationMenuItem, TransformationMenuContext> {
        @Override
        protected boolean isApplicable(TransformationMenuContext _context) {
          return isCastExpression;
        }

        @NotNull
        @Override
        public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
          context.getEditorMenuTrace().pushTraceInfo();
          context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("transformation menu group", new SNodePointer("r:00000000-0000-4000-0000-011c895902fd(jetbrains.mps.lang.smodel.editor)", "2091957167096913319")));
          try {
            return super.createItems(context);
          } finally {
            context.getEditorMenuTrace().popTraceInfo();
          }
        }
        @Override
        protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts() {
          return Arrays.<MenuPart<TransformationMenuItem, TransformationMenuContext>>asList(new IRefConceptArg_TransformationMenu.TMP_Group_9e3ftz_a0.TMP_Group_9e3ftz_a0a.TMP_Group_9e3ftz_a0a0.TMP_Include_9e3ftz_a0a0a());
        }
        public class TMP_Include_9e3ftz_a0a0a extends IncludeTransformationMenuTransformationMenuPart {
          @NotNull
          @Override
          public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
            context.getEditorMenuTrace().pushTraceInfo();
            context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include default transformation menu", new SNodePointer("r:00000000-0000-4000-0000-011c895902fd(jetbrains.mps.lang.smodel.editor)", "2091957167096921978")));
            try {
              return super.createItems(context);
            } finally {
              context.getEditorMenuTrace().popTraceInfo();
            }
          }

          @Nullable
          @Override
          protected SNode getNode(TransformationMenuContext _context) {
            return SNodeOperations.getParent(_context.getNode());
          }

        }
      }
      public class TMP_Group_9e3ftz_b0a0 extends GroupMenuPart<TransformationMenuItem, TransformationMenuContext> {
        @Override
        protected boolean isApplicable(TransformationMenuContext _context) {
          return !(isCastExpression);
        }

        @NotNull
        @Override
        public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
          context.getEditorMenuTrace().pushTraceInfo();
          context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("transformation menu group", new SNodePointer("r:00000000-0000-4000-0000-011c895902fd(jetbrains.mps.lang.smodel.editor)", "2091957167096915687")));
          try {
            return super.createItems(context);
          } finally {
            context.getEditorMenuTrace().popTraceInfo();
          }
        }
        @Override
        protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts() {
          return Arrays.<MenuPart<TransformationMenuItem, TransformationMenuContext>>asList(new ConstraintsFilteringTransformationMenuPartDecorator(new IRefConceptArg_TransformationMenu.TMP_Group_9e3ftz_a0.TMP_Group_9e3ftz_a0a.TMP_Group_9e3ftz_b0a0.TMP_Action_9e3ftz_a1a0a(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")));
        }
        private class TMP_Action_9e3ftz_a1a0a extends SingleItemMenuPart<TransformationMenuItem, TransformationMenuContext> {
          @Nullable
          protected TransformationMenuItem createItem(TransformationMenuContext context) {
            IRefConceptArg_TransformationMenu.TMP_Group_9e3ftz_a0.TMP_Group_9e3ftz_a0a.TMP_Group_9e3ftz_b0a0.TMP_Action_9e3ftz_a1a0a.Item item = new IRefConceptArg_TransformationMenu.TMP_Group_9e3ftz_a0.TMP_Group_9e3ftz_a0a.TMP_Group_9e3ftz_b0a0.TMP_Action_9e3ftz_a1a0a.Item(context);
            String description;
            try {
              description = "single item: " + item.getLabelText("");
            } catch (Throwable t) {
              Logger.getLogger(getClass()).error("Exception while executing getText of the item " + item, t);
              return null;
            }
            context.getEditorMenuTrace().pushTraceInfo();
            try {
              context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase(description, new SNodePointer("r:00000000-0000-4000-0000-011c895902fd(jetbrains.mps.lang.smodel.editor)", "1741258697586941469")));
              item.setTraceInfo(context.getEditorMenuTrace().getTraceInfo());
            } finally {
              context.getEditorMenuTrace().popTraceInfo();
            }
            return item;
          }

          private class Item extends ActionItemBase implements SideTransformCompletionActionItem, ConstraintsVerifiableActionItem {
            private final TransformationMenuContext _context;
            private EditorMenuTraceInfo myEditorMenuTraceInfo;
            private Item(TransformationMenuContext context) {
              _context = context;
            }
            private void setTraceInfo(EditorMenuTraceInfo info) {
              myEditorMenuTraceInfo = info;
            }
            @Nullable
            @Override
            public String getLabelText(String pattern) {
              return ")";
            }

            @Override
            public void execute(@NotNull String pattern) {
              SNode parentExpression = SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));
              SNode parens = ParenthesisUtil.createUnmatchedRightParenthesis(parentExpression);
              if (Objects.equals(parens, parentExpression)) {
                SelectionUtil.selectLabelCellAnSetCaret(_context.getEditorContext(), AttributeOperations.getAttribute(parens, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x2052c4520af308e1L, "jetbrains.mps.baseLanguage.structure.IncompleteRightParen"))), SelectionManager.LAST_CELL, -1);
              } else {
                SelectionUtil.selectLabelCellAnSetCaret(_context.getEditorContext(), parens, SelectionManager.LAST_CELL, -1);
              }
              return;
            }


            @Nullable
            @Override
            public SAbstractConcept getOutputConcept() {
              return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression");
            }
            @Override
            public String getShortDescriptionText(@NotNull String pattern) {
              return "Complete parens";
            }


            @Override
            public EditorMenuTraceInfo getTraceInfo() {
              return myEditorMenuTraceInfo;
            }
          }

        }
      }
    }
  }
}
