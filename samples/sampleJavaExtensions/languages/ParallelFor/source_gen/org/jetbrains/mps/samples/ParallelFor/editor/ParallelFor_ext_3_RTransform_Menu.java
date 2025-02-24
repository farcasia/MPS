package org.jetbrains.mps.samples.ParallelFor.editor;

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

public class ParallelFor_ext_3_RTransform_Menu extends TransformationMenuBase {
  private final Set<String> myLocations = SetSequence.fromSetAndArray(new HashSet<String>(), MenuLocations.LEFT_SIDE_TRANSFORM, MenuLocations.RIGHT_SIDE_TRANSFORM);
  @Override
  public boolean isApplicableToLocation(@NotNull String location) {
    return SetSequence.fromSet(myLocations).contains(location);
  }

  @NotNull
  @Override
  public List<TransformationMenuItem> createMenuItems(@NotNull TransformationMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("named transformation menu " + "ParallelFor_ext_3_RTransform_Menu", new SNodePointer("r:356cdff9-223c-480e-a34e-0b9eab641194(org.jetbrains.mps.samples.ParallelFor.editor)", "1741258697587112640")));
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
      result.add(new ParallelFor_ext_3_RTransform_Menu.TMP_Include_w7u9im_a0());
      result.add(new ParallelFor_ext_3_RTransform_Menu.TMP_Include_w7u9im_b0());
    }
    return result;
  }

  public class TMP_Include_w7u9im_a0 extends IncludeTransformationMenuTransformationMenuPart {
    @NotNull
    @Override
    public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include " + "named transformation menu " + "NoWaitTransforms_ParallelFor_ext_3", new SNodePointer("r:356cdff9-223c-480e-a34e-0b9eab641194(org.jetbrains.mps.samples.ParallelFor.editor)", "1741258697587112678")));
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

      return new NamedTransformationMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), MetaAdapterFactory.getConcept(0xcb7388e8f1824cdaL, 0xbd839796e8634856L, 0x7bd8445d1e8770aaL, "org.jetbrains.mps.samples.ParallelFor.structure.ParallelFor"), "org.jetbrains.mps.samples.ParallelFor.editor.NoWaitTransforms_ParallelFor_ext_3");
    }

  }
  public class TMP_Include_w7u9im_b0 extends IncludeTransformationMenuTransformationMenuPart {
    @NotNull
    @Override
    public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include " + "named transformation menu " + "ThreadPoolTransforms_ext_3", new SNodePointer("r:356cdff9-223c-480e-a34e-0b9eab641194(org.jetbrains.mps.samples.ParallelFor.editor)", "1741258697587112797")));
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

      return new NamedTransformationMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), MetaAdapterFactory.getConcept(0xcb7388e8f1824cdaL, 0xbd839796e8634856L, 0x7bd8445d1e8770aaL, "org.jetbrains.mps.samples.ParallelFor.structure.ParallelFor"), "org.jetbrains.mps.samples.ParallelFor.editor.ThreadPoolTransforms_ext_3");
    }

  }
}
