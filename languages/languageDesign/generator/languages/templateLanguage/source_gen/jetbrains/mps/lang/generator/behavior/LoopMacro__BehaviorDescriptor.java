package jetbrains.mps.lang.generator.behavior;

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
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.core.behavior.ISuppressErrors__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

public final class LoopMacro__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1047ce009c3L, "jetbrains.mps.lang.generator.structure.LoopMacro");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<SNode> getInputNodeTypeInsideOfMacro_idhEwIosJ = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getInputNodeTypeInsideOfMacro").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIosJ").registry(REGISTRY).build();
  public static final SMethod<String> getCounterVarName_id5KmckUrI7Lz = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getCounterVarName").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5KmckUrI7Lz").registry(REGISTRY).build();
  public static final SMethod<List<SNode>> contextVariables_id6suuiWX_oN7 = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("contextVariables").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6suuiWX_oN7").registry(REGISTRY).build();
  public static final SMethod<Boolean> suppress_id2WmWrdnSpX7 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("suppress").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2WmWrdnSpX7").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getInputNodeTypeInsideOfMacro_idhEwIosJ, getCounterVarName_id5KmckUrI7Lz, contextVariables_id6suuiWX_oN7, suppress_id2WmWrdnSpX7);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static SNode getInputNodeTypeInsideOfMacro_idhEwIosJ(@NotNull SNode __thisNode__) {
    {
      GeneratedMatchingPattern pattern_cdqxf8_a0a = new Pattern_cdqxf8_a0a0a0a(_quotation_createNode_cdqxf8_a0a0a0a0a());
      SNode coercedNode_cdqxf8_a0a = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1047ce009c3L, 0x10fef5e42d7L, "sourceNodesQuery"))), pattern_cdqxf8_a0a);
      if (coercedNode_cdqxf8_a0a != null) {
        return pattern_cdqxf8_a0a.getMatchedNode("concept");
      } else {
      }
    }
    return null;
  }
  /*package*/ static String getCounterVarName_id5KmckUrI7Lz(@NotNull SNode __thisNode__) {
    // name of counter as available in TemplateContext, similar to VarMacro.getName() 
    return "cv:" + SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1047ce009c3L, 0x671e792f3d97a344L, "counterVarName"));
  }
  /*package*/ static List<SNode> contextVariables_id6suuiWX_oN7(@NotNull SNode __thisNode__) {
    List<SNode> rv = new ArrayList<SNode>();
    if (isEmptyString(SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1047ce009c3L, 0x671e792f3d97a344L, "counterVarName")))) {
      return rv;
    }
    SNode counterVar = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x671e792f3d94989fL, "jetbrains.mps.lang.generator.structure.ContextVariableDeclaration"));
    SPropertyOperations.set(counterVar, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1047ce009c3L, 0x671e792f3d97a344L, "counterVarName")));
    SLinkOperations.setTarget(counterVar, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x671e792f3d94989fL, 0x671e792f3d9580f4L, "type"), createIntegerType_cdqxf8_a0e0c());
    ListSequence.fromList(rv).addElement(counterVar);
    return rv;
  }
  /*package*/ static boolean suppress_id2WmWrdnSpX7(@NotNull SNode __thisNode__, SNode child) {
    // child is not under any other macro except this one 
    return ((boolean) ISuppressErrors__BehaviorDescriptor.suppress_id2WmWrdnSpX7.invokeSuper(__thisNode__, MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1047ce009c3L, "jetbrains.mps.lang.generator.structure.LoopMacro"), child)) && ListSequence.fromList(SNodeOperations.getNodeAncestors(child, null, true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return Sequence.fromIterable(SNodeOperations.ofConcept(AttributeOperations.getAttributeList(it, new IAttributeDescriptor.AllAttributes()), MetaAdapterFactory.getInterfaceConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11dc0f7933bL, "jetbrains.mps.lang.generator.structure.AbstractMacro"))).isNotEmpty();
      }
    }) == SNodeOperations.getParent(__thisNode__);
  }

  /*package*/ LoopMacro__BehaviorDescriptor() {
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
        return (T) ((SNode) getInputNodeTypeInsideOfMacro_idhEwIosJ(node));
      case 1:
        return (T) ((String) getCounterVarName_id5KmckUrI7Lz(node));
      case 2:
        return (T) ((List<SNode>) contextVariables_id6suuiWX_oN7(node));
      case 3:
        return (T) ((Boolean) suppress_id2WmWrdnSpX7(node, (SNode) parameters[0]));
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
  private static SNode _quotation_createNode_cdqxf8_a0a0a0a0a() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, "jetbrains.mps.baseLanguage.collections"), 0x10c25fb076aL, "ListType"), null, null, false);
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x108f968b3caL, "SNodeType"), null, null, false);
    quotedNode_1.addChild(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x10c25fb076aL, 0x10c25fe95c5L, "elementType"), quotedNode_2);
    return quotedNode_1;
  }
  private static boolean isEmptyString(String str) {
    return str == null || str.length() == 0;
  }
  private static SNode createIntegerType_cdqxf8_a0e0c() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d22479L, "jetbrains.mps.baseLanguage.structure.IntegerType"), null, null, false);
    return n1;
  }
}
