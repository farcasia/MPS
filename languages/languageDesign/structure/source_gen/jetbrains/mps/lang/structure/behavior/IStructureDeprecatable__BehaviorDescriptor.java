package jetbrains.mps.lang.structure.behavior;

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
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class IStructureDeprecatable__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getInterfaceConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x11d2ea63881L, "jetbrains.mps.lang.structure.structure.IStructureDeprecatable");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Boolean> isDeprecated_idhOwoPtR = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isDeprecated").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hOwoPtR").registry(REGISTRY).build();
  public static final SMethod<String> getMessage_idhP43_8K = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getMessage").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hP43_8K").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(isDeprecated_idhOwoPtR, getMessage_idhP43_8K);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static boolean isDeprecated_idhOwoPtR(@NotNull SNode __thisNode__) {
    return (AttributeOperations.getAttribute(__thisNode__, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x11d0a70ae54L, "jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation"))) != null);
  }
  /*package*/ static String getMessage_idhP43_8K(@NotNull SNode __thisNode__) {
    StringBuilder result = new StringBuilder();
    result.append(BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(__thisNode__));
    result.append(" is deprecated");
    if (SPropertyOperations.getString(AttributeOperations.getAttribute(__thisNode__, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x11d0a70ae54L, "jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation"))), MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x11d0a70ae54L, 0x11d3ec75203L, "build")) != null) {
      result.append(" since build ");
      result.append(SPropertyOperations.getString(AttributeOperations.getAttribute(__thisNode__, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x11d0a70ae54L, "jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation"))), MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x11d0a70ae54L, 0x11d3ec75203L, "build")));
    }
    if (SPropertyOperations.getString(AttributeOperations.getAttribute(__thisNode__, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x11d0a70ae54L, "jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation"))), MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x11d0a70ae54L, 0x11d3ec760e8L, "comment")) != null) {
      result.append(" (");
      result.append(SPropertyOperations.getString(AttributeOperations.getAttribute(__thisNode__, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x11d0a70ae54L, "jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation"))), MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x11d0a70ae54L, 0x11d3ec760e8L, "comment")));
      result.append(")");
    }
    return result.toString();
  }

  /*package*/ IStructureDeprecatable__BehaviorDescriptor() {
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
        return (T) ((Boolean) isDeprecated_idhOwoPtR(node));
      case 1:
        return (T) ((String) getMessage_idhP43_8K(node));
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
