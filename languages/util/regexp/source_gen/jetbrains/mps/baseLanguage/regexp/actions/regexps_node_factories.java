package jetbrains.mps.baseLanguage.regexp.actions;

/*Generated by MPS */

import jetbrains.mps.openapi.actions.descriptor.NodeFactory;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class regexps_node_factories {
  public static class NodeFactory_6799940379546646404 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      if (SNodeOperations.isInstanceOf(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174c678adL, "jetbrains.mps.baseLanguage.regexp.structure.UnaryRegexp"))) {
        SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174c678adL, 0x11174c6961aL, "regexp"), SLinkOperations.getTarget(SNodeOperations.cast(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174c678adL, "jetbrains.mps.baseLanguage.regexp.structure.UnaryRegexp")), MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174c678adL, 0x11174c6961aL, "regexp")));
      }
    }
  }
  public static class NodeFactory_8786899561263173301 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      if (SNodeOperations.isInstanceOf(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118de32185L, "jetbrains.mps.baseLanguage.regexp.structure.LookRegexp"))) {
        SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118de32185L, 0x1118de377b8L, "regexp"), SLinkOperations.getTarget(SNodeOperations.cast(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118de32185L, "jetbrains.mps.baseLanguage.regexp.structure.LookRegexp")), MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118de32185L, 0x1118de377b8L, "regexp")));
      } else if (SNodeOperations.isInstanceOf(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111752101b0L, "jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp"))) {
        SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118de32185L, 0x1118de377b8L, "regexp"), SLinkOperations.getTarget(SNodeOperations.cast(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111752101b0L, "jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp")), MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111752101b0L, 0x1117521177bL, "expr")));
      } else if (SNodeOperations.isInstanceOf(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111797946c7L, "jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp"))) {
        SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118de32185L, 0x1118de377b8L, "regexp"), SLinkOperations.getTarget(SNodeOperations.cast(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111797946c7L, "jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp")), MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111797946c7L, 0x111797ac579L, "regexp")));
      }
    }
  }
  public static class NodeFactory_6799940379547316574 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      if (SNodeOperations.isInstanceOf(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118de32185L, "jetbrains.mps.baseLanguage.regexp.structure.LookRegexp"))) {
        SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111752101b0L, 0x1117521177bL, "expr"), SLinkOperations.getTarget(SNodeOperations.cast(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118de32185L, "jetbrains.mps.baseLanguage.regexp.structure.LookRegexp")), MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118de32185L, 0x1118de377b8L, "regexp")));
      } else if (SNodeOperations.isInstanceOf(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111797946c7L, "jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp"))) {
        SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111752101b0L, 0x1117521177bL, "expr"), SLinkOperations.getTarget(SNodeOperations.cast(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111797946c7L, "jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp")), MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111797946c7L, 0x111797ac579L, "regexp")));
      } else if (SNodeOperations.isInstanceOf(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174a06efdL, "jetbrains.mps.baseLanguage.regexp.structure.Regexp"))) {
        SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111752101b0L, 0x1117521177bL, "expr"), SNodeOperations.cast(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174a06efdL, "jetbrains.mps.baseLanguage.regexp.structure.Regexp")));
      }
    }
  }
  public static class NodeFactory_3050481019131578337 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      if (SNodeOperations.isInstanceOf(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118de32185L, "jetbrains.mps.baseLanguage.regexp.structure.LookRegexp"))) {
        SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111797946c7L, 0x111797ac579L, "regexp"), SLinkOperations.getTarget(SNodeOperations.cast(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118de32185L, "jetbrains.mps.baseLanguage.regexp.structure.LookRegexp")), MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118de32185L, 0x1118de377b8L, "regexp")));
      } else if (SNodeOperations.isInstanceOf(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111752101b0L, "jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp"))) {
        SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111797946c7L, 0x111797ac579L, "regexp"), SLinkOperations.getTarget(SNodeOperations.cast(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111752101b0L, "jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp")), MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111752101b0L, 0x1117521177bL, "expr")));
      } else if (SNodeOperations.isInstanceOf(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174a06efdL, "jetbrains.mps.baseLanguage.regexp.structure.Regexp"))) {
        SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111797946c7L, 0x111797ac579L, "regexp"), SNodeOperations.cast(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174a06efdL, "jetbrains.mps.baseLanguage.regexp.structure.Regexp")));
      }
    }
  }
  public static class NodeFactory_1353467374625228627 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      if (SNodeOperations.isInstanceOf(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174a06efdL, "jetbrains.mps.baseLanguage.regexp.structure.Regexp"))) {
        SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174c56bf9L, 0x11174c59241L, "left"), SNodeOperations.cast(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174a06efdL, "jetbrains.mps.baseLanguage.regexp.structure.Regexp")));
      }
    }
  }
  public static class NodeFactory_4759120547780396753 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      if (SNodeOperations.isInstanceOf(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11178e2916aL, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp"))) {
        ListSequence.fromList(SLinkOperations.getChildren(newNode, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11178e2916aL, 0x11179171739L, "part"))).addSequence(ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(sampleNode, MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11178e2916aL, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp")), MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11178e2916aL, 0x11179171739L, "part"))));
      }
    }
  }
  public static class NodeFactory_7048923897762413188 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117ecbc07aL, 0x1117ecc427cL, "regexp"), SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117648961dL, "jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression")), null));
    }
  }
}
