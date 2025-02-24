package jetbrains.mps.samples.Shapes.behavior;

/*Generated by MPS */

import javax.swing.JPanel;
import org.jetbrains.mps.openapi.model.SNode;
import java.awt.Graphics;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import java.awt.Dimension;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public final class PreviewFactory {

  public static JPanel createPanel(final SNode thisCanvas) {
    return new JPanel() {
      @Override
      protected void paintComponent(final Graphics graphics) {
        super.paintComponent(graphics);
        SNodeOperations.getModel(thisCanvas).getRepository().getModelAccess().runReadAction(new Runnable() {
          public void run() {
            ListSequence.fromList(SLinkOperations.getChildren(thisCanvas, MetaAdapterFactory.getContainmentLink(0x16bafbb4c6cd4cc5L, 0x83327c6de8729b3fL, 0x51dcaa29974fa71dL, 0x51dcaa29974ffa47L, "shapes"))).visitAll(new IVisitor<SNode>() {
              public void visit(SNode it) {
                Shape__BehaviorDescriptor.drawShape_idW6XMzE_hbz.invoke(it, graphics);
              }
            });
          }
        });
      }

      @Override
      public Dimension getPreferredSize() {
        return new Dimension(500, 500);
      }

      @Override
      public Border getBorder() {
        return new TitledBorder("Instant Preview");
      }
    };
  }
}
