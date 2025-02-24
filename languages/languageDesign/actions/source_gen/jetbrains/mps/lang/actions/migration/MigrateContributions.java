package jetbrains.mps.lang.actions.migration;

/*Generated by MPS */

import jetbrains.mps.lang.migration.runtime.base.MigrationScriptBase;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.module.SModule;
import java.util.Map;
import jetbrains.mps.lang.migration.runtime.base.MigrationScriptReference;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.migration.runtime.base.Problem;
import org.jetbrains.mps.openapi.module.SearchScope;
import jetbrains.mps.lang.smodel.query.runtime.CommandUtil;
import jetbrains.mps.lang.smodel.query.runtime.QueryExecutionContext;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class MigrateContributions extends MigrationScriptBase {
  public String getCaption() {
    return "MigrateContributions";
  }
  @Override
  public boolean isRerunnable() {
    return false;
  }
  public SNode execute(final SModule m) {
    doExecute(m);
    return null;
  }
  public void doExecute(final SModule m) {
    final Map<SModule, SNode> actions = getDataCollector().collectData(m, new MigrationScriptReference(MetaAdapterFactory.getLanguage(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, "jetbrains.mps.lang.actions"), 0));
    new SideTransformActionsMigrationHelper(m, false).migrate();
  }
  @Override
  public Iterable<Problem> check(SModule m) {
    {
      final SearchScope scope = CommandUtil.createScope(m);
      QueryExecutionContext context = new QueryExecutionContext() {
        public SearchScope getDefaultSearchScope() {
          return scope;
        }
      };
      return CollectionSequence.fromCollection(CommandUtil.instances(CommandUtil.selectScope(null, context), MetaAdapterFactory.getInterfaceConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x7650d61a085f9929L, "jetbrains.mps.lang.actions.structure.ICouldBeAnnotatedWithMigrateManually"), false)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return (AttributeOperations.getAttribute(it, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x7ce019826543db5L, "jetbrains.mps.lang.actions.structure.MigrateManuallyAnnotation"))) != null);
        }
      }).select(new ISelector<SNode, MigrateManuallyProblem>() {
        public MigrateManuallyProblem select(SNode it) {
          return new MigrateManuallyProblem(it);
        }
      });
    }
  }
  public Iterable<MigrationScriptReference> requiresData() {
    return ListSequence.fromListAndArray(new ArrayList<MigrationScriptReference>(), new MigrationScriptReference(MetaAdapterFactory.getLanguage(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, "jetbrains.mps.lang.actions"), 0));
  }
  public MigrationScriptReference getDescriptor() {
    return new MigrationScriptReference(MetaAdapterFactory.getLanguage(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, "jetbrains.mps.lang.actions"), 1);
  }

}
