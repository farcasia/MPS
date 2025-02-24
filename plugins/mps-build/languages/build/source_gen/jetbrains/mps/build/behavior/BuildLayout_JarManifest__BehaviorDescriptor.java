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
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class BuildLayout_JarManifest__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x115d3b22faf20f2eL, "jetbrains.mps.build.structure.BuildLayout_JarManifest");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> getOutputPath_WithMacro_id5V$ev8kKIxP = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getOutputPath_WithMacro").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5V$ev8kKIxP").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(Context.class, ""));
  public static final SMethod<Boolean> isInJar_id5V$ev8kKReX = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isInJar").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5V$ev8kKReX").registry(REGISTRY).build();
  public static final SMethod<Iterable<SNode>> getSections_id7ro1Zzt_n6o = new SMethodBuilder<Iterable<SNode>>(new SJavaCompoundTypeImpl((Class<Iterable<SNode>>) ((Class) Object.class))).name("getSections").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7ro1Zzt_n6o").registry(REGISTRY).build();
  public static final SMethod<Iterable<SNode>> getAttributes_id7ro1Zzt_na1 = new SMethodBuilder<Iterable<SNode>>(new SJavaCompoundTypeImpl((Class<Iterable<SNode>>) ((Class) Object.class))).name("getAttributes").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7ro1Zzt_na1").registry(REGISTRY).build();
  public static final SMethod<String> defaultManifestName_id7N6lJotVTmG = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("defaultManifestName").modifiers(SModifiersImpl.create(1, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7N6lJotVTmG").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getOutputPath_WithMacro_id5V$ev8kKIxP, isInJar_id5V$ev8kKReX, getSections_id7ro1Zzt_n6o, getAttributes_id7ro1Zzt_na1, defaultManifestName_id7N6lJotVTmG);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String getOutputPath_WithMacro_id5V$ev8kKIxP(@NotNull SNode __thisNode__, Context context) {
    if ((SNodeOperations.getParent(__thisNode__) != null) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(__thisNode__), MetaAdapterFactory.getInterfaceConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4140393b234482c3L, "jetbrains.mps.build.structure.BuildLayout_Container"))) {
      if (((boolean) BuildLayout_JarManifest__BehaviorDescriptor.isInJar_id5V$ev8kKReX.invoke(__thisNode__))) {
        SNode nlayout = SNodeOperations.getNodeAncestor(__thisNode__, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x31292e1a60d9f330L, "jetbrains.mps.build.structure.BuildNamedLayout"), true, false);
        return context.getTempPath(__thisNode__, BuildLayout_JarManifest__BehaviorDescriptor.defaultManifestName_id7N6lJotVTmG.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x115d3b22faf20f2eL, "jetbrains.mps.build.structure.BuildLayout_JarManifest"))), ((nlayout != null) ? SPropertyOperations.getString(nlayout, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) : "default"));
      } else {
        String parentChildrenTargetDir = BuildLayout_Container__BehaviorDescriptor.getChildrenOutputDir_WithMacro_id450ejGzh8bb.invoke(SNodeOperations.cast(SNodeOperations.getParent(__thisNode__), MetaAdapterFactory.getInterfaceConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4140393b234482c3L, "jetbrains.mps.build.structure.BuildLayout_Container")), context);
        String name;
        if ((SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x115d3b22faf20f2eL, 0x67af4eb97391dfc1L, "name")) != null)) {
          name = BuildString__BehaviorDescriptor.getText_id3NagsOfTioI.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x115d3b22faf20f2eL, 0x67af4eb97391dfc1L, "name")), context.getMacros(__thisNode__));
        } else {
          name = BuildLayout_JarManifest__BehaviorDescriptor.defaultManifestName_id7N6lJotVTmG.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x115d3b22faf20f2eL, "jetbrains.mps.build.structure.BuildLayout_JarManifest")));
        }
        return parentChildrenTargetDir + "/" + name;
      }
    }
    return null;
  }
  /*package*/ static boolean isInJar_id5V$ev8kKReX(@NotNull SNode __thisNode__) {
    return (SNodeOperations.getParent(__thisNode__) != null) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(__thisNode__), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafac7f9aL, "jetbrains.mps.build.structure.BuildLayout_Jar"));
  }
  /*package*/ static Iterable<SNode> getSections_id7ro1Zzt_n6o(@NotNull SNode __thisNode__) {
    return SNodeOperations.ofConcept(SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x115d3b22faf20f2eL, 0x76d807f8dd957193L, "parts")), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x115d3b22faf47d7bL, "jetbrains.mps.build.structure.BuildLayout_JarManifest_Section"));
  }
  /*package*/ static Iterable<SNode> getAttributes_id7ro1Zzt_na1(@NotNull SNode __thisNode__) {
    return SNodeOperations.ofConcept(SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x115d3b22faf20f2eL, 0x76d807f8dd957193L, "parts")), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x115d3b22faf20f30L, "jetbrains.mps.build.structure.BuildLayout_JarManifest_Attribute"));
  }
  /*package*/ static String defaultManifestName_id7N6lJotVTmG(@NotNull SAbstractConcept __thisConcept__) {
    return "MANIFEST.MF";
  }

  /*package*/ BuildLayout_JarManifest__BehaviorDescriptor() {
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
        return (T) ((String) getOutputPath_WithMacro_id5V$ev8kKIxP(node, (Context) parameters[0]));
      case 1:
        return (T) ((Boolean) isInJar_id5V$ev8kKReX(node));
      case 2:
        return (T) ((Iterable<SNode>) getSections_id7ro1Zzt_n6o(node));
      case 3:
        return (T) ((Iterable<SNode>) getAttributes_id7ro1Zzt_na1(node));
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
        return (T) ((String) defaultManifestName_id7N6lJotVTmG(concept));
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
