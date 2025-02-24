package jetbrains.mps.migration.workbench.plugin;

/*Generated by MPS */

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.project.Project;
import javax.swing.JComponent;
import javax.swing.JCheckBox;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NonNls;
import javax.swing.JPanel;
import com.intellij.openapi.ui.VerticalFlowLayout;
import javax.swing.JScrollPane;
import com.intellij.ui.ScrollPaneFactory;
import java.awt.Dimension;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import com.intellij.ui.IdeBorderFactory;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import javax.swing.JTable;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.List;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.language.SLanguage;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.table.AbstractTableModel;

public class MigrationTestConfigDialog extends DialogWrapper {
  private Project myProject;
  private JComponent myComponent;
  private JCheckBox myPreErrorCB;
  private MigrationTestConfigDialog.Result myResult = new MigrationTestConfigDialog.Result();

  public MigrationTestConfigDialog(Project project) {
    super(project);
    setTitle("Test Config Options");
    setOKButtonText("&OK");
    setCancelButtonText("Ca&ncel");
    this.myProject = project;
    this.myComponent = this.createPanel();
    init();
  }

  @Nullable
  @NonNls
  @Override
  protected String getDimensionServiceKey() {
    return MigrationTestConfigDialog.class.getCanonicalName();
  }

  @Nullable
  @Override
  protected JComponent createCenterPanel() {
    return myComponent;
  }

  public JComponent createPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(new VerticalFlowLayout());

    panel.add(createRequiredPanel());
    panel.add(createCleanupPanel());
    panel.add(createPreCheckPanel());
    panel.add(createProjectMigPanel());
    panel.add(createLanguageMigPanel());
    panel.add(createPostCheckPanel());

    JScrollPane scrollPane = ScrollPaneFactory.createScrollPane(panel);
    scrollPane.setAutoscrolls(true);
    scrollPane.setPreferredSize(new Dimension(400, 400));

