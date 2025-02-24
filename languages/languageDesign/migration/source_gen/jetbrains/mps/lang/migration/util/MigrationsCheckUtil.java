package jetbrains.mps.lang.migration.util;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.LinkedList;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.migration.behavior.IMigrationUnit__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import java.util.Map;
import java.util.Collection;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.smodel.Language;
import java.util.Collections;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModuleOperations;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.ArrayList;

public class MigrationsCheckUtil {
  private static <T> boolean hasCycles(final _FunctionTypes._return_P1_E0<? extends Iterable<T>, ? super T> neighbours, T startPoint, final List<T> parents, final List<T> visited) {
    if (ListSequence.fromList(visited).contains(startPoint)) {
      return false;
    }
    if (ListSequence.fromList(parents).contains(startPoint)) {
      return true;
    }
    ListSequence.fromList(parents).insertElement(0, startPoint);
    if (Sequence.fromIterable(neighbours.invoke(startPoint)).any(new IWhereFilter<T>() {
      public boolean accept(T it) {
        return hasCycles(neighbours, it, parents, visited);
      }
    })) {
      return true;
    }
    ListSequence.fromList(parents).removeElementAt(0);
    ListSequence.fromList(visited).addElement(startPoint);
    return false;
  }
  private static <T> boolean hasCycles(_FunctionTypes._return_P1_E0<? extends Iterable<T>, ? super T> neighbours, T startPoint) {
    return hasCycles(neighbours, startPoint, ListSequence.fromList(new LinkedList<T>()), ListSequence.fromList(new LinkedList<T>()));
  }
  public static boolean hasCycles(SNode migrationScript) {
    return hasCycles(new _FunctionTypes._return_P1_E0<Iterable<SNode>, SNode>() {
      public Iterable<SNode> invoke(SNode migrationScript) {
        return allScriptDependencies(migrationScript);
      }
    }, migrationScript);
  }
  public static boolean hasIncludeCycles(SNode migrationScript) {
    return hasCycles(new _FunctionTypes._return_P1_E0<Iterable<SNode>, SNode>() {
      public Iterable<SNode> invoke(SNode pureMigrationScript) {
        return SNodeOperations.ofConcept(SLinkOperations.collect(SNodeOperations.ofConcept(SLinkOperations.getChildren(pureMigrationScript, MetaAdapterFactory.getContainmentLink(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x67236d4a5836cabbL, 0x67236d4a5836d7f3L, "part")), MetaAdapterFactory.getConcept(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x267418e6b5c2b903L, "jetbrains.mps.lang.migration.structure.IncludeMigrationPart")), MetaAdapterFactory.getReferenceLink(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x267418e6b5c2b903L, 0x267418e6b5c2b960L, "target")), MetaAdapterFactory.getConcept(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x67236d4a5836cabbL, "jetbrains.mps.lang.migration.structure.PureMigrationScript"));
      }
    }, migrationScript);
  }
  private static Iterable<SNode> allScriptDependencies(final SNode script) {
    Iterable<SNode> result = Sequence.fromIterable(SLinkOperations.collect(IMigrationUnit__BehaviorDescriptor.getRequiredData_id7s$_UJMVosT.invoke(script), MetaAdapterFactory.getReferenceLink(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x44b28148e401c891L, 0x4f6b4ac0cd6d4af5L, "script"))).concat(Sequence.fromIterable(SLinkOperations.collect(IMigrationUnit__BehaviorDescriptor.getExecuteAfter_id2bWK$jI6RRp.invoke(script), MetaAdapterFactory.getReferenceLink(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x398343344f099b7aL, 0x398343344f099b7bL, "script"))));
    result = Sequence.fromIterable(result).concat(ListSequence.fromList(SModelOperations.roots(SNodeOperations.getModel(script), MetaAdapterFactory.getInterfaceConcept(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x47bb811da2acc4d6L, "jetbrains.mps.lang.migration.structure.IMigrationUnit"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (int) IMigrationUnit__BehaviorDescriptor.fromVersion_id4uVwhQyFcnl.invoke(it) < (int) IMigrationUnit__BehaviorDescriptor.fromVersion_id4uVwhQyFcnl.invoke(script);
      }
    }));
    return result;
  }
  public static Map<SNode, Collection<String>> checkMigrationsVersions(SModule module) {
    // check whether scripts are really migrations for some language 
    if (!(module instanceof Language)) {
      return Collections.emptyMap();
    }
    SModel migModel = SModuleOperations.getAspect(module, "migration");
    if (migModel == null) {
      return Collections.emptyMap();
    }
    if (!(migModel.isLoaded())) {
      return Collections.emptyMap();
    }

    List<SNode> allScripts = SModelOperations.roots(migModel, MetaAdapterFactory.getInterfaceConcept(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x47bb811da2acc4d6L, "jetbrains.mps.lang.migration.structure.IMigrationUnit"));

    // scripts with no versions set 
    final Map<SNode, Collection<String>> result = MapSequence.fromMap(new HashMap<SNode, Collection<String>>());
    Iterable<SNode> noVersionScripts = ListSequence.fromList(allScripts).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return !((boolean) IMigrationUnit__BehaviorDescriptor.isVersionSet_id4uVwhQyFpOe.invoke(it));
      }
    });
    Sequence.fromIterable(noVersionScripts).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        MigrationsCheckUtil.ensureInitialized(result, it);
        CollectionSequence.fromCollection(MapSequence.fromMap(result).get(it)).addElement("Script does not have version");
      }
    });

    // no scripts with versions? 
    if (Sequence.fromIterable(noVersionScripts).count() == ListSequence.fromList(allScripts).count()) {
      return result;
    }

    Iterable<SNode> scriptsWithVersions = ListSequence.fromList(allScripts).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (boolean) IMigrationUnit__BehaviorDescriptor.isVersionSet_id4uVwhQyFpOe.invoke(it);
      }
    });

    final Map<Integer, Integer> versions = MapSequence.fromMap(new HashMap<Integer, Integer>());
    Sequence.fromIterable(scriptsWithVersions).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        if (MapSequence.fromMap(versions).get((int) IMigrationUnit__BehaviorDescriptor.fromVersion_id4uVwhQyFcnl.invoke(it)) == null) {
          MapSequence.fromMap(versions).put((int) IMigrationUnit__BehaviorDescriptor.fromVersion_id4uVwhQyFcnl.invoke(it), 0);
        }
        MapSequence.fromMap(versions).put((int) IMigrationUnit__BehaviorDescriptor.fromVersion_id4uVwhQyFcnl.invoke(it), MapSequence.fromMap(versions).get((int) IMigrationUnit__BehaviorDescriptor.fromVersion_id4uVwhQyFcnl.invoke(it)) + 1);
      }
    });

    final int minVersion = SetSequence.fromSet(MapSequence.fromMap(versions).keySet()).sort(new ISelector<Integer, Integer>() {
      public Integer select(Integer it) {
        return it;
      }
    }, true).first();
    final int maxVersion = SetSequence.fromSet(MapSequence.fromMap(versions).keySet()).sort(new ISelector<Integer, Integer>() {
      public Integer select(Integer it) {
        return it;
      }
    }, false).first();
    final int langVersion = ((Language) module).getLanguageVersion();

    // last version+1 == version of a language? 
    if (maxVersion != langVersion - 1) {
      Sequence.fromIterable(scriptsWithVersions).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return (int) IMigrationUnit__BehaviorDescriptor.fromVersion_id4uVwhQyFcnl.invoke(it) == maxVersion;
        }
      }).visitAll(new IVisitor<SNode>() {
        public void visit(SNode it) {
          ensureInitialized(result, it);
          CollectionSequence.fromCollection(MapSequence.fromMap(result).get(it)).addElement("Language version (" + langVersion + ") is not equal to the target version of last migration script (" + (maxVersion + 1) + ")");
        }
      });
    }

    Sequence.fromIterable(scriptsWithVersions).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        // multiple scripts for one version? 
        if (MapSequence.fromMap(versions).get((int) IMigrationUnit__BehaviorDescriptor.fromVersion_id4uVwhQyFcnl.invoke(it)) > 1) {
          ensureInitialized(result, it);
          CollectionSequence.fromCollection(MapSequence.fromMap(result).get(it)).addElement("Multiple scripts for version " + (int) IMigrationUnit__BehaviorDescriptor.fromVersion_id4uVwhQyFcnl.invoke(it) + " found");
        }

        // version with no scripts for it? 
        if ((int) IMigrationUnit__BehaviorDescriptor.fromVersion_id4uVwhQyFcnl.invoke(it) != minVersion && MapSequence.fromMap(versions).get((int) IMigrationUnit__BehaviorDescriptor.fromVersion_id4uVwhQyFcnl.invoke(it) - 1) == null) {
          ensureInitialized(result, it);
          CollectionSequence.fromCollection(MapSequence.fromMap(result).get(it)).addElement("Missing script for version " + ((int) IMigrationUnit__BehaviorDescriptor.fromVersion_id4uVwhQyFcnl.invoke(it) - 1));
        }
      }
    });

    return result;
  }
  private static void ensureInitialized(Map<SNode, Collection<String>> coll, SNode index) {
    if (MapSequence.fromMap(coll).get(index) == null) {
      MapSequence.fromMap(coll).put(index, CollectionSequence.fromCollection(new ArrayList<String>()));
    }
  }

}
