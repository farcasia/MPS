package jetbrains.mps.lang.smodel.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.ids.SReferenceLinkId;
import jetbrains.mps.smodel.adapter.ids.MetaIdHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class ReferenceLinkId__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x74cb131f5923b6ecL, "jetbrains.mps.lang.smodel.structure.ReferenceLinkId");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<SReferenceLink> getReference_id7jb4LXp9a7o = new SMethodBuilder<SReferenceLink>(new SJavaCompoundTypeImpl(SReferenceLink.class)).name("getReference").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7jb4LXp9a7o").registry(REGISTRY).build();
  public static final SMethod<Void> setReference_id7jb4LXp9a6q = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("setReference").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7jb4LXp9a6q").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(SReferenceLink.class, ""));
  public static final SMethod<Long> getIdValue_id7jb4LXp9a7d = new SMethodBuilder<Long>(new SJavaCompoundTypeImpl(Long.TYPE)).name("getIdValue").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7jb4LXp9a7d").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getReference_id7jb4LXp9a7o, setReference_id7jb4LXp9a6q, getIdValue_id7jb4LXp9a7d);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static SReferenceLink getReference_id7jb4LXp9a7o(@NotNull SNode __thisNode__) {
    SAbstractConcept rc = ConceptIdentity__BehaviorDescriptor.getConcept_id5ZE7FBYYOpv.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x74cb131f5923b6ecL, 0x74cb131f5923b6edL, "conceptIdentity")));
    String rn = SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x74cb131f5923b6ecL, 0x74cb131f5923b6efL, "referenceName"));
    if (rc == null || rn == null) {
      return null;
    }
    long rid = ((long) ReferenceLinkId__BehaviorDescriptor.getIdValue_id7jb4LXp9a7d.invoke(__thisNode__));
    return MetaAdapterFactory.getReferenceLink(rc, rid, rn);
  }
  /*package*/ static void setReference_id7jb4LXp9a6q(@NotNull SNode __thisNode__, @NotNull SReferenceLink ref) {
    SReferenceLinkId rid = MetaIdHelper.getAssociation(ref);
    SNode cid = SModelOperations.createNewNode(SNodeOperations.getModel(__thisNode__), null, MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5fea1eb9fefb6fe7L, "jetbrains.mps.lang.smodel.structure.ConceptId"));
    ConceptId__BehaviorDescriptor.setConcept_id5ZE7FBYYR6j.invoke(cid, ref.getOwner());
    SLinkOperations.setTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x74cb131f5923b6ecL, 0x74cb131f5923b6edL, "conceptIdentity"), cid);
    SPropertyOperations.set(__thisNode__, MetaAdapterFactory.getProperty(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x74cb131f5923b6ecL, 0x74cb131f5923b6efL, "referenceName"), ref.getName());
    SPropertyOperations.set(__thisNode__, MetaAdapterFactory.getProperty(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x74cb131f5923b6ecL, 0x74cb131f5923b6eeL, "referenceId"), Long.toString(rid.getIdValue(), Character.MAX_RADIX));
  }
  /*package*/ static long getIdValue_id7jb4LXp9a7d(@NotNull SNode __thisNode__) {
    return Long.parseLong(SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x74cb131f5923b6ecL, 0x74cb131f5923b6eeL, "referenceId")), Character.MAX_RADIX);
  }

  /*package*/ ReferenceLinkId__BehaviorDescriptor() {
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
        return (T) ((SReferenceLink) getReference_id7jb4LXp9a7o(node));
      case 1:
        setReference_id7jb4LXp9a6q(node, (SReferenceLink) parameters[0]);
        return null;
      case 2:
        return (T) ((Long) getIdValue_id7jb4LXp9a7d(node));
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
