package jetbrains.mps.lang.editor.behavior;

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
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class CellModel_Constant__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eb01232eL, "jetbrains.mps.lang.editor.structure.CellModel_Constant");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Integer> getDefaultFontStyle_idhL_r0Mx = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("getDefaultFontStyle").modifiers(SModifiersImpl.create(8, AccessPrivileges.PROTECTED)).concept(CONCEPT).id("hL_r0Mx").registry(REGISTRY).build();
  public static final SMethod<Boolean> canBeSynchronized_id3wXm3h1AYM7 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canBeSynchronized").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("3wXm3h1AYM7").registry(REGISTRY).build();
  public static final SMethod<Boolean> shellBeSynchronized_id3TPTV99_TMT = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("shellBeSynchronized").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("3TPTV99_TMT").registry(REGISTRY).build();
  public static final SMethod<Boolean> canBeUsedAsEmptyCell_id6RO52Mcgrfa = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canBeUsedAsEmptyCell").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6RO52Mcgrfa").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getDefaultFontStyle_idhL_r0Mx, canBeSynchronized_id3wXm3h1AYM7, shellBeSynchronized_id3TPTV99_TMT, canBeUsedAsEmptyCell_id6RO52Mcgrfa);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static int getDefaultFontStyle_idhL_r0Mx(@NotNull SNode __thisNode__) {
    return EditorCell_Constant.DEFAULT_FONT_STYLE;
  }
  /*package*/ static boolean canBeSynchronized_id3wXm3h1AYM7(@NotNull SNode __thisNode__) {
    return true;
  }
  /*package*/ static boolean shellBeSynchronized_id3TPTV99_TMT(@NotNull SNode __thisNode__) {
    return false;
  }
  /*package*/ static boolean canBeUsedAsEmptyCell_id6RO52Mcgrfa(@NotNull SNode __thisNode__) {
    return true;
  }

  /*package*/ CellModel_Constant__BehaviorDescriptor() {
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
        return (T) ((Integer) getDefaultFontStyle_idhL_r0Mx(node));
      case 1:
        return (T) ((Boolean) canBeSynchronized_id3wXm3h1AYM7(node));
      case 2:
        return (T) ((Boolean) shellBeSynchronized_id3TPTV99_TMT(node));
      case 3:
        return (T) ((Boolean) canBeUsedAsEmptyCell_id6RO52Mcgrfa(node));
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
