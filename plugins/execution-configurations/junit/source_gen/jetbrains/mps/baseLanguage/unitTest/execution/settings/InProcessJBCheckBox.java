package jetbrains.mps.baseLanguage.unitTest.execution.settings;

/*Generated by MPS */

import com.intellij.ui.components.JBCheckBox;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import org.jetbrains.annotations.NotNull;
import java.awt.Component;

public final class InProcessJBCheckBox extends JBCheckBox {
  private final List<InProcessJBCheckBox.Updater> myUpdaters = ListSequence.fromList(new LinkedList<InProcessJBCheckBox.Updater>());

  public InProcessJBCheckBox(String text) {
    super(text, true);
    this.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent p0) {
        forceUpdate();
      }
    });
  }

  public void forceUpdate() {
    ListSequence.fromList(myUpdaters).visitAll(new IVisitor<InProcessJBCheckBox.Updater>() {
      public void visit(InProcessJBCheckBox.Updater it) {
        it.updateMe();
      }
    });
  }

  public void registerUpdater(@NotNull InProcessJBCheckBox.Updater updater) {
    ListSequence.fromList(myUpdaters).addElement(updater);
  }

  /**
   * default choice
   */
  public void registerDisableIffSelectedUpdater(@NotNull Component component) {
    ListSequence.fromList(myUpdaters).addElement(genDisableIfSelectedUpdater(component));
  }

  @NotNull
  public InProcessJBCheckBox.Updater genDisableIfSelectedUpdater(Component me) {
    return new InProcessJBCheckBox.DisableIffSelected(me);
  }

  public interface Updater {
    void updateMe();
  }

  /*package*/ final class DisableIffSelected implements InProcessJBCheckBox.Updater {
    private final Component myComp;
    private DisableIffSelected(@NotNull Component me) {
      myComp = me;
    }

    @Override
    public void updateMe() {
      myComp.setEnabled(!(InProcessJBCheckBox.this.isSelected()));
    }
  }
}
