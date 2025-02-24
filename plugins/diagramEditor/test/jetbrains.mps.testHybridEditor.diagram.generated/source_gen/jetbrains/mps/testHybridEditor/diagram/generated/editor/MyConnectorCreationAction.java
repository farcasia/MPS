package jetbrains.mps.testHybridEditor.diagram.generated.editor;

/*Generated by MPS */

import jetbrains.mps.lang.editor.diagram.runtime.jetpad.palette.openapi.PaletteToggleAction;
import jetbrains.jetpad.projectional.view.ViewTrait;
import jetbrains.mps.nodeEditor.cells.jetpad.DiagramCell;
import javax.swing.Icon;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.jetpad.projectional.view.ViewTraitBuilder;
import jetbrains.jetpad.projectional.view.ViewEvents;
import jetbrains.jetpad.projectional.view.ViewEventHandler;
import jetbrains.jetpad.event.MouseEvent;
import jetbrains.jetpad.projectional.view.View;
import jetbrains.mps.nodeEditor.cells.jetpad.JetpadUtils;
import org.jetbrains.mps.openapi.module.SRepository;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.Objects;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class MyConnectorCreationAction implements PaletteToggleAction {
  private ViewTrait myTrait;
  private DiagramCell myDiagramCell;
  private String myText;
  private Icon myIcon;
  public MyConnectorCreationAction(DiagramCell diagramCell) {
    myDiagramCell = diagramCell;
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myText = "Connector";
        myIcon = IconManager.getIcon(MetaAdapterFactory.getConcept(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x20a804e2ec441516L, "jetbrains.mps.testHybridEditor.structure.ConnectorInstance"));
      }
    });
  }
  protected ViewTrait getTrait() {
    if (myTrait == null) {
      myTrait = new ViewTraitBuilder().on(ViewEvents.MOUSE_DRAGGED, new ViewEventHandler<MouseEvent>() {
        @Override
        public void handle(View view, MouseEvent event) {
          if (!(myDiagramCell.hasConnectionDragFeedback())) {
            View sourceView = view.viewAt(event.location());
            if (sourceView == null || !(check_lbjacb_a0a1a0a0a0b0a0a0a0a0f(sourceView.prop(JetpadUtils.CONNECTION_SOURCE).get()))) {
              return;
            }
            myDiagramCell.showConnectionDragFeedback(sourceView);
          }
          myDiagramCell.updateConnectionDragFeedback(event.location());
        }
      }).on(ViewEvents.MOUSE_RELEASED, new ViewEventHandler<MouseEvent>() {
        @Override
        public void handle(View view, MouseEvent event) {
          if (!(myDiagramCell.hasConnectionDragFeedback())) {
            return;
          }
          myDiagramCell.hideConnectionDragFeedback();
          final SRepository repo = myDiagramCell.getContext().getRepository();
          final DiagramCell.ConnectionInfo connectionInfo = myDiagramCell.getConnectionInfo();
          final Wrappers._boolean result = new Wrappers._boolean(false);
          repo.getModelAccess().runReadAction(new Runnable() {
            public void run() {
              if (connectionInfo.isValid() && SNodeOperations.isInstanceOf(connectionInfo.getFromNode(), MetaAdapterFactory.getConcept(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x20a804e2ec43f49dL, "jetbrains.mps.testHybridEditor.structure.BlockInstance")) && connectionInfo.getFromId() instanceof SNode && SNodeOperations.isInstanceOf(connectionInfo.getToNode(), MetaAdapterFactory.getConcept(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x20a804e2ec43f49dL, "jetbrains.mps.testHybridEditor.structure.BlockInstance")) && connectionInfo.getToId() instanceof SNode && Objects.equals(SNodeOperations.getContainingLink(((SNode) connectionInfo.getToId())), MetaAdapterFactory.getContainmentLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x20a804e2ec40c2c8L, 0x20a804e2ec410486L, "inMetaPorts"))) {
                result.value = true;
              }
            }
          });
          if (!(result.value)) {
            return;
          }
          repo.getModelAccess().executeCommand(new Runnable() {
            public void run() {
              SNode connectorInstance = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x20a804e2ec441516L, "jetbrains.mps.testHybridEditor.structure.ConnectorInstance"));
              SLinkOperations.setTarget(connectorInstance, MetaAdapterFactory.getContainmentLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x20a804e2ec441516L, 0x49664459198225c0L, "source"), SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x4966445919822461L, "jetbrains.mps.testHybridEditor.structure.ConnectorEndInstance")));
              SLinkOperations.setTarget(connectorInstance, MetaAdapterFactory.getContainmentLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x20a804e2ec441516L, 0x49664459198225c6L, "target"), SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x4966445919822461L, "jetbrains.mps.testHybridEditor.structure.ConnectorEndInstance")));
              SLinkOperations.setTarget(SLinkOperations.getTarget(connectorInstance, MetaAdapterFactory.getContainmentLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x20a804e2ec441516L, 0x49664459198225c0L, "source")), MetaAdapterFactory.getReferenceLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x4966445919822461L, 0x49664459198225bcL, "block"), SNodeOperations.cast(connectionInfo.getFromNode(), MetaAdapterFactory.getConcept(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x20a804e2ec43f49dL, "jetbrains.mps.testHybridEditor.structure.BlockInstance")));
              SLinkOperations.setTarget(SLinkOperations.getTarget(connectorInstance, MetaAdapterFactory.getContainmentLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x20a804e2ec441516L, 0x49664459198225c0L, "source")), MetaAdapterFactory.getReferenceLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x4966445919822461L, 0x49664459198225bdL, "metaPort"), ((SNode) connectionInfo.getFromId()));
              SLinkOperations.setTarget(SLinkOperations.getTarget(connectorInstance, MetaAdapterFactory.getContainmentLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x20a804e2ec441516L, 0x49664459198225c6L, "target")), MetaAdapterFactory.getReferenceLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x4966445919822461L, 0x49664459198225bcL, "block"), SNodeOperations.cast(connectionInfo.getToNode(), MetaAdapterFactory.getConcept(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x20a804e2ec43f49dL, "jetbrains.mps.testHybridEditor.structure.BlockInstance")));
              SLinkOperations.setTarget(SLinkOperations.getTarget(connectorInstance, MetaAdapterFactory.getContainmentLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x20a804e2ec441516L, 0x49664459198225c6L, "target")), MetaAdapterFactory.getReferenceLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0x4966445919822461L, 0x49664459198225bdL, "metaPort"), ((SNode) connectionInfo.getToId()));
              ListSequence.fromList(SLinkOperations.getChildren(((SNode) myDiagramCell.getSNode()), MetaAdapterFactory.getContainmentLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0xa10615a65702ec1L, 0x20a804e2ec4425e0L, "newConnectors"))).addElement(connectorInstance);
            }
          });
          event.consume();

        }
      }).build();
    }
    return myTrait;
  }


  public void onClick() {
    myDiagramCell.setExternalTrait(getTrait());
  }
  public Icon getIcon() {
    return myIcon;
  }
  public String getText() {
    return myText;
  }
  private static boolean check_lbjacb_a0a1a0a0a0b0a0a0a0a0f(Boolean checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.booleanValue();
    }
    return false;
  }
}
