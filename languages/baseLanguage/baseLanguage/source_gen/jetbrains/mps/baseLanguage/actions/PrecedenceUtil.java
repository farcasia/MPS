package jetbrains.mps.baseLanguage.actions;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import java.util.Objects;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.Expression__BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.baseLanguage.behavior.BinaryOperation__BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.ParenthesisUtil;

public class PrecedenceUtil {
  public PrecedenceUtil() {
  }
  @NotNull
  public static SNode getTargetForRightTransform(@NotNull SNode contextNode) {
    SNode targetNode = contextNode;
    for (SNode parentNode = SNodeOperations.getParent(targetNode); parentNode != null && SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")); parentNode = SNodeOperations.getParent(targetNode)) {
      if (SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, "jetbrains.mps.baseLanguage.structure.IMethodCall")) || SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression"))) {
        // if parent expression is IMethodCall then targetNode is either actualArgument 
        // or typeArgument (parameters of method call), so we should not go upper 
        // same with ParenthesizedExpression 
        break;
      }
      SContainmentLink targetContainingLink = SNodeOperations.getContainingLink(targetNode);
      if (SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation")) && Objects.equals(targetContainingLink, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11cL, "leftExpression"))) {
        // if parent expression is BinaryOperation and target is left child of it 
        // then we should rather transform current target 
        break;
      }
      if (SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression")) && Objects.equals(targetContainingLink, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46a4416L, "operand"))) {
        // if parent expression is DotExpression and target is operang ("left" part of the expression) 
        // then we should rather transform current target 
        break;
      }
      targetNode = SNodeOperations.cast(parentNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));
    }
    return targetNode;
  }
  @NotNull
  public static SNode getTargetForLeftTransform(@NotNull SNode contextNode, @NotNull SNode resultNode) {
    int resultingExpressionPriority = getPriority(SNodeOperations.getConcept(resultNode)).ordinal();
    SNode targetNode = contextNode;
    for (SNode parentNode = SNodeOperations.getParent(targetNode); parentNode != null && SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")) && getPriority(SNodeOperations.castConcept(SNodeOperations.getConcept(parentNode), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"))).ordinal() < resultingExpressionPriority; parentNode = SNodeOperations.getParent(targetNode)) {
      if (SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, "jetbrains.mps.baseLanguage.structure.IMethodCall")) || SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression"))) {
        // if parent expression is IMethodCall then targetNode is either actualArgument 
        // or typeArgument (parameters of method call), so we should not go upper 
        // same with ParenthesizedExpression 
        break;
      }
      if (SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation")) && Objects.equals(SNodeOperations.getContainingLink(targetNode), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression"))) {
        // if parent expression is BinaryOperation having higher priority and target is rhigh child of it 
        // then we should rather transform current target and add additional parenthesis around resulting expression 
        break;
      }
      targetNode = SNodeOperations.cast(parentNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));
    }
    return targetNode;
  }
  public static boolean isSamePriority(SNode firstExpression, SNode secondExpression) {
    return getPriority(SNodeOperations.getConcept(firstExpression)) == getPriority(SNodeOperations.getConcept(secondExpression));
  }
  public static SNode parenthesiseIfNecessary(@NotNull SNode contextNode) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(contextNode), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation"))) {
      SNode parentBinaryOperation = SNodeOperations.cast(SNodeOperations.getParent(contextNode), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation"));
      if (Objects.equals(SNodeOperations.getContainingLink(contextNode), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression")) && isHigherPriority(parentBinaryOperation, contextNode)) {
        SNode result = SNodeFactoryOperations.replaceWithNewChild(contextNode, SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")));
        SLinkOperations.setTarget(result, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, 0xfb4ed32b80L, "expression"), contextNode);
        return result;
      }
    } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(contextNode), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, "jetbrains.mps.baseLanguage.structure.CastExpression"))) {
      SNode parentCastExpression = SNodeOperations.cast(SNodeOperations.getParent(contextNode), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, "jetbrains.mps.baseLanguage.structure.CastExpression"));
      if (PrecedenceUtil.needsParensInsideCastExpression(parentCastExpression)) {
        SNode result = SNodeFactoryOperations.replaceWithNewChild(contextNode, SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")));
        SLinkOperations.setTarget(result, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, 0xfb4ed32b80L, "expression"), contextNode);
        return result;
      }
    }
    return contextNode;
  }

  public static boolean needsParensInsideCastExpression(SNode castExpression) {
    SNode targetExpr = SLinkOperations.getTarget(castExpression, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4cL, "expression"));
    return !(((targetExpr == null) || (boolean) Expression__BehaviorDescriptor.constant_id1653mnvAgr2.invoke(SNodeOperations.asSConcept(SNodeOperations.getConcept(targetExpr))) || SNodeOperations.isInstanceOf(targetExpr, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, "jetbrains.mps.baseLanguage.structure.GenericNewExpression")) || (!(SNodeOperations.isInstanceOf(targetExpr, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef01239c9L, "jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression"))) && !(SNodeOperations.isInstanceOf(targetExpr, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation")))) || PrecedenceUtil.isHigherPriority(targetExpr, castExpression)));

  }

  public static boolean needsParensAroundNotExpression(SNode notExpression) {
    return !(((SLinkOperations.getTarget(notExpression, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbcf6bd10dL, 0xfbcf6c30a4L, "expression")) == null) || (boolean) Expression__BehaviorDescriptor.constant_id1653mnvAgr2.invoke(SNodeOperations.asSConcept(SNodeOperations.getConcept(SLinkOperations.getTarget(notExpression, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbcf6bd10dL, 0xfbcf6c30a4L, "expression"))))) || (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(notExpression, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbcf6bd10dL, 0xfbcf6c30a4L, "expression")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef01239c9L, "jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression"))) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(notExpression, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbcf6bd10dL, 0xfbcf6c30a4L, "expression")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation")))) || PrecedenceUtil.isHigherPriority(SLinkOperations.getTarget(notExpression, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbcf6bd10dL, 0xfbcf6c30a4L, "expression")), notExpression)));

  }

  public static SNode findDesiredInstanceOfExpressionRoot(SNode instanceOfExpression) {

    if ((SLinkOperations.getTarget(instanceOfExpression, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbff03700L, 0xfbbff06218L, "leftExpression")) == null) || (SNodeOperations.getParent(instanceOfExpression) == null) || !(SNodeOperations.isInstanceOf(SNodeOperations.getParent(instanceOfExpression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation"))) || !(SNodeOperations.hasRole(instanceOfExpression, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression"))) || !(PrecedenceUtil.isHigherPriority(SNodeOperations.cast(SNodeOperations.getParent(instanceOfExpression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")), instanceOfExpression))) {
      return null;
    }
    SNode currentParent = SNodeOperations.cast(SNodeOperations.getParent(instanceOfExpression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));

    while ((SNodeOperations.getParent(currentParent) != null) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(currentParent), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation")) && SNodeOperations.hasRole(currentParent, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression")) && PrecedenceUtil.isHigherPriority(SNodeOperations.cast(SNodeOperations.getParent(currentParent), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")), instanceOfExpression)) {
      currentParent = SNodeOperations.cast(SNodeOperations.getParent(currentParent), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));
    }
    return currentParent;
  }

  private static boolean isHigherPriority(SNode firstExpression, SNode secondExpression) {
    return getPriority(SNodeOperations.getConcept(firstExpression)).ordinal() < getPriority(SNodeOperations.getConcept(secondExpression)).ordinal();
  }
  private static PrecedenceUtil.Precedence getPriority(SConcept expression) {
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation"))) {
      switch ((int) BinaryOperation__BehaviorDescriptor.getPriority_id1653mnvAgo2.invoke(SNodeOperations.asSConcept(SNodeOperations.castConcept(expression, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation"))))) {
        case 2:
          // || 
          return PrecedenceUtil.Precedence.J_13;
        case 3:
          // && 
          return PrecedenceUtil.Precedence.J_12;
        case 4:
          // | 
          return PrecedenceUtil.Precedence.J_11;
        case 5:
          // ^ 
          return PrecedenceUtil.Precedence.J_10;
        case 6:
          // & 
          return PrecedenceUtil.Precedence.J_9;
        case 7:
          // ==, != 
          return PrecedenceUtil.Precedence.J_8;
        case 8:
          // <, <=, >, >= 
          return PrecedenceUtil.Precedence.J_7;
        case 9:
          // >>, << 
          return PrecedenceUtil.Precedence.J_6;
        case 10:
          // +, - 
          return PrecedenceUtil.Precedence.J_5;
        case 11:
          // *, /, % 
          return PrecedenceUtil.Precedence.J_4;
        default:
      }
    }

    // TODO: not sure concerning ParenthesizedExpression priorities.. 
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression"))) {
      return PrecedenceUtil.Precedence.PARENTHESES;
    }
    // TODO: m.b. we should make "Default" precenence higher then all the user extensions 
    // TODO: will be recognized as high-priority expressions 
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11126b40c25L, "jetbrains.mps.baseLanguage.structure.ArrayAccessExpression")) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, "jetbrains.mps.baseLanguage.structure.IMethodCall")) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference")) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x515d7a8d927e9fb3L, "jetbrains.mps.baseLanguage.structure.LocalPropertyReference")) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116ea555a25L, "jetbrains.mps.baseLanguage.collections.structure.MapElement")) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d6213c318L, "jetbrains.mps.baseLanguage.collections.structure.ListElementAccessExpression")) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x10975850da7L, "jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression"))) {
      return PrecedenceUtil.Precedence.ARRAY_OPARATIONS_AND_METHOD_CALLS;
    }
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression"))) {
      return PrecedenceUtil.Precedence.DOT_EXPRESSION;
    }
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x10aaf6d7435L, "jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression"))) {
      return PrecedenceUtil.Precedence.DOT_EXPRESSION;
    }
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11adecdb4f0L, "jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression")) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11aded05fe6L, "jetbrains.mps.baseLanguage.structure.PostfixDecrementExpression"))) {
      return PrecedenceUtil.Precedence.POSTFIX_EXPRESSIONS;
    }
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x120a46df580L, "jetbrains.mps.baseLanguage.structure.PrefixIncrementExpression")) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x120a472f0e8L, "jetbrains.mps.baseLanguage.structure.PrefixDecrementExpression")) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x6fea7de6103549b1L, "jetbrains.mps.baseLanguage.structure.UnaryMinus")) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbcf6bd10dL, "jetbrains.mps.baseLanguage.structure.NotExpression")) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11d6d026f5fL, "jetbrains.mps.baseLanguage.structure.BitwiseNotExpression"))) {
      return PrecedenceUtil.Precedence.J_2;
    }
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, "jetbrains.mps.baseLanguage.structure.CastExpression")) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, "jetbrains.mps.baseLanguage.structure.GenericNewExpression"))) {
      return PrecedenceUtil.Precedence.J_3;
    }
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbff03700L, "jetbrains.mps.baseLanguage.structure.InstanceOfExpression"))) {
      return PrecedenceUtil.Precedence.J_7;
    }
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef01239c9L, "jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression"))) {
      return PrecedenceUtil.Precedence.J_14;
    }
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(expression), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11b0d00332cL, "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression"))) {
      return PrecedenceUtil.Precedence.J_15;
    }
    return PrecedenceUtil.Precedence.DEFAULT;
  }
  public static SNode processLeftTransform(SNode sourceNode, SNode result) {
    SNode nodeToProcess = PrecedenceUtil.getTargetForLeftTransform(sourceNode, result);
    // since BinaryOperations are left-associative we should perform complex LT then 
    // BinaryOperations is "rightExpression" child of another BinaryOperations with same priority 
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(nodeToProcess), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation")) && Objects.equals(SNodeOperations.getContainingLink(nodeToProcess), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression"))) {
      SNode parentBinaryOperation = SNodeOperations.cast(SNodeOperations.getParent(nodeToProcess), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation"));
      if (PrecedenceUtil.isSamePriority(parentBinaryOperation, result)) {
        SNodeOperations.replaceWithAnother(parentBinaryOperation, result);
        SLinkOperations.setTarget(result, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression"), nodeToProcess);
        SLinkOperations.setTarget(result, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11cL, "leftExpression"), parentBinaryOperation);
        return result;
      }
    }
    SNodeOperations.replaceWithAnother(nodeToProcess, result);
    SLinkOperations.setTarget(result, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression"), nodeToProcess);
    PrecedenceUtil.parenthesiseIfNecessary(result);
    return result;
  }
  public static SNode processRightTransform(SNode sourceNode, SNode result) {
    SNodeOperations.replaceWithAnother(sourceNode, result);
    SLinkOperations.setTarget(result, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11cL, "leftExpression"), sourceNode);
    ParenthesisUtil.checkOperationWRTPriority(result);
    return result;
  }
  private enum Precedence {
    PARENTHESES(),
    ARRAY_OPARATIONS_AND_METHOD_CALLS(),
    DOT_EXPRESSION(),
    POSTFIX_EXPRESSIONS(),
    J_2(),
    J_3(),
    J_4(),
    J_5(),
    J_6(),
    J_7(),
    J_8(),
    J_9(),
    J_10(),
    J_11(),
    J_12(),
    J_13(),
    J_14(),
    J_15(),
    DEFAULT();

    Precedence() {
      // All J_ constants corresponds to the levels "defined" in java - see 
      // http://www.cs.princeton.edu/introcs/11precedence/ 

      // All MPS_ constants were introduced in MPS languages 

      // Actual priority of Expression is determined by ordinal of corresponding 
      // enumeration constant upper constants has higher priority then lower 
    }
  }
}
