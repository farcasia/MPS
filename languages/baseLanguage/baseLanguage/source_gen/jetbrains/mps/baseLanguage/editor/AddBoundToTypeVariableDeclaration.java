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
import jetbrains.mps.lang.editor.menus.SingleItemMenuPart;
import org.jetbrains.annotations.Nullable;
import org.apache.log4j.Logger;
import jetbrains.mps.openapi.editor.menus.transformation.ActionItemBase;
import jetbrains.mps.nodeEditor.cellMenu.SideTransformCompletionActionItem;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class AddBoundToTypeVariableDeclaration extends TransformationMenuBase {
  private final Set<String> myLocations = SetSequence.fromSetAndArray(new HashSet<String>(), MenuLocations.RIGHT_SIDE_TRANSFORM);
  @Override
  public boolean isApplicableToLocation(@NotNull String location) {
    return SetSequence.fromSet(myLocations).contains(location);
  }

  @NotNull
  @Override
  public List<TransformationMenuItem> createMenuItems(@NotNull TransformationMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("named transformation menu " + "AddBoundToTypeVariableDeclaration", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "4967345845881433048")));
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
      result.add(new AddBoundToTypeVariableDeclaration.TMP_Action_djneue_a0());
    }
    return result;
  }

  private class TMP_Action_djneue_a0 extends SingleItemMenuPart<TransformationMenuItem, TransformationMenuContext> {
    @Nullable
    protected TransformationMenuItem createItem(TransformationMenuContext context) {
      AddBoundToTypeVariableDeclaration.TMP_Action_djneue_a0.Item item = new AddBoundToTypeVariableDeclaration.TMP_Action_djneue_a0.Item(context);
      String description;
      try {
        description = "single item: " + item.getLabelText("");
      } catch (Throwable t) {
        Logger.getLogger(getClass()).error("Exception while executing getText of the item " + item, t);
        return null;
      }
      context.getEditorMenuTrace().pushTraceInfo();
      try {
        context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase(description, new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "4967345845881433068")));
        item.setTraceInfo(context.getEditorMenuTrace().getTraceInfo());
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
      return item;
    }

    private class Item extends ActionItemBase implements SideTransformCompletionActionItem {
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
        return "extends";
      }

      @Override
      public void execute(@NotNull String pattern) {
        SNodeFactoryOperations.setNewChild(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1024639ed74L, 0x11ae375bda0L, "bound"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL, "jetbrains.mps.baseLanguage.structure.Type")));
      }

      @Override
      public boolean canExecute(@NotNull String pattern) {
        return (SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1024639ed74L, 0x11ae375bda0L, "bound")) == null);
      }



      @Override
      public EditorMenuTraceInfo getTraceInfo() {
        return myEditorMenuTraceInfo;
      }
    }

  }
}
