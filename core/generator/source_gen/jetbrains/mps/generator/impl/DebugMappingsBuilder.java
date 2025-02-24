package jetbrains.mps.generator.impl;

/*Generated by MPS */

import org.jetbrains.mps.openapi.module.SRepository;
import jetbrains.mps.messages.IMessageHandler;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.ArrayList;
import java.util.Collections;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.smodel.behaviour.BHReflection;
import jetbrains.mps.core.aspects.behaviour.SMethodTrimmedId;
import org.jetbrains.mps.openapi.model.SNodeId;
import jetbrains.mps.extapi.model.TransientSModel;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.textgen.trace.TracingUtil;
import java.util.Collection;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.generator.impl.plan.CrossModelEnvironment;

public class DebugMappingsBuilder {
  private final SRepository myRepo;
  private final TransitionTrace myOriginTrace;
  private final IMessageHandler myMessageHandler;

  public DebugMappingsBuilder(SRepository repo, TransitionTrace originTrace, IMessageHandler messageHandler) {
    myRepo = repo;
    myOriginTrace = originTrace;
    myMessageHandler = messageHandler;
  }

  public SNode build(@NotNull SModel checkpointModel, GeneratorMappings mappings) {
    SNode rv = SModelOperations.createNewNode(checkpointModel, null, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc97f1c1L, "jetbrains.mps.lang.generator.structure.GeneratorDebug_Mappings"));
    ArrayList<String> availableLabels = new ArrayList<String>(mappings.getAvailableLabels());
    Collections.sort(availableLabels);
    for (String label : availableLabels) {
      SNode labelEntry = SModelOperations.createNewNode(checkpointModel, null, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c4L, "jetbrains.mps.lang.generator.structure.GeneratorDebug_LabelEntry"));
      SPropertyOperations.set(labelEntry, MetaAdapterFactory.getProperty(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c4L, 0x35a02f6bfc9810e9L, "label"), label);
      ListSequence.fromList(SLinkOperations.getChildren(rv, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc97f1c1L, 0x35a02f6bfc9806c5L, "labels"))).addElement(labelEntry);
      List<SNode> keys = mappings.getSortedMappingKeys(label);
      for (SNode keyInputNode : keys) {
        SNode entry = SModelOperations.createNewNode(checkpointModel, null, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c7L, "jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeMapEntry"));
        ListSequence.fromList(SLinkOperations.getChildren(labelEntry, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c4L, 0x35a02f6bfc9810ebL, "entries"))).addElement(entry);
        assert keyInputNode != null;
        SLinkOperations.setNewChild(entry, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c7L, 0x509c00a99889f77eL, "inputNode"), MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x509c00a998897534L, "jetbrains.mps.lang.generator.structure.GeneratorDebug_InputNode"));
        SNode inputNodeIdentity = SModelOperations.createNewNode(checkpointModel, null, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x7d58bd9fd9b64463L, "jetbrains.mps.lang.generator.structure.TrivialNodeId"));
        SNode inputNodeConceptIdentity = SModelOperations.createNewNode(checkpointModel, null, MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5fea1eb9fefb6fe7L, "jetbrains.mps.lang.smodel.structure.ConceptId"));
        BHReflection.invoke0(inputNodeConceptIdentity, MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5fea1eb9fefb6fe7L, "jetbrains.mps.lang.smodel.structure.ConceptId"), SMethodTrimmedId.create("setConcept", MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5fea1eb9fefb6fe7L, "jetbrains.mps.lang.smodel.structure.ConceptId"), "5ZE7FBYYR6j"), keyInputNode.getConcept());
        SLinkOperations.setTarget(inputNodeIdentity, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x7d58bd9fd9b64463L, 0x76c27c67a4605f07L, "cncpt"), inputNodeConceptIdentity);
        // keyInputNode comes from one of transient models, and we need to replace it with a 'stable' version, exposed in a CP (or initial) model 
        // XXX what if keyInputNode IS from CP model, wouldn't that give us wrong origin (the one from previous trace)? 
        //     Indeed, this makes sense only as long as we use user objects to pass origin value (TT object is essentially stateless), and copy these 
        //     when creating a CP model. If TT keeps map for the given transition only (bounded to previous CP), then the issue is likely less important 
        //     (though still valid - in case node id of a CP node matches nodeid of some irrelevant transient one). Would be great if we can tell if keyInputNode 
        //     comes from a transient, external or CP model. FIXME I still need to deal with 'foreign' nodes as ML keys, and then I could decide better what to do here. 
        SNodeId inputNodeId = (myOriginTrace.hasOrigin(keyInputNode) ? myOriginTrace.getOrigin(keyInputNode) : keyInputNode.getNodeId());
        SPropertyOperations.set(inputNodeIdentity, MetaAdapterFactory.getProperty(0xb401a68083254110L, 0x8fd384331ff25befL, 0x7d58bd9fd9b64463L, 0x7d58bd9fd9b64468L, "nodeId"), inputNodeId.toString());
        SLinkOperations.setTarget(SLinkOperations.getTarget(entry, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c7L, 0x509c00a99889f77eL, "inputNode")), MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x509c00a998897534L, 0x509c00a99889f0aeL, "node"), inputNodeIdentity);
        SPropertyOperations.set(SLinkOperations.getTarget(entry, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c7L, 0x509c00a99889f77eL, "inputNode")), MetaAdapterFactory.getProperty(0xb401a68083254110L, 0x8fd384331ff25befL, 0x509c00a998897534L, 0x509c00a99889f702L, "presentation"), keyInputNode.getPresentation());
        SModel inputNodeModel = keyInputNode.getModel();
        // in fact, inputNodeModel when keyInputNode is from the same model is unlikely to be checkpoint, we need its counterpart 
        // from myOriginTrace's checkpoint model, but I have no idea how to get one here. 
        if (inputNodeModel != null && (isCheckpointModel(inputNodeModel) || !(inputNodeModel instanceof TransientSModel))) {
          // no reason to save reference to a model that would be disposed and eventually break the reference 
          SPropertyOperations.set(SLinkOperations.getTarget(entry, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c7L, 0x509c00a99889f77eL, "inputNode")), MetaAdapterFactory.getProperty(0xb401a68083254110L, 0x8fd384331ff25befL, 0x509c00a998897534L, 0x509c00a9989481dbL, "modelName"), inputNodeModel.getName().getValue());
          // The problem with direct reference is that I need to respect change in model reference for persisted CP model if it changes 
          SLinkOperations.setTarget(SLinkOperations.getTarget(entry, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c7L, 0x509c00a99889f77eL, "inputNode")), MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x509c00a998897534L, 0x509c00a99889f6ffL, "nodePtr"), keyInputNode);
        }
        SNodeReference origin = TracingUtil.getInput(keyInputNode);
        SLinkOperations.setTarget(entry, MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c7L, 0x35a02f6bfc9806dbL, "inputOrigin"), (origin == null ? null : origin.resolve(myRepo)));
        Collection<SNode> c;
        Object valueOutputNode = mappings.getMappings(label).get(keyInputNode);
        if (valueOutputNode instanceof SNode) {
          SNode n = ((SNode) valueOutputNode);
          c = Collections.singleton(n);
        } else if (valueOutputNode instanceof Collection) {
          c = (Collection<SNode>) valueOutputNode;
        } else {
          c = Collections.emptyList();
        }
        for (SNode n : CollectionSequence.fromCollection(c)) {
          SNode r = SModelOperations.createNewNode(checkpointModel, null, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806d2L, "jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeRef"));
          SLinkOperations.setTarget(r, MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806d2L, 0x35a02f6bfc9806d3L, "node"), substituteOutputNode(checkpointModel, n));
          ListSequence.fromList(SLinkOperations.getChildren(entry, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c7L, 0x35a02f6bfc9806d5L, "outputNode"))).addElement(r);
        }
      }
    }
    for (String label : mappings.getConditionalRootLabels()) {
      SNode labelEntry = SModelOperations.createNewNode(checkpointModel, null, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c4L, "jetbrains.mps.lang.generator.structure.GeneratorDebug_LabelEntry"));
      SPropertyOperations.set(labelEntry, MetaAdapterFactory.getProperty(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c4L, 0x35a02f6bfc9810e9L, "label"), label);
      ListSequence.fromList(SLinkOperations.getChildren(rv, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc97f1c1L, 0x35a02f6bfc9806c5L, "labels"))).addElement(labelEntry);
      for (SNode cr : mappings.getConditionalRoots(label)) {
        SNode entry = SModelOperations.createNewNode(checkpointModel, null, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c7L, "jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeMapEntry"));
        SPropertyOperations.set(entry, MetaAdapterFactory.getProperty(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c7L, 0x511a0d44c7f45537L, "isNewRoot"), "" + (true));
        ListSequence.fromList(SLinkOperations.getChildren(labelEntry, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c4L, 0x35a02f6bfc9810ebL, "entries"))).addElement(entry);
        SNode r = SModelOperations.createNewNode(checkpointModel, null, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806d2L, "jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeRef"));
        SLinkOperations.setTarget(r, MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806d2L, 0x35a02f6bfc9806d3L, "node"), substituteOutputNode(checkpointModel, cr));
        ListSequence.fromList(SLinkOperations.getChildren(entry, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c7L, 0x35a02f6bfc9806d5L, "outputNode"))).addElement(r);
      }
    }
    return rv;
  }

  /**
   * GeneratorMappings keep nodes from transient models as ML output. They are not necessarily always
   * nodes from the very last step (i.e. if there's a transformation step that records ML and subsequent post-processing
   * script that modifies the model again, SNode values in GeneratorMappings would be 'stale' and likely from a model already
   * disposed (unless transients are kept). That's why we stick to SNodeId only.
   * It's unlikely (i.e. I can't imagine a reasonable scenario, other than explicit genContext.registerLabel) that an output node won't be from a transient model 
   * or that we would mistakenly take a wrong one (i.e. if aforementioned script removes a node registered as an ouput and adds another one with the same id).
   */
  private SNode substituteOutputNode(SModel checkpointModel, SNode n) {
    // Generator 
    SNode tn = checkpointModel.getNode(n.getNodeId());
    if (tn == null) {
      Message m = new Message(MessageKind.ERROR, getClass(), "Didn't find labeled output node in a checkpoint model, original value left.");
      m.setHintObject(n.getReference());
      myMessageHandler.handle(m);
      return n;
    }
    return tn;
  }

  private boolean isCheckpointModel(SModel m) {
    // CP models may be exposed as transients; we need to keep references to CP models 
    // Need better condition than just model attribute, though. 
    return CrossModelEnvironment.isCheckpointModel(m);
  }
}
