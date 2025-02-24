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
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.build.util.Context;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class BuildLayout_NamedContainer__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafac7f8cL, "jetbrains.mps.build.structure.BuildLayout_NamedContainer");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Void> appendName_id1bWeed$ownT = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("appendName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1bWeed$ownT").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter(StringBuilder.class, ""));
  public static final SMethod<String> getChildrenOutputDir_WithMacro_id450ejGzh8bb = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getChildrenOutputDir_WithMacro").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("450ejGzh8bb").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(Context.class, ""));
  public static final SMethod<String> getOutputPath_WithMacro_idfzIHCHip1Q = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getOutputPath_WithMacro").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("fzIHCHip1Q").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(Context.class, ""));
  public static final SMethod<String> getApproximateName_id4RsV8qJH_Br = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getApproximateName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4RsV8qJH_Br").registry(REGISTRY).build();
  public static final SMethod<Boolean> isValidPart_id7XQqoCTkVIS = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isValidPart").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7XQqoCTkVIS").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""), SMethodBuilder.createJavaParameter(SContainmentLink.class, ""));
  public static final SMethod<Boolean> hasInputDir_id1653mnvAgqQ = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("hasInputDir").modifiers(SModifiersImpl.create(9, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1653mnvAgqQ").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(appendName_id1bWeed$ownT, getChildrenOutputDir_WithMacro_id450ejGzh8bb, getOutputPath_WithMacro_idfzIHCHip1Q, getApproximateName_id4RsV8qJH_Br, isValidPart_id7XQqoCTkVIS, hasInputDir_id1653mnvAgqQ);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static void appendName_id1bWeed$ownT(@NotNull SNode __thisNode__, SNode parent, StringBuilder sb) {
    if (SNodeOperations.isInstanceOf(parent, MetaAdapterFactory.getInterfaceConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4140393b234482c3L, "jetbrains.mps.build.structure.BuildLayout_Container"))) {
      sb.append("/");
    }
    sb.append(BuildString__BehaviorDescriptor.getText_id3NagsOfTioI.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafac7f8cL, 0x3cca41cd0fe75496L, "containerName")), null));
  }
  /*package*/ static String getChildrenOutputDir_WithMacro_id450ejGzh8bb(@NotNull SNode __thisNode__, Context context) {
    SNode nlayout = SNodeOperations.getNodeAncestor(__thisNode__, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x31292e1a60d9f330L, "jetbrains.mps.build.structure.BuildNamedLayout"), true, false);
    return context.getTempPath(__thisNode__, SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), ((nlayout != null) ? SPropertyOperations.getString(nlayout, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) : "default"));
  }
  /*package*/ static String getOutputPath_WithMacro_idfzIHCHip1Q(@NotNull SNode __thisNode__, Context context) {
    if ((SNodeOperations.getParent(__thisNode__) != null) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(__thisNode__), MetaAdapterFactory.getInterfaceConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4140393b234482c3L, "jetbrains.mps.build.structure.BuildLayout_Container"))) {
      String parentChildrenTargetDir = BuildLayout_Container__BehaviorDescriptor.getChildrenOutputDir_WithMacro_id450ejGzh8bb.invoke(SNodeOperations.cast(SNodeOperations.getParent(__thisNode__), MetaAdapterFactory.getInterfaceConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4140393b234482c3L, "jetbrains.mps.build.structure.BuildLayout_Container")), context);
      return parentChildrenTargetDir + "/" + BuildString__BehaviorDescriptor.getText_id3NagsOfTioI.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafac7f8cL, 0x3cca41cd0fe75496L, "containerName")), context.getMacros(__thisNode__));
    }
    return null;
  }
  /*package*/ static String getApproximateName_id4RsV8qJH_Br(@NotNull SNode __thisNode__) {
    return (String) BuildString__BehaviorDescriptor.getText_id3NagsOfTioI.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafac7f8cL, 0x3cca41cd0fe75496L, "containerName")), null);
  }
  /*package*/ static boolean isValidPart_id7XQqoCTkVIS(@NotNull SNode __thisNode__, String propertyValue, SContainmentLink role) {
    return !((propertyValue.contains("$") || propertyValue.contains("/") || propertyValue.contains("\\")));
  }
  /*package*/ static boolean hasInputDir_id1653mnvAgqQ(@NotNull SAbstractConcept __thisConcept__) {
    return false;
  }

  /*package*/ BuildLayout_NamedContainer__BehaviorDescriptor() {
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
        appendName_id1bWeed$ownT(node, (SNode) parameters[0], (StringBuilder) parameters[1]);
        return null;
      case 1:
        return (T) ((String) getChildrenOutputDir_WithMacro_id450ejGzh8bb(node, (Context) parameters[0]));
      case 2:
        return (T) ((String) getOutputPath_WithMacro_idfzIHCHip1Q(node, (Context) parameters[0]));
      case 3:
        return (T) ((String) getApproximateName_id4RsV8qJH_Br(node));
      case 4:
        return (T) ((Boolean) isValidPart_id7XQqoCTkVIS(node, (String) parameters[0], (SContainmentLink) parameters[1]));
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
      case 5:
        return (T) ((Boolean) hasInputDir_id1653mnvAgqQ(concept));
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
