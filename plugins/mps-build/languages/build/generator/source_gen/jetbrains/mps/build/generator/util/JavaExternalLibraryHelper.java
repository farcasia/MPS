package jetbrains.mps.build.generator.util;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.build.util.DependenciesHelper;
import jetbrains.mps.generator.template.TemplateQueryContext;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.build.behavior.BuildSource_JavaLibrary__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.build.behavior.BuildSourcePath__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Collections;
import jetbrains.mps.build.behavior.BuildSource_SingleFile__BehaviorDescriptor;
import jetbrains.mps.build.behavior.BuildSource_SingleFolder__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class JavaExternalLibraryHelper {
  private SNode library;
  private DependenciesHelper helper;
  private TemplateQueryContext genContext;
  public JavaExternalLibraryHelper(DependenciesHelper helper, SNode library, TemplateQueryContext genContext) {
    this.library = library;
    this.helper = helper;
    this.genContext = genContext;
  }
  public Iterable<SNode> artifacts() {
    List<SNode> artifacts = new ArrayList<SNode>();
    List<SNode> jarContainers = new ArrayList<SNode>();

    if ((boolean) BuildSource_JavaLibrary__BehaviorDescriptor.canExportByParts_id4RsV8qJGJnM.invoke(library)) {
      for (SNode element : ListSequence.fromList(SLinkOperations.getChildren(library, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x540febaa6144b873L, 0x540febaa6144e311L, "elements")))) {
        SNode jcp = SNodeOperations.as(element, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x3395e884b61d4cbbL, "jetbrains.mps.build.structure.BuildSource_JavaLibraryCP"));
        if ((jcp == null)) {
          return null;
        }
        SNode classpath = SLinkOperations.getTarget(jcp, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x3395e884b61d4cbbL, 0x3395e884b61d4cbdL, "classpath"));
        if (SNodeOperations.isInstanceOf(classpath, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x11779a1dbcff551aL, "jetbrains.mps.build.structure.BuildSource_JavaJar"))) {
          SNode jarArtifact = helper.getArtifact(SLinkOperations.getTarget(SNodeOperations.cast(classpath, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x11779a1dbcff551aL, "jetbrains.mps.build.structure.BuildSource_JavaJar")), MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x11779a1dbcff551aL, 0x3395e884b61c23e2L, "path")));
          if (jarArtifact != null) {
            ListSequence.fromList(artifacts).addElement(jarArtifact);
          } else {
            genContext.showErrorMessage(library, "jar `" + BuildSourcePath__BehaviorDescriptor.getLastSegment_id5dwDdJ8yckN.invoke(SLinkOperations.getTarget(SNodeOperations.cast(classpath, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x11779a1dbcff551aL, "jetbrains.mps.build.structure.BuildSource_JavaJar")), MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x11779a1dbcff551aL, 0x3395e884b61c23e2L, "path"))) + "' was not found in the layout");
            return Sequence.fromIterable(Collections.<SNode>emptyList());
          }
        } else if (SNodeOperations.isInstanceOf(classpath, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4ddcec86afb50da7L, "jetbrains.mps.build.structure.BuildSource_JavaLibraryExternalJar"))) {
          SNode file = SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(classpath, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4ddcec86afb50da7L, "jetbrains.mps.build.structure.BuildSource_JavaLibraryExternalJar")), MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4ddcec86afb50da7L, 0x4ddcec86afb50da8L, "extJar")), MetaAdapterFactory.getReferenceLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4ddcec86afb2f64cL, 0x4ddcec86afb2f64dL, "jar"));
          SNode artifact = SNodeOperations.as(file, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafac4c85L, "jetbrains.mps.build.structure.BuildLayout_Node"));
          if (artifact == null && SNodeOperations.isInstanceOf(file, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x48d5d03db9224596L, "jetbrains.mps.build.structure.BuildInputSingleFile"))) {
            artifact = SNodeOperations.as(helper.getArtifact(SLinkOperations.getTarget(SNodeOperations.cast(file, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x48d5d03db9224596L, "jetbrains.mps.build.structure.BuildInputSingleFile")), MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x48d5d03db9224596L, 0x48d5d03db922459aL, "path"))), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafac4c85L, "jetbrains.mps.build.structure.BuildLayout_Node"));
          }
          if (artifact != null) {
            ListSequence.fromList(artifacts).addElement(artifact);
          } else {
            genContext.showErrorMessage(library, "jar file `" + BuildSource_SingleFile__BehaviorDescriptor.getApproximateName_id4RsV8qJDnFm.invoke(file) + "' was not found in the layout");
            return Sequence.fromIterable(Collections.<SNode>emptyList());
          }

        } else if (SNodeOperations.isInstanceOf(classpath, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4ddcec86afb65af8L, "jetbrains.mps.build.structure.BuildSource_JavaLibraryExternalJarFolder"))) {
          SNode folder = SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(classpath, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4ddcec86afb65af8L, "jetbrains.mps.build.structure.BuildSource_JavaLibraryExternalJarFolder")), MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4ddcec86afb65af8L, 0x4ddcec86afb65afaL, "extFolder")), MetaAdapterFactory.getReferenceLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4ddcec86afb65a3fL, 0x4ddcec86afb65a40L, "folder"));
          SNode artifact = SNodeOperations.as(folder, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafabcf0cL, "jetbrains.mps.build.structure.BuildLayout_AbstractContainer"));
          if (artifact == null && SNodeOperations.isInstanceOf(folder, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x1ff930b22643b0ffL, "jetbrains.mps.build.structure.BuildInputSingleFolder"))) {
            artifact = SNodeOperations.as(helper.getArtifact(SLinkOperations.getTarget(SNodeOperations.cast(folder, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x1ff930b22643b0ffL, "jetbrains.mps.build.structure.BuildInputSingleFolder")), MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x1ff930b22643b0ffL, 0x1ff930b22643b100L, "path"))), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafabcf0cL, "jetbrains.mps.build.structure.BuildLayout_AbstractContainer"));
          }
          if (artifact != null) {
            ListSequence.fromList(jarContainers).addElement(artifact);
          } else {
            genContext.showErrorMessage(library, "jar folder `" + BuildSource_SingleFolder__BehaviorDescriptor.getApproximateName_id4RsV8qJH_Br.invoke(folder) + "' was not found in the layout");
            return Sequence.fromIterable(Collections.<SNode>emptyList());
          }
        } else {
          // unknown child, reset to library reexport 
          ListSequence.fromList(artifacts).clear();
          ListSequence.fromList(jarContainers).clear();
          break;
        }
      }
    }

    // export as java library 
    if (ListSequence.fromList(artifacts).isEmpty() && ListSequence.fromList(jarContainers).isEmpty()) {
      SNode layoutNode = helper.getArtifact(library);
      if (layoutNode == null) {
        genContext.showErrorMessage(library, "java library " + SPropertyOperations.getString(library, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + " was not found in the layout");
        return Sequence.fromIterable(Collections.<SNode>emptyList());
      } else {
        if (SNodeOperations.isInstanceOf(layoutNode, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x286d67dde534f69bL, "jetbrains.mps.build.structure.BuildLayout_ExportAsJavaLibrary"))) {
          ListSequence.fromList(artifacts).addSequence(ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(layoutNode, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x286d67dde534f69bL, "jetbrains.mps.build.structure.BuildLayout_ExportAsJavaLibrary")), MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4140393b234482c3L, 0x668c6cfbafac4c8eL, "children"))));
        } else {
          ListSequence.fromList(artifacts).addElement(layoutNode);
        }
      }
    }

    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode pe : ListSequence.fromList(artifacts).distinct()) {
      String val = helper.getLocation(pe);
      if (val == null) {
        genContext.showErrorMessage(pe, "no location for " + BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(pe) + " (unsupported layout element)");
        continue;
      }
      SNode propertyNode = SModelOperations.createNewNode(genContext.getOutputModel(), null, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x35951dfcf9e0ba02L, "jetbrains.mps.build.structure.GeneratorInternal_LibraryArtifacts"));
      ListSequence.fromList(SLinkOperations.getChildren(propertyNode, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x35951dfcf9e0ba02L, 0x35951dfcf9e0bd1fL, "attrs"))).addElement(_quotation_createNode_g6ffke_a0a3a9a4(val));
      ListSequence.fromList(result).addElement(propertyNode);
    }
    for (SNode pe : jarContainers) {
      String val = helper.getContentLocation(pe);
      if (val == null) {
        genContext.showErrorMessage(pe, "no content location for " + BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(pe) + " (unsupported layout element)");
        continue;
      }
      SNode propertyNode = SModelOperations.createNewNode(genContext.getOutputModel(), null, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x35951dfcf9e0ba02L, "jetbrains.mps.build.structure.GeneratorInternal_LibraryArtifacts"));
      ListSequence.fromList(SLinkOperations.getChildren(propertyNode, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x35951dfcf9e0ba02L, 0x35951dfcf9e0bd1fL, "attrs"))).addElement(_quotation_createNode_g6ffke_a0a3a01a4(val));
      ListSequence.fromList(SLinkOperations.getChildren(propertyNode, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x35951dfcf9e0ba02L, 0x35951dfcf9e0bd1fL, "attrs"))).addElement(_quotation_createNode_g6ffke_a0a4a01a4());
      ListSequence.fromList(result).addElement(propertyNode);
    }
    return result;
  }
  private static SNode _quotation_createNode_g6ffke_a0a3a9a4(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, "jetbrains.mps.core.xml"), 0x5c842a42c54b8df3L, "XmlAttribute"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_2, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54b8df3L, 0x5c842a42c54b8df6L, "attrName"), "file");
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, "jetbrains.mps.core.xml"), 0x5c842a42c54cfd1fL, "XmlTextValue"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_3, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"), (String) parameter_1);
    quotedNode_2.addChild(MetaAdapterFactory.getContainmentLink(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54b8df3L, 0x5c842a42c54cfd1eL, "value"), quotedNode_3);
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_g6ffke_a0a3a01a4(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, "jetbrains.mps.core.xml"), 0x5c842a42c54b8df3L, "XmlAttribute"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_2, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54b8df3L, 0x5c842a42c54b8df6L, "attrName"), "dir");
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, "jetbrains.mps.core.xml"), 0x5c842a42c54cfd1fL, "XmlTextValue"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_3, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"), (String) parameter_1);
    quotedNode_2.addChild(MetaAdapterFactory.getContainmentLink(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54b8df3L, 0x5c842a42c54cfd1eL, "value"), quotedNode_3);
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_g6ffke_a0a4a01a4() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, "jetbrains.mps.core.xml"), 0x5c842a42c54b8df3L, "XmlAttribute"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_1, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54b8df3L, 0x5c842a42c54b8df6L, "attrName"), "includes");
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, "jetbrains.mps.core.xml"), 0x5c842a42c54cfd1fL, "XmlTextValue"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_2, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"), "*.jar");
    quotedNode_1.addChild(MetaAdapterFactory.getContainmentLink(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54b8df3L, 0x5c842a42c54cfd1eL, "value"), quotedNode_2);
    return quotedNode_1;
  }
}
