package jetbrains.mps.lang.smodel.generator.baseLanguage.template.main;

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
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.runtime.NodeWeaveFacility;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;

@Generated
public class Template_reduce_ConceptMethodCallReflectiveCommon extends TemplateDeclarationBase {

  public Template_reduce_ConceptMethodCallReflectiveCommon() {
  }

  public SNodeReference getTemplateNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "8560627202335249984");
  }
  protected Collection<SNode> applyPart0(@NotNull final TemplateContext context) throws GenerationException {
    final TemplateExecutionEnvironment environment = context.getEnvironment();
    Collection<SNode> tlist1 = null;
    if (QueriesGenerated.ifMacro_Condition_4598718932037661889(new IfMacroContext(context, ifMacroRef_id0vkc_b0a0c0e))) {
      final SNode tnode2 = environment.createOutputNode(myConcepts[0]);
      try {
        TemplateContext context1 = context.subContext();
        {
          Collection<SNode> tlist3 = null;
          try {
            try {
              tlist3 = new Template_reduce_reflectiveInvoke().apply(environment, context1);
            } finally {
            }

          } finally {
          }
          for (SNode child4 : TemplateUtil.asNotNull(tlist3)) {
            tnode2.addChild(myAggregationLinks[0], child4);
          }
          // TODO validate child 
        }
        {
          Collection<SNode> tlist5 = null;
          final SNode copySrcInput5 = QueriesGenerated.sourceNodeQuery_4598718932037691177(new SourceSubstituteMacroNodeContext(context1, copySrcMacro_id0vkc_b0a0c0c0b0c0e));
          tlist5 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput5), copySrcMacro_id0vkc_b0a0c0c0b0c0e, "tpl/r:00000000-0000-4000-0000-011c89590303/4598718932037655771", context1);
          for (SNode child6 : TemplateUtil.asNotNull(tlist5)) {
            tnode2.addChild(myAggregationLinks[1], child6);
          }
          // TODO validate child 
        }
      } finally {
      }
      tlist1 = TemplateUtil.singletonList(tnode2);
    } else {
      Collection<SNode> tlist7 = null;
      try {
        try {
          tlist7 = new Template_reduce_reflectiveInvoke().apply(environment, context);
        } finally {
        }

      } finally {
      }
      tlist1 = tlist7;
    }
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
      weaveSupport.weaveNode(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, 0xfb4ed32b80L, "expression"), nodeToWeave);
    }
    return tlistpart0;
  }
  @Override
  protected SConcept[] initConcepts() {
    SConcept[] rv = new SConcept[1];
    rv[0] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf940dabe4aL, "CastExpression");
    return rv;
  }
  @Override
  protected SContainmentLink[] initAggregationLinks() {
    SContainmentLink[] rv = new SContainmentLink[2];
    rv[0] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4cL, "expression");
    rv[1] = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4bL, "type");
    return rv;
  }
  private static SNodePointer copySrcMacro_id0vkc_b0a0c0c0b0c0e = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "4598718932037685342");
  private static SNodePointer ifMacroRef_id0vkc_b0a0c0e = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "4598718932037661886");
}
