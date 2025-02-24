package jetbrains.mps.build.mps.editor;

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
import jetbrains.mps.lang.editor.menus.transformation.IncludeTransformationMenuTransformationMenuPart;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuLookup;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.editor.menus.transformation.NamedTransformationMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class BuildMps_Solution_ApplySideTransforms extends TransformationMenuBase {
  private final Set<String> myLocations = SetSequence.fromSetAndArray(new HashSet<String>(), MenuLocations.LEFT_SIDE_TRANSFORM, MenuLocations.RIGHT_SIDE_TRANSFORM);
  @Override
  public boolean isApplicableToLocation(@NotNull String location) {
    return SetSequence.fromSet(myLocations).contains(location);
  }

  @NotNull
  @Override
  public List<TransformationMenuItem> createMenuItems(@NotNull TransformationMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("named transformation menu " + "BuildMps_Solution_ApplySideTransforms", new SNodePointer("r:589e3942-2f2d-42a2-9312-986a1d3e2f7f(jetbrains.mps.build.mps.editor)", "1741258697587217178")));
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
    if (ListSequence.fromListAndArray(new ArrayList<String>(), MenuLocations.LEFT_SIDE_TRANSFORM, MenuLocations.RIGHT_SIDE_TRANSFORM).contains(_context.getMenuLocation())) {
      result.add(new BuildMps_Solution_ApplySideTransforms.TMP_Include_ij7rv5_a0());
      result.add(new BuildMps_Solution_ApplySideTransforms.TMP_Include_ij7rv5_b0());
    }
    return result;
  }

  public class TMP_Include_ij7rv5_a0 extends IncludeTransformationMenuTransformationMenuPart {
    @NotNull
    @Override
    public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include " + "named transformation menu " + "add_moduleLocationAndFlags", new SNodePointer("r:589e3942-2f2d-42a2-9312-986a1d3e2f7f(jetbrains.mps.build.mps.editor)", "1741258697587217183")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @Nullable
    @Override
    protected TransformationMenuLookup getMenuLookup(TransformationMenuContext _context) {
      final SNode node = _context.getNode();
      final EditorContext editorContext = _context.getEditorContext();

      return new NamedTransformationMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x2c446791464290f7L, "jetbrains.mps.build.mps.structure.BuildMps_Solution"), "jetbrains.mps.build.mps.editor.add_moduleLocationAndFlags");
    }

  }
  public class TMP_Include_ij7rv5_b0 extends IncludeTransformationMenuTransformationMenuPart {
    @NotNull
    @Override
    public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include " + "named transformation menu " + "add_moduleLocationAndFlags_BuildMps_Module_ext_4", new SNodePointer("r:589e3942-2f2d-42a2-9312-986a1d3e2f7f(jetbrains.mps.build.mps.editor)", "1741258697587217184")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @Nullable
    @Override
    protected TransformationMenuLookup getMenuLookup(TransformationMenuContext _context) {
      final SNode node = _context.getNode();
      final EditorContext editorContext = _context.getEditorContext();

      return new NamedTransformationMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x48e82d508331930cL, "jetbrains.mps.build.mps.structure.BuildMps_Module"), "jetbrains.mps.build.mps.editor.add_moduleLocationAndFlags_BuildMps_Module_ext_4");
    }

  }
}
