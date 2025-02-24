package jetbrains.mps.lang.smodel.actions;

/*Generated by MPS */

import jetbrains.mps.openapi.actions.descriptor.NodeFactory;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class Node_GetChildrenAndChildAttributesOperation_Factory {
  public static class NodeFactory_7457491784609238794 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      SNode parameter = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x47bb2de70d00ff8cL, "jetbrains.mps.lang.smodel.structure.OperationParm_LinkQualifier"));
      ListSequence.fromList(SLinkOperations.getChildren(newNode, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x1090ea2ebacL, 0x10a61ef5a56L, "parameter"))).addElement(parameter);
      SNode refQualifier = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x11886c4bac0L, "jetbrains.mps.lang.smodel.structure.LinkRefQualifier"));
      SLinkOperations.setTarget(parameter, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x47bb2de70d00ff8cL, 0x47bb2de70d00ff8dL, "linkQualifier"), refQualifier);
    }
  }
}
