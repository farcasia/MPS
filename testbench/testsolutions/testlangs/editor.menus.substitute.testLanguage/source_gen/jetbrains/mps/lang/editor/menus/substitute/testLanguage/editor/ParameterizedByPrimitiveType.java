package jetbrains.mps.lang.editor.menus.substitute.testLanguage.editor;

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
import jetbrains.mps.lang.editor.menus.ParameterizedMenuPart;
import org.jetbrains.annotations.Nullable;
import java.util.Arrays;
import jetbrains.mps.lang.editor.menus.substitute.SingleItemSubstituteMenuPart;
import org.apache.log4j.Logger;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.runtime.IconResource;

public class ParameterizedByPrimitiveType extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new ParameterizedByPrimitiveType.SMP_Param_ud82js_a(), MetaAdapterFactory.getConcept(0xcb6d57037c8e46a9L, 0xb993c1373dc0942fL, 0x75a761fb50351afbL, "jetbrains.mps.lang.editor.menus.substitute.testLanguage.structure.TestConceptForMenuParameterizedByPrimitiveType")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("named substitute menu " + "ParameterizedByPrimitiveType", new SNodePointer("r:d793eea9-8b7b-4c58-a7a2-62336f54dcce(jetbrains.mps.lang.editor.menus.substitute.testLanguage.editor)", "8477852555558591226")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  private class SMP_Param_ud82js_a extends ParameterizedMenuPart<Integer, SubstituteMenuItem, SubstituteMenuContext> {
    @NotNull
    @Override
    protected List<SubstituteMenuItem> createItems(Integer parameter, SubstituteMenuContext context) {
      return new ParameterizedByPrimitiveType.SMP_Param_ud82js_a.SMP_Action_ud82js_a0(parameter).createItems(context);
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("parameterized substitute menu part", new SNodePointer("r:d793eea9-8b7b-4c58-a7a2-62336f54dcce(jetbrains.mps.lang.editor.menus.substitute.testLanguage.editor)", "8477852555558591228")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }
    @Nullable
    @Override
    protected Iterable<? extends Integer> getParameters(SubstituteMenuContext _context) {
      return Arrays.asList(1, 2, 3);
    }
    private class SMP_Action_ud82js_a0 extends SingleItemSubstituteMenuPart {
      private final Integer myParameterObject;
      public SMP_Action_ud82js_a0(Integer parameterObject) {
        myParameterObject = parameterObject;
      }

      @Nullable
      @Override
      protected SubstituteMenuItem createItem(SubstituteMenuContext _context) {
        ParameterizedByPrimitiveType.SMP_Param_ud82js_a.SMP_Action_ud82js_a0.Item item = new ParameterizedByPrimitiveType.SMP_Param_ud82js_a.SMP_Action_ud82js_a0.Item(_context);
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
          _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase(description, new SNodePointer("r:d793eea9-8b7b-4c58-a7a2-62336f54dcce(jetbrains.mps.lang.editor.menus.substitute.testLanguage.editor)", "8477852555558593538")));
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
          super(MetaAdapterFactory.getConcept(0xcb6d57037c8e46a9L, 0xb993c1373dc0942fL, 0x75a761fb50351afbL, "jetbrains.mps.lang.editor.menus.substitute.testLanguage.structure.TestConceptForMenuParameterizedByPrimitiveType"), context.getParentNode(), context.getCurrentTargetNode(), context.getEditorContext());
          _context = context;
        }

        private void setTraceInfo(EditorMenuTraceInfo traceInfo) {
          myTraceInfo = traceInfo;
        }

        @Nullable
        @Override
        public SNode createNode(@NotNull String pattern) {
          // Check that we can use parameterObject of a primitive type without errors 
          int param = myParameterObject;
          if (myParameterObject < 3) {
            param++;
          }
          return null;
        }

        @Override
        public EditorMenuTraceInfo getTraceInfo() {
          return myTraceInfo;
        }
        @Nullable
        @Override
        public String getMatchingText(@NotNull String pattern) {
          return "" + myParameterObject;
        }
        @Nullable
        @Override
        public String getDescriptionText(@NotNull String pattern) {
          return "";
        }
        @Nullable
        @Override
        public IconResource getIcon(@NotNull String pattern) {
          return null;
        }
      }
    }

  }
}
