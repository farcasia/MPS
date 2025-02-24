package jetbrains.mps.execution.configurations.behavior;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.execution.common.behavior.IGeneratedToClass__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class AbstractRunConfigurationExecutor__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x22e72e4c0f6946ceL, 0x84036750153aa615L, 0x2153d8f1c1f52479L, "jetbrains.mps.execution.configurations.structure.AbstractRunConfigurationExecutor");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> getCanExecuteMethodName_id6LlKjXrMerG = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getCanExecuteMethodName").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6LlKjXrMerG").registry(REGISTRY).build();
  public static final SMethod<String> getSuffix_idO$iR4JBsSb = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getSuffix").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("O$iR4JBsSb").registry(REGISTRY).build();
  public static final SMethod<String> getGeneratedClassName_idO$iR4JBsSg = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getGeneratedClassName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("O$iR4JBsSg").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getCanExecuteMethodName_id6LlKjXrMerG, getSuffix_idO$iR4JBsSb, getGeneratedClassName_idO$iR4JBsSg);

  private static void ___init___(@NotNull SNode __thisNode__) {
    SPropertyOperations.set(__thisNode__, MetaAdapterFactory.getProperty(0x22e72e4c0f6946ceL, 0x84036750153aa615L, 0x2153d8f1c1f52479L, 0x523a1a6c9706408bL, "canRun"), "" + (true));
    SPropertyOperations.set(__thisNode__, MetaAdapterFactory.getProperty(0x22e72e4c0f6946ceL, 0x84036750153aa615L, 0x2153d8f1c1f52479L, 0x1acdeec3ca0ad49cL, "configurationName"), "myRunConfiguration");
  }

  /*package*/ static String getCanExecuteMethodName_id6LlKjXrMerG(@NotNull SNode __thisNode__) {
    return "canExecute";
  }
  @NonNls
  /*package*/ static String getSuffix_idO$iR4JBsSb(@NotNull SNode __thisNode__) {
    return IGeneratedToClass__BehaviorDescriptor.getSuffix_idO$iR4JBsSb.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f9dce91L, 0xd244b712f9dce92L, "configuration"))) + "_RunProfileState";
  }
  /*package*/ static String getGeneratedClassName_idO$iR4JBsSg(@NotNull SNode __thisNode__) {
    return ((String) IGeneratedToClass__BehaviorDescriptor.getGeneratedClassName_idO$iR4JBsSG.invoke(__thisNode__, SPropertyOperations.getString(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f9dce91L, 0xd244b712f9dce92L, "configuration")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"))));
  }

  /*package*/ AbstractRunConfigurationExecutor__BehaviorDescriptor() {
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
        return (T) ((String) getCanExecuteMethodName_id6LlKjXrMerG(node));
      case 1:
        return (T) ((String) getSuffix_idO$iR4JBsSb(node));
      case 2:
        return (T) ((String) getGeneratedClassName_idO$iR4JBsSg(node));
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
