package jetbrains.mps.build.mps.behavior;

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
import jetbrains.mps.build.util.DependenciesHelper;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.build.util.UnpackHelper;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.build.behavior.BuildLayout_Node__BehaviorDescriptor;
import jetbrains.mps.build.behavior.BuildLayout_PathElement__BehaviorDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class BuildMpsLayout_PluginDescriptor__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4dee437cL, "jetbrains.mps.build.mps.structure.BuildMpsLayout_PluginDescriptor");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Boolean> exports_id5FtnUVJQES1 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("exports").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5FtnUVJQES1").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(Object.class, ""));
  public static final SMethod<String> location_id6b4RkXS8sT2 = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("location").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6b4RkXS8sT2").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(DependenciesHelper.class, ""), SMethodBuilder.createJavaParameter(Object.class, ""));
  public static final SMethod<Void> appendName_id1bWeed$ownT = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("appendName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1bWeed$ownT").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter(StringBuilder.class, ""));
  public static final SMethod<Void> unpack_id6IqTD4bJTWZ = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("unpack").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6IqTD4bJTWZ").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(UnpackHelper.class, ""));
  public static final SMethod<String> pluginXml_idQkG2t1cwfm = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("pluginXml").modifiers(SModifiersImpl.create(1, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("QkG2t1cwfm").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(exports_id5FtnUVJQES1, location_id6b4RkXS8sT2, appendName_id1bWeed$ownT, unpack_id6IqTD4bJTWZ, pluginXml_idQkG2t1cwfm);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static boolean exports_id5FtnUVJQES1(@NotNull SNode __thisNode__, Object artifactId) {
    if (artifactId instanceof jetbrains.mps.smodel.SNode) {
      SNode node = (SNode) artifactId;
      // todo (in 3.0+) plugin should be exported by folder, not by xml 
      // weeeeell? 
      if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4de9bb74L, "jetbrains.mps.build.mps.structure.BuildMps_IdeaPlugin"))) {
        return SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4dee437cL, 0x5b7be37b4dee437dL, "plugin")) == node;
      }
    }
    return ((boolean) BuildLayout_Node__BehaviorDescriptor.exports_id5FtnUVJQES1.invokeSuper(__thisNode__, MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4dee437cL, "jetbrains.mps.build.mps.structure.BuildMpsLayout_PluginDescriptor"), artifactId));
  }
  /*package*/ static String location_id6b4RkXS8sT2(@NotNull SNode __thisNode__, DependenciesHelper helper, Object artifactId) {
    if (artifactId instanceof jetbrains.mps.smodel.SNode) {
      SNode node = (SNode) artifactId;
      if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4de9bb74L, "jetbrains.mps.build.mps.structure.BuildMps_IdeaPlugin"))) {
        return helper.getLocation(__thisNode__) + "/../..";
      }
    }
    return ((String) BuildLayout_PathElement__BehaviorDescriptor.location_id6b4RkXS8sT2.invokeSuper(__thisNode__, MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4dee437cL, "jetbrains.mps.build.mps.structure.BuildMpsLayout_PluginDescriptor"), helper, artifactId));
  }
  /*package*/ static void appendName_id1bWeed$ownT(@NotNull SNode __thisNode__, SNode parent, StringBuilder sb) {
    if (SNodeOperations.isInstanceOf(parent, MetaAdapterFactory.getInterfaceConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4140393b234482c3L, "jetbrains.mps.build.structure.BuildLayout_Container"))) {
      sb.append("/");
    }
    sb.append(BuildMpsLayout_PluginDescriptor__BehaviorDescriptor.pluginXml_idQkG2t1cwfm.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4dee437cL, "jetbrains.mps.build.mps.structure.BuildMpsLayout_PluginDescriptor"))));
  }
  /*package*/ static void unpack_id6IqTD4bJTWZ(@NotNull SNode __thisNode__, UnpackHelper helper) {
    String parentLocation = helper.getContentLocation(helper.parent(__thisNode__));
    helper.putLocation(__thisNode__, parentLocation + "/" + BuildMpsLayout_PluginDescriptor__BehaviorDescriptor.pluginXml_idQkG2t1cwfm.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4dee437cL, "jetbrains.mps.build.mps.structure.BuildMpsLayout_PluginDescriptor"))));
  }
  /*package*/ static String pluginXml_idQkG2t1cwfm(@NotNull SAbstractConcept __thisConcept__) {
    return "plugin.xml";
  }

  /*package*/ BuildMpsLayout_PluginDescriptor__BehaviorDescriptor() {
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
        return (T) ((Boolean) exports_id5FtnUVJQES1(node, (Object) parameters[0]));
      case 1:
        return (T) ((String) location_id6b4RkXS8sT2(node, (DependenciesHelper) parameters[0], (Object) parameters[1]));
      case 2:
        appendName_id1bWeed$ownT(node, (SNode) parameters[0], (StringBuilder) parameters[1]);
        return null;
      case 3:
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
      case 4:
        return (T) ((String) pluginXml_idQkG2t1cwfm(concept));
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
