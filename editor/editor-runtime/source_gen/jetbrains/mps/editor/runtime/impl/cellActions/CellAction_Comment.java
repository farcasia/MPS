package jetbrains.mps.editor.runtime.impl.cellActions;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.nodeEditor.selectionRestoring.RestorableSelection;
import jetbrains.mps.nodeEditor.selectionRestoring.RestorableSelectionByNode;
import jetbrains.mps.nodeEditor.selectionRestoring.RestorableSelectionComposite;

/**
 * Used only in CellAction_CommentOrUncomment
 * Remove when there will be no instances in generated code
 * 
 * @deprecated 
 */
@Deprecated
public class CellAction_Comment extends AbstractCommentAction {
  private final SNode myNode;


  @Deprecated
  public CellAction_Comment(@NotNull SNode node) {
    myNode = node;
  }

  @Override
  public boolean canExecute(EditorContext editorContext) {
    if (SNodeOperations.getParent(this.myNode) == null || SNodeOperations.isInstanceOf(SNodeOperations.getParent(myNode), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x3dcc194340c24debL, "jetbrains.mps.lang.core.structure.BaseCommentAttribute"))) {
      return false;
    }
    return isNonTrivialSingleSelection(editorContext);
  }

  public void executeInternal(EditorContext editorContext) {
    if (!(SNodeOperations.isInstanceOf(myNode, MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x47bf8397520e5939L, "jetbrains.mps.lang.core.structure.Attribute")))) {
      CommentUtil.commentOut(myNode);
    }
  }

  protected RestorableSelection createRestorableSelection(EditorContext editorContext) {
    RestorableSelection firstSelection = super.createRestorableSelection(editorContext);
    RestorableSelectionByNode secondSelection = new RestorableSelectionByNode(myNode);
    return new RestorableSelectionComposite(firstSelection, secondSelection);
  }

}
