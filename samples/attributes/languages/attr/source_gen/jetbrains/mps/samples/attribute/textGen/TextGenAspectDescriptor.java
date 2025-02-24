package jetbrains.mps.samples.attribute.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenAspectBase;
import jetbrains.mps.samples.attribute.structure.LanguageConceptSwitch;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.text.rt.TextGenDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.text.rt.TextGenModelOutline;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.text.TextUnit;
import jetbrains.mps.text.impl.BufferLayoutBuilder;
import jetbrains.mps.text.impl.RegularTextUnit;

public class TextGenAspectDescriptor extends TextGenAspectBase {
  private final LanguageConceptSwitch myIndex = new LanguageConceptSwitch();

  public TextGenAspectDescriptor() {
  }

  @Nullable
  @Override
  public TextGenDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    switch (myIndex.index(concept)) {
      case LanguageConceptSwitch.CommentAttribute:
        return new CommentAttribute_TextGen();
      case LanguageConceptSwitch.CommentAttribute2:
        return new CommentAttribute2_TextGen();
    }
    return null;
  }

  @Override
  public void breakdownToUnits(@NotNull TextGenModelOutline outline) {
    for (SNode root : outline.getModel().getRootNodes()) {
      if (root.getConcept().equals(MetaAdapterFactory.getConcept(0xe8e38af60cf34cc1L, 0xbaa3ba261722e8f3L, 0x33ec18d5113abcd9L, "jetbrains.mps.samples.attribute.structure.HandlerAsRoot"))) {
        String fname = getFileName_HandlerAsRoot(root);
        String ext = getFileExtension_HandlerAsRoot(root);
        outline.registerTextUnit(createTextUnit0((ext == null ? fname : (fname + '.' + ext)), root));
        continue;
      }
    }
  }
  private static String getFileName_HandlerAsRoot(SNode node) {
    return node.getName();
  }
  private static String getFileExtension_HandlerAsRoot(SNode node) {
    return null;
  }
  private static TextUnit createTextUnit0(String filename, SNode node) {
    BufferLayoutBuilder lb = new BufferLayoutBuilder();
    lb.add("HEADER");
    lb.add("IMPORTS");
    lb.add("SEPARATOR");
    lb.add("BODY");
    lb.activate("BODY");
    RegularTextUnit rv = new RegularTextUnit(node, filename, null);
    rv.setBufferLayout(lb.create());
    rv.addContextObject("ctx", Auxiliary.contextObjectInstance_ctx(node));
    return rv;
  }
}
