package jetbrains.mps.lang.migration.runtime.base;

/*Generated by MPS */

import java.util.Map;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.model.SNode;

/**
 * todo this should be replaced with migration annotations
 */
public interface DataCollector {
  Map<SModule, SNode> collectData(SModule module, MigrationScriptReference scriptReference);
}
