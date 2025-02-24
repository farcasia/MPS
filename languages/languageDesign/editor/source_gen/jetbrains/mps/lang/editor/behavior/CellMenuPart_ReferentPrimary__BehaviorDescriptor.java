package jetbrains.mps.lang.editor.behavior;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class CellMenuPart_ReferentPrimary__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10f3f33baebL, "jetbrains.mps.lang.editor.structure.CellMenuPart_ReferentPrimary");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<SNode> getMatchingTextFunction_id6K3nYZvn7p1 = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getMatchingTextFunction").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6K3nYZvn7p1").registry(REGISTRY).build();
  public static final SMethod<SNode> getVisibleMatchingTextFunction_id5KYS0pi3wd5 = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getVisibleMatchingTextFunction").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5KYS0pi3wd5").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getMatchingTextFunction_id6K3nYZvn7p1, getVisibleMatchingTextFunction_id5KYS0pi3wd5);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static SNode getMatchingTextFunction_id6K3nYZvn7p1(@NotNull SNode __thisNode__) {
    if ((SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10f3f33baebL, 0x6001c76613d86514L, "matchingText")) != null)) {
      return SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10f3f33baebL, 0x6001c76613d86514L, "matchingText"));
    }
    SNode cellModel = SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.getNodeAncestor(__thisNode__, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xfd52a2c922L, "jetbrains.mps.lang.editor.structure.CellModel_RefCell"), false, false), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xfd52a2c922L, 0xfd5cf2df2aL, "editorComponent")), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xfba0eb7c50L, 0xfba0ec5415L, "cellModel"));
    if (SNodeOperations.isInstanceOf(cellModel, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x8ace515f0191e6eL, "jetbrains.mps.lang.editor.structure.CellModel_ReferencePresentation"))) {
      return SLinkOperations.getTarget((SNodeOperations.cast(cellModel, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x8ace515f0191e6eL, "jetbrains.mps.lang.editor.structure.CellModel_ReferencePresentation"))), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x8ace515f0191e6eL, 0x6c035fefdf050085L, "referentPresentation"));
    }
    return null;
  }
  /*package*/ static SNode getVisibleMatchingTextFunction_id5KYS0pi3wd5(@NotNull SNode __thisNode__) {
    if ((SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10f3f33baebL, 0x5c3ee006520dfad6L, "visibleMatchingText")) == null)) {
      return CellMenuPart_ReferentPrimary__BehaviorDescriptor.getMatchingTextFunction_id6K3nYZvn7p1.invoke(__thisNode__);
    }
    return SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10f3f33baebL, 0x5c3ee006520dfad6L, "visibleMatchingText"));
  }

  /*package*/ CellMenuPart_ReferentPrimary__BehaviorDescriptor() {
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
        return (T) ((SNode) getMatchingTextFunction_id6K3nYZvn7p1(node));
      case 1:
        return (T) ((SNode) getVisibleMatchingTextFunction_id5KYS0pi3wd5(node));
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
