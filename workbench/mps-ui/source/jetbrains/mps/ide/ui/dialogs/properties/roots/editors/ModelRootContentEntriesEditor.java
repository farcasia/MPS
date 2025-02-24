/*
 * Copyright 2003-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.ide.ui.dialogs.properties.roots.editors;

import com.intellij.icons.AllIcons.Modules;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.roots.ui.componentsList.components.ScrollablePanel;
import com.intellij.openapi.roots.ui.componentsList.layout.VerticalStackLayout;
import com.intellij.openapi.roots.ui.configuration.actions.IconWithTextAction;
import com.intellij.openapi.ui.Splitter;
import com.intellij.openapi.ui.popup.JBPopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.ui.popup.PopupStep;
import com.intellij.openapi.ui.popup.util.BaseListPopupStep;
import com.intellij.openapi.util.Disposer;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.ScrollPaneFactory;
import com.intellij.ui.awt.RelativePoint;
import com.intellij.ui.components.JBPanel;
import com.intellij.ui.roots.ToolbarPanel;
import com.intellij.util.ui.JBUI;
import com.intellij.util.ui.UIUtil;
import jetbrains.mps.extapi.persistence.FileBasedModelRoot;
import jetbrains.mps.ide.ui.dialogs.properties.PropertiesBundle;
import jetbrains.mps.ide.ui.dialogs.properties.roots.editors.ModelRootEntryContainer.ContentEntryEditorListener;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import jetbrains.mps.persistence.MementoImpl;
import jetbrains.mps.persistence.PersistenceRegistry;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.project.structure.model.ModelRootDescriptor;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import jetbrains.mps.smodel.ModelAccessHelper;
import jetbrains.mps.vfs.FileSystemExtPoint;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.module.SRepository;
import org.jetbrains.mps.openapi.persistence.Memento;
import org.jetbrains.mps.openapi.persistence.ModelRoot;
import org.jetbrains.mps.openapi.ui.persistence.ModelRootEntry;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static com.intellij.openapi.vfs.VfsUtilCore.isAncestor;

/**
 * UIComponent which contains all the module roots.
 * It is located in the module properties dialog.
 */
public class ModelRootContentEntriesEditor implements Disposable {
  private static final Color BACKGROUND_COLOR = UIUtil.getListBackground();

  private final ModuleDescriptor myModuleDescriptor;
  private final SRepository myRepository;
  private final ModelRootEntryPersistence myRootEntryPersistence;
  private final List<ModelRootEntryContainer> myModelRootEntries = new ArrayList<>();
  private ModelRootEntryContainer myFocusedModelRootEntryContainer;
  private final MyContentEntryEditorListener myEditorListener = new MyContentEntryEditorListener();

  private JPanel myEditorsListPanel;
  private JBPanel myEditorPanel;
  private JBPanel myMainPanel;
  private IFile myDefaultFolder;

  public ModelRootContentEntriesEditor(ModuleDescriptor moduleDescriptor, SRepository repository) {
    myModuleDescriptor = moduleDescriptor;
    myRepository = repository;
    myRootEntryPersistence = new ModelRootEntryPersistence().initFromEP();
    for (ModelRootDescriptor descriptor : myModuleDescriptor.getModelRootDescriptors()) {
      ModelRootEntry entry = myRootEntryPersistence.getModelRootEntry(descriptor);
      Disposer.register(this, entry);
      ModelRootEntryContainer container = new ModelRootEntryContainer(entry);
      container.addContentEntryEditorListener(myEditorListener);
      myModelRootEntries.add(container);
    }
    initUI();
  }

  private AnAction getContentEntryActions() {
    final List<AddContentEntryAction> list = new ArrayList<>();
    for (String type : myRootEntryPersistence.getModelRootTypes()) {
      list.add(new AddContentEntryAction(type));
    }

    return new IconWithTextAction(
        PropertiesBundle.message("module.common.roots.add.title"),
        PropertiesBundle.message("module.common.roots.add.tip"),
        Modules.AddContentEntry) {
      @Override
      public void actionPerformed(final AnActionEvent e) {
        if (list.size() == 1) {
          myRepository.getModelAccess().runReadAction(() -> list.get(0).actionPerformed(e));
          return;
        }
        final JBPopup popup = JBPopupFactory.getInstance().createListPopup(
            new BaseListPopupStep<AddContentEntryAction>(null, list) {
              @Override
              public Icon getIconFor(AddContentEntryAction aValue) {
                return aValue.getTemplatePresentation().getIcon();
              }

              @Override
              public boolean hasSubstep(AddContentEntryAction selectedValue) {
                return false;
              }

              @Override
              public boolean isMnemonicsNavigationEnabled() {
                return true;
              }

              @Override
              public PopupStep onChosen(final AddContentEntryAction selectedValue, final boolean finalChoice) {
                return doFinalStep(() -> selectedValue.actionPerformed(e));
              }

              @Override
              @NotNull
              public String getTextFor(AddContentEntryAction value) {
                return value.getTemplatePresentation().getText();
              }
            });
        popup.show(new RelativePoint(myEditorsListPanel, new Point(0, 0)));
      }
    };
  }

