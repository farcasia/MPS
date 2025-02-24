package jetbrains.mps.samples.ActionWithProgress.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.progress.ProgressMonitorAdapter;
import org.jetbrains.mps.openapi.module.SRepository;
import com.intellij.util.WaitForProgressToShow;
import com.intellij.openapi.application.ModalityState;
import java.util.concurrent.CyclicBarrier;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.progress.ProgressManager;
import java.util.concurrent.BrokenBarrierException;

public class ModalProgressAction_Action extends BaseAction {
  private static final Icon ICON = null;

  public ModalProgressAction_Action() {
    super("ModalProgressAction", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      Project p = event.getData(CommonDataKeys.PROJECT);
      if (p == null) {
        return false;
      }
    }
    {
      MPSProject p = event.getData(MPSCommonDataKeys.MPS_PROJECT);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    // Indicates whether the progress dialog has the'Cancel' option 
    boolean canBeCanceled = true;

    // This is a common modal task. It can't be sent to the background, but can be canceled  
    // Your code needs to frequently check if the process has been canceled (between every calculation steps)  
    // and handle yourself all steps to revert the action 
    final Task.Modal modalTask = new Task.Modal(event.getData(CommonDataKeys.PROJECT), "Modal cancelable task", canBeCanceled) {
      @Override
      public void run(@NotNull final ProgressIndicator indicator) {
        final ProgressMonitorAdapter adapter = new ProgressMonitorAdapter(indicator);
        final SRepository repository = event.getData(MPSCommonDataKeys.MPS_PROJECT).getRepository();

        adapter.start("Progress in progress...", 9);
        int stepValue = 1;

        // a normal step 
        adapter.step("Do simple work...");
        ModalProgressAction_Action.this.doWork(event);
        adapter.advance(stepValue);
        // Check if progress is canceled 
        if (adapter.isCanceled()) {
          return;
        }

        // ReadAction in step is ok 
        repository.getModelAccess().runReadAction(new Runnable() {
          public void run() {
            adapter.step("Do some work with Read Lock...");
            ModalProgressAction_Action.this.doWork(event);
          }
        });
        adapter.advance(stepValue);
        if (adapter.isCanceled()) {
          return;
        }

        // WriteAction in step is ok 
        repository.getModelAccess().runWriteAction(new Runnable() {
          public void run() {
            adapter.step("Do some work with Write Lock...");
            ModalProgressAction_Action.this.doWork(event);
          }
        });

        adapter.advance(stepValue);
        if (adapter.isCanceled()) {
          return;
        }

        adapter.step("Now will try to do some work with Locks in EDT...");
        ModalProgressAction_Action.this.doWork(event);
        adapter.advance(stepValue);
        if (adapter.isCanceled()) {
          return;
        }

        // The correct way to call command with progress is as follows 
        // The dialog might not show up if the method for the usual read & write locks are used 
        adapter.step("Do some work in command in EDT...");
        WaitForProgressToShow.runOrInvokeAndWaitAboveProgress(new Runnable() {
          public void run() {
            repository.getModelAccess().executeCommand(new Runnable() {
              public void run() {
                ModalProgressAction_Action.this.doWork(event);
              }
            });
          }
        }, ModalityState.defaultModalityState());

        adapter.advance(stepValue);
        if (adapter.isCanceled()) {
          return;
        }

        adapter.step("Do some work with Read Lock in EDT using IDEA API...");
        WaitForProgressToShow.runOrInvokeAndWaitAboveProgress(new Runnable() {
          public void run() {
            repository.getModelAccess().runReadAction(new Runnable() {
              public void run() {
                ModalProgressAction_Action.this.doWork(event);
              }
            });
          }
        });

        adapter.advance(stepValue);
        if (adapter.isCanceled()) {
          return;
        }

        final CyclicBarrier barrier = new CyclicBarrier(2);
        adapter.step("Do some work with Read Lock in EDT using jdk...");
        repository.getModelAccess().runReadInEDT(new Runnable() {
          public void run() {
            ModalProgressAction_Action.this.doWork(event);
            ModalProgressAction_Action.this.block(barrier, event);
          }
        });
        ModalProgressAction_Action.this.block(barrier, event);

        adapter.advance(stepValue);
        if (adapter.isCanceled()) {
          return;
        }

        // Any EDT access lock brokes normal progress behaviour 
        adapter.step("Do some work with Write Lock in EDT using jdk...");
        repository.getModelAccess().runWriteInEDT(new Runnable() {
          public void run() {
            ModalProgressAction_Action.this.doWork(event);
            ModalProgressAction_Action.this.block(barrier, event);
          }
        });
        ModalProgressAction_Action.this.block(barrier, event);

        adapter.advance(stepValue);
        if (adapter.isCanceled()) {
          return;
        }

        // Any EDT access lock brokes normal progress behaviour 

        ModalProgressAction_Action.this.doWork(event);

        adapter.step("Finishing...");
        ModalProgressAction_Action.this.doWork(event);
        adapter.advance(stepValue);
        if (adapter.isCanceled()) {
          return;
        }

        adapter.done();
      }

      @Override
      public void onCancel() {
        super.onCancel();
        // Needs to handle reverting changes for all the finished steps 
        // This method does not interrupt the steps - steps must be either short or have such interruption capability 
      }
    };

    // The execute() method of actions must be very quick 
    // so every long calculation must be invoked outside of this method like this: 
    ApplicationManager.getApplication().invokeLater(new Runnable() {
      public void run() {
        ProgressManager.getInstance().run(modalTask);
      }
    });
  }
  private void block(CyclicBarrier barrier, final AnActionEvent event) {
    try {
      barrier.await();
    } catch (BrokenBarrierException e) {
    } catch (InterruptedException e) {
    }
  }
  private void doWork(final AnActionEvent event) {
    // 42 because it is ultimate answer to everything =) 
    ModalProgressAction_Action.this.fib(44, event);
  }
  private int fib(int n, final AnActionEvent event) {
    // Very ineffective implementation with exponential time complexity 
    if (n < 1) {
      throw new IllegalArgumentException();
    }

    if (n == 1) {
      return 0;
    } else if (n == 2 || n == 3) {
      return 1;
    }

    return ModalProgressAction_Action.this.fib(n - 1, event) + ModalProgressAction_Action.this.fib(n - 2, event);
  }
}
