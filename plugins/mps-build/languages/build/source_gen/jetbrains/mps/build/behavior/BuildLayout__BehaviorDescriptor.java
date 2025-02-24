package jetbrains.mps.build.behavior;

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
import jetbrains.mps.build.util.Context;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.build.util.UnpackHelper;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class BuildLayout__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4df58c6f18f84a14L, "jetbrains.mps.build.structure.BuildLayout");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> getChildrenOutputDir_WithMacro_id450ejGzh8bb = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getChildrenOutputDir_WithMacro").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("450ejGzh8bb").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(Context.class, ""));
  public static final SMethod<String> getAssembleSubTaskId_id450ejGzh8bO = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getAssembleSubTaskId").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("450ejGzh8bO").registry(REGISTRY).build();
  public static final SMethod<String> getPrepareSubTaskId_id450ejGzh8bD = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getPrepareSubTaskId").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("450ejGzh8bD").registry(REGISTRY).build();
  public static final SMethod<Void> appendName_id1bWeed$ownT = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("appendName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1bWeed$ownT").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter(StringBuilder.class, ""));
  public static final SMethod<Void> unpack_id6IqTD4bJTWZ = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("unpack").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6IqTD4bJTWZ").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(UnpackHelper.class, ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getChildrenOutputDir_WithMacro_id450ejGzh8bb, getAssembleSubTaskId_id450ejGzh8bO, getPrepareSubTaskId_id450ejGzh8bD, appendName_id1bWeed$ownT, unpack_id6IqTD4bJTWZ);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String getChildrenOutputDir_WithMacro_id450ejGzh8bb(@NotNull SNode __thisNode__, Context context) {
    return "${build.layout}";
  }
  /*package*/ static String getAssembleSubTaskId_id450ejGzh8bO(@NotNull SNode __thisNode__) {
    return null;
  }
  /*package*/ static String getPrepareSubTaskId_id450ejGzh8bD(@NotNull SNode __thisNode__) {
    return "create.artifacts.folder." + __thisNode__.getNodeId().toString();
  }
  /*package*/ static void appendName_id1bWeed$ownT(@NotNull SNode __thisNode__, SNode parent, StringBuilder sb) {
    sb.append("/");
  }
  /*package*/ static void unpack_id6IqTD4bJTWZ(@NotNull SNode __thisNode__, UnpackHelper helper) {
    SNode parent = helper.parent(__thisNode__);
    if (parent == null) {
      helper.putContentLocation(__thisNode__, "${build.layout}");
    } else {
      String parentLocation = helper.getContentLocation(parent);
      helper.putContentLocation(__thisNode__, parentLocation);
    }
  }

  /*package*/ BuildLayout__BehaviorDescriptor() {
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
        return (T) ((String) getChildrenOutputDir_WithMacro_id450ejGzh8bb(node, (Context) parameters[0]));
      case 1:
        return (T) ((String) getAssembleSubTaskId_id450ejGzh8bO(node));
      case 2:
        return (T) ((String) getPrepareSubTaskId_id450ejGzh8bD(node));
      case 3:
        appendName_id1bWeed$ownT(node, (SNode) parameters[0], (StringBuilder) parameters[1]);
        return null;
      case 4:
        unpack_id6IqTD4bJTWZ(node, (UnpackHelper) parameters[0]);
        return null;
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
