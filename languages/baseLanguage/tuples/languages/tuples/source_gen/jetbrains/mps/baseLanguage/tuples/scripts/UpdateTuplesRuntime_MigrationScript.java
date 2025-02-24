package jetbrains.mps.baseLanguage.tuples.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.core.behavior.INamedConcept__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.behavior.Classifier__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public final class UpdateTuplesRuntime_MigrationScript extends BaseMigrationScript {
  public UpdateTuplesRuntime_MigrationScript() {
    super("Create runtime classes in the tuples runtime");
    this.addRefactoring(new AbstractMigrationRefactoring() {
      @Override
      public String getName() {
        return "TupleInterface";
      }
      @Override
      public String getAdditionalInfo() {
        return "TupleInterface";
      }
      @Override
      public SAbstractConcept getApplicableConcept() {
        return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept");
      }
      @Override
      public boolean isApplicableInstanceNode(SNode node) {
        return "jetbrains.mps.baseLanguage.tuples.runtime.Tuples".equals(INamedConcept__BehaviorDescriptor.getFqName_idhEwIO9y.invoke(node)) && !(Sequence.fromIterable(Classifier__BehaviorDescriptor.nestedClassifiers_id4_LVZ3pBjGQ.invoke(node)).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches("_[0-9]+");
          }
        }));
      }
      @Override
      public void doUpdateInstanceNode(SNode node) {
        SNode ifc = null;
        for (int i = 0; i < 10; i++) {
          List<SNode> typedecls = new ArrayList<SNode>();
          for (int j = 0; j < i; j++) {
            ListSequence.fromList(typedecls).addElement(_quotation_createNode_yti4yq_a0a0a1a1a0a("T" + j));
          }

          List<SNode> typerefs = new ArrayList<SNode>();
          for (int j = 0; j < i; j++) {
            ListSequence.fromList(typerefs).addElement(_quotation_createNode_yti4yq_a0a0a4a1a0a(ListSequence.fromList(typedecls).getElement(j)));
          }

          List<SNode> methods = new ArrayList<SNode>();
          for (int j = 0; j < i; j++) {
            ListSequence.fromList(methods).addElement(_quotation_createNode_yti4yq_a0a0a7a1a0a(SNodeOperations.copyNode(ListSequence.fromList(typerefs).getElement(j)), "_" + j, SNodeOperations.copyNode(ListSequence.fromList(typerefs).getElement(j))));
          }
          for (int j = 0; j < i; j++) {
            ListSequence.fromList(methods).addElement(_quotation_createNode_yti4yq_a0a0a8a1a0a("_" + j, SNodeOperations.copyNode(ListSequence.fromList(typerefs).getElement(j))));
          }

          SNode extendIfc = null;
          if (ifc != null) {
            extendIfc = _quotation_createNode_yti4yq_a0a0l0b0a0(ListSequence.fromList(typerefs).cut(1).toListSequence(), ifc);
          }

          ifc = _quotation_createNode_yti4yq_a0n0b0a0(extendIfc, typedecls, "_" + i, methods);

          List<SNode> extParams = ListSequence.fromList(typerefs).select(new ISelector<SNode, SNode>() {
            public SNode select(SNode tr) {
              return _quotation_createNode_yti4yq_a0a0a0a0p0b0a0(SNodeOperations.copyNode(tr));
            }
          }).toListSequence();
          ListSequence.fromList(SLinkOperations.getChildren(ifc, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, 0x4a9a46de59132803L, "member"))).addElement(_quotation_createNode_yti4yq_a0a61a1a0a(extParams, ifc, ListSequence.fromList(typerefs).select(new ISelector<SNode, SNode>() {
            public SNode select(SNode it) {
              return SNodeOperations.copyNode(it);
            }
          }).toListSequence(), ifc));

          ListSequence.fromList(SLinkOperations.getChildren(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, 0x4a9a46de59132803L, "member"))).addElement(ifc);
        }
      }
      @Override
      public boolean isShowAsIntention() {
        return false;
      }
    });
    // whitespace 
  }

  @Nullable
  @Override
  public SNodeReference getScriptNode() {
    return PersistenceFacade.getInstance().createNodeReference("r:e1f907d4-9f20-482f-9ee2-2b580163f28a(jetbrains.mps.baseLanguage.tuples.scripts)/5684843424312914767");
  }
  private static SNode _quotation_createNode_yti4yq_a0a0a1a1a0a(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x1024639ed74L, "TypeVariableDeclaration"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_2, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), (String) parameter_1);
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_yti4yq_a0a0a4a1a0a(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x102467229d8L, "TypeVariableReference"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102467229d8L, 0x1024673a581L, "typeVariableDeclaration"), (SNode) parameter_1);
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_yti4yq_a0a0a7a1a0a(Object parameter_1, Object parameter_2, Object parameter_3) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_4 = null;
    SNode quotedNode_5 = null;
    SNode quotedNode_6 = null;
    SNode quotedNode_7 = null;
    SNode quotedNode_8 = null;
    SNode quotedNode_9 = null;
    quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b21dL, "InstanceMethodDeclaration"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_4, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b21dL, 0x1126a8d157dL, "isAbstract"), "true");
    SNodeAccessUtil.setProperty(quotedNode_4, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), (String) parameter_2);
    quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c77f1e94L, "ParameterDeclaration"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_5, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "value");
    quotedNode_9 = (SNode) parameter_1;
    if (quotedNode_9 != null) {
      quotedNode_5.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type"), HUtil.copyIfNecessary(quotedNode_9));
    }
    quotedNode_4.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1feL, "parameter"), quotedNode_5);
    quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x10af9581ff1L, "PublicVisibility"), null, null, false);
    quotedNode_4.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility"), quotedNode_6);
    quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b200L, "StatementList"), null, null, false);
    quotedNode_4.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1ffL, "body"), quotedNode_7);
    quotedNode_8 = (SNode) parameter_3;
    if (quotedNode_8 != null) {
      quotedNode_4.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1fdL, "returnType"), HUtil.copyIfNecessary(quotedNode_8));
    }
    return quotedNode_4;
  }
  private static SNode _quotation_createNode_yti4yq_a0a0a8a1a0a(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    SNode quotedNode_5 = null;
    SNode quotedNode_6 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b21dL, "InstanceMethodDeclaration"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_3, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b21dL, 0x1126a8d157dL, "isAbstract"), "true");
    SNodeAccessUtil.setProperty(quotedNode_3, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), (String) parameter_1);
    quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x10af9581ff1L, "PublicVisibility"), null, null, false);
    quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility"), quotedNode_4);
    quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b200L, "StatementList"), null, null, false);
    quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1ffL, "body"), quotedNode_5);
    quotedNode_6 = (SNode) parameter_2;
    if (quotedNode_6 != null) {
      quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1fdL, "returnType"), HUtil.copyIfNecessary(quotedNode_6));
    }
    return quotedNode_3;
  }
  private static SNode _quotation_createNode_yti4yq_a0a0l0b0a0(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), (SNode) parameter_2);
    {
      List<SNode> nodes = (List<SNode>) parameter_1;
      for (SNode child : nodes) {
        quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x102419671abL, "parameter"), HUtil.copyIfNecessary(child));
      }
    }
    return quotedNode_3;
  }
  private static SNode _quotation_createNode_yti4yq_a0n0b0a0(Object parameter_1, Object parameter_2, Object parameter_3, Object parameter_4) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_5 = null;
    SNode quotedNode_6 = null;
    SNode quotedNode_7 = null;
    SNode quotedNode_8 = null;
    SNode quotedNode_9 = null;
    SNode quotedNode_10 = null;
    SNode quotedNode_11 = null;
    SNode quotedNode_12 = null;
    quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101edd46144L, "Interface"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_5, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, 0x73c6d8a8c021f99L, "nonStatic"), "true");
    SNodeAccessUtil.setProperty(quotedNode_5, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), (String) parameter_3);
    quotedNode_6 = (SNode) parameter_1;
    if (quotedNode_6 != null) {
      quotedNode_5.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101edd46144L, 0x101eddadad7L, "extendedInterface"), HUtil.copyIfNecessary(quotedNode_6));
    }
    quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x10af9581ff1L, "PublicVisibility"), null, null, false);
    quotedNode_5.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility"), quotedNode_7);
    {
      List<SNode> nodes = (List<SNode>) parameter_2;
      for (SNode child : nodes) {
        quotedNode_5.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102463b447aL, 0x102463bb98eL, "typeVariableDeclaration"), HUtil.copyIfNecessary(child));
      }
    }
    {
      List<SNode> nodes = (List<SNode>) parameter_4;
      for (SNode child : nodes) {
        quotedNode_5.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, 0x4a9a46de59132803L, "member"), HUtil.copyIfNecessary(child));
      }
    }
    return quotedNode_5;
  }
  private static SNode _quotation_createNode_yti4yq_a0a0a0a0p0b0a0(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x110daeaa84aL, "UpperBoundType"), null, null, false);
    quotedNode_3 = (SNode) parameter_1;
    if (quotedNode_3 != null) {
      quotedNode_2.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x110daeaa84aL, 0x110daeaa84bL, "bound"), HUtil.copyIfNecessary(quotedNode_3));
    }
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_yti4yq_a0a61a1a0a(Object parameter_1, Object parameter_2, Object parameter_3, Object parameter_4) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_5 = null;
    SNode quotedNode_6 = null;
    SNode quotedNode_7 = null;
    SNode quotedNode_8 = null;
    SNode quotedNode_9 = null;
    SNode quotedNode_10 = null;
    SNode quotedNode_11 = null;
    SNode quotedNode_12 = null;
    quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b21dL, "InstanceMethodDeclaration"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_5, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b21dL, 0x1126a8d157dL, "isAbstract"), "true");
    SNodeAccessUtil.setProperty(quotedNode_5, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "assign");
    quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c77f1e94L, "ParameterDeclaration"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_6, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "from");
    quotedNode_10 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_10, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), (SNode) parameter_2);
    {
      List<SNode> nodes = (List<SNode>) parameter_1;
      for (SNode child : nodes) {
        quotedNode_10.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x102419671abL, "parameter"), HUtil.copyIfNecessary(child));
      }
    }
    quotedNode_6.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type"), quotedNode_10);
    quotedNode_5.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1feL, "parameter"), quotedNode_6);
    quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x10af9581ff1L, "PublicVisibility"), null, null, false);
    quotedNode_5.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility"), quotedNode_7);
    quotedNode_8 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc56b200L, "StatementList"), null, null, false);
    quotedNode_5.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1ffL, "body"), quotedNode_8);
    quotedNode_9 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_9, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), (SNode) parameter_4);
    {
      List<SNode> nodes = (List<SNode>) parameter_3;
      for (SNode child : nodes) {
        quotedNode_9.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x102419671abL, "parameter"), HUtil.copyIfNecessary(child));
      }
    }
    quotedNode_5.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1fdL, "returnType"), quotedNode_9);
    return quotedNode_5;
  }
}
