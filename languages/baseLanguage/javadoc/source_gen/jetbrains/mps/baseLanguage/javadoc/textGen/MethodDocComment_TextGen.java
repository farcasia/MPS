package jetbrains.mps.baseLanguage.javadoc.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class MethodDocComment_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    DocCommentTextGen.docCommentStart(ctx.getPrimaryInput(), ctx);

    for (SNode item : ListSequence.fromList(SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7fae70d3L, 0x4ab5c2019ddc99f3L, "tags"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x757ba20a4c905f8aL, "jetbrains.mps.baseLanguage.javadoc.structure.ParameterBlockDocTag"));
      }
    })) {
      tgs.appendNode(item);
    }
    for (SNode item : SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7faeeb34L, 0x757ba20a4c90eaf9L, "param"))) {
      tgs.appendNode(item);
    }
    for (SNode item : ListSequence.fromList(SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7fae70d3L, 0x4ab5c2019ddc99f3L, "tags"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x514c0f68704ec270L, "jetbrains.mps.baseLanguage.javadoc.structure.ThrowsBlockDocTag"));
      }
    })) {
      tgs.appendNode(item);
    }
    for (SNode item : SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7faeeb34L, 0x514c0f687050918cL, "throwsTag"))) {
      tgs.appendNode(item);
    }
    if (ListSequence.fromList(SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7fae70d3L, 0x4ab5c2019ddc99f3L, "tags"))).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x514c0f687050918eL, "jetbrains.mps.baseLanguage.javadoc.structure.ReturnBlockDocTag"));
      }
    })) {
      tgs.appendNode(ListSequence.fromList(SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7fae70d3L, 0x4ab5c2019ddc99f3L, "tags"))).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x514c0f687050918eL, "jetbrains.mps.baseLanguage.javadoc.structure.ReturnBlockDocTag"));
        }
      }).first());
    } else {
      if ((SLinkOperations.getTarget(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7faeeb34L, 0x514c0f6870509198L, "return")) != null)) {
        tgs.appendNode(SLinkOperations.getTarget(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7faeeb34L, 0x514c0f6870509198L, "return")));
      }
    }

    DocCommentTextGen.docCommentEnd(ctx.getPrimaryInput(), ctx);
    tgs.appendAttributedNode();
  }
}
