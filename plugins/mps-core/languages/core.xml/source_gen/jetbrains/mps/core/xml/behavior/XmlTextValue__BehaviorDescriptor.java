package jetbrains.mps.core.xml.behavior;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class XmlTextValue__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, "jetbrains.mps.core.xml.structure.XmlTextValue");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Boolean> isFirstPositionAllowed_id2EZ251g0bSk = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isFirstPositionAllowed").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2EZ251g0bSk").registry(REGISTRY).build();
  public static final SMethod<Boolean> isLastPositionAllowed_id2EZ251g0bSp = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isLastPositionAllowed").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2EZ251g0bSp").registry(REGISTRY).build();
  public static final SMethod<Boolean> onNewLine_id2EZ251g0bS6 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("onNewLine").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2EZ251g0bS6").registry(REGISTRY).build();
  public static final SMethod<Boolean> hasNewLineAfter_id2EZ251g0bSd = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("hasNewLineAfter").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2EZ251g0bSd").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(isFirstPositionAllowed_id2EZ251g0bSk, isLastPositionAllowed_id2EZ251g0bSp, onNewLine_id2EZ251g0bS6, hasNewLineAfter_id2EZ251g0bSd);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static boolean isFirstPositionAllowed_id2EZ251g0bSk(@NotNull SNode __thisNode__) {
    return true;
  }
  /*package*/ static boolean isLastPositionAllowed_id2EZ251g0bSp(@NotNull SNode __thisNode__) {
    return true;
  }
  /*package*/ static boolean onNewLine_id2EZ251g0bS6(@NotNull SNode __thisNode__) {
    SNode left = SNodeOperations.getPrevSibling(__thisNode__);
    if (SNodeOperations.isInstanceOf(left, MetaAdapterFactory.getConcept(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1cL, "jetbrains.mps.core.xml.structure.XmlValuePart"))) {
      SNode leftContent = SNodeOperations.cast(left, MetaAdapterFactory.getConcept(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1cL, "jetbrains.mps.core.xml.structure.XmlValuePart"));
      return SNodeOperations.isInstanceOf(leftContent, MetaAdapterFactory.getConcept(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, "jetbrains.mps.core.xml.structure.XmlTextValue")) || isEmptyString(SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"))) && (SNodeOperations.getNextSibling(__thisNode__) == null);
    }
    return false;
  }
  /*package*/ static boolean hasNewLineAfter_id2EZ251g0bSd(@NotNull SNode __thisNode__) {
    if (isEmptyString(SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"))) && (SNodeOperations.getNextSibling(__thisNode__) != null)) {
      return !(((boolean) XmlValuePart__BehaviorDescriptor.onNewLine_id2EZ251g0bS6.invoke(__thisNode__)));
    }
    return false;
  }

  /*package*/ XmlTextValue__BehaviorDescriptor() {
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
        return (T) ((Boolean) isFirstPositionAllowed_id2EZ251g0bSk(node));
      case 1:
        return (T) ((Boolean) isLastPositionAllowed_id2EZ251g0bSp(node));
      case 2:
        return (T) ((Boolean) onNewLine_id2EZ251g0bS6(node));
      case 3:
        return (T) ((Boolean) hasNewLineAfter_id2EZ251g0bSd(node));
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
  private static boolean isEmptyString(String str) {
    return str == null || str.length() == 0;
  }
}
