package jetbrains.mps.baseLanguage.regexp.behavior;

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
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.ArrayList;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class MatchParensRegexp__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111797946c7L, "jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> getString_idhMuDF1A = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getString").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hMuDF1A").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<List<SNode>>) ((Class) Object.class), ""));
  public static final SMethod<Integer> getIndex_idhNm3Btp = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("getIndex").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hNm3Btp").registry(REGISTRY).build();
  public static final SMethod<SNode> getValue_idhOJcizo = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getValue").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hOJcizo").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getString_idhMuDF1A, getIndex_idhNm3Btp, getValue_idhOJcizo);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String getString_idhMuDF1A(@NotNull SNode __thisNode__, List<SNode> vars) {
    ListSequence.fromList(vars).addElement(__thisNode__);
    return "(" + Regexp__BehaviorDescriptor.getString_idhMuDF1A.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111797946c7L, 0x111797ac579L, "regexp")), vars) + ")";
  }
  /*package*/ static int getIndex_idhNm3Btp(@NotNull SNode __thisNode__) {
    SNode parens = __thisNode__;
    List<SNode> parensList = new ArrayList<SNode>();
    Regexp__BehaviorDescriptor.getString_idhMuDF1A.invoke(Regexp__BehaviorDescriptor.getTopLevelRegexp_idhNm6Oh5.invoke(__thisNode__), parensList);
    return 1 + ListSequence.fromList(parensList).indexOf(parens);
  }
  /*package*/ static SNode getValue_idhOJcizo(@NotNull SNode __thisNode__) {
    throw new UnsupportedOperationException();
  }

  /*package*/ MatchParensRegexp__BehaviorDescriptor() {
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
        return (T) ((String) getString_idhMuDF1A(node, (List<SNode>) parameters[0]));
      case 1:
        return (T) ((Integer) getIndex_idhNm3Btp(node));
      case 2:
        return (T) ((SNode) getValue_idhOJcizo(node));
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
