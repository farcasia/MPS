package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_weaveManyToSingularChild;

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
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.template.PropertyMacroContext;
import java.util.Collection;
import jetbrains.mps.generator.runtime.NodeWeaveFacility;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SProperty;

@Generated
public class Template_weave_InputNode_A extends TemplateDeclarationBase {

  public Template_weave_InputNode_A() {
  }

  public SNodeReference getTemplateNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895905fa(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_weaveManyToSingularChild@generator)", "1218738992784");
  }
  protected SNode applyPart0(@NotNull final TemplateContext context) throws GenerationException {
    final TemplateExecutionEnvironment environment = context.getEnvironment();
    final SNode tnode1 = environment.createOutputNode(myConcepts[0]);
    try {
      SNodeAccessUtil.setProperty(tnode1, myProperties[0], TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_1218740165112(new PropertyMacroContext(context, "_text_", propertyMacro_ymqu3a_c0a0c0a0c0e))));
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
    weaveSupport.weaveNode(MetaAdapterFactory.getContainmentLink(0x157a9668bf58417bL, 0x893e53d86388dc56L, 0x116455d922fL, 0x11bc24e708cL, "specialChild"), tnodepart0);
    return TemplateUtil.singletonList(tnodepart0);
  }
  @Override
  protected SConcept[] initConcepts() {
    SConcept[] rv = new SConcept[1];
    rv[0] = MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x157a9668bf58417bL, 0x893e53d86388dc56L, "jetbrains.mps.transformation.test.outputLang"), 0x1164564a526L, "OutputNode");
    return rv;
  }
  @Override
  protected SProperty[] initProperties() {
    SProperty[] rv = new SProperty[1];
    rv[0] = MetaAdapterFactory.getProperty(0x157a9668bf58417bL, 0x893e53d86388dc56L, 0x1164564a526L, 0x11645b5a797L, "text");
    return rv;
  }
  private static SNodePointer propertyMacro_ymqu3a_c0a0c0a0c0e = new SNodePointer("r:00000000-0000-4000-0000-011c895905fa(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_weaveManyToSingularChild@generator)", "1218740165111");
}
