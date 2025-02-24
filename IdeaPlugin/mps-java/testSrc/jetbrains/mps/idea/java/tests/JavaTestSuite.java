/*
 * Copyright 2003-2013 JetBrains s.r.o.
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

package jetbrains.mps.idea.java.tests;

import org.apache.log4j.LogManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import jetbrains.mps.TestMode;
import jetbrains.mps.RuntimeFlags;

@RunWith(Suite.class)
@Suite.SuiteClasses({ForeignIdReferenceCacheTest.class, NewRootTest.class, ReferenceBLThingsFromJavaTest.class})
public class JavaTestSuite {
  @BeforeClass
  public static void setTestMode() {
    LogManager.getLogger(JavaTestSuite.class).info("The log4j has been initialized successfully");
    RuntimeFlags.setTestMode(TestMode.USUAL);
  }
}
