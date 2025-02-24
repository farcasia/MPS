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
import jetbrains.mps.build.util.UnpackHelper;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Objects;
import jetbrains.mps.build.util.LocalSourcePathArtifact;
import jetbrains.mps.build.util.FileSetUtil;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class BuildLayout_File__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x7ea63ceef6e8c0edL, "jetbrains.mps.build.structure.BuildLayout_File");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> getApproximateName_id4RsV8qJDnFm = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getApproximateName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4RsV8qJDnFm").registry(REGISTRY).build();
  public static final SMethod<Boolean> isFile_id1bWeed$oPZ2 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isFile").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1bWeed$oPZ2").registry(REGISTRY).build();
  public static final SMethod<Boolean> exports_id5FtnUVJQES1 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("exports").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5FtnUVJQES1").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(Object.class, ""));
  public static final SMethod<Void> unpack_id6IqTD4bJTWZ = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("unpack").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6IqTD4bJTWZ").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(UnpackHelper.class, ""));
  public static final SMethod<Void> appendName_id1bWeed$ownT = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("appendName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1bWeed$ownT").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter(StringBuilder.class, ""));
  public static final SMethod<Boolean> canHaveFilemode_id7UAfeVQUccL = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canHaveFilemode").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7UAfeVQUccL").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getApproximateName_id4RsV8qJDnFm, isFile_id1bWeed$oPZ2, exports_id5FtnUVJQES1, unpack_id6IqTD4bJTWZ, appendName_id1bWeed$ownT, canHaveFilemode_id7UAfeVQUccL);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String getApproximateName_id4RsV8qJDnFm(@NotNull SNode __thisNode__) {
    return (String) BuildSourcePath__BehaviorDescriptor.getLastSegment_id5dwDdJ8yckN.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x7ea63ceef6e8c0edL, 0x7ea63ceef6e8c11aL, "path")));
  }
  /*package*/ static boolean isFile_id1bWeed$oPZ2(@NotNull SNode __thisNode__) {
    return true;
  }
  /*package*/ static boolean exports_id5FtnUVJQES1(@NotNull SNode __thisNode__, Object artifactId) {
    if (artifactId instanceof SNode) {
      SNode node = (SNode) artifactId;
      // check node.containing root == this.containing root is from initial commit e0a6b1f), but I don't see a reason 
      // why a file from an external layout shall not match requested BuildSourcePath. Perhaps, it's due to 'source' part of the name, i.e. 
      // that the path is supposed to reference smth from project source. However, we've got BuildSourceArchiveRelativePath which may  
      // legitimately point to a file from an external layout, and the restriction is not clear here. 
      if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafacdc3eL, "jetbrains.mps.build.structure.BuildSourcePath")) && SNodeOperations.getContainingRoot(node) == SNodeOperations.getContainingRoot(__thisNode__)) {
        SNode required = SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafacdc3eL, "jetbrains.mps.build.structure.BuildSourcePath"));
        return Objects.equals(BuildSourcePath__BehaviorDescriptor.getRelativePath_id4Kip2_918YF.invoke(required), BuildSourcePath__BehaviorDescriptor.getRelativePath_id4Kip2_918YF.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x7ea63ceef6e8c0edL, 0x7ea63ceef6e8c11aL, "path"))));
      }
    }
    if (artifactId instanceof LocalSourcePathArtifact) {
      LocalSourcePathArtifact art = (LocalSourcePathArtifact) artifactId;
      if (!(art.isFolder()) && art.getRoot() == SNodeOperations.getContainingRoot(__thisNode__)) {
        return Objects.equals(art.getSourcePath(), BuildSourcePath__BehaviorDescriptor.getRelativePath_id4Kip2_918YF.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x7ea63ceef6e8c0edL, 0x7ea63ceef6e8c11aL, "path"))));
      }
    }
    return false;
  }
  /*package*/ static void unpack_id6IqTD4bJTWZ(@NotNull SNode __thisNode__, UnpackHelper helper) {
    SNode parent = helper.parent(__thisNode__);
    String parentLocation = helper.getContentLocation(parent);
    SNode path = SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x7ea63ceef6e8c0edL, 0x7ea63ceef6e8c11aL, "path"));
    if (path != null) {
      String lastSegment = BuildSourcePath__BehaviorDescriptor.getLastSegment_id5dwDdJ8yckN.invoke(path);
      if (lastSegment != null) {
        String fileLocation = parentLocation + "/" + lastSegment;
        helper.putLocation(__thisNode__, fileLocation);
      }
    }
  }
  /*package*/ static void appendName_id1bWeed$ownT(@NotNull SNode __thisNode__, SNode parent, StringBuilder sb) {
    if ((SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x7ea63ceef6e8c0edL, 0x7ea63ceef6e8c11aL, "path")) != null)) {
      String lastSegment = BuildSourcePath__BehaviorDescriptor.getLastSegment_id5dwDdJ8yckN.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x7ea63ceef6e8c0edL, 0x7ea63ceef6e8c11aL, "path")));
      if (lastSegment != null) {
        if (SNodeOperations.isInstanceOf(parent, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafac4c85L, "jetbrains.mps.build.structure.BuildLayout_Node"))) {
          sb.append("/");
        }
        sb.append(lastSegment);
      }
    }
  }
  /*package*/ static boolean canHaveFilemode_id7UAfeVQUccL(@NotNull SNode __thisNode__) {
    SNode filesetLayoutContainer = FileSetUtil.getFilesetLayoutContainer(SNodeOperations.as(SNodeOperations.getParent(__thisNode__), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafac4c85L, "jetbrains.mps.build.structure.BuildLayout_Node")));
    return (filesetLayoutContainer != null) && (boolean) BuildLayout_ContainerAcceptingFileSet__BehaviorDescriptor.hasFileModeAttribute_id5zIo$W4pFU5.invoke(filesetLayoutContainer);
  }

  /*package*/ BuildLayout_File__BehaviorDescriptor() {
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
        return (T) ((String) getApproximateName_id4RsV8qJDnFm(node));
      case 1:
        return (T) ((Boolean) isFile_id1bWeed$oPZ2(node));
      case 2:
        return (T) ((Boolean) exports_id5FtnUVJQES1(node, (Object) parameters[0]));
      case 3:
        unpack_id6IqTD4bJTWZ(node, (UnpackHelper) parameters[0]);
        return null;
      case 4:
        appendName_id1bWeed$ownT(node, (SNode) parameters[0], (StringBuilder) parameters[1]);
        return null;
      case 5:
        return (T) ((Boolean) canHaveFilemode_id7UAfeVQUccL(node));
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
