package jetbrains.mps.testbench.junit.suites;

/*Generated by MPS */

import org.jetbrains.mps.openapi.module.SModule;
import java.util.List;
import jetbrains.mps.checkers.IChecker;
import jetbrains.mps.errors.item.IssueKindReportItem;
import jetbrains.mps.testbench.PerformanceMessenger;
import jetbrains.mps.smodel.ModelAccessHelper;
import jetbrains.mps.util.Computable;
import jetbrains.mps.checkers.ModelCheckerBuilder;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import org.jetbrains.mps.openapi.util.Consumer;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.errors.MessageStatus;
import jetbrains.mps.errors.item.NodeReportItem;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.errors.item.ModelReportItem;
import org.jetbrains.mps.openapi.model.SModel;

public abstract class BaseCheckerTest extends BaseCheckModulesTest {

  public BaseCheckerTest(SModule module) {
    super(module);
  }

  public void runCheck(final List<IChecker<?, ? extends IssueKindReportItem>> checkers, PerformanceMessenger stats, String errorMessage) {
    final CheckingTestStatistic statistic = new CheckingTestStatistic();
    List<String> errors = new ModelAccessHelper(BaseCheckModulesTest.getContextProject().getModelAccess()).runReadAction(new Computable<List<String>>() {
      public List<String> compute() {
        return BaseCheckerTest.this.applyChecker(myModule, new ModelCheckerBuilder.ModelsExtractorImpl().excludeGenerators(), checkers, statistic);
      }
    });

    if (stats != null) {
      stats.report("Errors", statistic.getNumErrors());
      stats.report("Warnings", statistic.getNumWarnings());
    }
    Assert.assertTrue(errorMessage + ":\n" + formatErrors(errors), errors.isEmpty());
  }

  public List<String> applyChecker(SModule module, ModelCheckerBuilder.ModelExtractor modelExtractor, final List<? extends IChecker<?, ? extends IssueKindReportItem>> checkers, CheckingTestStatistic statistic) {
    final List<String> errors = new ArrayList<String>();
    final Set<IssueKindReportItem> reportItems = SetSequence.fromSet(new HashSet<IssueKindReportItem>());


    new ModelCheckerBuilder(modelExtractor).createChecker(checkers).check(ModelCheckerBuilder.ItemsToCheck.forSingleModule(module), module.getRepository(), new Consumer<IssueKindReportItem>() {
      public void consume(IssueKindReportItem reportItem) {
        SetSequence.fromSet(reportItems).addElement(reportItem);
      }
    }, new EmptyProgressMonitor());

    for (IssueKindReportItem reportItem : reportItems) {
      if (reportItem.getSeverity().equals(MessageStatus.ERROR)) {
        statistic.reportError();
        if (NodeReportItem.FLAVOUR_NODE.canGet(reportItem)) {
          SNode node = NodeReportItem.FLAVOUR_NODE.tryToGet(reportItem).resolve(module.getRepository());
          errors.add("Error message: " + reportItem.getMessage() + "   model: " + node.getModel().getName().getValue() + " root: " + node.getContainingRoot() + " node: " + node);
        } else if (ModelReportItem.FLAVOUR_MODEL.canGet(reportItem)) {
          SModel model = ModelReportItem.FLAVOUR_MODEL.tryToGet(reportItem).resolve(module.getRepository());
          errors.add("Error message: " + reportItem.getMessage() + "   model: " + model);
        } else {
          errors.add("Error message: " + reportItem.getMessage());
        }
      }
      if (reportItem.getSeverity().equals(MessageStatus.WARNING)) {
        statistic.reportWarning();
      }
    }
    return errors;
  }

  public String formatErrors(List<String> errors) {
    StringBuilder sb = new StringBuilder();
    String sep = "";
    for (String er : errors) {
      sb.append(sep).append(er);
      sep = "\n";
    }
    return sb.toString();
  }

}