  public void initUI() {
    myMainPanel = new JBPanel(new BorderLayout());
    myMainPanel.setPreferredSize(new Dimension(300, 300));

    final JBPanel entriesPanel = new JBPanel(new BorderLayout());

    final DefaultActionGroup group = new DefaultActionGroup();
    group.add(getContentEntryActions());

    myEditorsListPanel = new ScrollablePanel(new VerticalStackLayout());
    myEditorsListPanel.setBackground(BACKGROUND_COLOR);
    JScrollPane scrollPane = ScrollPaneFactory.createScrollPane(myEditorsListPanel);
    scrollPane.setPreferredSize(new Dimension(250, 300));
    entriesPanel.add(new ToolbarPanel(scrollPane, group), BorderLayout.CENTER);

    Splitter splitter = new Splitter(false);
    splitter.setHonorComponentsMinimumSize(true);
    myMainPanel.add(splitter, BorderLayout.CENTER);

    final JBPanel editorsPanel = new JBPanel(new GridBagLayout());
    splitter.setFirstComponent(editorsPanel);
    editorsPanel.add(entriesPanel,
        new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, JBUI.emptyInsets(), 0, 0));

    final JBPanel editorPanel = new JBPanel(new BorderLayout());
    editorPanel.setBorder(BorderFactory.createEtchedBorder());
    myEditorPanel = new JBPanel(new BorderLayout());
    editorPanel.add(myEditorPanel, BorderLayout.CENTER);
    splitter.setSecondComponent(editorPanel);

    for (ModelRootEntryContainer entry : myModelRootEntries) {
      myEditorsListPanel.add(entry.getComponent());
    }

