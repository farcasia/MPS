package jetbrains.mps.core.xml.editor;

/*Generated by MPS */

import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuComponent;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.openapi.editor.menus.EditorMenuDescriptor;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;

public class ExternalIdMenu extends AbstractCellMenuComponent {
  public ExternalIdMenu() {
    super(new SubstituteInfoPartExt[]{new ExternalIdMenu.XmlExternalId_generic_cellMenu_kwmulu_a0()});
  }
  public static class XmlExternalId_generic_cellMenu_kwmulu_a0 extends AbstractCellMenuPart_Generic_Group {
    public XmlExternalId_generic_cellMenu_kwmulu_a0() {
    }

    public List<?> createParameterObjects(SNode node, IOperationContext operationContext, EditorContext editorContext) {
      if (SPropertyOperations.getBoolean(node, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x1d9c27c394f6033fL, 0x1d9c27c394f60345L, "isPublic"))) {
        return ListSequence.fromListAndArray(new ArrayList<String>(), "SYSTEM");
      }
      return ListSequence.fromListAndArray(new ArrayList<String>(), "PUBLIC");
    }
    protected void handleAction(Object parameterObject, SNode node, SModel model, IOperationContext operationContext, EditorContext editorContext) {
      this.handleAction_impl((String) parameterObject, node, model, operationContext, editorContext);
    }
    public void handleAction_impl(String parameterObject, SNode node, SModel model, IOperationContext operationContext, EditorContext editorContext) {
      SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x1d9c27c394f6033fL, 0x1d9c27c394f60345L, "isPublic"), "" + (!(SPropertyOperations.getBoolean(node, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x1d9c27c394f6033fL, 0x1d9c27c394f60345L, "isPublic")))));
      editorContext.selectWRTFocusPolicy(node);
    }
    public boolean isReferentPresentation() {
      return false;
    }

    @Override
    protected EditorMenuDescriptor getEditorMenuDescriptor(Object parameterObject) {
      return new EditorMenuDescriptorBase("generic group with parameter: " + ((parameterObject == null ? "null" : parameterObject.toString())), new SNodePointer("r:2f32078d-2a84-4fef-b050-97e346d25159(jetbrains.mps.core.xml.editor)", "2133624044437948981"));
    }
  }
}
