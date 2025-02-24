package jetbrains.mps.lang.smodel.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.runtime.TemplateDeclarationBase;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.smodel.SReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.runtime.NodeWeaveFacility;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SContainmentLink;

@Generated
public class Template_reduce_ModuleReferenceExpression extends TemplateDeclarationBase {

  public Template_reduce_ModuleReferenceExpression() {
  }

  public SNodeReference getTemplateNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "4040588429969066518");
  }
  protected SNode applyPart0(@NotNull final TemplateContext context) throws GenerationException {
    final TemplateExecutionEnvironment environment = context.getEnvironment();
    final SNode tnode1 = environment.createOutputNode(myConcepts[0]);
    try {
      TemplateContext context1 = context.subContext();
      {
        final SNode tnode2 = environment.createOutputNode(myConcepts[1]);
        try {
          tnode2.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode2, PersistenceFacade.getInstance().createModelReference("6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)"), PersistenceFacade.getInstance().createNodeId("~ModuleRepositoryFacade")));
          tnode2.setReference(myAssociationLinks[1], SReference.create(myAssociationLinks[1], tnode2, PersistenceFacade.getInstance().createModelReference("6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)"), PersistenceFacade.getInstance().createNodeId("~ModuleRepositoryFacade.getInstance():jetbrains.mps.smodel.ModuleRepositoryFacade")));
        } finally {
        }
        tnode1.addChild(myAggregationLinks[0], tnode2);
        // TODO validate child 
      }
      {
        final SNode tnode3 = environment.createOutputNode(myConcepts[2]);
        try {
          tnode3.setReference(myAssociationLinks[1], SReference.create(myAssociationLinks[1], tnode3, PersistenceFacade.getInstance().createModelReference("6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)"), PersistenceFacade.getInstance().createNodeId("~ModuleRepositoryFacade.getModule(org.jetbrains.mps.openapi.module.SModuleReference):org.jetbrains.mps.openapi.module.SModule")));
          TemplateContext context2 = context1.subContext();
          {
            Collection<SNode> tlist4 = null;
            tlist4 = new Template_reduce_ModuleReferenceFromString().apply(environment, context2);
            for (SNode child5 : TemplateUtil.asNotNull(tlist4)) {
              tnode3.addChild(myAggregationLinks[1], child5);
            }
            // TODO validate child 
          }
        } finally {
        }
        tnode1.addChild(myAggregationLinks[2], tnode3);
        // TODO validate child 
      }
    } finally {
    }
    return tnode1;
  }
  @Override
  public Collection<SNode> apply(@NotNull TemplateExecutionEnvironment environment, @NotNull TemplateContext context) throws GenerationException {
    return TemplateUtil.singletonList(applyPart0(context));
  }

  @Override
  public Collection<SNode> weave(@NotNull NodeWeaveFacility.WeaveContext weaveContext, @NotNull NodeWeaveFacility weaveSupport) throws GenerationException {
    final TemplateContext templateContext = weaveSupport.getTemplateContext();
    SNode tnodepart0 = applyPart0(templateContext);
    weaveSupport.weaveNode(MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0xfe43cb41d0L, 0xfe43de823bL, "contentNode"), tnodepart0);
    return TemplateUtil.singletonList(tnodepart0);
  }
  @Override
  protected SConcept[] initConcepts() {
    SConcept[] rv = new SConcept[3];
    rv[0] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x116b46a08c4L, "DotExpression");
    rv[1] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf09L, "StaticMethodCall");
    rv[2] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x118154a6332L, "InstanceMethodCallOperation");
    return rv;
  }
  @Override
  protected SReferenceLink[] initAssociationLinks() {
    SReferenceLink[] rv = new SReferenceLink[2];
    rv[0] = MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept");
    rv[1] = MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration");
    return rv;
  }
  @Override
  protected SContainmentLink[] initAggregationLinks() {
    SContainmentLink[] rv = new SContainmentLink[3];
    rv[0] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46a4416L, "operand");
    rv[1] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument");
    rv[2] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46b36c4L, "operation");
    return rv;
  }
}
