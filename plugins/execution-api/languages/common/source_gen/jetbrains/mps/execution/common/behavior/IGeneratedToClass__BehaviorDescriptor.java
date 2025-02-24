package jetbrains.mps.execution.common.behavior;

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
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NodeNameUtil;
import jetbrains.mps.lang.core.behavior.INamedConcept__BehaviorDescriptor;
import jetbrains.mps.baseLanguage.regexp.runtime.RegexpOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import java.util.regex.Pattern;

public final class IGeneratedToClass__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getInterfaceConcept(0x73c1a49099fa4d0dL, 0x8292b8985697c74bL, 0xd244b712f9dcdabL, "jetbrains.mps.execution.common.structure.IGeneratedToClass");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> getSuffix_idO$iR4JBsSb = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getSuffix").modifiers(SModifiersImpl.create(12, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("O$iR4JBsSb").registry(REGISTRY).build();
  public static final SMethod<String> getGeneratedClassName_idO$iR4JBsSg = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getGeneratedClassName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("O$iR4JBsSg").registry(REGISTRY).build();
  public static final SMethod<String> getFullName_idO$iR4JBsSv = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getFullName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("O$iR4JBsSv").registry(REGISTRY).build();
  public static final SMethod<String> getValidClassName_id2eOtvO7hJjT = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getValidClassName").modifiers(SModifiersImpl.create(0, AccessPrivileges.PROTECTED)).concept(CONCEPT).id("2eOtvO7hJjT").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""));
  public static final SMethod<String> getGeneratedClassName_idO$iR4JBsSG = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getGeneratedClassName").modifiers(SModifiersImpl.create(0, AccessPrivileges.PROTECTED)).concept(CONCEPT).id("O$iR4JBsSG").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""));
  public static final SMethod<String> getBaseName_id3MnZbusxcPI = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getBaseName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PROTECTED)).concept(CONCEPT).id("3MnZbusxcPI").registry(REGISTRY).build();
  public static final SMethod<String> getNamespace_id1XgDflG1h$6 = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getNamespace").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1XgDflG1h$6").registry(REGISTRY).build();
  public static final SMethod<String> replaceProhibitedSymbol_idO$iR4JBsQI = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("replaceProhibitedSymbol").modifiers(SModifiersImpl.create(1, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("O$iR4JBsQI").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""), SMethodBuilder.createJavaParameter(String.class, ""));
  public static final SMethod<String> makeUpperCase_idO$iR4JBsRn = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("makeUpperCase").modifiers(SModifiersImpl.create(1, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("O$iR4JBsRn").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""), SMethodBuilder.createJavaParameter(Integer.TYPE, ""));
  public static final SMethod<String> getValidClassName_id3gpm$NHlLi1 = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getValidClassName").modifiers(SModifiersImpl.create(1, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("3gpm$NHlLi1").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getSuffix_idO$iR4JBsSb, getGeneratedClassName_idO$iR4JBsSg, getFullName_idO$iR4JBsSv, getValidClassName_id2eOtvO7hJjT, getGeneratedClassName_idO$iR4JBsSG, getBaseName_id3MnZbusxcPI, getNamespace_id1XgDflG1h$6, replaceProhibitedSymbol_idO$iR4JBsQI, makeUpperCase_idO$iR4JBsRn, getValidClassName_id3gpm$NHlLi1);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String getGeneratedClassName_idO$iR4JBsSg(@NotNull SNode __thisNode__) {
    String name = IGeneratedToClass__BehaviorDescriptor.getBaseName_id3MnZbusxcPI.invoke(__thisNode__);
    return IGeneratedToClass__BehaviorDescriptor.getGeneratedClassName_idO$iR4JBsSG.invoke(__thisNode__, name);
  }
  /*package*/ static String getFullName_idO$iR4JBsSv(@NotNull SNode __thisNode__) {
    return IGeneratedToClass__BehaviorDescriptor.getNamespace_id1XgDflG1h$6.invoke(__thisNode__) + "." + IGeneratedToClass__BehaviorDescriptor.getGeneratedClassName_idO$iR4JBsSg.invoke(__thisNode__);
  }
  /*package*/ static String getValidClassName_id2eOtvO7hJjT(@NotNull SNode __thisNode__, @NonNls String name) {
    return (String) IGeneratedToClass__BehaviorDescriptor.getValidClassName_id3gpm$NHlLi1.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getInterfaceConcept(0x73c1a49099fa4d0dL, 0x8292b8985697c74bL, 0xd244b712f9dcdabL, "jetbrains.mps.execution.common.structure.IGeneratedToClass")), name);
  }
  /*package*/ static String getGeneratedClassName_idO$iR4JBsSG(@NotNull SNode __thisNode__, String name) {
    if ((name == null || name.length() == 0)) {
      return null;
    }
    return IGeneratedToClass__BehaviorDescriptor.getValidClassName_id2eOtvO7hJjT.invoke(__thisNode__, name) + "_" + IGeneratedToClass__BehaviorDescriptor.getSuffix_idO$iR4JBsSb.invoke(__thisNode__);
  }
  /*package*/ static String getBaseName_id3MnZbusxcPI(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  /*package*/ static String getNamespace_id1XgDflG1h$6(@NotNull SNode __thisNode__) {
    return NodeNameUtil.getNamespace(INamedConcept__BehaviorDescriptor.getFqName_idhEwIO9y.invoke(__thisNode__));
  }
  /*package*/ static String replaceProhibitedSymbol_idO$iR4JBsQI(@NotNull SAbstractConcept __thisConcept__, String name, String symbol) {
    String result = name;
    while (result.contains(symbol)) {
      int index = result.indexOf(symbol);
      result = result.replace(symbol, "");
      result = IGeneratedToClass__BehaviorDescriptor.makeUpperCase_idO$iR4JBsRn.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getInterfaceConcept(0x73c1a49099fa4d0dL, 0x8292b8985697c74bL, 0xd244b712f9dcdabL, "jetbrains.mps.execution.common.structure.IGeneratedToClass")), result, ((int) index));
    }
    return result;
  }
  /*package*/ static String makeUpperCase_idO$iR4JBsRn(@NotNull SAbstractConcept __thisConcept__, @NonNls String string, int index) {
    assert index >= 0 && index < string.length();
    return string.substring(0, index) + string.substring(index, index + 1).toUpperCase() + ((index + 1 < string.length() ? string.substring(index + 1) : ""));
  }
  /*package*/ static String getValidClassName_id3gpm$NHlLi1(@NotNull SAbstractConcept __thisConcept__, @NonNls String name) {
    // in between 
    name = RegexpOperations.replace(name, REGEXP_mgabp8_b0a1a62, new _Replacer_mgabp8_a0a0b0ab(null));
    // in the end 
    name = RegexpOperations.replace(name, REGEXP_mgabp8_b0a3a62, new _Replacer_mgabp8_a0a0d0ab(null));
    // in the beggining 
    name = RegexpOperations.replace(name, REGEXP_mgabp8_b0a5a62, new _Replacer_mgabp8_a0a0f0ab(null));
    return (String) IGeneratedToClass__BehaviorDescriptor.makeUpperCase_idO$iR4JBsRn.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getInterfaceConcept(0x73c1a49099fa4d0dL, 0x8292b8985697c74bL, 0xd244b712f9dcdabL, "jetbrains.mps.execution.common.structure.IGeneratedToClass")), name, ((int) 0));
  }

  /*package*/ IGeneratedToClass__BehaviorDescriptor() {
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
      case 1:
        return (T) ((String) getGeneratedClassName_idO$iR4JBsSg(node));
      case 2:
        return (T) ((String) getFullName_idO$iR4JBsSv(node));
      case 3:
        return (T) ((String) getValidClassName_id2eOtvO7hJjT(node, (String) parameters[0]));
      case 4:
        return (T) ((String) getGeneratedClassName_idO$iR4JBsSG(node, (String) parameters[0]));
      case 5:
        return (T) ((String) getBaseName_id3MnZbusxcPI(node));
      case 6:
        return (T) ((String) getNamespace_id1XgDflG1h$6(node));
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
      case 7:
        return (T) ((String) replaceProhibitedSymbol_idO$iR4JBsQI(concept, (String) parameters[0], (String) parameters[1]));
      case 8:
        return (T) ((String) makeUpperCase_idO$iR4JBsRn(concept, (String) parameters[0], ((int) (Integer) parameters[1])));
      case 9:
        return (T) ((String) getValidClassName_id3gpm$NHlLi1(concept, (String) parameters[0]));
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
  private static Pattern REGEXP_mgabp8_b0a1a62 = Pattern.compile("(\\w)\\W+(\\w)", 0);
  private static Pattern REGEXP_mgabp8_b0a3a62 = Pattern.compile("(.)\\W+$", 0);
  private static Pattern REGEXP_mgabp8_b0a5a62 = Pattern.compile("^\\W+(\\w)", 0);
}
