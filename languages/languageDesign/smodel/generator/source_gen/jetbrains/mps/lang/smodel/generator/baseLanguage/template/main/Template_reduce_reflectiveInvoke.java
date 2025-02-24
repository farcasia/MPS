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
import jetbrains.mps.generator.impl.reference.RefResolver;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.TemplateArgumentContext;
import jetbrains.mps.generator.runtime.NodeWeaveFacility;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SContainmentLink;

@Generated
public class Template_reduce_reflectiveInvoke extends TemplateDeclarationBase {

  public Template_reduce_reflectiveInvoke() {
  }

  public SNodeReference getTemplateNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "3866789353799081477");
  }
  protected SNode applyPart0(@NotNull final TemplateContext context) throws GenerationException {
    final TemplateExecutionEnvironment environment = context.getEnvironment();
    final SNode tnode1 = environment.createOutputNode(myConcepts[0]);
    try {
      tnode1.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode1, PersistenceFacade.getInstance().createModelReference("d936855b-48da-4812-a8a0-2bfddd633ac5/java:jetbrains.mps.smodel.behaviour(jetbrains.mps.lang.behavior.api/)"), PersistenceFacade.getInstance().createNodeId("~BHReflection.invoke0(org.jetbrains.mps.openapi.model.SNode,org.jetbrains.mps.openapi.language.SAbstractConcept,jetbrains.mps.core.aspects.behaviour.api.SMethodId,java.lang.Object...):java.lang.Object")));
      tnode1.setReference(myAssociationLinks[1], SReference.create(myAssociationLinks[1], tnode1, PersistenceFacade.getInstance().createModelReference("d936855b-48da-4812-a8a0-2bfddd633ac5/java:jetbrains.mps.smodel.behaviour(jetbrains.mps.lang.behavior.api/)"), PersistenceFacade.getInstance().createNodeId("~BHReflection")));
      TemplateContext context1 = context.subContext();
      {
        Collection<SNode> tlist2 = null;
        try {
          try {
            tlist2 = new Template_NodeOrConceptCommon().apply(environment, context1);
          } finally {
          }

        } finally {
        }
        for (SNode child3 : TemplateUtil.asNotNull(tlist2)) {
          tnode1.addChild(myAggregationLinks[0], child3);
        }
        // TODO validate child 
      }
      {
        final SNode tnode4 = environment.createOutputNode(myConcepts[1]);
        try {
          environment.resolve(new RefResolver(tnode4, myAssociationLinks[2], context1, new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "7939541470171874107"), "BaseConcept") {
            @Override
            public Object resolve() {
              return QueriesGenerated.referenceMacro_GetReferent_7939541470171874108(createQueryContext());
            }
          });
        } finally {
        }
        tnode1.addChild(myAggregationLinks[0], tnode4);
        // TODO validate child 
      }
      {
        final SNode tnode5 = environment.createOutputNode(myConcepts[0]);
        try {
          tnode5.setReference(myAssociationLinks[1], SReference.create(myAssociationLinks[1], tnode5, PersistenceFacade.getInstance().createModelReference("d936855b-48da-4812-a8a0-2bfddd633ac4/java:jetbrains.mps.core.aspects.behaviour(jetbrains.mps.lang.behavior.runtime/)"), PersistenceFacade.getInstance().createNodeId("~SMethodTrimmedId")));
          tnode5.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode5, PersistenceFacade.getInstance().createModelReference("d936855b-48da-4812-a8a0-2bfddd633ac4/java:jetbrains.mps.core.aspects.behaviour(jetbrains.mps.lang.behavior.runtime/)"), PersistenceFacade.getInstance().createNodeId("~SMethodTrimmedId.create(java.lang.String,org.jetbrains.mps.openapi.language.SAbstractConcept,java.lang.String):jetbrains.mps.core.aspects.behaviour.SMethodTrimmedId")));
          TemplateContext context2 = context1.subContext();
          {
            final SNode tnode6 = environment.createOutputNode(myConcepts[2]);
            try {
              SNodeAccessUtil.setProperty(tnode6, myProperties[0], TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_7939541470171862488(new PropertyMacroContext(context2, "foo", propertyMacro_x96ipf_c0a0c0a0b0d0b0f0c0e))));
            } finally {
            }
            tnode5.addChild(myAggregationLinks[0], tnode6);
            // TODO validate child 
          }
          {
            Collection<SNode> tlist7 = null;
            if (QueriesGenerated.ifMacro_Condition_7939541470171862519(new IfMacroContext(context2, ifMacroRef_x96ipf_b0a0b0e0b0f0c0e))) {
              final SNode tnode8 = environment.createOutputNode(myConcepts[1]);
              try {
                environment.resolve(new RefResolver(tnode8, myAssociationLinks[2], context2, new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "7939541470171862503"), "BaseConcept") {
                  @Override
                  public Object resolve() {
                    return QueriesGenerated.referenceMacro_GetReferent_7939541470171862504(createQueryContext());
                  }
                });
              } finally {
              }
              tlist7 = TemplateUtil.singletonList(tnode8);
            } else {
              final SNode tnode9 = environment.createOutputNode(myConcepts[3]);
              try {
              } finally {
              }
              tlist7 = TemplateUtil.singletonList(tnode9);
            }
            for (SNode child10 : TemplateUtil.asNotNull(tlist7)) {
              tnode5.addChild(myAggregationLinks[0], child10);
            }
            // TODO validate child 
          }
          {
            final SNode tnode11 = environment.createOutputNode(myConcepts[2]);
            try {
              SNodeAccessUtil.setProperty(tnode11, myProperties[0], TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_7939541470171862540(new PropertyMacroContext(context2, "1234567890", propertyMacro_x96ipf_c0a0c0a0b0f0b0f0c0e))));
            } finally {
            }
            tnode5.addChild(myAggregationLinks[0], tnode11);
            // TODO validate child 
          }
        } finally {
        }
        tnode1.addChild(myAggregationLinks[0], tnode5);
        // TODO validate child 
      }
      {
        Collection<SNode> tlist12 = null;
        tlist12 = new Template_reduce_Parameters(((SNode) QueriesGenerated.templateArgumentQuery_7939541470171862556(new TemplateArgumentContext(context1, new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "7939541470171862556"))))).apply(environment, context1);
        for (SNode child13 : TemplateUtil.asNotNull(tlist12)) {
          tnode1.addChild(myAggregationLinks[0], child13);
        }
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
    weaveSupport.weaveNode(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, 0xf8cc56b214L, "expression"), tnodepart0);
    return TemplateUtil.singletonList(tnodepart0);
  }
  @Override
  protected SConcept[] initConcepts() {
    SConcept[] rv = new SConcept[4];
    rv[0] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf09L, "StaticMethodCall");
    rv[1] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x24b2bf7ce180eb54L, "ConceptIdRefExpression");
    rv[2] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf93d565d10L, "StringLiteral");
    rv[3] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf940cd6167L, "NullLiteral");
    return rv;
  }
  @Override
  protected SProperty[] initProperties() {
    SProperty[] rv = new SProperty[1];
    rv[0] = MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value");
    return rv;
  }
  @Override
  protected SReferenceLink[] initAssociationLinks() {
    SReferenceLink[] rv = new SReferenceLink[3];
    rv[0] = MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration");
    rv[1] = MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept");
    rv[2] = MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce180eb54L, 0x24b2bf7ce180eb55L, "conceptDeclaration");
    return rv;
  }
  @Override
  protected SContainmentLink[] initAggregationLinks() {
    SContainmentLink[] rv = new SContainmentLink[1];
    rv[0] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument");
    return rv;
  }
  private static SNodePointer propertyMacro_x96ipf_c0a0c0a0b0d0b0f0c0e = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "7939541470171862487");
  private static SNodePointer ifMacroRef_x96ipf_b0a0b0e0b0f0c0e = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "7939541470171862518");
  private static SNodePointer propertyMacro_x96ipf_c0a0c0a0b0f0b0f0c0e = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "7939541470171862539");
}