    selectEntry(myModelRootEntries.size() > 0 ? myModelRootEntries.get(0) : null);
  }

  private void selectEntry(ModelRootEntryContainer entry) {
    try {
      if (entry != null && entry.equals(myFocusedModelRootEntryContainer)) {
        return;
      }

      if (myFocusedModelRootEntryContainer != null) {
        myFocusedModelRootEntryContainer.setFocused(false);
      }

      if (entry == null) {
        myFocusedModelRootEntryContainer = null;
        myEditorPanel.removeAll();
        return;
      }

      entry.setFocused(true);
      myEditorPanel.removeAll();
      myEditorPanel.add(entry.getEditor().createComponent(), BorderLayout.CENTER);
      myFocusedModelRootEntryContainer = entry;
    } finally {
      myMainPanel.updateUI();
    }
  }

  private void deleteEntry(ModelRootEntryContainer entry) {
    if (myModelRootEntries.contains(entry)) {
      myEditorsListPanel.remove(entry.getComponent());
      int idx = myModelRootEntries.indexOf(entry);
      myModelRootEntries.remove(entry);
      if (myFocusedModelRootEntryContainer.equals(entry)) {
        selectEntry(myModelRootEntries.size() > 0 ?
            myModelRootEntries.get(Math.max(idx - 1, 0))
            : null);
      } else {
        myMainPanel.updateUI();
      }
    }
  }

  public boolean isModified() {
    List<ModelRootDescriptor> newSet = getDescriptors();
    Collection<ModelRootDescriptor> modelRootDescriptors = myModuleDescriptor.getModelRootDescriptors();
    return !(modelRootDescriptors.containsAll(newSet) && newSet.containsAll(modelRootDescriptors));
  }

  public void apply() {
    myModuleDescriptor.getModelRootDescriptors().clear();
    myModuleDescriptor.getModelRootDescriptors().addAll(getDescriptors());
  }

  private List<ModelRootDescriptor> getDescriptors() {
    List<ModelRootDescriptor> descriptors = new LinkedList<>();
    for (ModelRootEntryContainer container : myModelRootEntries) {
      Memento memento = new MementoImpl();
      container.getModelRoot().save(memento);
      descriptors.add(new ModelRootDescriptor(container.getModelRoot().getType(), memento));
    }
    return descriptors;
  }

  public Collection<ModelRoot> getModelRoots() {
    List<ModelRoot> modelRoots = new LinkedList<>();
    for (ModelRootEntryContainer container : myModelRootEntries) {
      modelRoots.add(container.getModelRoot());
    }
    return modelRoots;
  }

  public Collection<ModelRootEntryContainer> getModelRootsEntries() {
    return myModelRootEntries;
  }

  public JComponent getComponent() {
    return myMainPanel;
  }

  @Override
  public void dispose() {
  }

  /** Set default folder for FileBasedModel root content dir if module is not in repository yet */
  public final void setDefaultFolder(IFile defaultFolder) {
    myDefaultFolder = defaultFolder;
  }

  private class AddContentEntryAction extends IconWithTextAction implements DumbAware {
    private String myType;

    AddContentEntryAction(@NotNull String type) {
      super(type);
      myType = type;
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
      ModelRoot modelRoot = PersistenceRegistry.getInstance().getModelRootFactory(myType).create();
      ModelRootEntry entry = myRootEntryPersistence.getModelRootEntry(modelRoot);
      Disposer.register(ModelRootContentEntriesEditor.this, entry);
      if (entry.getModelRoot() instanceof FileBasedModelRoot) {
        if (!checkAndAddFBModelRoot(entry)) {
          return;
        }
      }
      ModelRootEntryContainer container = new ModelRootEntryContainer(entry);
      container.addContentEntryEditorListener(myEditorListener);
      myModelRootEntries.add(container);
      myEditorsListPanel.add(container.getComponent());
      selectEntry(container);
      myEditorsListPanel.revalidate();
      myEditorsListPanel.repaint();
    }

    private boolean checkAndAddFBModelRoot(ModelRootEntry entry) {
      IFile contentRoot = myDefaultFolder != null ? myDefaultFolder : FileSystemExtPoint.getFS().getFile("");
      final SModule module = new ModelAccessHelper(myRepository).runReadAction(() -> myRepository.getModule(myModuleDescriptor.getId()));
      if (module instanceof AbstractModule) {
        contentRoot = ((AbstractModule) module).getModuleSourceDir() == null
            ? ((AbstractModule) module).getDescriptorFile().getParent()
            : ((AbstractModule) module).getModuleSourceDir();
      }

      Set<VirtualFile> candidatesForIntersection = new HashSet<>();
      for (ModelRootEntryContainer existingEntryContainer : myModelRootEntries) {
        if (entry.getClass().equals(existingEntryContainer.getModelRootEntry().getClass())) {
          FileBasedModelRoot existingModelRoot = (FileBasedModelRoot) existingEntryContainer.getModelRootEntry().getModelRoot();
          candidatesForIntersection.add(VirtualFileUtils.getVirtualFile(existingModelRoot.getContentRoot()));
        }
      }
      FileChooserDescriptor fileChooserDescriptor = new FileChooserDescriptor(false, true, true, false, true, false);
      fileChooserDescriptor.setTitle("Choose Root Folder for New Model Root");

      VirtualFile chosen = null;
      while (chosen == null) {
        VirtualFile contentRootVFile = VirtualFileUtils.getProjectVirtualFile(contentRoot);
        VirtualFile[] files = FileChooser.chooseFiles(fileChooserDescriptor, null, null, contentRootVFile);
        if (files.length == 0) {
          return false;
        } else if (files.length > 0) {
          assert files.length == 1; // internal contract of the <code>FileChooser</code>
          chosen = files[0];
          for (VirtualFile candidate : candidatesForIntersection) {
            if (doIntersect(chosen, candidate)) {
              JOptionPane.showMessageDialog(myMainPanel,
                  MessageFormat.format("Can''t create new model root, it intersects with the existing model root: ''{0}''! \nChoose another folder", candidate));
              chosen = null;
              break;
            }
          }
        }
      }

      contentRoot = VirtualFileUtils.toIFile(chosen);
      assert contentRoot != null; // : #toIFile method contract
      ((FileBasedModelRoot) entry.getModelRoot()).setContentRoot(contentRoot.getPath());
      return true;
    }

    private boolean doIntersect(VirtualFile chosen, VirtualFile candidate) {
      return isAncestor(candidate, chosen, true) || isAncestor(candidate, chosen, false);
    }
  }

  private final class MyContentEntryEditorListener implements ContentEntryEditorListener {
    @Override
    public void focused(ModelRootEntryContainer entry) {
      selectEntry(entry);
    }

    @Override
    public void delete(ModelRootEntryContainer entry) {
      deleteEntry(entry);
    }

    @Override
    public void dataChanged(ModelRootEntryContainer entry) {
    }
  }
}
