package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.transformation.TransformationMenuBase;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.editor.menus.transformation.MenuLocations;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuItem;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuContext;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.MenuPart;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.editor.menus.transformation.WrapSubstituteMenuTransformationMenuPart;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuLookup;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.editor.menus.substitute.NamedSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.editor.runtime.menus.SubstituteItemProxy;
import jetbrains.mps.lang.editor.menus.transformation.SubstituteMenuItemAsActionItem;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class LanguageRefExpression_Transformation extends TransformationMenuBase {
  private final Set<String> myLocations = SetSequence.fromSetAndArray(new HashSet<String>(), MenuLocations.SUBSTITUTE);
  @Override
  public boolean isApplicableToLocation(@NotNull String location) {
    return SetSequence.fromSet(myLocations).contains(location);
  }

  @NotNull
  @Override
  public List<TransformationMenuItem> createMenuItems(@NotNull TransformationMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("named transformation menu " + "LanguageRefExpression_Transformation", new SNodePointer("r:00000000-0000-4000-0000-011c895902fd(jetbrains.mps.lang.smodel.editor)", "2469893808088029481")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }

  @Override
  @NotNull
  protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts(TransformationMenuContext _context) {
    List<MenuPart<TransformationMenuItem, TransformationMenuContext>> result = new ArrayList<MenuPart<TransformationMenuItem, TransformationMenuContext>>();
    if (ListSequence.fromListAndArray(new ArrayList<String>(), MenuLocations.SUBSTITUTE).contains(_context.getMenuLocation())) {
      result.add(new LanguageRefExpression_Transformation.TMP_WrapSM_dga60q_a0());
    }
    return result;
  }

  public class TMP_WrapSM_dga60q_a0 extends WrapSubstituteMenuTransformationMenuPart {
    @NotNull
    @Override
    public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("wrap substitute menu " + "named substitute menu " + "RepositoryLanguages_SubstituteWrapped", new SNodePointer("r:00000000-0000-4000-0000-011c895902fd(jetbrains.mps.lang.smodel.editor)", "2469893808088029513")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @Nullable
    @Override
    protected SubstituteMenuLookup getSubstituteMenuLookup(TransformationMenuContext _context) {
      final EditorContext editorContext = _context.getEditorContext();
      SAbstractConcept conceptToFindMenuFor = getConceptToFindMenuFor(_context);
      return new NamedSubstituteMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), conceptToFindMenuFor, "jetbrains.mps.lang.smodel.editor.RepositoryLanguages_SubstituteWrapped");
    }
    private SAbstractConcept getConceptToFindMenuFor(TransformationMenuContext _context) {
      return MetaAdapterFactory.getInterfaceConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x500fe561b6da3df1L, "jetbrains.mps.lang.smodel.structure.AbstractLanguageIdentity");
    }


    @Override
    protected TransformationMenuItem createTransformationItem(final SNode targetNode, final SubstituteMenuItem item, final TransformationMenuContext _context) {
      final SubstituteItemProxy wrappedItem = new SubstituteItemProxy(item);
      return new SubstituteMenuItemAsActionItem(item) {
        @Override
        public void execute(@NotNull String pattern) {
          SNode createdNode = item.createNode(pattern);
          SLinkOperations.setTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x3e6a40ba27dd70f3L, 0x312abca18ab995e2L, "languageId"), createdNode);
        }
      };
    }
  }
}
