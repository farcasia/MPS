package jetbrains.mps.debugger.api.lang.editor;

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
import jetbrains.mps.lang.editor.menus.substitute.SimpleConceptSubstituteMenuPart;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.ParameterizedMenuPart;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.debug.api.IDebugger;
import jetbrains.mps.debug.api.Debuggers;
import jetbrains.mps.lang.editor.menus.substitute.SingleItemSubstituteMenuPart;
import org.apache.log4j.Logger;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.runtime.IconResource;
import jetbrains.mps.lang.editor.menus.ConceptMenusPart;
import java.util.Collection;
import jetbrains.mps.smodel.ConceptDescendantsCache;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;

public class DebuggerReference_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new DebuggerReference_SubstituteMenu.SMP_Param_kfxouf_a(), MetaAdapterFactory.getConcept(0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0xf528808f912d151L, "jetbrains.mps.debugger.api.lang.structure.DebuggerReference")));
    result.add(new DebuggerReference_SubstituteMenu.SMP_Subconcepts_kfxouf_b());
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new SimpleConceptSubstituteMenuPart(MetaAdapterFactory.getConcept(0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0xf528808f912d151L, "jetbrains.mps.debugger.api.lang.structure.DebuggerReference")) {

      @NotNull
      @Override
      public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
        context.getEditorMenuTrace().pushTraceInfo();
        context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("simple substitute menu part for concept: " + "DebuggerReference", new SNodePointer("r:600c053c-afd8-419c-b24b-2550d269af72(jetbrains.mps.debugger.api.lang.editor)", "1741258697587148216")));
        try {
          return super.createItems(context);
        } finally {
          context.getEditorMenuTrace().popTraceInfo();
        }
      }
    }, MetaAdapterFactory.getConcept(0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0xf528808f912d151L, "jetbrains.mps.debugger.api.lang.structure.DebuggerReference")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for " + "DebuggerReference", new SNodePointer("r:600c053c-afd8-419c-b24b-2550d269af72(jetbrains.mps.debugger.api.lang.editor)", "1741258697587147832")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  private class SMP_Param_kfxouf_a extends ParameterizedMenuPart<String, SubstituteMenuItem, SubstituteMenuContext> {
    @NotNull
    @Override
    protected List<SubstituteMenuItem> createItems(String parameter, SubstituteMenuContext context) {
      return new DebuggerReference_SubstituteMenu.SMP_Param_kfxouf_a.SMP_Action_kfxouf_a0(parameter).createItems(context);
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("parameterized substitute menu part", new SNodePointer("r:600c053c-afd8-419c-b24b-2550d269af72(jetbrains.mps.debugger.api.lang.editor)", "1741258697587147834")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }
    @Nullable
    @Override
    protected Iterable<? extends String> getParameters(SubstituteMenuContext _context) {
      List<String> debuggerNames = ListSequence.fromList(new ArrayList<String>());
      for (IDebugger debugger : ListSequence.fromList(Debuggers.getInstance().getDebuggers())) {
        ListSequence.fromList(debuggerNames).addElement(debugger.getName());
      }
      return debuggerNames;
    }
    private class SMP_Action_kfxouf_a0 extends SingleItemSubstituteMenuPart {
      private final String myParameterObject;
      public SMP_Action_kfxouf_a0(String parameterObject) {
        myParameterObject = parameterObject;
      }

      @Nullable
      @Override
      protected SubstituteMenuItem createItem(SubstituteMenuContext _context) {
        DebuggerReference_SubstituteMenu.SMP_Param_kfxouf_a.SMP_Action_kfxouf_a0.Item item = new DebuggerReference_SubstituteMenu.SMP_Param_kfxouf_a.SMP_Action_kfxouf_a0.Item(_context);
        String description;
        try {
          description = "Substitute item: " + item.getMatchingText("");
          description += ". Parameter object: " + myParameterObject;
        } catch (Throwable t) {
          Logger.getLogger(getClass()).error("Exception while executing getMatchingText() of the item " + item, t);
          return null;
        }

        _context.getEditorMenuTrace().pushTraceInfo();
        try {
          _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase(description, new SNodePointer("r:600c053c-afd8-419c-b24b-2550d269af72(jetbrains.mps.debugger.api.lang.editor)", "1741258697587147886")));
          item.setTraceInfo(_context.getEditorMenuTrace().getTraceInfo());
        } finally {
          _context.getEditorMenuTrace().popTraceInfo();
        }

        return item;
      }
      private class Item extends DefaultSubstituteMenuItem {
        private final SubstituteMenuContext _context;
        private EditorMenuTraceInfo myTraceInfo;
        public Item(SubstituteMenuContext context) {
          super(MetaAdapterFactory.getConcept(0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0xf528808f912d151L, "jetbrains.mps.debugger.api.lang.structure.DebuggerReference"), context.getParentNode(), context.getCurrentTargetNode(), context.getEditorContext());
          _context = context;
        }

        private void setTraceInfo(EditorMenuTraceInfo traceInfo) {
          myTraceInfo = traceInfo;
        }

        @Nullable
        @Override
        public SNode createNode(@NotNull String pattern) {
          SNode debuggerReference = SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0xf528808f912d151L, "jetbrains.mps.debugger.api.lang.structure.DebuggerReference")), null);
          SPropertyOperations.set(debuggerReference, MetaAdapterFactory.getProperty(0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0xf528808f912d151L, 0xf528808f912d155L, "debuggerName"), myParameterObject);
          return debuggerReference;
        }

        @Override
        public EditorMenuTraceInfo getTraceInfo() {
          return myTraceInfo;
        }
        @Nullable
        @Override
        public IconResource getIcon(@NotNull String pattern) {
          return null;
        }
        @Nullable
        @Override
        public String getMatchingText(@NotNull String pattern) {
          return "debugger<" + myParameterObject + ">";
        }
        @Nullable
        @Override
        public String getDescriptionText(@NotNull String pattern) {
          return myParameterObject + " Debugger";
        }
      }
    }

  }
  public class SMP_Subconcepts_kfxouf_b extends ConceptMenusPart<SubstituteMenuItem, SubstituteMenuContext> {
    protected Collection getConcepts(final SubstituteMenuContext _context) {
      return ConceptDescendantsCache.getInstance().getDirectDescendants(MetaAdapterFactory.getConcept(0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0xf528808f912d151L, "jetbrains.mps.debugger.api.lang.structure.DebuggerReference"));
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include menus for all the direct subconcepts of " + "DebuggerReference", new SNodePointer("r:600c053c-afd8-419c-b24b-2550d269af72(jetbrains.mps.debugger.api.lang.editor)", "1741258697587148215")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @Override
    protected Collection<SubstituteMenuItem> createItemsForConcept(SubstituteMenuContext context, SAbstractConcept concept) {
      return context.createItems(new DefaultSubstituteMenuLookup(LanguageRegistry.getInstance(context.getEditorContext().getRepository()), concept));
    }
  }
}
