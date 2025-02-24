/*
 * Copyright 2003-2016 JetBrains s.r.o.
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
package jetbrains.mps.vfs.path;

import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

/**
 * Testing {@link CommonPath}
 */
public class CommonPathTest extends PathTest {
  @Override
  public Path create(@NotNull String path) {
    return CommonPath.fromString(path);
  }

  @Test
  public void constructionEqualityTest1() {
    CommonPath a = CommonPath.fromParts(Path.UNIX_SEPARATOR_CHAR, null, "a");
    Assert.assertEquals(a, CommonPath.fromString("a"));
    Assert.assertTrue(a.isRelative());
  }

  @Test
  public void constructionEqualityTest2() {
    CommonPath a = CommonPath.fromParts(Path.WIN_SEPARATOR_CHAR, null, "a");
    Assert.assertEquals(a, CommonPath.fromString("a"));
    Assert.assertTrue(a.isRelative());
  }

  @Test
  public void constructionEqualityTest3() {
    Assert.assertEquals(CommonPath.fromParts(Path.UNIX_SEPARATOR_CHAR, null, "a"), CommonPath.fromString("\\a"));
  }

  @Test
  public void getParentTestWin3() {
    CommonPath emptyRelPath = CommonPath.fromParts(Path.WIN_SEPARATOR_CHAR, null);
    Assert.assertEquals(null, emptyRelPath.getParent());
  }
}
