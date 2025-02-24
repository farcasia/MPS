package jetbrains.mps.execution.commands.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.TransformationMenu;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.openapi.editor.descriptor.NamedMenuId;
import java.util.Arrays;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0a = ((SAbstractConcept) concept);
    switch (index_xbvbvu_a0a.index(cncpt_a0a)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new CommandBuilderExpression_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new CommandDebuggerOperation_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new CommandDeclaration_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new CommandParameterAssignment_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new CommandParameterReference_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new CommandPartLengthOperation_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new CommandPartToListOperation_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new CommandProcessType_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new CommandReferenceExpression_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new CommandType_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new DebuggerSettingsCommandParameterDeclaration_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new ExecuteCommandPart_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new ExplicitCommandParameterDeclaration_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new KeyValueCommandPart_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new ListCommandPart_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new NewProcessBuilderExpression_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new PropertyCommandPart_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new RedirectOutputExpression_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new ReportErrorStatement_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new StartAndWaitOperation_Editor());
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
        return Collections.<TransformationMenu>singletonList(new AddRedirect_Contribution());
      case 1:
        return Collections.<TransformationMenu>singletonList(new ProcessType_TransformationMenu());
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
        return Collections.<SubstituteMenu>singletonList(new CommandParameterAssignment_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new CommandParameterReference_SubstituteMenu());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new Expression_Contribution());
      case 3:
        return Collections.<SubstituteMenu>singletonList(new reportExecutionError_Contribution());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }
  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredNamedSubstituteMenus(NamedMenuId menuId) {
    SAbstractConcept cncpt_a0f = (SAbstractConcept) menuId.getConcept();
    switch (index_xbvbvu_a0f.index(cncpt_a0f)) {
      case 0:
        if (true) {
          switch (Arrays.binarySearch(stringSwitchCases_xbvbvu_a0a0a0a1a5, menuId.getFqName())) {
            case 0:
              return Arrays.asList(new SubstituteMenu[]{new SubstituteListCommandPart()});
            case 1:
              return Arrays.asList(new SubstituteMenu[]{new commandBuilderExpression()});
            case 2:
              return Arrays.asList(new SubstituteMenu[]{new commandReference()});
            default:
          }
        }
        break;
      default:
    }

    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xbe3a0d5ba1a2bf4L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xbe3a0d5ba1a2bf1L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xbe3a0d5ba1a2be8L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xbe3a0d5ba1a2be4L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xbe3a0d5ba1a2bdcL), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x166dfef127134569L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x72450cdacb885c78L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x87f99370d7e1ea3L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xbe3a0d5ba1a2bd9L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xbe3a0d5ba1a2bd6L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x75aadb0d4e61a576L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x550ea9458ea107acL), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xbe3a0d5ba1a2be2L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xc58d43a818a1f7fL), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x5f50ed14026999c9L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x2085f2c5c8400c12L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x72450cdacb8a706eL), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xbe3a0d5ba1a2c14L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xbe3a0d5ba1a2c00L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x2222cc72e62f7052L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0d = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xbe3a0d5ba1a2c12L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0e = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xbe3a0d5ba1a2be4L), MetaIdFactory.conceptId(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0xbe3a0d5ba1a2bdcL), MetaIdFactory.conceptId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL), MetaIdFactory.conceptId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0f = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL)).seal();
  private static String[] stringSwitchCases_xbvbvu_a0a0a0a1a5 = new String[]{"jetbrains.mps.execution.commands.editor.SubstituteListCommandPart", "jetbrains.mps.execution.commands.editor.commandBuilderExpression", "jetbrains.mps.execution.commands.editor.commandReference"};
}
