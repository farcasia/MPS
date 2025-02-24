package jetbrains.mps.build.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.substitute.SubstituteMenuBase;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuContext;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.substitute.WrapperSubstituteMenuPart;
import jetbrains.mps.editor.runtime.menus.SubstituteItemProxy;
import jetbrains.mps.lang.editor.menus.substitute.SubstituteMenuItemWrapper;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.editor.runtime.selection.SelectionUtil;
import jetbrains.mps.openapi.editor.selection.SelectionManager;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuLookup;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;

public class BuildSource_JavaLibraryCP_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new BuildSource_JavaLibraryCP_SubstituteMenu.SMP_Wrap_2ut3s4_a(), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x3395e884b61d4cbbL, "jetbrains.mps.build.structure.BuildSource_JavaLibraryCP")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for " + "BuildSource_JavaLibraryCP", new SNodePointer("r:00f69407-23a8-49a2-a236-9e89a32679aa(jetbrains.mps.build.editor)", "1741258697587201596")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  private class SMP_Wrap_2ut3s4_a extends WrapperSubstituteMenuPart {
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("wrap " + "default substitute menu for " + "BuildSource_JavaCP", new SNodePointer("r:00f69407-23a8-49a2-a236-9e89a32679aa(jetbrains.mps.build.editor)", "1741258697587201598")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @NotNull
    @Override
    protected SubstituteMenuItem wrapItem(final SubstituteMenuItem item, final SubstituteMenuContext _context) {
      final SubstituteItemProxy wrappedItem = new SubstituteItemProxy(item);
      return new SubstituteMenuItemWrapper(item) {
        private SNode myCreatedNode;

        @Nullable
        @Override
        public SAbstractConcept getOutputConcept() {
          return MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x3395e884b61d4cbbL, "jetbrains.mps.build.structure.BuildSource_JavaLibraryCP");
        }
        @Nullable
        @Override
        public SNode createNode(@NotNull String pattern) {
          SNode nodeToWrap = super.createNode(pattern);
          SNode n = SModelOperations.createNewNode(_context.getModel(), null, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x3395e884b61d4cbbL, "jetbrains.mps.build.structure.BuildSource_JavaLibraryCP"));
          SLinkOperations.setTarget(n, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x3395e884b61d4cbbL, 0x3395e884b61d4cbdL, "classpath"), nodeToWrap);
          return n;
        }
        @Override
        public void select(@NotNull SNode createdNode, @NotNull String pattern) {
          SelectionUtil.selectLabelCellAnSetCaret(_context.getEditorContext(), createdNode, SelectionManager.FIRST_ERROR_CELL + "|" + SelectionManager.FOCUS_POLICY_CELL + "|" + SelectionManager.FIRST_EDITABLE_CELL + "|" + SelectionManager.FIRST_CELL, -1);
        }
      };
    }
    @Nullable
    @Override
    protected SubstituteMenuLookup getLookup(SubstituteMenuContext _context) {
      final EditorContext editorContext = _context.getEditorContext();
      SAbstractConcept conceptToFindMenuFor = getConceptToFindMenuFor(_context);
      return new DefaultSubstituteMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), conceptToFindMenuFor);
    }
    private SAbstractConcept getConceptToFindMenuFor(SubstituteMenuContext _context) {
      return MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x3395e884b61c2404L, "jetbrains.mps.build.structure.BuildSource_JavaCP");
    }
  }
}
