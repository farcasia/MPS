package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import java.util.List;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class CellMenuPart_Generic_Group_Handler__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10f587b827aL, "jetbrains.mps.lang.editor.structure.CellMenuPart_Generic_Group_Handler");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<List<SConcept>> getParameterConcepts_id2xELmDxyi2v = new SMethodBuilder<List<SConcept>>(new SJavaCompoundTypeImpl((Class<List<SConcept>>) ((Class) Object.class))).name("getParameterConcepts").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2xELmDxyi2v").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getParameterConcepts_id2xELmDxyi2v);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static List<SConcept> getParameterConcepts_id2xELmDxyi2v(@NotNull SNode __thisNode__) {
    List<SConcept> result = ConceptFunction__BehaviorDescriptor.getParameterConcepts_id2xELmDxyi2v.invoke0(__thisNode__, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L, "jetbrains.mps.baseLanguage.structure.ConceptFunction"));
    ListSequence.fromList(result).addElement(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10eecc5b3feL, "jetbrains.mps.lang.editor.structure.CellMenuPart_AbstractGroup_parameterObject"));
    ListSequence.fromList(result).addElement(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10eecc9de0fL, "jetbrains.mps.lang.editor.structure.CellMenuPart_Abstract_editedNode"));
    ListSequence.fromList(result).addElement(MetaAdapterFactory.getConcept(0x13744753c81f424aL, 0x9c1bcf8943bf4e86L, 0x10e761b3745L, "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_model"));
    ListSequence.fromList(result).addElement(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10e76200a6fL, "jetbrains.mps.lang.editor.structure.ConceptFunctionParameter_editorContext"));
    ListSequence.fromList(result).addElement(MetaAdapterFactory.getConcept(0x13744753c81f424aL, 0x9c1bcf8943bf4e86L, 0x10e761c927aL, "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_operationContext"));
    return result;
  }

  /*package*/ CellMenuPart_Generic_Group_Handler__BehaviorDescriptor() {
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
        return (T) ((List<SConcept>) getParameterConcepts_id2xELmDxyi2v(node));
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
