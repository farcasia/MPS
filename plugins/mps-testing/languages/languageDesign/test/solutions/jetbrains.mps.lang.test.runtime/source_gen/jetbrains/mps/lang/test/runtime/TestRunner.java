package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;

/**
 * 
 * @deprecated There's no longer need to delegate initialization of a TransformationTest to external code. Instead, external code injects proper values (Environment) into the test at construction time. This class will be removed.
 */
@Deprecated
public interface TestRunner {
  void initTest(final TransformationTest test, @NotNull String projectPath, String modelName, boolean reOpenProject) throws Exception;
}