    return scrollPane;
  }

  private JCheckBox createRequiredPanel() {
    JCheckBox requiredCB = new JCheckBox("migration reqired");
    requiredCB.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent p0) {
        if (p0.getID() == ItemEvent.SELECTED) {
          myResult.required = true;
        }
        if (p0.getID() == ItemEvent.DESELECTED) {
          myResult.required = false;
        }
      }
    });
    requiredCB.setSelected(true);
    return requiredCB;
  }

  private JPanel createCleanupPanel() {
    JPanel panel = new JPanel();
    panel.setBorder(IdeBorderFactory.createTitledBorder("Cleanup"));
    panel.setLayout(new VerticalFlowLayout());
    // todo 
    return panel;
  }

  private JPanel createPreCheckPanel() {
    JPanel panel = new JPanel();
    panel.setBorder(IdeBorderFactory.createTitledBorder("Pre-check"));
    panel.setLayout(new VerticalFlowLayout());

    JRadioButton rb1 = new JRadioButton(new MigrationTestConfigDialog.MyPreErrRadioAction("none", 0));
    JRadioButton rb2 = new JRadioButton(new MigrationTestConfigDialog.MyPreErrRadioAction("broken ref - recoverable", 1));
    JRadioButton rb3 = new JRadioButton(new MigrationTestConfigDialog.MyPreErrRadioAction("missing migration - non-recoverable", 2));
    ButtonGroup bg = new ButtonGroup();
    bg.add(rb1);
    bg.add(rb2);
    bg.add(rb3);

    JPanel errPanel = new JPanel(new GridLayout(0, 1));
    errPanel.setBorder(BorderFactory.createTitledBorder("Error"));
    errPanel.add(rb1);
    errPanel.add(rb2);
    errPanel.add(rb3);

    rb1.setSelected(true);

    panel.add(errPanel);
    return panel;
  }

  private JPanel createProjectMigPanel() {
    JPanel panel = new JPanel();
    panel.setBorder(IdeBorderFactory.createTitledBorder("Project step"));
    panel.setLayout(new VerticalFlowLayout());

    ListSequence.fromList(myResult.pMigrations).addElement(new MigrationTestConfigDialog.Result.PMigration("migration1", false, false));
    ListSequence.fromList(myResult.pMigrations).addElement(new MigrationTestConfigDialog.Result.PMigration("migration2", false, false));
    ListSequence.fromList(myResult.pMigrations).addElement(new MigrationTestConfigDialog.Result.PMigration("migration3", false, false));

    JTable table = new JTable(new MigrationTestConfigDialog.PMigTableModel());
    table.setPreferredScrollableViewportSize(new Dimension(400, 100));
    table.setFillsViewportHeight(true);
    JScrollPane scrollPane = new JScrollPane(table);
    panel.add(scrollPane);

    return panel;
  }

  private JPanel createLanguageMigPanel() {
    JPanel panel = new JPanel();
    panel.setBorder(IdeBorderFactory.createTitledBorder("Language Step"));
    panel.setLayout(new VerticalFlowLayout());

    ListSequence.fromList(myResult.lMigrations).addElement(new MigrationTestConfigDialog.Result.LMigration(MetaAdapterFactory.getLanguage(1, 1, "Language1"), 0, false, new boolean[]{true, true, true}));
    ListSequence.fromList(myResult.lMigrations).addElement(new MigrationTestConfigDialog.Result.LMigration(MetaAdapterFactory.getLanguage(1, 1, "Language1"), 1, false, new boolean[]{true, true, true}));
    ListSequence.fromList(myResult.lMigrations).addElement(new MigrationTestConfigDialog.Result.LMigration(MetaAdapterFactory.getLanguage(2, 2, "Language2"), 0, false, new boolean[]{true, true, true}));

    JTable table = new JTable(new MigrationTestConfigDialog.LMigTableModel());
    table.setPreferredScrollableViewportSize(new Dimension(400, 100));
    table.setFillsViewportHeight(true);
    JScrollPane scrollPane = new JScrollPane(table);
    panel.add(scrollPane);

    return panel;
  }

  private JPanel createPostCheckPanel() {
    JPanel panel = new JPanel();
    panel.setBorder(IdeBorderFactory.createTitledBorder("Post-check (not implemented)"));
    panel.setLayout(new VerticalFlowLayout());

    JRadioButton rb1 = new JRadioButton(new MigrationTestConfigDialog.MyPostErrRadioAction("none", 0));
    JRadioButton rb2 = new JRadioButton(new MigrationTestConfigDialog.MyPostErrRadioAction("not migrated code", 1));
    ButtonGroup bg = new ButtonGroup();
    bg.add(rb1);
    bg.add(rb2);

    JPanel errPanel = new JPanel(new GridLayout(0, 1));
    errPanel.setBorder(BorderFactory.createTitledBorder("Error"));
    errPanel.add(rb1);
    errPanel.add(rb2);

    rb1.setSelected(true);

    panel.add(errPanel);
    return panel;
  }

  public MigrationTestConfigDialog.Result getResult() {
    return myResult;
  }

  public static class Result {
    public boolean required = true;
    public int preError;
    public int hasMissingMigrations;
    public int postError;
    public List<MigrationTestConfigDialog.Result.PMigration> pMigrations = ListSequence.fromList(new ArrayList<MigrationTestConfigDialog.Result.PMigration>());
    public List<MigrationTestConfigDialog.Result.LMigration> lMigrations = ListSequence.fromList(new ArrayList<MigrationTestConfigDialog.Result.LMigration>());

    public static class PMigration {
      public String id;
      public boolean hasOptions;
      public boolean isCleanup = false;
      public boolean error;

      public PMigration(String id1, boolean hasOptions1, boolean error1) {
        // todo cleanup 
        id = id1;
        hasOptions = hasOptions1;
        error = error1;
      }
    }

    public static class LMigration {
      public SLanguage language;
      public boolean error;
      public boolean[] applyToModules = new boolean[3];
      public int version;

      public LMigration(SLanguage l, int version, boolean error1, boolean[] applyTo) {
        language = l;
        error = error1;
        applyToModules = applyTo;
        this.version = version;
      }
    }
  }

  private class MyPreErrRadioAction extends AbstractAction {
    private final int myVal;
    public MyPreErrRadioAction(String cap, int val) {
      super(cap);
      myVal = val;
    }
    public void actionPerformed(ActionEvent e) {
      myResult.preError = myVal;
    }
  }

  private class MyPostErrRadioAction extends AbstractAction {
    private final int myVal;
    public MyPostErrRadioAction(String cap, int val) {
      super(cap);
      myVal = val;
    }
    public void actionPerformed(ActionEvent e) {
      myResult.postError = myVal;
    }
  }

  private class PMigTableModel extends AbstractTableModel {
    private String[] columnNames = {"ID", "hasOptions", "throws error"};

    public int getColumnCount() {
      return columnNames.length;
    }

    public int getRowCount() {
      return ListSequence.fromList(myResult.pMigrations).count();
    }

    public String getColumnName(int col) {
      return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
      MigrationTestConfigDialog.Result.PMigration migration = ListSequence.fromList(myResult.pMigrations).getElement(row);
      if (col == 0) {
        return migration.id;
      }
      if (col == 1) {
        return migration.hasOptions;
      }
      if (col == 2) {
        return migration.error;
      }
      throw new IllegalArgumentException(col + "");
    }

    public Class getColumnClass(int c) {
      return getValueAt(0, c).getClass();
    }

    public boolean isCellEditable(int row, int col) {
      return true;
    }

    public void setValueAt(Object value, int row, int col) {
      MigrationTestConfigDialog.Result.PMigration migration = ListSequence.fromList(myResult.pMigrations).getElement(row);
      if (col == 0) {
        migration.id = ((String) value);
        fireTableCellUpdated(row, col);
        return;
      }
      if (col == 1) {
        migration.hasOptions = ((Boolean) value);
        fireTableCellUpdated(row, col);
        return;
      }
      if (col == 2) {
        migration.error = ((Boolean) value);
        fireTableCellUpdated(row, col);
        return;
      }
      throw new IllegalArgumentException(col + "");
    }
  }

  private class LMigTableModel extends AbstractTableModel {
    private String[] columnNames = {"language", "throws error", "module1", "module2", "module3"};

    public int getColumnCount() {
      return columnNames.length;
    }

    public int getRowCount() {
      return ListSequence.fromList(myResult.lMigrations).count();
    }

    public String getColumnName(int col) {
      return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
      MigrationTestConfigDialog.Result.LMigration migration = ListSequence.fromList(myResult.lMigrations).getElement(row);
      if (col == 0) {
        return migration.language;
      }
      if (col == 1) {
        return migration.error;
      }
      if (col == 2) {
        return migration.applyToModules[0];
      }
      if (col == 3) {
        return migration.applyToModules[1];
      }
      if (col == 4) {
        return migration.applyToModules[2];
      }
      throw new IllegalArgumentException(col + "");
    }

    public Class getColumnClass(int c) {
      return getValueAt(0, c).getClass();
    }

    public boolean isCellEditable(int row, int col) {
      return col != 0;
    }

    public void setValueAt(Object value, int row, int col) {
      MigrationTestConfigDialog.Result.LMigration migration = ListSequence.fromList(myResult.lMigrations).getElement(row);
      if (col == 0) {
        throw new IllegalArgumentException();
      }
      if (col == 1) {
        migration.error = ((Boolean) value);
        fireTableCellUpdated(row, col);
        return;
      }
      if (col == 2) {
        migration.applyToModules[0] = ((Boolean) value);
        fireTableCellUpdated(row, col);
        return;
      }
      if (col == 3) {
        migration.applyToModules[1] = ((Boolean) value);
        fireTableCellUpdated(row, col);
        return;
      }
      if (col == 4) {
        migration.applyToModules[2] = ((Boolean) value);
        fireTableCellUpdated(row, col);
        return;
      }
      throw new IllegalArgumentException(col + "");
    }
  }
}
