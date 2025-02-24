package jetbrains.mps.lang.quotation.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.runtime.TemplateDeclarationBase;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.template.TemplateVarContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.runtime.TemplateUtil;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.generator.template.PropertyMacroContext;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.SReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.impl.reference.RefResolver;
import jetbrains.mps.generator.runtime.NodeWeaveFacility;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SContainmentLink;

@Generated
public class Template_Quotation_to_staticMethodCall extends TemplateDeclarationBase {

  public Template_Quotation_to_staticMethodCall() {
  }

  public SNodeReference getTemplateNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "1025590056396628814");
  }
  protected Collection<SNode> applyPart0(@NotNull final TemplateContext context) throws GenerationException {
    final TemplateExecutionEnvironment environment = context.getEnvironment();
    Collection<SNode> tlist1 = null;
    final Object varValue1 = QueriesGenerated.insertMacro_varValue_6911370362348301908(new TemplateVarContext(context, varMacroRef_6fpfng_b0a0a2a4));
    TemplateContext context1 = context.withVariable("var:inputNode", varValue1);
    final SNode tnode2 = environment.createOutputNode(myConcepts[0]);
    try {
      TemplateContext context2 = context1.subContext();
      {
        final SNode tnode3 = environment.createOutputNode(myConcepts[1]);
        try {
          environment.resolveInTemplateLater(tnode3, myAssociationLinks[0], templateNode_6fpfng_c0a0a1a1a5a4, "tpl/r:00000000-0000-4000-0000-011c8959034c/1025590056396661196", "_quotation_createNode", context2);
          TemplateContext context3 = context2.subContext();
          {
            Collection<SNode> tlist4 = null;
            final Iterable<SNode> copyListInput4 = QueriesGenerated.sourceNodesQuery_8438065045296712361(new SourceSubstituteMacroNodesContext(context3, copySrcListMacro_6fpfng_b0a0a1a2a1a1a5a4));
            tlist4 = environment.copyNodes(copyListInput4, copySrcListMacro_6fpfng_b0a0a1a2a1a1a5a4, "tpl/r:00000000-0000-4000-0000-011c8959034c/1025590056396691722", context3);
            for (SNode child5 : TemplateUtil.asNotNull(tlist4)) {
              tnode3.addChild(myAggregationLinks[0], child5);
            }
            // TODO validate child 
          }
        } finally {
        }
        tnode2.addChild(myAggregationLinks[1], tnode3);
        // TODO validate child 
      }
      {
        final SNode tnode6 = environment.createOutputNode(myConcepts[2]);
        try {
          environment.nodeCopied(context2, tnode6, "tpl/r:00000000-0000-4000-0000-011c8959034c/1025590056396661196");
          SNodeAccessUtil.setProperty(tnode6, myProperties[0], TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_1025590056397541505(new PropertyMacroContext(context2, "_quotation_createNode", propertyMacro_6fpfng_c0a0c0b0b0c0f0e))));
          TemplateContext context4 = context2.subContext();
          {
            final SNode tnode7 = environment.createOutputNode(myConcepts[3]);
            try {
            } finally {
            }
            tnode6.addChild(myAggregationLinks[2], tnode7);
            // TODO validate child 
          }
          {
            final SNode tnode8 = environment.createOutputNode(myConcepts[4]);
            try {
            } finally {
            }
            tnode6.addChild(myAggregationLinks[3], tnode8);
            // TODO validate child 
          }
          {
            final List<SNode> tlist9 = new ArrayList<SNode>();
            final Iterable<SNode> loopList9 = QueriesGenerated.sourceNodesQuery_1025590056396672113(new SourceSubstituteMacroNodesContext(context4, loopMacroRef_6fpfng_b0a0a1a5a1a2a5a4));
            for (SNode itnode9 : loopList9) {
              if (itnode9 == null) {
                continue;
              }
              TemplateContext context5 = context4.subContext("parametersFromExpressions", itnode9);
              final SNode tnode10 = environment.createOutputNode(myConcepts[5]);
              try {
                SNodeAccessUtil.setProperty(tnode10, myProperties[0], TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_1025590056396672173(new PropertyMacroContext(context5, "a", propertyMacro_6fpfng_c0a0c0a0d0c0f0b0c0f0e))));
                TemplateContext context6 = context5.subContext();
                {
                  final SNode tnode11 = environment.createOutputNode(myConcepts[6]);
                  try {
                    tnode11.setReference(myAssociationLinks[1], SReference.create(myAssociationLinks[1], tnode11, PersistenceFacade.getInstance().createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)"), PersistenceFacade.getInstance().createNodeId("~Object")));
                  } finally {
                  }
                  tnode10.addChild(myAggregationLinks[4], tnode11);
                  // TODO validate child 
                }
              } finally {
              }
              if (tnode10 != null) {
                environment.registerLabel(itnode9, tnode10, "parametersFromExpressions");
                tlist9.add(tnode10);
              }
            }
            for (SNode child12 : TemplateUtil.asNotNull(tlist9)) {
              tnode6.addChild(myAggregationLinks[5], child12);
            }
            // TODO validate child 
          }
          {
            final SNode tnode13 = environment.createOutputNode(myConcepts[7]);
            try {
              TemplateContext context7 = context4.subContext();
              {
                final SNode tnode14 = environment.createOutputNode(myConcepts[8]);
                try {
                  TemplateContext context8 = context7.subContext();
                  {
                    final SNode tnode15 = environment.createOutputNode(myConcepts[9]);
                    try {
                      SNodeAccessUtil.setProperty(tnode15, myProperties[0], "facade");
                      TemplateContext context9 = context8.subContext();
                      {
                        final SNode tnode16 = environment.createOutputNode(myConcepts[10]);
                        try {
                          tnode16.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode16, PersistenceFacade.getInstance().createModelReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.persistence(MPS.OpenAPI/)"), PersistenceFacade.getInstance().createNodeId("~PersistenceFacade.getInstance():org.jetbrains.mps.openapi.persistence.PersistenceFacade")));
                          tnode16.setReference(myAssociationLinks[2], SReference.create(myAssociationLinks[2], tnode16, PersistenceFacade.getInstance().createModelReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.persistence(MPS.OpenAPI/)"), PersistenceFacade.getInstance().createNodeId("~PersistenceFacade")));
                        } finally {
                        }
                        tnode15.addChild(myAggregationLinks[6], tnode16);
                        // TODO validate child 
                      }
                      {
                        final SNode tnode17 = environment.createOutputNode(myConcepts[6]);
                        try {
                          tnode17.setReference(myAssociationLinks[1], SReference.create(myAssociationLinks[1], tnode17, PersistenceFacade.getInstance().createModelReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.persistence(MPS.OpenAPI/)"), PersistenceFacade.getInstance().createNodeId("~PersistenceFacade")));
                        } finally {
                        }
                        tnode15.addChild(myAggregationLinks[4], tnode17);
                        // TODO validate child 
                      }
                    } finally {
                    }
                    tnode14.addChild(myAggregationLinks[7], tnode15);
                    // TODO validate child 
                  }
                } finally {
                }
                tnode13.addChild(myAggregationLinks[8], tnode14);
                // TODO validate child 
              }
              {
                final List<SNode> tlist18 = new ArrayList<SNode>();
                final Iterable<SNode> loopList18 = QueriesGenerated.sourceNodesQuery_1025590056396681241(new SourceSubstituteMacroNodesContext(context7, loopMacroRef_6fpfng_b0a0a1a2a1a6a1a2a5a4));
                for (SNode itnode18 : loopList18) {
                  if (itnode18 == null) {
                    continue;
                  }
                  TemplateContext context10 = context7.subContext(itnode18);
                  final SNode tnode19 = environment.createOutputNode(myConcepts[8]);
                  try {
                    TemplateContext context11 = context10.subContext();
                    {
                      Collection<SNode> tlist20 = null;
                      TemplateContext context12 = context11.subContext("nodeVariable");
                      final SNode tnode21 = environment.createOutputNode(myConcepts[9]);
                      try {
                        environment.nodeCopied(context12, tnode21, "tpl/r:00000000-0000-4000-0000-011c8959034c/1025590056396681223");
                        SNodeAccessUtil.setProperty(tnode21, myProperties[0], TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_1025590056396681226(new PropertyMacroContext(context12, "_node_", propertyMacro_6fpfng_c0a0c0b0d0b0d0c0c0b0g0b0c0f0e))));
                        TemplateContext context13 = context12.subContext();
                        {
                          final SNode tnode22 = environment.createOutputNode(myConcepts[6]);
                          try {
                            tnode22.setReference(myAssociationLinks[1], SReference.create(myAssociationLinks[1], tnode22, PersistenceFacade.getInstance().createModelReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)"), PersistenceFacade.getInstance().createNodeId("~SNode")));
                          } finally {
                          }
                          tnode21.addChild(myAggregationLinks[4], tnode22);
                          // TODO validate child 
                        }
                        {
                          final SNode tnode23 = environment.createOutputNode(myConcepts[11]);
                          try {
                          } finally {
                          }
                          tnode21.addChild(myAggregationLinks[6], tnode23);
                          // TODO validate child 
                        }
                      } finally {
                      }
                      tlist20 = TemplateUtil.singletonList(tnode21);
                      environment.registerLabel(context11.getInput(), tnode21, "nodeVariable");
                      for (SNode child24 : TemplateUtil.asNotNull(tlist20)) {
                        tnode19.addChild(myAggregationLinks[7], child24);
                      }
                      // TODO validate child 
                    }
                  } finally {
                  }
                  if (tnode19 != null) {
                    tlist18.add(tnode19);
                  }
                }
                for (SNode child25 : TemplateUtil.asNotNull(tlist18)) {
                  tnode13.addChild(myAggregationLinks[8], child25);
                }
                // TODO validate child 
              }
              {
                final SNode tnode26 = environment.createOutputNode(myConcepts[12]);
                try {
                  TemplateContext context14 = context7.subContext();
                  {
                    Collection<SNode> tlist27 = null;
                    SNode callInputNode27 = QueriesGenerated.sourceNodeQuery_767161977424634934(new SourceSubstituteMacroNodeContext(context14, callMacro_6fpfng_b0a0a1a1a1a3a1a6a1a2a5a4));
                    TemplateContext context15 = context14.subContext(null, callInputNode27);
                    if (callInputNode27 != null) {
                      tlist27 = new Template_QuotedNode_to_statementList().apply(environment, context15);

                    }
                    for (SNode child28 : TemplateUtil.asNotNull(tlist27)) {
                      tnode26.addChild(myAggregationLinks[9], child28);
                    }
                    // TODO validate child 
                  }
                } finally {
                }
                tnode13.addChild(myAggregationLinks[8], tnode26);
                // TODO validate child 
              }
              {
                final List<SNode> tlist29 = new ArrayList<SNode>();
                final Iterable<SNode> loopList29 = QueriesGenerated.sourceNodesQuery_2038730470042886544(new SourceSubstituteMacroNodesContext(context7, loopMacroRef_6fpfng_b0a0a1a4a1a6a1a2a5a4));
                for (SNode itnode29 : loopList29) {
                  if (itnode29 == null) {
                    continue;
                  }
                  TemplateContext context16 = context7.subContext(itnode29);
                  final SNode tnode30 = environment.createOutputNode(myConcepts[13]);
                  try {
                    TemplateContext context17 = context16.subContext();
                    {
                      final SNode tnode31 = environment.createOutputNode(myConcepts[14]);
                      try {
                        TemplateContext context18 = context17.subContext();
                        {
                          final SNode tnode32 = environment.createOutputNode(myConcepts[15]);
                          try {
                            environment.resolve(new RefResolver(tnode32, myAssociationLinks[3], context18, new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "2038730470042870210"), "_node_") {
                              @Override
                              public Object resolve() {
                                return QueriesGenerated.referenceMacro_GetReferent_2038730470042870211(createQueryContext());
                              }
                            });
                          } finally {
                          }
                          tnode31.addChild(myAggregationLinks[10], tnode32);
                          // TODO validate child 
                        }
                        {
                          final SNode tnode33 = environment.createOutputNode(myConcepts[16]);
                          try {
                            tnode33.setReference(myAssociationLinks[0], SReference.create(myAssociationLinks[0], tnode33, PersistenceFacade.getInstance().createModelReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)"), PersistenceFacade.getInstance().createNodeId("~SNode.setReferenceTarget(org.jetbrains.mps.openapi.language.SReferenceLink,org.jetbrains.mps.openapi.model.SNode):void")));
                            TemplateContext context19 = context18.subContext();
                            {
                              Collection<SNode> tlist34 = null;
                              try {
                                SNode callInputNode34 = QueriesGenerated.sourceNodeQuery_2038730470045400440(new SourceSubstituteMacroNodeContext(context19, includeMacro_6fpfng_b0a0a0a1a2a1a2a1a1a3a2a4a1a6a1a2a5a4));
                                TemplateContext context20 = context19.subContext(null, callInputNode34);
                                if (callInputNode34 != null) {
                                  try {
                                    tlist34 = environment.applyTemplate(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "6506750610319222074"), new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "2038730470045399544"), context20);
                                  } finally {
                                  }

                                }

                              } finally {
                              }
                              for (SNode child35 : TemplateUtil.asNotNull(tlist34)) {
                                tnode33.addChild(myAggregationLinks[0], child35);
                              }
                              // TODO validate child 
                            }
                            {
                              final SNode tnode36 = environment.createOutputNode(myConcepts[15]);
                              try {
                                environment.resolve(new RefResolver(tnode36, myAssociationLinks[3], context19, new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "6497389703574369436"), "_node_") {
                                  @Override
                                  public Object resolve() {
                                    return QueriesGenerated.referenceMacro_GetReferent_6497389703574369437(createQueryContext());
                                  }
                                });
                              } finally {
                              }
                              tnode33.addChild(myAggregationLinks[0], tnode36);
                              // TODO validate child 
                            }
                          } finally {
                          }
                          tnode31.addChild(myAggregationLinks[11], tnode33);
                          // TODO validate child 
                        }
                      } finally {
                      }
                      tnode30.addChild(myAggregationLinks[12], tnode31);
                      // TODO validate child 
                    }
                  } finally {
                  }
                  if (tnode30 != null) {
                    tlist29.add(tnode30);
                  }
                }
                for (SNode child37 : TemplateUtil.asNotNull(tlist29)) {
                  tnode13.addChild(myAggregationLinks[8], child37);
                }
                // TODO validate child 
              }
              {
                final SNode tnode38 = environment.createOutputNode(myConcepts[17]);
                try {
                  TemplateContext context21 = context7.subContext();
                  {
                    final SNode tnode39 = environment.createOutputNode(myConcepts[15]);
                    try {
                      environment.resolve(new RefResolver(tnode39, myAssociationLinks[3], context21, new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "767161977427984192"), "_node_") {
                        @Override
                        public Object resolve() {
                          return QueriesGenerated.referenceMacro_GetReferent_767161977427984193(createQueryContext());
                        }
                      });
                    } finally {
                    }
                    tnode38.addChild(myAggregationLinks[13], tnode39);
                    // TODO validate child 
                  }
                } finally {
                }
                tnode13.addChild(myAggregationLinks[8], tnode38);
                // TODO validate child 
              }
            } finally {
            }
            tnode6.addChild(myAggregationLinks[14], tnode13);
            // TODO validate child 
          }
        } finally {
        }
        tnode2.addChild(myAggregationLinks[15], tnode6);
        // TODO validate child 
      }
    } finally {
    }
    tlist1 = TemplateUtil.singletonList(tnode2);
    return tlist1;
  }
  @Override
  public Collection<SNode> apply(@NotNull TemplateExecutionEnvironment environment, @NotNull TemplateContext context) throws GenerationException {
    return applyPart0(context);
  }

  @Override
  public Collection<SNode> weave(@NotNull NodeWeaveFacility.WeaveContext weaveContext, @NotNull NodeWeaveFacility weaveSupport) throws GenerationException {
    final TemplateContext templateContext = weaveSupport.getTemplateContext();
    Collection<SNode> tlistpart0 = applyPart0(templateContext);
    for (SNode nodeToWeave : TemplateUtil.asNotNull(tlistpart0)) {
      weaveSupport.weaveNode(MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0xfe43cb41d0L, 0xfe43de823bL, "contentNode"), nodeToWeave);
    }
    return tlistpart0;
  }
  @Override
  protected SConcept[] initConcepts() {
    SConcept[] rv = new SConcept[18];
    rv[0] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, "jetbrains.mps.baseLanguageInternal"), 0x31c3f88088ea0ac4L, "ExtractStaticMethodExpression");
    rv[1] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, "jetbrains.mps.baseLanguageInternal"), 0x31c3f88088ed999aL, "ExtractStaticMethod_CallExpression");
    rv[2] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf0aL, "StaticMethodDeclaration");
    rv[3] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x10af9586f0cL, "PrivateVisibility");
    rv[4] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x108f968b3caL, "SNodeType");
    rv[5] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c77f1e94L, "ParameterDeclaration");
    rv[6] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType");
    rv[7] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b200L, "StatementList");
    rv[8] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc67c7f0L, "LocalVariableDeclarationStatement");
    rv[9] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc67c7efL, "LocalVariableDeclaration");
    rv[10] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf09L, "StaticMethodCall");
    rv[11] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf940cd6167L, "NullLiteral");
    rv[12] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfc092b6b77L, "BlockStatement");
    rv[13] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b213L, "ExpressionStatement");
    rv[14] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x116b46a08c4L, "DotExpression");
    rv[15] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c77f1e98L, "VariableReference");
    rv[16] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x118154a6332L, "InstanceMethodCallOperation");
    rv[17] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc67c7feL, "ReturnStatement");
    return rv;
  }
  @Override
  protected SProperty[] initProperties() {
    SProperty[] rv = new SProperty[1];
    rv[0] = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
    return rv;
  }
  @Override
  protected SReferenceLink[] initAssociationLinks() {
    SReferenceLink[] rv = new SReferenceLink[4];
    rv[0] = MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration");
    rv[1] = MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier");
    rv[2] = MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept");
    rv[3] = MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration");
    return rv;
  }
  @Override
  protected SContainmentLink[] initAggregationLinks() {
    SContainmentLink[] rv = new SContainmentLink[16];
    rv[0] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument");
    rv[1] = MetaAdapterFactory.getContainmentLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x31c3f88088ea0ac4L, 0x31c3f88088ea0ac5L, "inner");
    rv[2] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility");
    rv[3] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1fdL, "returnType");
    rv[4] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type");
    rv[5] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1feL, "parameter");
    rv[6] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, 0xf8c37f506eL, "initializer");
    rv[7] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7f0L, 0xf8cc67c7f1L, "localVariableDeclaration");
    rv[8] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement");
    rv[9] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc092b6b77L, 0xfc092b6b78L, "statements");
    rv[10] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46a4416L, "operand");
    rv[11] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46b36c4L, "operation");
    rv[12] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, 0xf8cc56b214L, "expression");
    rv[13] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7feL, 0xf8cc6bf96cL, "expression");
    rv[14] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1ffL, "body");
    rv[15] = MetaAdapterFactory.getContainmentLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x31c3f88088ea0ac4L, 0x31c3f88088ea0ac6L, "method");
    return rv;
  }
  private static SNodePointer varMacroRef_6fpfng_b0a0a2a4 = new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "6911370362348301906");
  private static SNodePointer templateNode_6fpfng_c0a0a1a1a5a4 = new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "1025590056396668027");
  private static SNodePointer copySrcListMacro_6fpfng_b0a0a1a2a1a1a5a4 = new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "8438065045296712359");
  private static SNodePointer propertyMacro_6fpfng_c0a0c0b0b0c0f0e = new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "1025590056397541504");
  private static SNodePointer loopMacroRef_6fpfng_b0a0a1a5a1a2a5a4 = new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "1025590056396672112");
  private static SNodePointer propertyMacro_6fpfng_c0a0c0a0d0c0f0b0c0f0e = new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "1025590056396672172");
  private static SNodePointer loopMacroRef_6fpfng_b0a0a1a2a1a6a1a2a5a4 = new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "1025590056396681240");
  private static SNodePointer propertyMacro_6fpfng_c0a0c0b0d0b0d0c0c0b0g0b0c0f0e = new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "1025590056396681225");
  private static SNodePointer callMacro_6fpfng_b0a0a1a1a1a3a1a6a1a2a5a4 = new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "767161977424627382");
  private static SNodePointer loopMacroRef_6fpfng_b0a0a1a4a1a6a1a2a5a4 = new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "2038730470042886541");
  private static SNodePointer includeMacro_6fpfng_b0a0a0a1a2a1a2a1a1a3a2a4a1a6a1a2a5a4 = new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "2038730470045399544");
}
