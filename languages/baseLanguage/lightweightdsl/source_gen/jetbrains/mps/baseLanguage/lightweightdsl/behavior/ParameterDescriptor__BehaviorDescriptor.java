package jetbrains.mps.baseLanguage.lightweightdsl.behavior;

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
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.module.SModule;
import java.lang.reflect.Method;
import jetbrains.mps.classloading.ClassLoaderManager;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

public final class ParameterDescriptor__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d164L, "jetbrains.mps.baseLanguage.lightweightdsl.structure.ParameterDescriptor");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<SNode> create_id2h59CdJp99Y = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("create").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2h59CdJp99Y").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<Boolean> isNeeded_id7GXvAHO1j1d = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isNeeded").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7GXvAHO1j1d").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<String> getGeneratedMethodName_id7GXvAHO1heb = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getGeneratedMethodName").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7GXvAHO1heb").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(create_id2h59CdJp99Y, isNeeded_id7GXvAHO1j1d, getGeneratedMethodName_id7GXvAHO1heb);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static SNode create_id2h59CdJp99Y(@NotNull SNode __thisNode__, SNode point) {
    return createMethodParameterInstance_e87i4c_a0a0(SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), __thisNode__, SNodeOperations.cast(HUtil.copyIfNecessary((SNodeOperations.isInstanceOf(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d164L, 0x340eb2bd2e03d166L, "type")), MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d15cL, "jetbrains.mps.baseLanguage.lightweightdsl.structure.DependentTypeDescriptor")) ? DependentTypeDescriptor__BehaviorDescriptor.create_id2h59CdJp8nr.invoke(SNodeOperations.cast(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d164L, 0x340eb2bd2e03d166L, "type")), MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d15cL, "jetbrains.mps.baseLanguage.lightweightdsl.structure.DependentTypeDescriptor")), point) : SNodeOperations.copyNode(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d164L, 0x340eb2bd2e03d166L, "type"))))), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL, "jetbrains.mps.baseLanguage.structure.Type")));
  }
  /*package*/ static boolean isNeeded_id7GXvAHO1j1d(@NotNull SNode __thisNode__, SNode node) {
    try {
      String className = SNodeOperations.getModel(__thisNode__).getModelName() + "." + DSLDescriptor__BehaviorDescriptor.getGeneratedClassName_id2VRROcY7Vt6.invoke(SNodeOperations.getNodeAncestor(__thisNode__, MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d160L, "jetbrains.mps.baseLanguage.lightweightdsl.structure.DSLDescriptor"), false, false));
      SModule classModule = __thisNode__.getModel().getModule();
      Method[] methods = ClassLoaderManager.getInstance().getClass(classModule, className).getMethods();
      for (Method m : methods) {
        if (m.getName().equals(ParameterDescriptor__BehaviorDescriptor.getGeneratedMethodName_id7GXvAHO1heb.invoke(__thisNode__))) {
          m.setAccessible(true);
          return ((Boolean) m.invoke(null, node));
        }
      }
      return false;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
  /*package*/ static String getGeneratedMethodName_id7GXvAHO1heb(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getString(SNodeOperations.getNodeAncestor(__thisNode__, MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d167L, "jetbrains.mps.baseLanguage.lightweightdsl.structure.MethodDescriptor"), false, false), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "_" + SPropertyOperations.getString(SNodeOperations.getNodeAncestor(__thisNode__, MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d164L, "jetbrains.mps.baseLanguage.lightweightdsl.structure.ParameterDescriptor"), false, false), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "_opt";
  }

  /*package*/ ParameterDescriptor__BehaviorDescriptor() {
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
        return (T) ((SNode) create_id2h59CdJp99Y(node, (SNode) parameters[0]));
      case 1:
        return (T) ((Boolean) isNeeded_id7GXvAHO1j1d(node, (SNode) parameters[0]));
      case 2:
        return (T) ((String) getGeneratedMethodName_id7GXvAHO1heb(node));
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
  private static SNode createMethodParameterInstance_e87i4c_a0a0(Object p0, Object p1, Object p2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x7b3d7e6b74000c44L, "jetbrains.mps.baseLanguage.lightweightdsl.structure.MethodParameterInstance"), null, null, false);
    n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), p0 + "");
    n1.setReferenceTarget(MetaAdapterFactory.getReferenceLink(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x7b3d7e6b74000c44L, 0x7b3d7e6b7400c831L, "decl"), (SNode) p1);
    if (p2 != null) {
      n1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type"), (SNode) p2);
    }
    return n1;
  }
}
