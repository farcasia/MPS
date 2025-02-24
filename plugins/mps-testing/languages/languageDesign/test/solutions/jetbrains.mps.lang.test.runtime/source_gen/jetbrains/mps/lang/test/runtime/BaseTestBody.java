package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.project.Project;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class BaseTestBody {
  public SModel myModel;
  public Project myProject;
  protected Map<SNode, SNode> myMap;
  private List<SNode> myCopies;

  public BaseTestBody() {
    myMap = MapSequence.fromMap(new HashMap<SNode, SNode>());
    myCopies = ListSequence.fromList(new ArrayList<SNode>());
  }

  public void addNodeById(final String id) throws Exception {
    myProject.getModelAccess().executeCommand(new Runnable() {
      public void run() {
        SNode node = myModel.getNode(SNodeId.fromString(id));
        SNode copy = CopyUtil.copy(node, myMap, true);
        for (SNode a : ListSequence.fromList(SNodeOperations.getNodeDescendants(copy, MetaAdapterFactory.getConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x11e0d52da47L, "jetbrains.mps.lang.test.structure.INodeAnnotation"), false, new SAbstractConcept[]{}))) {
          SNodeOperations.deleteNode(a);
        }
        myModel.addRootNode(copy);
        ListSequence.fromList(myCopies).addElement(copy);
      }
    });
  }

  public SNode getNodeById(String id) {
    return MapSequence.fromMap(myMap).get(myModel.getNode(SNodeId.fromString(id)));
  }

  public SNode getRealNodeById(String id) {
    return myModel.getNode(SNodeId.fromString(id));
  }
}
