package jetbrains.mps.lang.smodel.editor;

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
import jetbrains.mps.lang.editor.menus.substitute.ReferenceScopeSubstituteMenuPart;
import jetbrains.mps.lang.editor.menus.substitute.ReferenceScopeSubstituteMenuItem;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.presentation.NodePresentationUtil;

public class EnumMemberReference_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new EnumMemberReference_SubstituteMenu.SMP_ReferenceScope_pzcnlg_a(), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x1091e6212fdL, "jetbrains.mps.lang.smodel.structure.EnumMemberReference")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for EnumMemberReference. Generated from the smart reference attribute.", new SNodePointer("r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)", "4747359941569483844")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public static class SMP_ReferenceScope_pzcnlg_a extends ReferenceScopeSubstituteMenuPart {

    public SMP_ReferenceScope_pzcnlg_a() {
      super(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x1091e6212fdL, "jetbrains.mps.lang.smodel.structure.EnumMemberReference"), MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x1091e6212fdL, 0x1091e625b13L, "enumMember"));
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("reference scope substitute menu part", null));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @Override
    @NotNull
    protected ReferenceScopeSubstituteMenuItem createItem(SubstituteMenuContext context, SNode referencedNode) {
      return new EnumMemberReference_SubstituteMenu.SMP_ReferenceScope_pzcnlg_a.Item(context, referencedNode, getConcept(), getReferenceLink());
    }
    private static class Item extends ReferenceScopeSubstituteMenuItem {
      private final SubstituteMenuContext _context;
      private final SNode referencedNode;
      private EditorMenuTraceInfo myTraceInfo;

      private Item(SubstituteMenuContext context, SNode refNode, SConcept concept, SReferenceLink referenceLink) {
        super(concept, context.getParentNode(), context.getCurrentTargetNode(), refNode, referenceLink, context.getEditorContext());
        _context = context;
        referencedNode = refNode;
        myTraceInfo = context.getEditorMenuTrace().getTraceInfo();
      }
      @Override
      public String getMatchingText(String pattern) {
        return "<" + NodePresentationUtil.matchingText(getReferent(), getParentNode(), false) + ">";
      }
      @Override
      public String getVisibleMatchingText(String pattern) {
        return getMatchingText(pattern);
      }

      @Override
      public EditorMenuTraceInfo getTraceInfo() {
        return myTraceInfo;
      }
    }
  }
}
