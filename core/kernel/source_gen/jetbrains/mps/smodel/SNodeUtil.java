package jetbrains.mps.smodel;

/*Generated by MPS */

import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.BootstrapAdapterFactory;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SInterfaceConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.adapter.ids.MetaIdHelper;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BHReflection;
import jetbrains.mps.core.aspects.behaviour.SMethodTrimmedId;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.annotation.ToRemove;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;

public final class SNodeUtil {
  public static final SProperty property_AbstractConcept_Id = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x5d2e6079771f8cc0L, "conceptId");
  public static final SProperty property_AbstractConcept_LangId = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x7cf94884f2237423L, "languageId");
  public static final SProperty property_Concept_Rootable = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0xff49c1d648L, "rootable");
  public static final SProperty property_Property_Id = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086bL, 0x35a81382d82a4d9L, "propertyId");
  public static final SProperty property_Link_Id = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0x35a81382d82a4e4L, "linkId");

  public static final SAbstractConcept concept_PropertyAttribute = MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute");
  public static final SAbstractConcept concept_LinkAttribute = MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da51L, "jetbrains.mps.lang.core.structure.LinkAttribute");


  /**
   * for typesystem usages
   */
  public static final SConcept concept_VoidType = MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc6bf96dL, "jetbrains.mps.baseLanguage.structure.VoidType");
  public static final SConcept concept_SNodeType = MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, "jetbrains.mps.lang.smodel.structure.SNodeType");
  public static final SConcept concept_RuntimeErrorType = MetaAdapterFactory.getConcept(0x7a5dda6291404668L, 0xab76d5ed1746f2b2L, 0x113f84956f9L, "jetbrains.mps.lang.typesystem.structure.RuntimeErrorType");
  public static final SReferenceLink ref_SNodeType_concept = MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept");

  public static final SAbstractConcept concept_IType = MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x11f8a0774f2L, "jetbrains.mps.lang.core.structure.IType");


  /**
   * java concepts to be used in idea plugin
   */
  public static final SConcept concept_Classifier = MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier");
  public static final SInterfaceConcept concept_IMemberContainer = MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11638b31955L, "jetbrains.mps.baseLanguage.structure.IMemberContainer");
  public static final SConcept concept_BaseMethodDeclaration = MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
  public static final SConcept concept_InstanceMethodDeclaration = MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b21dL, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration");
  public static final SConcept concept_StaticMethodDeclaration = MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf0aL, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration");
  public static final SConcept concept_ConstructorDeclaration = MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b204L, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration");
  /**
   * todo: returnType is needed for hack in ValidationUtil, remove this hack
   */
  public static final SContainmentLink link_ConstructorDeclaration_returnType = MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1fdL, "returnType");

  public static final SInterfaceConcept concept_IResolveInfo = BootstrapAdapterFactory.getInterface(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x116b17c6e46L, "jetbrains.mps.lang.core.structure.IResolveInfo");
  public static final SInterfaceConcept concept_INamedConcept = BootstrapAdapterFactory.getInterface(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, "jetbrains.mps.lang.core.structure.INamedConcept");
  public static final SConcept concept_BaseConcept = BootstrapAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, "jetbrains.mps.lang.core.structure.BaseConcept");
  public static final SConceptId conceptId_BaseConcept = MetaIdHelper.getConcept(concept_BaseConcept);
  public static final SConcept concept_AbstractConceptDeclaration = BootstrapAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
  public static final SConcept concept_ConceptDeclaration = BootstrapAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, "jetbrains.mps.lang.structure.structure.ConceptDeclaration");
  public static final SConcept concept_InterfaceConceptDeclaration = BootstrapAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration");
  public static final SConcept concept_LinkDeclaration = BootstrapAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, "jetbrains.mps.lang.structure.structure.LinkDeclaration");
  public static final SConcept concept_PrimitiveDataTypeDeclaration = BootstrapAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xfc3652de27L, "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration");
  public static final SInterfaceConcept concept_InterfacePart = BootstrapAdapterFactory.getInterface(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x12509ddfaa98f128L, "jetbrains.mps.lang.core.structure.InterfacePart");
  public static final SInterfaceConcept concept_ImplementationPart = BootstrapAdapterFactory.getInterface(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x12509ddfaa7c0557L, "jetbrains.mps.lang.core.structure.ImplementationPart");
  public static final SInterfaceConcept concept_ImplementationWithStubPart = BootstrapAdapterFactory.getInterface(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x612410e32cf46136L, "jetbrains.mps.lang.core.structure.ImplementationWithStubPart");
  public static final SConcept concept_RuntimeTypeVariable = BootstrapAdapterFactory.getConcept(0x7a5dda6291404668L, 0xab76d5ed1746f2b2L, 0x113f84956fbL, "jetbrains.mps.lang.typesystem.structure.RuntimeTypeVariable");
  public static final SConcept concept_RuntimeHoleType = BootstrapAdapterFactory.getConcept(0x7a5dda6291404668L, 0xab76d5ed1746f2b2L, 0x11e68800741L, "jetbrains.mps.lang.typesystem.structure.RuntimeHoleType");

  public static final SReferenceLink link_ConceptDeclaration_extends = BootstrapAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0xf979be93cfL, "extends");
  public static final SContainmentLink link_ConceptDeclaration_implements = BootstrapAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0x110358d693eL, "implements");
  public static final SContainmentLink link_InterfaceConceptDeclaration_extends = BootstrapAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, 0x110356e9df4L, "extends");
  public static final SProperty property_ConceptDeclaration_staticScope = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0x4b014033eedc8a48L, "staticScope");

  public static final SContainmentLink link_AbstractConceptDeclaration_linkDeclaration = BootstrapAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0xf979c3ba6bL, "linkDeclaration");
  public static final SContainmentLink link_AbstractConceptDeclaration_propertyDeclaration = BootstrapAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0xf979c3ba6cL, "propertyDeclaration");
  public static final SProperty property_AbstractConceptDeclaration_abstract = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x403a32c5772c7ec2L, "abstract");
  public static final SProperty property_AbstractConceptDeclaration_helpURL = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x2237c3bc85b3755cL, "oldHelpURL");
  public static final SProperty property_AbstractConceptDeclaration_final = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x403a32c5772c7ec7L, "final");
  public static final SProperty property_AbstractConceptDeclaration_conceptAlias = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x46ab0ad5826c74caL, "conceptAlias");
  public static final SProperty property_AbstractConceptDeclaration_conceptShortDescription = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x403a32c5772bbe20L, "conceptShortDescription");

  public static final SReferenceLink link_InterfaceConceptReference_intfc = BootstrapAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x110356fc618L, 0x110356fe029L, "intfc");

  public static final SProperty property_INamedConcept_name = BootstrapAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  public static final SProperty property_LinkDeclaration_role = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98052f333L, "role");
  public static final SProperty property_LinkDeclaration_unordered = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0x213ed46fe94fc232L, "unordered");
  public static final SProperty property_LinkDeclaration_metaClass = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf980556927L, "metaClass");
  public static final SProperty property_LinkDeclaration_sourceCardinality = BootstrapAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98054bb04L, "sourceCardinality");
  public static final SReferenceLink link_LinkDeclaration_target = BootstrapAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98055fef0L, "target");
  public static final SReferenceLink link_LinkDeclaration_specializedLink = BootstrapAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98051c244L, "specializedLink");
  public static final SProperty property_BaseConcept_virtualPackage = BootstrapAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, 0x115eca8579fL, "virtualPackage");
  public static final SContainmentLink link_BaseConcept_smodelAttribute = BootstrapAdapterFactory.getContainmentLink(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, 0x47bf8397520e5942L, "smodelAttribute");
  private SNodeUtil() {
  }
  public static String getPresentation(SNode node) {
    try {
      return ((String) BHReflection.invoke0(node, MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, "jetbrains.mps.lang.core.structure.BaseConcept"), SMethodTrimmedId.create("getPresentation", null, "hEwIMiw")));
    } catch (Throwable t) {
      return node.getName();
    }
  }
  public static String getDetailedPresentation(SNode node) {
    return ((String) (String) BHReflection.invoke0(node, MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, "jetbrains.mps.lang.core.structure.BaseConcept"), SMethodTrimmedId.create("getDetailedPresentation", null, "22G2W3WJ92t")));
  }
  /**
   * 
   * @deprecated Since 2017.1 editor automatically detects whether the concept cannot be used as a substitute by noticing that its substitute menu is empty
   */
  @Deprecated
  public static boolean isDefaultSubstitutable(SAbstractConcept concept) {
    return !(concept.isAbstract()) && !(SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(concept), MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x19796fa16a19888bL, "jetbrains.mps.lang.core.structure.IDontSubstituteByDefault")));
  }
  public static int getMetaLevel(SNode node) {
    return ((int) (Integer) BHReflection.invoke0(node, MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, "jetbrains.mps.lang.core.structure.BaseConcept"), SMethodTrimmedId.create("getMetaLevel", null, "3t0v3yFOD1A")));
  }
  @Deprecated
  @ToRemove(version = 2017.3)
  public static String getConceptDeclarationAlias(SNode conceptDeclaration) {
    return SPropertyOperations.getString(conceptDeclaration, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x46ab0ad5826c74caL, "conceptAlias"));
  }
  public static boolean isInstanceOfConceptDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    return SNodeOperations.getConcept(node).equals(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"));
  }
  public static boolean isInstanceOfInterfaceConceptDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    return SNodeOperations.getConcept(node).equals(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration"));
  }
  public static boolean isInstanceOfAbstractConceptDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    SAbstractConcept c = SNodeOperations.getConcept(node);
    return c.equals(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, "jetbrains.mps.lang.structure.structure.ConceptDeclaration")) || c.equals(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration")) || c.equals(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"));
  }
  public static SNode getConceptDeclaration_Extends(SNode concept) {
    return SLinkOperations.getTarget(concept, MetaAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0xf979be93cfL, "extends"));
  }
  public static Iterable<SNode> getConceptDeclaration_Implements(SNode concept) {
    return ListSequence.fromList(SLinkOperations.getChildren(concept, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0x110358d693eL, "implements"))).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x110356fc618L, 0x110356fe029L, "intfc"));
      }
    });
  }
  public static Iterable<SNode> getConceptDeclaration_ImplementsReferenceNodes(SNode concept) {
    return SLinkOperations.getChildren(concept, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0x110358d693eL, "implements"));
  }
  public static Iterable<SNode> getConcept_LinkDeclarations(SNode concept) {
    return SLinkOperations.getChildren(concept, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0xf979c3ba6bL, "linkDeclaration"));
  }
  public static Iterable<SNode> getConcept_PropertyDeclarations(SNode concept) {
    return SLinkOperations.getChildren(concept, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0xf979c3ba6cL, "propertyDeclaration"));
  }
  public static Iterable<SNode> getInterfaceConceptDeclaration_Extends(SNode concept) {
    return ListSequence.fromList(SLinkOperations.getChildren(concept, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, 0x110356e9df4L, "extends"))).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x110356fc618L, 0x110356fe029L, "intfc"));
      }
    });
  }
  public static Iterable<SNode> getInterfaceConceptDeclaration_ExtendsReferenceNodes(SNode concept) {
    return SLinkOperations.getChildren(concept, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, 0x110356e9df4L, "extends"));
  }
  public static String getNodeShortDescription(SNode node) {
    return SPropertyOperations.getString(node, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, 0x10d34f97574L, "shortDescription"));
  }
  public static String getConceptShortDescription(SNode concept) {
    return SPropertyOperations.getString(concept, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x403a32c5772bbe20L, "conceptShortDescription"));
  }
  public static String getConceptAlias(SNode concept) {
    return SPropertyOperations.getString(concept, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x46ab0ad5826c74caL, "conceptAlias"));
  }
  public static String getResolveInfo(SNode node) {
    return SPropertyOperations.getString(node, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x116b17c6e46L, 0x116b17cd415L, "resolveInfo"));
  }
  public static boolean isInstanceOfLinkDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    return SNodeOperations.getConcept(node).equals(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, "jetbrains.mps.lang.structure.structure.LinkDeclaration"));
  }
  public static boolean isInstanceOfPropertyDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    return SNodeOperations.getConcept(node).equals(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086bL, "jetbrains.mps.lang.structure.structure.PropertyDeclaration"));
  }
  public static SNode getPropertyDeclaration_DataType(SNode decl) {
    return SLinkOperations.getTarget(decl, MetaAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086bL, 0xfc26f42fe5L, "dataType"));
  }
  public static boolean isInstanceOfPrimitiveDataTypeDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    return SNodeOperations.getConcept(node).equals(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xfc3652de27L, "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration"));
  }
  public static boolean isInstanceOfEnumerationDataTypeDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    return SNodeOperations.getConcept(node).equals(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xfc26875dfbL, "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration"));
  }
  public static boolean getLinkDeclaration_IsReference(SNode link) {
    return SPropertyOperations.hasValue(link, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf980556927L, "metaClass"), "reference", "reference");
  }
  public static boolean getLinkDeclaration_IsExactlyOneMultiplicity(SNode link) {
    return SPropertyOperations.hasValue(link, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98054bb04L, "sourceCardinality"), "1", "0..1");
  }
  public static boolean getLinkDeclaration_IsAtLeastOneMultiplicity(SNode link) {
    return SPropertyOperations.hasValue(link, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98054bb04L, "sourceCardinality"), "1", "0..1") || SPropertyOperations.hasValue(link, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98054bb04L, "sourceCardinality"), "1..n", "0..1");
  }
  public static boolean getLinkDeclaration_IsSingular(SNode link) {
    SNode genuineLinkDeclaration = ((SNode) SModelUtil.getGenuineLinkDeclaration(link));
    return SPropertyOperations.hasValue(genuineLinkDeclaration, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98054bb04L, "sourceCardinality"), "0..1", "0..1") || SPropertyOperations.hasValue(genuineLinkDeclaration, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98054bb04L, "sourceCardinality"), "1", "0..1");
  }
  public static boolean hasReferenceMacro(SNode node, SReferenceLink role) {
    return (AttributeOperations.getAttribute(node, new IAttributeDescriptor.LinkAttribute(MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0xfd7f44d616L, "jetbrains.mps.lang.generator.structure.ReferenceMacro"), role)) != null);
  }
  public static boolean isSideTransformInfo(SNode node) {
    return SNodeOperations.getConcept(node).equals(MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0xad0053c7ae9194dL, "jetbrains.mps.lang.core.structure.SideTransformInfo"));
  }
  public static boolean isAtLeastOne(String cardinality) {
    cardinality = defaultCardinalityIfNotSet(cardinality);
    return "1".equals(cardinality) || "1..n".equals(cardinality);
  }
  public static boolean isAtMostOne(String cardinality) {
    cardinality = defaultCardinalityIfNotSet(cardinality);
    return "1".equals(cardinality) || "0..1".equals(cardinality);
  }
  private static String defaultCardinalityIfNotSet(String cardinality) {
    // couldn't use type for cardinality (enummember<Cardinality> is SNode) 
    // can't use link.sourceCardinality.is because I need sourceCardinality to be *bootstrap* property, which is possible at the moment 
    // only for PropertyIdRefExpression, and not for SPropertyAccess 
    return (cardinality == null ? "0..1" : cardinality);
  }
  public static boolean isAssociationLink(String metaclass) {
    // same as cardinality, would like to access LinkDeclaration.metaClass via bootstrap property 
    return metaclass == null || "reference".equals(metaclass);
  }
}
