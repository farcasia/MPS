package jetbrains.mps.lang.editor.diagram.runtime.jetpad.palette.impl;

/*Generated by MPS */

import jetbrains.mps.lang.editor.diagram.runtime.jetpad.palette.openapi.PaletteActionGroup;
import jetbrains.mps.openapi.editor.cells.SubstituteInfo;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.jetpad.DiagramCell;
import javax.swing.Icon;
import jetbrains.mps.util.annotation.ToRemove;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.MetaAdapterByDeclaration;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.lang.editor.diagram.runtime.jetpad.palette.openapi.PaletteElement;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.List;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.nodeEditor.cellMenu.CellContext;
import jetbrains.mps.smodel.action.AbstractNodeSubstituteAction;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import java.util.Collections;
import jetbrains.mps.smodel.action.NodeSubstituteActionWrapper;

public class PaletteConnectorCreationActionGroup implements PaletteActionGroup {
  private SubstituteInfo mySubstituteInfo;
  private EditorContext myEditorContext;
  private _FunctionTypes._return_P4_E0<? extends Boolean, ? super SNode, ? super Object, ? super SNode, ? super Object> myCanCreateConnectorCallback;
  private _FunctionTypes._void_P5_E0<? super SNode, ? super SNode, ? super Object, ? super SNode, ? super Object> mySetConnectorCallBack;
  private DiagramCell myDiagramCell;
  private Icon myIcon;
  @Deprecated
  @ToRemove(version = 3.5)
  public PaletteConnectorCreationActionGroup(DiagramCell diagramCell, SNode container, SNode childNodeConcept, SNode containingLink, final _FunctionTypes._return_P4_E0<? extends Boolean, ? super SNode, ? super Object, ? super SNode, ? super Object> canCreateConnector, final _FunctionTypes._void_P5_E0<? super SNode, ? super SNode, ? super Object, ? super SNode, ? super Object> setConnectorCallback) {
    this(diagramCell, container, SNodeOperations.asSConcept(childNodeConcept), MetaAdapterByDeclaration.getContainmentLink(containingLink), canCreateConnector, setConnectorCallback);
  }
  public PaletteConnectorCreationActionGroup(DiagramCell diagramCell, SNode container, SAbstractConcept childConcept, SContainmentLink containingLink, final _FunctionTypes._return_P4_E0<? extends Boolean, ? super SNode, ? super Object, ? super SNode, ? super Object> canCreateConnector, final _FunctionTypes._void_P5_E0<? super SNode, ? super SNode, ? super Object, ? super SNode, ? super Object> setConnectorCallback) {
    myDiagramCell = diagramCell;
    myEditorContext = diagramCell.getContext();
    myCanCreateConnectorCallback = canCreateConnector;
    mySetConnectorCallBack = setConnectorCallback;
    mySubstituteInfo = new CompositeSubstituteInfo(myEditorContext, new BasicCellContext(diagramCell.getSNode()), new SubstituteInfoPartExt[]{createNewDiagramConnectorActions(container, childConcept, containingLink, canCreateConnector, setConnectorCallback)});
    myIcon = IconManager.getIcon(childConcept);
  }
  public PaletteElement[] getElements() {
    mySubstituteInfo.invalidateActions();
    return ListSequence.fromList(((List<SubstituteAction>) mySubstituteInfo.getMatchingActions("", false))).select(new ISelector<SubstituteAction, PaletteConnectorCreationAction>() {
      public PaletteConnectorCreationAction select(SubstituteAction it) {
        return new PaletteConnectorCreationAction(myDiagramCell, it, myCanCreateConnectorCallback, mySetConnectorCallBack, myEditorContext);
      }
    }).toGenericArray(PaletteConnectorCreationAction.class);
  }
  public boolean isPopup() {
    return true;
  }
  public Icon getIcon() {
    return myIcon;
  }
  public String getText() {
    return null;
  }
  public SubstituteInfoPartExt createNewDiagramConnectorActions(final SNode container, final SAbstractConcept childNodeConcept, final SContainmentLink containingLink, final _FunctionTypes._return_P4_E0<? extends Boolean, ? super SNode, ? super Object, ? super SNode, ? super Object> canCreateConnector, final _FunctionTypes._void_P5_E0<? super SNode, ? super SNode, ? super Object, ? super SNode, ? super Object> setConnectorCallback) {
    // TMP solution: manually creating instance of connection instead of using 
    // ModelActions.createChildNodeSubstituteActions() because of mbeddr reqirements: 
    // hiding text-specific connection substitute actions from the diagram 
    return new SubstituteInfoPartExt() {
      public List<SubstituteAction> createActions(CellContext cellContext, final EditorContext editorContext) {
        AbstractNodeSubstituteAction action = new AbstractNodeSubstituteAction(childNodeConcept.getDeclarationNode(), childNodeConcept, container) {
          @Override
          protected SNode doSubstitute(@Nullable EditorContext context, String string) {
            SNode result = NodeFactoryManager.createNode(childNodeConcept, null, container, SNodeOperations.getModel(container));
            ListSequence.fromList(SNodeOperations.getChildren(container, containingLink)).addElement(result);
            return result;
          }
        };
        return Collections.<SubstituteAction>singletonList(new NodeSubstituteActionWrapper(action));
      }
    };
  }


}
