package jetbrains.mps.editor.contextActionsTool.lang.menus.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import java.util.Collection;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import java.util.HashSet;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class TransformationLocation_ContextActionsTool__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xb1c7d06f525d43b5L, 0x9b0a2fc8f7f076baL, 0x7c45559defbb1da8L, "jetbrains.mps.editor.contextActionsTool.lang.menus.structure.TransformationLocation_ContextActionsTool");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Collection<SConcept>> getRequiredFeatures_id7L5lpRJHK_w = new SMethodBuilder<Collection<SConcept>>(new SJavaCompoundTypeImpl((Class<Collection<SConcept>>) ((Class) Object.class))).name("getRequiredFeatures").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7L5lpRJHK_w").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getRequiredFeatures_id7L5lpRJHK_w);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static Collection<SConcept> getRequiredFeatures_id7L5lpRJHK_w(@NotNull SNode __thisNode__) {
    return CollectionSequence.fromCollectionAndArray(new HashSet<SConcept>(), MetaAdapterFactory.getConcept(0xb1c7d06f525d43b5L, 0x9b0a2fc8f7f076baL, 0x7c45559defbb1ac7L, "jetbrains.mps.editor.contextActionsTool.lang.menus.structure.TransformationFeature_Icon"), MetaAdapterFactory.getConcept(0xb1c7d06f525d43b5L, 0x9b0a2fc8f7f076baL, 0x7c45559defbb1da5L, "jetbrains.mps.editor.contextActionsTool.lang.menus.structure.TransformationFeature_Tooltip"));
  }

  /*package*/ TransformationLocation_ContextActionsTool__BehaviorDescriptor() {
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
        return (T) ((Collection<SConcept>) getRequiredFeatures_id7L5lpRJHK_w(node));
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
