package jetbrains.mps.build.tests;

/*Generated by MPS */

import jetbrains.mps.build.util.Context;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.generator.template.TemplateQueryContext;
import java.util.Map;
import java.util.HashMap;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeReference;
import java.util.List;
import jetbrains.mps.generator.template.ITemplateGenerator;

public class TestContext extends Context {
  public static final String TEMP_MACRO = "build.tmp";
  public static final String TEMP = "${" + TEMP_MACRO + "}";
  public static final String DEPLOY_MACRO = "build.layout";
  public static final String DEPLOY = "${" + DEPLOY_MACRO + "}";
  public TestContext(SModel currentModel) {
    super(new TestContext.TestGenContext(currentModel));
  }

  public static class TestGenContext extends TemplateQueryContext {
    private Map<Object, Object> map = new HashMap<Object, Object>();
    private SModel model;
    public TestGenContext(SModel model) {
      super();
      this.model = model;
    }
    @Override
    public Object putSessionObject(Object k, Object v) {
      return map.put(k, v);
    }
    @Override
    public Object getSessionObject(Object k) {
      return map.get(k);
    }
    @Override
    public SNode getOriginalCopiedInputNode(SNode node) {
      return node;
    }
    @Override
    public SModel getOriginalInputModel() {
      return model;
    }
    @Override
    public SNode getCopiedOutputNodeForInputNode(SNode node) {
      throw new UnsupportedOperationException();
    }
    @Override
    protected SNodeReference getRuleNode() {
      throw new UnsupportedOperationException();
    }
    @Override
    protected SNodeReference getTemplateNodeRef() {
      throw new UnsupportedOperationException();
    }
    @Override
    public void showErrorMessage(SNode node, String string) {
      throw new UnsupportedOperationException();
    }
    @Override
    public void showWarningMessage(SNode node, String string) {
      throw new UnsupportedOperationException();
    }
    @Override
    public void showInformationMessage(SNode node, String string) {
      throw new UnsupportedOperationException();
    }
    @Override
    public Object getStepObject(Object object) {
      throw new UnsupportedOperationException();
    }
    @Override
    public Object putStepObject(Object object, Object object1) {
      throw new UnsupportedOperationException();
    }
    @Override
    public Object getGenerationParameter(String string) {
      throw new UnsupportedOperationException();
    }
    @Override
    public Object getPatternVariable(String string) {
      throw new UnsupportedOperationException();
    }
    @Override
    public Object getVariable(String string) {
      throw new UnsupportedOperationException();
    }
    @Override
    public Object getTransientObject(Object object) {
      throw new UnsupportedOperationException();
    }
    @Override
    public Object putTransientObject(Object object, Object object1) {
      throw new UnsupportedOperationException();
    }
    @Override
    public String createUniqueName(String string, SNode node) {
      throw new UnsupportedOperationException();
    }
    @Override
    public SNode getPreviousInputNodeByMappingLabel(String string) {
      throw new UnsupportedOperationException();
    }
    @Override
    public void registerMappingLabel(SNode node, String string, SNode node1) {
      throw new UnsupportedOperationException();
    }
    @Override
    public List<SNode> getAllOutputNodesByInputNodeAndMappingLabel(SNode node, String string) {
      throw new UnsupportedOperationException();
    }
    @Override
    public SNode getOutputNodeByInputNodeAndMappingLabel(SNode node, String string) {
      throw new UnsupportedOperationException();
    }
    @Override
    public ITemplateGenerator getGenerator() {
      throw new UnsupportedOperationException();
    }
    @Override
    public SModel getOutputModel() {
      throw new UnsupportedOperationException();
    }
    @Override
    public boolean isDirty(SNode node) {
      throw new UnsupportedOperationException();
    }
    @Override
    public SModel getInputModel() {
      throw new UnsupportedOperationException();
    }
    @Override
    public SNode getOutputNode() {
      throw new UnsupportedOperationException();
    }
    @Override
    public SNode getInputNode() {
      throw new UnsupportedOperationException();
    }
    @Override
    public SNode getNode() {
      throw new UnsupportedOperationException();
    }
  }
}
