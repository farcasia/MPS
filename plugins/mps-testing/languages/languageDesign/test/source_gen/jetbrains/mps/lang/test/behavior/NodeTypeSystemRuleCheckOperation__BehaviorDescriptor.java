package jetbrains.mps.lang.test.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import jetbrains.mps.errors.item.NodeReportItem;
import org.jetbrains.mps.openapi.module.SRepository;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.test.runtime.NodeCheckerUtil;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class NodeTypeSystemRuleCheckOperation__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x4a391b6dc8e619d9L, "jetbrains.mps.lang.test.structure.NodeTypeSystemRuleCheckOperation");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Boolean> hasExpectedRuleMessage_id4CT6QR8SJl8 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("hasExpectedRuleMessage").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4CT6QR8SJl8").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<Iterable<NodeReportItem>>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter(SRepository.class, ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(hasExpectedRuleMessage_id4CT6QR8SJl8);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static boolean hasExpectedRuleMessage_id4CT6QR8SJl8(@NotNull SNode __thisNode__, Iterable<NodeReportItem> errorReporters, SRepository contextRepo) {
    for (NodeReportItem errorReport : errorReporters) {
      SNode ruleNode = NodeCheckerUtil.getRuleNodeFromReporter(errorReport, contextRepo);
      if (new NodeRuleReference(ruleNode).getType() == RuleType.TYPESYSTEM) {
        return true;
      }
    }
    return false;
  }

  /*package*/ NodeTypeSystemRuleCheckOperation__BehaviorDescriptor() {
    super(REGISTRY);
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((Boolean) hasExpectedRuleMessage_id4CT6QR8SJl8(node, (Iterable<NodeReportItem>) parameters[0], (SRepository) parameters[1]));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }
}
