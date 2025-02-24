package jetbrains.mps.lang.quotation.editor;

/*Generated by MPS */

import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuComponent;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.language.LanguageRegistry;
import org.jetbrains.mps.openapi.language.SLanguage;
import jetbrains.mps.smodel.SLanguageHierarchy;
import jetbrains.mps.smodel.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.openapi.editor.menus.EditorMenuDescriptor;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;

public class Quotation_quotedNode extends AbstractCellMenuComponent {
  public Quotation_quotedNode() {
    super(new SubstituteInfoPartExt[]{new Quotation_quotedNode.Quotation_generic_cellMenu_61vnku_a0()});
  }
  public static class Quotation_generic_cellMenu_61vnku_a0 extends AbstractCellMenuPart_Generic_Group {
    public Quotation_generic_cellMenu_61vnku_a0() {
    }

    public List<?> createParameterObjects(SNode node, IOperationContext operationContext, EditorContext editorContext) {
      List<SAbstractConcept> result = ListSequence.fromList(new ArrayList<SAbstractConcept>());
      LanguageRegistry lr = LanguageRegistry.getInstance(editorContext.getRepository());
      for (SLanguage l : new SLanguageHierarchy(lr, SModelOperations.getAllLanguageImports(SNodeOperations.getModel(node))).getExtended()) {
        for (SAbstractConcept c : l.getConcepts()) {
          if (!(c.isAbstract())) {
            ListSequence.fromList(result).addElement(c);
          }
        }
      }
      return result;
    }
    protected void handleAction(Object parameterObject, SNode node, SModel model, IOperationContext operationContext, EditorContext editorContext) {
      this.handleAction_impl((SAbstractConcept) parameterObject, node, model, operationContext, editorContext);
    }
    public void handleAction_impl(SAbstractConcept parameterObject, SNode node, SModel model, IOperationContext operationContext, EditorContext editorContext) {
      SNode oldInstance = SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x1168c104659L, 0x1168c10465aL, "quotedNode"));
      SLinkOperations.setTarget(node, MetaAdapterFactory.getContainmentLink(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x1168c104659L, 0x1168c10465aL, "quotedNode"), SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(parameterObject), null));
      if (oldInstance != null) {
        SNodeOperations.deleteNode(oldInstance);
      }
    }
    public boolean isReferentPresentation() {
      return true;
    }

    @Override
    protected EditorMenuDescriptor getEditorMenuDescriptor(Object parameterObject) {
      return new EditorMenuDescriptorBase("generic group with parameter: " + ((parameterObject == null ? "null" : parameterObject.toString())), new SNodePointer("r:00000000-0000-4000-0000-011c89590349(jetbrains.mps.lang.quotation.editor)", "8802842484753224591"));
    }
  }
}
