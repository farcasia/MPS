package jetbrains.mps.samples.Kaja.generator.template.main;

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
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.runtime.NodeWeaveFacility;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SContainmentLink;

@Generated
public class Template_reduce_Step extends TemplateDeclarationBase {

  public Template_reduce_Step() {
  }

  public SNodeReference getTemplateNode() {
    return new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039580716");
  }
  protected SNode applyPart0(@NotNull final TemplateContext context) throws GenerationException {
    final TemplateExecutionEnvironment environment = context.getEnvironment();
    final SNode tnode1 = environment.createOutputNode(myConcepts[0]);
    try {
      TemplateContext context1 = context.subContext();
      {
        final SNode tnode2 = environment.createOutputNode(myConcepts[1]);
        try {
          TemplateContext context2 = context1.subContext();
          {
            final SNode tnode3 = environment.createOutputNode(myConcepts[2]);
            try {
              TemplateContext context3 = context2.subContext();
              {
                final SNode tnode4 = environment.createOutputNode(myConcepts[1]);
                try {
                  TemplateContext context4 = context3.subContext();
                  {
                    final SNode tnode5 = environment.createOutputNode(myConcepts[3]);
                    try {
                      TemplateContext context5 = context4.subContext();
                      {
                        final SNode tnode6 = environment.createOutputNode(myConcepts[4]);
                        try {
                          tnode6.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode6, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3308300503039569801")));
                        } finally {
                        }
                        tnode5.addChild(myAggregationLinks[0], tnode6);
                        // TODO validate child 
                      }
                    } finally {
                    }
                    tnode4.addChild(myAggregationLinks[1], tnode5);
                    // TODO validate child 
                  }
                  {
                    final SNode tnode7 = environment.createOutputNode(myConcepts[3]);
                    try {
                      TemplateContext context6 = context4.subContext();
                      {
                        final SNode tnode8 = environment.createOutputNode(myConcepts[4]);
                        try {
                          tnode8.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode8, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3308300503039570144")));
                        } finally {
                        }
                        tnode7.addChild(myAggregationLinks[0], tnode8);
                        // TODO validate child 
                      }
                    } finally {
                    }
                    tnode4.addChild(myAggregationLinks[1], tnode7);
                    // TODO validate child 
                  }
                } finally {
                }
                tnode3.addChild(myAggregationLinks[2], tnode4);
                // TODO validate child 
              }
              {
                final SNode tnode9 = environment.createOutputNode(myConcepts[4]);
                try {
                  tnode9.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode9, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3308300503039581734")));
                } finally {
                }
                tnode3.addChild(myAggregationLinks[3], tnode9);
                // TODO validate child 
              }
              {
                final SNode tnode10 = environment.createOutputNode(myConcepts[0]);
                try {
                  TemplateContext context7 = context3.subContext();
                  {
                    final SNode tnode11 = environment.createOutputNode(myConcepts[1]);
                    try {
                      TemplateContext context8 = context7.subContext();
                      {
                        final SNode tnode12 = environment.createOutputNode(myConcepts[3]);
                        try {
                          TemplateContext context9 = context8.subContext();
                          {
                            final SNode tnode13 = environment.createOutputNode(myConcepts[4]);
                            try {
                              tnode13.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode13, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3308300503039580739")));
                              TemplateContext context10 = context9.subContext();
                              {
                                final SNode tnode14 = environment.createOutputNode(myConcepts[5]);
                                try {
                                  SNodeAccessUtil.setProperty(tnode14, myProperties[0], "Oops, There's a wall in front of me. I can't make a step forward.");
                                } finally {
                                }
                                tnode13.addChild(myAggregationLinks[4], tnode14);
                                // TODO validate child 
                              }
                            } finally {
                            }
                            tnode12.addChild(myAggregationLinks[0], tnode13);
                            // TODO validate child 
                          }
                        } finally {
                        }
                        tnode11.addChild(myAggregationLinks[1], tnode12);
                        // TODO validate child 
                      }
                    } finally {
                    }
                    tnode10.addChild(myAggregationLinks[5], tnode11);
                    // TODO validate child 
                  }
                } finally {
                }
                tnode3.addChild(myAggregationLinks[6], tnode10);
                // TODO validate child 
              }
            } finally {
            }
            tnode2.addChild(myAggregationLinks[1], tnode3);
            // TODO validate child 
          }
        } finally {
        }
        tnode1.addChild(myAggregationLinks[5], tnode2);
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
    weaveSupport.weaveNode(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"), tnodepart0);
    return TemplateUtil.singletonList(tnodepart0);
  }
  @Override
  protected SConcept[] initConcepts() {
    SConcept[] rv = new SConcept[6];
    rv[0] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfc092b6b77L, "BlockStatement");
    rv[1] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b200L, "StatementList");
    rv[2] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b217L, "IfStatement");
    rv[3] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b213L, "ExpressionStatement");
    rv[4] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x6c6b6a1e379f9404L, "LocalMethodCall");
    rv[5] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf93d565d10L, "StringLiteral");
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
    SReferenceLink[] rv = new SReferenceLink[1];
    rv[0] = MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration");
    return rv;
  }
  @Override
  protected SContainmentLink[] initAggregationLinks() {
    SContainmentLink[] rv = new SContainmentLink[7];
    rv[0] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, 0xf8cc56b214L, "expression");
    rv[1] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement");
    rv[2] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xf8cc56b219L, "ifTrue");
    rv[3] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xf8cc56b218L, "condition");
    rv[4] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument");
    rv[5] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc092b6b77L, 0xfc092b6b78L, "statements");
    rv[6] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xfc092b6b76L, "ifFalseStatement");
    return rv;
  }
}
