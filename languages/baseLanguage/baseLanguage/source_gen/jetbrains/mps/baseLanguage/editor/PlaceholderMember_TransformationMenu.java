package jetbrains.mps.baseLanguage.editor;

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
import jetbrains.mps.lang.editor.menus.transformation.DefaultConceptMenusTransformationMenuPart;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.menus.GroupMenuPart;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import java.util.Arrays;
import jetbrains.mps.lang.editor.menus.transformation.ConstraintsFilteringTransformationMenuPartDecorator;
import jetbrains.mps.lang.editor.menus.SingleItemMenuPart;
import org.jetbrains.annotations.Nullable;
import org.apache.log4j.Logger;
import jetbrains.mps.openapi.editor.menus.transformation.ActionItemBase;
import jetbrains.mps.nodeEditor.cellMenu.SideTransformCompletionActionItem;
import jetbrains.mps.openapi.editor.menus.transformation.ConstraintsVerifiableActionItem;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import jetbrains.mps.baseLanguage.actions.ModuleDependencyUtils;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.editor.runtime.selection.SelectionUtil;
import jetbrains.mps.openapi.editor.selection.SelectionManager;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class PlaceholderMember_TransformationMenu extends TransformationMenuBase {
  private final Set<String> myLocations = SetSequence.fromSetAndArray(new HashSet<String>(), MenuLocations.LEFT_SIDE_TRANSFORM, MenuLocations.RIGHT_SIDE_TRANSFORM, MenuLocations.LEFT_SIDE_TRANSFORM);
  @Override
  public boolean isApplicableToLocation(@NotNull String location) {
    return SetSequence.fromSet(myLocations).contains(location);
  }

  @NotNull
  @Override
  public List<TransformationMenuItem> createMenuItems(@NotNull TransformationMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default transformation menu for " + "PlaceholderMember", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586941955")));
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
    if (ListSequence.fromListAndArray(new ArrayList<String>(), MenuLocations.LEFT_SIDE_TRANSFORM, MenuLocations.RIGHT_SIDE_TRANSFORM).contains(_context.getMenuLocation())) {
      result.add(new DefaultConceptMenusTransformationMenuPart(SModelUtil.getDirectSuperConcepts(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1458378889e6d166L, "jetbrains.mps.baseLanguage.structure.PlaceholderMember"))) {
        @NotNull
        @Override
        public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
          context.getEditorMenuTrace().pushTraceInfo();
          context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include menus for all the direct superconcepts of " + "PlaceholderMember", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586941960")));
          try {
            return super.createItems(context);
          } finally {
            context.getEditorMenuTrace().popTraceInfo();
          }
        }

      });
    }
    if (ListSequence.fromListAndArray(new ArrayList<String>(), MenuLocations.LEFT_SIDE_TRANSFORM).contains(_context.getMenuLocation())) {
      result.add(new PlaceholderMember_TransformationMenu.TMP_Group_29uwod_a1());
    }
    return result;
  }

  public class TMP_Group_29uwod_a1 extends GroupMenuPart<TransformationMenuItem, TransformationMenuContext> {
    @Override
    protected boolean isApplicable(TransformationMenuContext _context) {
      SNode nextSibling = SNodeOperations.getNextSibling(_context.getNode());
      while (nextSibling != null && SNodeOperations.isInstanceOf(nextSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1458378889e6d166L, "jetbrains.mps.baseLanguage.structure.PlaceholderMember"))) {
        nextSibling = SNodeOperations.getNextSibling(nextSibling);
      }
      return nextSibling != null && ((SNodeOperations.isInstanceOf(nextSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca68L, "jetbrains.mps.baseLanguage.structure.FieldDeclaration")) && (AttributeOperations.getAttribute(SNodeOperations.cast(nextSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca68L, "jetbrains.mps.baseLanguage.structure.FieldDeclaration")), new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment"))) == null)) || (SNodeOperations.isInstanceOf(nextSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93c84351fL, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")) && (AttributeOperations.getAttribute(SNodeOperations.cast(nextSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93c84351fL, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")), new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment"))) == null)) || (SNodeOperations.isInstanceOf(nextSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")) && (AttributeOperations.getAttribute(SNodeOperations.cast(nextSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")), new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7faeeb34L, "jetbrains.mps.baseLanguage.javadoc.structure.MethodDocComment"))) == null)));
    }

    @NotNull
    @Override
    public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("transformation menu group", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586941965")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }
    @Override
    protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts() {
      return Arrays.<MenuPart<TransformationMenuItem, TransformationMenuContext>>asList(new ConstraintsFilteringTransformationMenuPartDecorator(new PlaceholderMember_TransformationMenu.TMP_Group_29uwod_a1.TMP_Action_29uwod_a0b(), MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7fae70d3L, "jetbrains.mps.baseLanguage.javadoc.structure.BaseDocComment")));
    }
    private class TMP_Action_29uwod_a0b extends SingleItemMenuPart<TransformationMenuItem, TransformationMenuContext> {
      @Nullable
      protected TransformationMenuItem createItem(TransformationMenuContext context) {
        PlaceholderMember_TransformationMenu.TMP_Group_29uwod_a1.TMP_Action_29uwod_a0b.Item item = new PlaceholderMember_TransformationMenu.TMP_Group_29uwod_a1.TMP_Action_29uwod_a0b.Item(context);
        String description;
        try {
          description = "single item: " + item.getLabelText("");
        } catch (Throwable t) {
          Logger.getLogger(getClass()).error("Exception while executing getText of the item " + item, t);
          return null;
        }
        context.getEditorMenuTrace().pushTraceInfo();
        try {
          context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase(description, new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586942038")));
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
          return "/**";
        }

        @Override
        public void execute(@NotNull String pattern) {
          ModuleDependencyUtils.addDependencyOnJavaDocIfMissing(SNodeOperations.getModel(_context.getNode()));

          SNode nextSibling = SNodeOperations.getNextSibling(_context.getNode());
          while (nextSibling != null && SNodeOperations.isInstanceOf(nextSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1458378889e6d166L, "jetbrains.mps.baseLanguage.structure.PlaceholderMember"))) {
            SNode toBeRemoved = nextSibling;
            nextSibling = SNodeOperations.getNextSibling(nextSibling);
            SNodeOperations.deleteNode(toBeRemoved);
          }

          if (SNodeOperations.isInstanceOf(nextSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93c84351fL, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration"))) {
            SNode fieldDeclaration = SNodeOperations.cast(nextSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93c84351fL, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration"));
            SNodeFactoryOperations.setNewAttribute(fieldDeclaration, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment")), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment")));
            SNode line = SNodeFactoryOperations.addNewChild(AttributeOperations.getAttribute(fieldDeclaration, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment"))), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7fae70d3L, 0x757ba20a4c87f96eL, "body"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x757ba20a4c87f96cL, "jetbrains.mps.baseLanguage.javadoc.structure.CommentLine")));
            SNodeFactoryOperations.addNewChild(line, MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x757ba20a4c87f96cL, 0x7c7f5b2f3199028dL, "part"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x7c7f5b2f31990287L, "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart")));
            SelectionUtil.selectLabelCellAnSetCaret(_context.getEditorContext(), AttributeOperations.getAttribute(fieldDeclaration, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment"))), SelectionManager.FIRST_ERROR_CELL + "|" + SelectionManager.FOCUS_POLICY_CELL + "|" + SelectionManager.FIRST_EDITABLE_CELL + "|" + SelectionManager.FIRST_CELL, -1);
            return;
          } else if (SNodeOperations.isInstanceOf(nextSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca68L, "jetbrains.mps.baseLanguage.structure.FieldDeclaration"))) {
            SNode fieldDeclaration = SNodeOperations.cast(nextSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca68L, "jetbrains.mps.baseLanguage.structure.FieldDeclaration"));
            SNodeFactoryOperations.setNewAttribute(fieldDeclaration, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment")), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment")));
            SNode line = SNodeFactoryOperations.addNewChild(AttributeOperations.getAttribute(fieldDeclaration, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment"))), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7fae70d3L, 0x757ba20a4c87f96eL, "body"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x757ba20a4c87f96cL, "jetbrains.mps.baseLanguage.javadoc.structure.CommentLine")));
            SNodeFactoryOperations.addNewChild(line, MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x757ba20a4c87f96cL, 0x7c7f5b2f3199028dL, "part"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x7c7f5b2f31990287L, "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart")));
            SelectionUtil.selectLabelCellAnSetCaret(_context.getEditorContext(), AttributeOperations.getAttribute(fieldDeclaration, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment"))), SelectionManager.FIRST_ERROR_CELL + "|" + SelectionManager.FOCUS_POLICY_CELL + "|" + SelectionManager.FIRST_EDITABLE_CELL + "|" + SelectionManager.FIRST_CELL, -1);
            return;
          } else {
            SNode methodDeclaration = SNodeOperations.cast(nextSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"));
            SNodeFactoryOperations.setNewAttribute(methodDeclaration, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7faeeb34L, "jetbrains.mps.baseLanguage.javadoc.structure.MethodDocComment")), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7faeeb34L, "jetbrains.mps.baseLanguage.javadoc.structure.MethodDocComment")));
            SNode line = SNodeFactoryOperations.addNewChild(AttributeOperations.getAttribute(methodDeclaration, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7faeeb34L, "jetbrains.mps.baseLanguage.javadoc.structure.MethodDocComment"))), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7fae70d3L, 0x757ba20a4c87f96eL, "body"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x757ba20a4c87f96cL, "jetbrains.mps.baseLanguage.javadoc.structure.CommentLine")));
            SNodeFactoryOperations.addNewChild(line, MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x757ba20a4c87f96cL, 0x7c7f5b2f3199028dL, "part"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x7c7f5b2f31990287L, "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart")));
            SelectionUtil.selectLabelCellAnSetCaret(_context.getEditorContext(), AttributeOperations.getAttribute(methodDeclaration, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7faeeb34L, "jetbrains.mps.baseLanguage.javadoc.structure.MethodDocComment"))), SelectionManager.FIRST_ERROR_CELL + "|" + SelectionManager.FOCUS_POLICY_CELL + "|" + SelectionManager.FIRST_EDITABLE_CELL + "|" + SelectionManager.FIRST_CELL, -1);
            return;
          }
        }


        @Nullable
        @Override
        public SAbstractConcept getOutputConcept() {
          return MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7fae70d3L, "jetbrains.mps.baseLanguage.javadoc.structure.BaseDocComment");
        }
        @Override
        public String getShortDescriptionText(@NotNull String pattern) {
          return "Add Documentation Comment";
        }


        @Override
        public EditorMenuTraceInfo getTraceInfo() {
          return myEditorMenuTraceInfo;
        }
      }

    }
  }
}
