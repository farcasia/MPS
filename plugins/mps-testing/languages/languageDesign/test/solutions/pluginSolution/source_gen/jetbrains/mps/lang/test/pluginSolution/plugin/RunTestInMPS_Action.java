package jetbrains.mps.lang.test.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestCase__BehaviorDescriptor;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestMethod__BehaviorDescriptor;
import jetbrains.mps.classloading.ClassLoaderManager;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import jetbrains.mps.lang.test.behavior.NodesTestCase__BehaviorDescriptor;

public class RunTestInMPS_Action extends BaseAction {
  private static final Icon ICON = null;

  public RunTestInMPS_Action() {
    super("Run Test in MPS Process", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return SNodeOperations.isInstanceOf(((SNode) MapSequence.fromMap(_params).get("node")), MetaAdapterFactory.getConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x11b55b49e46L, "jetbrains.mps.lang.test.structure.NodesTestCase"));
  }
  @Override
  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    this.setEnabledState(event.getPresentation(), this.isApplicable(event, _params));
  }
  @Override
  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SModel model = event.getData(MPSCommonDataKeys.CONTEXT_MODEL);
      MapSequence.fromMap(_params).put("model", model);
      if (model == null) {
        return false;
      }
    }
    {
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      MapSequence.fromMap(_params).put("node", node);
      if (node == null) {
        return false;
      }
    }
    {
      Project p = event.getData(CommonDataKeys.PROJECT);
      MapSequence.fromMap(_params).put("project", p);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    final Set<SNode> tests = SetSequence.fromSet(new HashSet<SNode>());
    SetSequence.fromSet(tests).addSequence(ListSequence.fromList(ITestCase__BehaviorDescriptor.getTestSet_idhGB2z8L.invoke(SNodeOperations.cast(((SNode) MapSequence.fromMap(_params).get("node")), MetaAdapterFactory.getConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x11b55b49e46L, "jetbrains.mps.lang.test.structure.NodesTestCase")))).toListSequence());
    for (SNode test : SetSequence.fromSet(tests)) {
      RunTestInMPS_Action.this.runTest(test, _params);
    }
  }
  /*package*/ void runTest(final SNode test, final Map<String, Object> _params) {
    try {
      final String className = ITestCase__BehaviorDescriptor.getClassName_idhGBnqtL.invoke(ITestMethod__BehaviorDescriptor.getTestCase_idhGBgWVd.invoke(test));
      final String testName = ITestMethod__BehaviorDescriptor.getTestName_idhGBohAB.invoke(test);
      System.out.println("Test " + className + "." + testName);
      final Class c = ClassLoaderManager.getInstance().getClass(((SModel) MapSequence.fromMap(_params).get("model")).getModule(), ITestCase__BehaviorDescriptor.getClassName_idhGBnqtL.invoke(ITestMethod__BehaviorDescriptor.getTestCase_idhGBgWVd.invoke(test)));
      final Method meth = c.getMethod("runTest", String.class, String.class, Boolean.TYPE);
      Constructor ctor = c.getConstructor(Project.class, SModel.class);
      final Object testClass = ctor.newInstance(((Project) MapSequence.fromMap(_params).get("project")), ((SModel) MapSequence.fromMap(_params).get("model")));
      Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
          try {
            meth.invoke(testClass, className + "$" + NodesTestCase__BehaviorDescriptor.getTestBodyName_idhOw0ICJ.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x11b55b49e46L, "jetbrains.mps.lang.test.structure.NodesTestCase"))), testName, true);
          } catch (Throwable e) {
            e.printStackTrace();
          }
        }
      });
      thread.start();
    } catch (Throwable e) {
      e.printStackTrace();
    }
  }
}
