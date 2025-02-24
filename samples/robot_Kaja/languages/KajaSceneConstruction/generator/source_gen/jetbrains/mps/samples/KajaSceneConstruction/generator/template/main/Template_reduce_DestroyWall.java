package jetbrains.mps.samples.KajaSceneConstruction.generator.template.main;

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
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.template.PropertyMacroContext;
import java.util.Collection;
import jetbrains.mps.generator.runtime.NodeWeaveFacility;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SContainmentLink;

@Generated
public class Template_reduce_DestroyWall extends TemplateDeclarationBase {

  public Template_reduce_DestroyWall() {
  }

  public SNodeReference getTemplateNode() {
    return new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273607275");
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
                          tnode6.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode6, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3210697320273550783")));
                          TemplateContext context6 = context5.subContext();
                          {
                            final SNode tnode7 = environment.createOutputNode(myConcepts[5]);
                            try {
                              SNodeAccessUtil.setProperty(tnode7, myProperties[0], TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_3210697320273608239(new PropertyMacroContext(context6, "0", propertyMacro_isi7q0_c0a0c0a0b0c0b0b0b0b0b0b0b0b0b0b0c0e))));
                            } finally {
                            }
                            tnode6.addChild(myAggregationLinks[0], tnode7);
                            // TODO validate child 
                          }
                          {
                            final SNode tnode8 = environment.createOutputNode(myConcepts[5]);
                            try {
                              SNodeAccessUtil.setProperty(tnode8, myProperties[0], TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_3210697320273608248(new PropertyMacroContext(context6, "0", propertyMacro_isi7q0_c0a0c0a0b0d0b0b0b0b0b0b0b0b0b0b0c0e))));
                            } finally {
                            }
                            tnode6.addChild(myAggregationLinks[0], tnode8);
                            // TODO validate child 
                          }
                        } finally {
                        }
                        tnode5.addChild(myAggregationLinks[1], tnode6);
                        // TODO validate child 
                      }
                    } finally {
                    }
                    tnode4.addChild(myAggregationLinks[2], tnode5);
                    // TODO validate child 
                  }
                  {
                    final SNode tnode9 = environment.createOutputNode(myConcepts[3]);
                    try {
                      TemplateContext context7 = context4.subContext();
                      {
                        final SNode tnode10 = environment.createOutputNode(myConcepts[4]);
                        try {
                          tnode10.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode10, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3210697320273550615")));
                        } finally {
                        }
                        tnode9.addChild(myAggregationLinks[1], tnode10);
                        // TODO validate child 
                      }
                    } finally {
                    }
                    tnode4.addChild(myAggregationLinks[2], tnode9);
                    // TODO validate child 
                  }
                } finally {
                }
                tnode3.addChild(myAggregationLinks[3], tnode4);
                // TODO validate child 
              }
              {
                final SNode tnode11 = environment.createOutputNode(myConcepts[6]);
                try {
                  TemplateContext context8 = context3.subContext();
                  {
                    final SNode tnode12 = environment.createOutputNode(myConcepts[4]);
                    try {
                      tnode12.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode12, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3210697320273648281")));
                      TemplateContext context9 = context8.subContext();
                      {
                        final SNode tnode13 = environment.createOutputNode(myConcepts[5]);
                        try {
                          SNodeAccessUtil.setProperty(tnode13, myProperties[0], TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_3210697320273648397(new PropertyMacroContext(context9, "0", propertyMacro_isi7q0_c0a0c0a0b0c0b0b0b0c0b0b0b0b0c0e))));
                        } finally {
                        }
                        tnode12.addChild(myAggregationLinks[0], tnode13);
                        // TODO validate child 
                      }
                    } finally {
                    }
                    tnode11.addChild(myAggregationLinks[4], tnode12);
                    // TODO validate child 
                  }
                  {
                    final SNode tnode14 = environment.createOutputNode(myConcepts[4]);
                    try {
                      tnode14.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode14, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3210697320273648203")));
                      TemplateContext context10 = context8.subContext();
                      {
                        final SNode tnode15 = environment.createOutputNode(myConcepts[5]);
                        try {
                          SNodeAccessUtil.setProperty(tnode15, myProperties[0], TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_3210697320273648406(new PropertyMacroContext(context10, "0", propertyMacro_isi7q0_c0a0c0a0b0c0b0c0b0c0b0b0b0b0c0e))));
                        } finally {
                        }
                        tnode14.addChild(myAggregationLinks[0], tnode15);
                        // TODO validate child 
                      }
                    } finally {
                    }
                    tnode11.addChild(myAggregationLinks[5], tnode14);
                    // TODO validate child 
                  }
                } finally {
                }
                tnode3.addChild(myAggregationLinks[6], tnode11);
                // TODO validate child 
              }
              {
                final SNode tnode16 = environment.createOutputNode(myConcepts[0]);
                try {
                  TemplateContext context11 = context3.subContext();
                  {
                    final SNode tnode17 = environment.createOutputNode(myConcepts[1]);
                    try {
                      TemplateContext context12 = context11.subContext();
                      {
                        final SNode tnode18 = environment.createOutputNode(myConcepts[3]);
                        try {
                          TemplateContext context13 = context12.subContext();
                          {
                            final SNode tnode19 = environment.createOutputNode(myConcepts[4]);
                            try {
                              tnode19.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode19, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3308300503039580739")));
                              TemplateContext context14 = context13.subContext();
                              {
                                final SNode tnode20 = environment.createOutputNode(myConcepts[7]);
                                try {
                                  SNodeAccessUtil.setProperty(tnode20, myProperties[1], "Attempted to destroy wall outside of the playground!");
                                } finally {
                                }
                                tnode19.addChild(myAggregationLinks[0], tnode20);
                                // TODO validate child 
                              }
                            } finally {
                            }
                            tnode18.addChild(myAggregationLinks[1], tnode19);
                            // TODO validate child 
                          }
                        } finally {
                        }
                        tnode17.addChild(myAggregationLinks[2], tnode18);
                        // TODO validate child 
                      }
                    } finally {
                    }
                    tnode16.addChild(myAggregationLinks[7], tnode17);
                    // TODO validate child 
                  }
                } finally {
                }
                tnode3.addChild(myAggregationLinks[8], tnode16);
                // TODO validate child 
              }
            } finally {
            }
            tnode2.addChild(myAggregationLinks[2], tnode3);
            // TODO validate child 
          }
        } finally {
        }
        tnode1.addChild(myAggregationLinks[7], tnode2);
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
    SConcept[] rv = new SConcept[8];
    rv[0] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfc092b6b77L, "BlockStatement");
    rv[1] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b200L, "StatementList");
    rv[2] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b217L, "IfStatement");
    rv[3] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b213L, "ExpressionStatement");
    rv[4] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x6c6b6a1e379f9404L, "LocalMethodCall");
    rv[5] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc59b314L, "IntegerConstant");
    rv[6] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfb7c3070eeL, "AndExpression");
    rv[7] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf93d565d10L, "StringLiteral");
    return rv;
  }
  @Override
  protected SProperty[] initProperties() {
    SProperty[] rv = new SProperty[2];
    rv[0] = MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value");
    rv[1] = MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value");
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
    SContainmentLink[] rv = new SContainmentLink[9];
    rv[0] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument");
    rv[1] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, 0xf8cc56b214L, "expression");
    rv[2] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement");
    rv[3] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xf8cc56b219L, "ifTrue");
    rv[4] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression");
    rv[5] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11cL, "leftExpression");
    rv[6] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xf8cc56b218L, "condition");
    rv[7] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc092b6b77L, 0xfc092b6b78L, "statements");
    rv[8] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xfc092b6b76L, "ifFalseStatement");
    return rv;
  }
  private static SNodePointer propertyMacro_isi7q0_c0a0c0a0b0c0b0b0b0b0b0b0b0b0b0b0c0e = new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273608236");
  private static SNodePointer propertyMacro_isi7q0_c0a0c0a0b0d0b0b0b0b0b0b0b0b0b0b0c0e = new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273608245");
  private static SNodePointer propertyMacro_isi7q0_c0a0c0a0b0c0b0b0b0c0b0b0b0b0c0e = new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273648396");
  private static SNodePointer propertyMacro_isi7q0_c0a0c0a0b0c0b0c0b0c0b0b0b0b0c0e = new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273648405");
}
