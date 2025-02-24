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
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class CellModel_Collection__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, "jetbrains.mps.lang.editor.structure.CellModel_Collection");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> getOpeningText_idhKxU$w9 = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getOpeningText").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hKxU$w9").registry(REGISTRY).build();
  public static final SMethod<String> getClosingText_idhKxUEwj = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getClosingText").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hKxUEwj").registry(REGISTRY).build();
  public static final SMethod<Boolean> isVertical_idi0pAV23 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isVertical").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("i0pAV23").registry(REGISTRY).build();
  public static final SMethod<Boolean> isVerticalGrid_idi2IbWq8 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isVerticalGrid").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("i2IbWq8").registry(REGISTRY).build();
  public static final SMethod<Boolean> isHorizontal_idi0pB4gH = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isHorizontal").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("i0pB4gH").registry(REGISTRY).build();
  public static final SMethod<Boolean> isIndentLayout_idi0pB9jQ = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isIndentLayout").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("i0pB9jQ").registry(REGISTRY).build();
  public static final SMethod<Boolean> isFoldingEnabled_id1_9L3A4DrOF = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isFoldingEnabled").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1_9L3A4DrOF").registry(REGISTRY).build();
  public static final SMethod<Boolean> isVerticalIndent_idi0tOX1j = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isVerticalIndent").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("i0tOX1j").registry(REGISTRY).build();
  public static final SMethod<Boolean> shellBeSynchronized_id3TPTV99_TMT = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("shellBeSynchronized").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("3TPTV99_TMT").registry(REGISTRY).build();
  /*package*/ static final SMethod<Boolean> shellBeSynchronized_id3TPTV99Aiv4 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("shellBeSynchronized").modifiers(SModifiersImpl.create(0, AccessPrivileges.PRIVATE)).concept(CONCEPT).id("3TPTV99Aiv4").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<Boolean> canBeSynchronized_id3wXm3h1AYM7 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canBeSynchronized").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("3wXm3h1AYM7").registry(REGISTRY).build();
  /*package*/ static final SMethod<Boolean> canBeSynchronized_id3wXm3h1BRps = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canBeSynchronized").modifiers(SModifiersImpl.create(0, AccessPrivileges.PRIVATE)).concept(CONCEPT).id("3wXm3h1BRps").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<Boolean> canBeUsedAsEmptyCell_id6RO52Mcgrfa = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canBeUsedAsEmptyCell").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6RO52Mcgrfa").registry(REGISTRY).build();
  public static final SMethod<SNode> getLayout_iditlittTD4U = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getLayout").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("itlittTD4U").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getOpeningText_idhKxU$w9, getClosingText_idhKxUEwj, isVertical_idi0pAV23, isVerticalGrid_idi2IbWq8, isHorizontal_idi0pB4gH, isIndentLayout_idi0pB9jQ, isFoldingEnabled_id1_9L3A4DrOF, isVerticalIndent_idi0tOX1j, shellBeSynchronized_id3TPTV99_TMT, shellBeSynchronized_id3TPTV99Aiv4, canBeSynchronized_id3wXm3h1AYM7, canBeSynchronized_id3wXm3h1BRps, canBeUsedAsEmptyCell_id6RO52Mcgrfa, getLayout_iditlittTD4U);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String getOpeningText_idhKxU$w9(@NotNull SNode __thisNode__) {
    if (((boolean) CellModel_Collection__BehaviorDescriptor.isVertical_idi0pAV23.invoke(__thisNode__))) {
      return "[/";
    } else if (((boolean) CellModel_Collection__BehaviorDescriptor.isIndentLayout_idi0pB9jQ.invoke(__thisNode__))) {
      return "[-";
    } else {
      return "[>";
    }
  }
  /*package*/ static String getClosingText_idhKxUEwj(@NotNull SNode __thisNode__) {
    if (((boolean) CellModel_Collection__BehaviorDescriptor.isVertical_idi0pAV23.invoke(__thisNode__))) {
      return "/]";
    } else if (((boolean) CellModel_Collection__BehaviorDescriptor.isIndentLayout_idi0pB9jQ.invoke(__thisNode__))) {
      return "-]";
    } else {
      return "<]";
    }
  }
  /*package*/ static boolean isVertical_idi0pAV23(@NotNull SNode __thisNode__) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x10192e0d3baL, "cellLayout")), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10192dd4cbeL, "jetbrains.mps.lang.editor.structure.CellLayout_Vertical"));
  }
  /*package*/ static boolean isVerticalGrid_idi2IbWq8(@NotNull SNode __thisNode__) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x10192e0d3baL, "cellLayout")), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x120aab61370L, "jetbrains.mps.lang.editor.structure.CellLayout_VerticalGrid"));
  }
  /*package*/ static boolean isHorizontal_idi0pB4gH(@NotNull SNode __thisNode__) {
    return (SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x10192e0d3baL, "cellLayout")) == null) || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x10192e0d3baL, "cellLayout")), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10192dcf685L, "jetbrains.mps.lang.editor.structure.CellLayout_Horizontal"));
  }
  /*package*/ static boolean isIndentLayout_idi0pB9jQ(@NotNull SNode __thisNode__) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x10192e0d3baL, "cellLayout")), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x120150bb441L, "jetbrains.mps.lang.editor.structure.CellLayout_Indent"));
  }
  /*package*/ static boolean isFoldingEnabled_id1_9L3A4DrOF(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getBoolean(__thisNode__, MetaAdapterFactory.getProperty(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x10e3893660fL, "usesFolding")) || (SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x78de9e36d994f770L, "usesFoldingCondition")) != null);
  }
  /*package*/ static boolean isVerticalIndent_idi0tOX1j(@NotNull SNode __thisNode__) {
    if (!(((boolean) CellModel_Collection__BehaviorDescriptor.isIndentLayout_idi0pB9jQ.invoke(__thisNode__)))) {
      return false;
    }
    if (((boolean) EditorCellModel__BehaviorDescriptor.isNewLineChildren_idi0pNGlC.invoke(__thisNode__))) {
      return true;
    }
    for (SNode model : SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0xf9eaff2518L, "childCellModel"))) {
      if ((boolean) EditorCellModel__BehaviorDescriptor.isNewLine_idi0pLPAc.invoke(model) || (boolean) EditorCellModel__BehaviorDescriptor.isNewLineChildren_idi0pNGlC.invoke(model) || (boolean) EditorCellModel__BehaviorDescriptor.isOnNewLine_idi0pUMOG.invoke(model)) {
        return true;
      }
      if (SNodeOperations.isInstanceOf(model, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, "jetbrains.mps.lang.editor.structure.CellModel_Collection")) && (boolean) CellModel_Collection__BehaviorDescriptor.isVerticalIndent_idi0tOX1j.invoke(SNodeOperations.cast(model, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, "jetbrains.mps.lang.editor.structure.CellModel_Collection")))) {
        return true;
      }
    }
    return false;
  }
  /*package*/ static boolean shellBeSynchronized_id3TPTV99_TMT(@NotNull final SNode __thisNode__) {
    return ListSequence.fromList(SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0xf9eaff2518L, "childCellModel"))).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return ((boolean) CellModel_Collection__BehaviorDescriptor.shellBeSynchronized_id3TPTV99Aiv4.invoke(__thisNode__, it));
      }
    }) || ((boolean) CellModel_Collection__BehaviorDescriptor.shellBeSynchronized_id3TPTV99Aiv4.invoke(__thisNode__, SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x6b2f47204d99c5f5L, "foldedCellModel"))));
  }
  /*package*/ static boolean shellBeSynchronized_id3TPTV99Aiv4(@NotNull SNode __thisNode__, SNode childCell) {
    return childCell != null && SNodeOperations.isInstanceOf(childCell, MetaAdapterFactory.getInterfaceConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x79b75ced2c4a134dL, "jetbrains.mps.lang.editor.structure.Synchronizeable")) && (boolean) Synchronizeable__BehaviorDescriptor.shellBeSynchronized_id3TPTV99_TMT.invoke(SNodeOperations.cast(childCell, MetaAdapterFactory.getInterfaceConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x79b75ced2c4a134dL, "jetbrains.mps.lang.editor.structure.Synchronizeable")));
  }
  /*package*/ static boolean canBeSynchronized_id3wXm3h1AYM7(@NotNull final SNode __thisNode__) {
    return ListSequence.fromList(SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0xf9eaff2518L, "childCellModel"))).all(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return ((boolean) CellModel_Collection__BehaviorDescriptor.canBeSynchronized_id3wXm3h1BRps.invoke(__thisNode__, it));
      }
    }) && ((boolean) CellModel_Collection__BehaviorDescriptor.canBeSynchronized_id3wXm3h1BRps.invoke(__thisNode__, SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x6b2f47204d99c5f5L, "foldedCellModel"))));
  }
  /*package*/ static boolean canBeSynchronized_id3wXm3h1BRps(@NotNull SNode __thisNode__, SNode childCell) {
    return childCell == null || (SNodeOperations.isInstanceOf(childCell, MetaAdapterFactory.getInterfaceConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x79b75ced2c4a134dL, "jetbrains.mps.lang.editor.structure.Synchronizeable")) && (boolean) Synchronizeable__BehaviorDescriptor.canBeSynchronized_id3wXm3h1AYM7.invoke(SNodeOperations.cast(childCell, MetaAdapterFactory.getInterfaceConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x79b75ced2c4a134dL, "jetbrains.mps.lang.editor.structure.Synchronizeable"))));
  }
  /*package*/ static boolean canBeUsedAsEmptyCell_id6RO52Mcgrfa(@NotNull SNode __thisNode__) {
    return true;
  }
  /*package*/ static SNode getLayout_iditlittTD4U(@NotNull SNode __thisNode__) {
    return SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x10192e0d3baL, "cellLayout"));
  }

  /*package*/ CellModel_Collection__BehaviorDescriptor() {
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
        return (T) ((String) getOpeningText_idhKxU$w9(node));
      case 1:
        return (T) ((String) getClosingText_idhKxUEwj(node));
      case 2:
        return (T) ((Boolean) isVertical_idi0pAV23(node));
      case 3:
        return (T) ((Boolean) isVerticalGrid_idi2IbWq8(node));
      case 4:
        return (T) ((Boolean) isHorizontal_idi0pB4gH(node));
      case 5:
        return (T) ((Boolean) isIndentLayout_idi0pB9jQ(node));
      case 6:
        return (T) ((Boolean) isFoldingEnabled_id1_9L3A4DrOF(node));
      case 7:
        return (T) ((Boolean) isVerticalIndent_idi0tOX1j(node));
      case 8:
        return (T) ((Boolean) shellBeSynchronized_id3TPTV99_TMT(node));
      case 9:
        return (T) ((Boolean) shellBeSynchronized_id3TPTV99Aiv4(node, (SNode) parameters[0]));
      case 10:
        return (T) ((Boolean) canBeSynchronized_id3wXm3h1AYM7(node));
      case 11:
        return (T) ((Boolean) canBeSynchronized_id3wXm3h1BRps(node, (SNode) parameters[0]));
      case 12:
        return (T) ((Boolean) canBeUsedAsEmptyCell_id6RO52Mcgrfa(node));
      case 13:
        return (T) ((SNode) getLayout_iditlittTD4U(node));
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
