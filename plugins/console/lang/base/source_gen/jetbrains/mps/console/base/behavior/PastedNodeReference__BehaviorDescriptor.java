package jetbrains.mps.console.base.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import org.jetbrains.mps.openapi.model.SNodeId;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class PastedNodeReference__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x51132a123c89fa7eL, "jetbrains.mps.console.base.structure.PastedNodeReference");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<SNode> getTargetNode_id36vPRrqnscn = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getTargetNode").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("36vPRrqnscn").registry(REGISTRY).build();
  public static final SMethod<String> getText_id5E451QuvdoB = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getText").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5E451QuvdoB").registry(REGISTRY).build();
  public static final SMethod<String> getText_id25MaZwhj0R7 = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getText").modifiers(SModifiersImpl.create(1, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("25MaZwhj0R7").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(SNodeId.class, ""));
  public static final SMethod<String> getTextWhenBroken_idigjXyuNrou = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getTextWhenBroken").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("igjXyuNrou").registry(REGISTRY).build();
  public static final SMethod<Boolean> canExecute_id2QdC0h7dh1h = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canExecute").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2QdC0h7dh1h").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getTargetNode_id36vPRrqnscn, getText_id5E451QuvdoB, getText_id25MaZwhj0R7, getTextWhenBroken_idigjXyuNrou, canExecute_id2QdC0h7dh1h);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static SNode getTargetNode_id36vPRrqnscn(@NotNull SNode __thisNode__) {
    return SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x36ac6f29ae8c1fb5L, 0x4904fd89e74fc6fL, "target"));
  }
  /*package*/ static String getText_id5E451QuvdoB(@NotNull SNode __thisNode__) {
    if (((boolean) INodeWithReference__BehaviorDescriptor.isBroken_id7m$hACyVN2F.invoke(__thisNode__))) {
      return INodeWithReference__BehaviorDescriptor.getTextWhenBroken_idigjXyuNrou.invoke(__thisNode__);
    } else {
      return PastedNodeReference__BehaviorDescriptor.getText_id25MaZwhj0R7.invoke(SNodeOperations.asSConcept(SNodeOperations.getConcept(__thisNode__)), SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x36ac6f29ae8c1fb5L, 0x4904fd89e74fc6fL, "target")).getNodeId());
    }
  }
  /*package*/ static String getText_id25MaZwhj0R7(@NotNull SAbstractConcept __thisConcept__, SNodeId targetNodeId) {
    if (targetNodeId == null) {
      return "(deleted node)";
    }
    int id = targetNodeId.hashCode();
    return "nodeRef@" + ((id >>> 16) + (id << 16 >>> 16));
  }
  /*package*/ static String getTextWhenBroken_idigjXyuNrou(@NotNull SNode __thisNode__) {
    SNodeId targetNodeId = __thisNode__.getReference(MetaAdapterFactory.getReferenceLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x36ac6f29ae8c1fb5L, 0x4904fd89e74fc6fL, "target")).getTargetNodeId();
    return PastedNodeReference__BehaviorDescriptor.getText_id25MaZwhj0R7.invoke(SNodeOperations.asSConcept(SNodeOperations.getConcept(__thisNode__)), targetNodeId) + "(deleted node)";
  }
  /*package*/ static boolean canExecute_id2QdC0h7dh1h(@NotNull SNode __thisNode__) {
    return false;
  }

  /*package*/ PastedNodeReference__BehaviorDescriptor() {
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
        return (T) ((SNode) getTargetNode_id36vPRrqnscn(node));
      case 1:
        return (T) ((String) getText_id5E451QuvdoB(node));
      case 3:
        return (T) ((String) getTextWhenBroken_idigjXyuNrou(node));
      case 4:
        return (T) ((Boolean) canExecute_id2QdC0h7dh1h(node));
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
      case 2:
        return (T) ((String) getText_id25MaZwhj0R7(concept, (SNodeId) parameters[0]));
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
