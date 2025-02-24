package jetbrains.mps.ide.make.actions;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.JLabel;
import jetbrains.mps.icons.MPSIcons;
import javax.swing.SwingConstants;
import java.awt.Font;
import com.intellij.util.ui.UIUtil;
import com.intellij.openapi.util.SystemInfo;
import com.intellij.util.SystemProperties;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*package*/ class TransientModelsPanel extends JPanel {
  private final TransientModelsWidget myWidget;
  private JLabel label;

  public TransientModelsPanel(TransientModelsWidget widget) {
    myWidget = widget;
    this.label = new JLabel(widget.getMaxPossibleText(), MPSIcons.Nodes.TransientModule, SwingConstants.LEFT);
    this.label.setIconTextGap(0);
    Font labelFont = UIUtil.getLabelFont();
    boolean framedStyle = SystemInfo.isMac || !(SystemProperties.getBooleanProperty("idea.ui.mem.use", false));
    this.label.setFont((framedStyle ? labelFont.deriveFont(11.0f) : labelFont));
    this.label.setPreferredSize(this.label.getPreferredSize());
    this.label.setText(myWidget.getText());
    this.add(this.label);

    putClientProperty(UIUtil.CENTER_TOOLTIP_DEFAULT, Boolean.TRUE);
    setToolTipText(myWidget.getTooltipText());
    addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(final MouseEvent e) {
        myWidget.getClickConsumer().consume(e);
      }
    });
    setOpaque(false);
  }
  public void update() {
    this.label.setText(myWidget.getText());
    this.label.setIcon(myWidget.getIcon());
  }
  @Override
  public String getToolTipText() {
    return myWidget.getTooltipText();
  }
}
