package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.typesystem.inference.TypeChecker;

/*package*/ class ExtractMethodFromExpressionRefactoring extends ExtractMethodRefactoring {
  @NotNull
  private SNode myExpression;
  /*package*/ ExtractMethodFromExpressionRefactoring(ExtractMethodRefactoringParameters params) {
    super(params);
    this.myExpression = SNodeOperations.cast(ListSequence.fromList(params.getNodesToRefactor()).first(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));
  }
  @Override
  protected SNode createMethodBody() {
    SNode body = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"));
    if (SNodeOperations.isInstanceOf(this.getMethodType(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc6bf96dL, "jetbrains.mps.baseLanguage.structure.VoidType"))) {
      SNode expressionStatement = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"));
      SLinkOperations.setTarget(expressionStatement, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, 0xf8cc56b214L, "expression"), SNodeOperations.cast(CopyUtil.copy(this.myExpression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")));
      ListSequence.fromList(SLinkOperations.getChildren(body, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"))).addElement(expressionStatement);
    } else {
      SNode ret = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7feL, "jetbrains.mps.baseLanguage.structure.ReturnStatement"));
      SLinkOperations.setTarget(ret, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7feL, 0xf8cc6bf96cL, "expression"), SNodeOperations.cast(CopyUtil.copy(this.myExpression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")));
      ListSequence.fromList(SLinkOperations.getChildren(body, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"))).addElement(ret);
    }
    return body;
  }
  @Override
  public void replaceMatch(MethodMatch match, SNode methodDeclaration) {
    SNodeOperations.replaceWithAnother(ListSequence.fromList(match.getNodes()).first(), this.createMethodCall(match, methodDeclaration));
  }
  @Override
  public SNode getMethodType() {
    SNode typeOf = TypeChecker.getInstance().getTypeOf(this.myExpression);
    return SNodeOperations.cast(typeOf, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL, "jetbrains.mps.baseLanguage.structure.Type"));
  }
}
