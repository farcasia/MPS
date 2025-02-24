package jetbrains.mps.baseLanguage.regexp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.TransformationMenu;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0a = ((SAbstractConcept) concept);
    switch (index_xbvbvu_a0a.index(cncpt_a0a)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new AtLeastNTimesRegexp_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new BinaryRegexp_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new CharacterSymbolClassPart_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new DotRegexp_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new FindMatchExpression_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new FindMatchStatement_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new ForEachMatchStatement_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new FromNToMTimesRegexp_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new InlineRegexpExpression_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new IntersectionSymbolClassPart_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new IntervalSymbolClassPart_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new LineEndRegexp_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new LineStartRegexp_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new LiteralReplacement_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new LookRegexp_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new MatchParensRegexp_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new MatchRegexpExpression_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new MatchRegexpOperation_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new MatchRegexpStatement_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new MatchVariableReference_Editor());
      case 20:
        return Collections.<ConceptEditor>singletonList(new MatchVariableReferenceRegexp_Editor());
      case 21:
        return Collections.<ConceptEditor>singletonList(new MatchVariableReferenceReplacement_Editor());
      case 22:
        return Collections.<ConceptEditor>singletonList(new NTimesRegexp_Editor());
      case 23:
        return Collections.<ConceptEditor>singletonList(new NegativeSymbolClassRegexp_Editor());
      case 24:
        return Collections.<ConceptEditor>singletonList(new OrRegexp_Editor());
      case 25:
        return Collections.<ConceptEditor>singletonList(new ParensRegexp_Editor());
      case 26:
        return Collections.<ConceptEditor>singletonList(new PositiveSymbolClassRegexp_Editor());
      case 27:
        return Collections.<ConceptEditor>singletonList(new PredefinedSymbolClassDeclaration_Editor());
      case 28:
        return Collections.<ConceptEditor>singletonList(new PredefinedSymbolClassRegexp_Editor());
      case 29:
        return Collections.<ConceptEditor>singletonList(new PredefinedSymbolClassSymbolClassPart_Editor());
      case 30:
        return Collections.<ConceptEditor>singletonList(new PredefinedSymbolClasses_Editor());
      case 31:
        return Collections.<ConceptEditor>singletonList(new Regexp_Editor());
      case 32:
        return Collections.<ConceptEditor>singletonList(new RegexpDeclaration_Editor());
      case 33:
        return Collections.<ConceptEditor>singletonList(new RegexpDeclarationReferenceRegexp_Editor());
      case 34:
        return Collections.<ConceptEditor>singletonList(new Regexps_Editor());
      case 35:
        return Collections.<ConceptEditor>singletonList(new ReplaceBlock_Editor());
      case 36:
        return Collections.<ConceptEditor>singletonList(new ReplaceRegexpOperation_Editor());
      case 37:
        return Collections.<ConceptEditor>singletonList(new ReplaceWithRegexpExpression_Editor());
      case 38:
        return Collections.<ConceptEditor>singletonList(new ReplaceWithRegexpOperation_Editor());
      case 39:
        return Collections.<ConceptEditor>singletonList(new SeqRegexp_Editor());
      case 40:
        return Collections.<ConceptEditor>singletonList(new SplitExpression_Editor());
      case 41:
        return Collections.<ConceptEditor>singletonList(new SplitOperation_Editor());
      case 42:
        return Collections.<ConceptEditor>singletonList(new StringLiteralRegexp_Editor());
      case 43:
        return Collections.<ConceptEditor>singletonList(new UnaryRegexp_Editor());
      case 44:
        return Collections.<ConceptEditor>singletonList(new UnicodeCharacterRegexp_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<TransformationMenu> getDeclaredDefaultTransformationMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0d = concept;
    switch (index_xbvbvu_a0d.index(cncpt_a0d)) {
      case 0:
        return Collections.<TransformationMenu>singletonList(new CharacterSymbolClassPart_TransformationMenu());
      case 1:
        return Collections.<TransformationMenu>singletonList(new stringOperations_Contribution());
      case 2:
        return Collections.<TransformationMenu>singletonList(new InlineRegexpExpression_TransformationMenu());
      case 3:
        return Collections.<TransformationMenu>singletonList(new Regexp_TransformationMenu());
      case 4:
        return Collections.<TransformationMenu>singletonList(new ReplaceRegexpOperation_TransformationMenu());
      case 5:
        return Collections.<TransformationMenu>singletonList(new SymbolClassPart_TransformationMenu());
      default:
    }
    return Collections.<TransformationMenu>emptyList();
  }
  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0e = concept;
    switch (index_xbvbvu_a0e.index(cncpt_a0e)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new FindMatchExpression_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new LiteralReplacement_SubstituteMenu());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new MatchParensRegexp_SubstituteMenu());
      case 3:
        return Collections.<SubstituteMenu>singletonList(new MatchRegexpExpression_SubstituteMenu());
      case 4:
        return Collections.<SubstituteMenu>singletonList(new MatchVariableReference_SubstituteMenu());
      case 5:
        return Collections.<SubstituteMenu>singletonList(new MatchVariableReferenceRegexp_SubstituteMenu());
      case 6:
        return Collections.<SubstituteMenu>singletonList(new MatchVariableReferenceReplacement_SubstituteMenu());
      case 7:
        return Collections.<SubstituteMenu>singletonList(new PredefinedSymbolClassRegexp_SubstituteMenu());
      case 8:
        return Collections.<SubstituteMenu>singletonList(new PredefinedSymbolClassSymbolClassPart_SubstituteMenu());
      case 9:
        return Collections.<SubstituteMenu>singletonList(new Regexp_SubstituteMenu());
      case 10:
        return Collections.<SubstituteMenu>singletonList(new RegexpDeclarationReferenceRegexp_SubstituteMenu());
      case 11:
        return Collections.<SubstituteMenu>singletonList(new ReplaceWithRegexpExpression_SubstituteMenu());
      case 12:
        return Collections.<SubstituteMenu>singletonList(new Replacement_SubstituteMenu());
      case 13:
        return Collections.<SubstituteMenu>singletonList(new SplitExpression_SubstituteMenu());
      case 14:
        return Collections.<SubstituteMenu>singletonList(new SplitOperation_SubstituteMenu());
      case 15:
        return Collections.<SubstituteMenu>singletonList(new SymbolClassPart_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118dc30ee2L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174c56bf9L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111791ae82fL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111790aa926L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x550fbf4ebc5de3f5L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1119d8807a3L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1119caff72eL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118dc58c6eL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117648961dL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11c0ef7f429L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11179215e8bL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1119d126564L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1119d11da7eL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x34ae970c192ab94cL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118de32185L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111797946c7L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x112972a0c32L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11c9466ae95L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11176652f14L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117987ff5eL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118e0a1c55L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x34ae970c192ab94eL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118dbeda57L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11178e35c63L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174a0d780L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111752101b0L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11178e2f48cL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11178e59fd0L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11178fa2a18L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117928d9f2L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11178e5efc7L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174a06efdL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174a6454dL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117f58ea2aL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117f550b6dL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117ef80054L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x34ae970c1923d18aL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117ef3f72dL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11c94680172L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174bc30e7L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1119d41c734L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11c942ab86bL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174a0992dL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174c678adL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11831260718L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0d = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111791ae82fL), MetaIdFactory.conceptId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117648961dL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174a06efdL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x34ae970c1923d18aL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111791aa602L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0e = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x550fbf4ebc5de3f5L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x34ae970c192ab94cL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111797946c7L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x112972a0c32L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117987ff5eL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1118e0a1c55L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x34ae970c192ab94eL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11178fa2a18L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117928d9f2L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11174a06efdL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117f58ea2aL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117ef3f72dL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x34ae970c192ab952L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1119d41c734L), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11c942ab86bL), MetaIdFactory.conceptId(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x111791aa602L)).seal();
}
