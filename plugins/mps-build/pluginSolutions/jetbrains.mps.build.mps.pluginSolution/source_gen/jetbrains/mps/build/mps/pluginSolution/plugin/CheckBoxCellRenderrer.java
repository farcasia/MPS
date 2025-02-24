package jetbrains.mps.build.mps.pluginSolution.plugin;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import com.intellij.util.ui.UIUtil;
import java.awt.Component;
import javax.swing.JTree;
import java.awt.Dimension;

public class CheckBoxCellRenderrer extends JPanel implements TreeCellRenderer {
  private final JCheckBox myCheckBox;
  private final JLabel myLabel;
  public CheckBoxCellRenderrer() {
    super(new FlowLayout());
    this.myCheckBox = new JCheckBox();
    this.myCheckBox.setBackground(UIUtil.getTreeBackground());
    this.myLabel = new JLabel();
    this.add(this.myCheckBox);
    this.add(this.myLabel);
  }
  @Override
  public Component getTreeCellRendererComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
    CheckBoxNode node = ((CheckBoxNode) value);
    this.myLabel.setText(node.getNodeText());
    this.myLabel.setIcon(node.getIconNonFinal(expanded));
    this.myCheckBox.setSelected(node.isChecked());
    return this;
  }
  @Override
  public Dimension getPreferredSize() {
    Dimension checkBoxDim = this.myCheckBox.getPreferredSize();
    Dimension labelDim = this.myLabel.getPreferredSize();
    return new Dimension(checkBoxDim.width + labelDim.width, Math.max(checkBoxDim.height, labelDim.height));
  }
  @Override
  public void doLayout() {
    Dimension checkBoxDim = this.myCheckBox.getPreferredSize();
    Dimension labelDim = this.myLabel.getPreferredSize();
    int baseline = Math.max(labelDim.height, checkBoxDim.height) / 2;
    this.myCheckBox.setLocation(0, baseline - checkBoxDim.height / 2);
    this.myCheckBox.setSize(checkBoxDim.width, checkBoxDim.height);
    this.myLabel.setLocation(checkBoxDim.width, baseline - labelDim.height / 2);
    this.myLabel.setSize(labelDim.width, labelDim.height);
  }
}
