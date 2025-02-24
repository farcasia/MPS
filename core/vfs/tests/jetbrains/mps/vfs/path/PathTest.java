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

import java.util.Arrays;
import java.util.Collections;

/**
 * Testing {@link Path} classes
 */
public abstract class PathTest {
  public abstract Path create(@NotNull String path);

  @Test
  public void nameTestUni1() {
    Path path = create("a////");
    Assert.assertEquals(Collections.singletonList("a"), path.getNames());
  }

  @Test
  public void nameTestUni2() {
    Path path = create("//////a/b/c/d/");
    Assert.assertEquals(Arrays.asList("", "a", "b", "c", "d"), path.getNames());
  }

  @Test
  public void nameTestWin1() {
    Path path = create("C:\\a\\b\\c");
    Assert.assertEquals(Arrays.asList("C", "a", "b", "c"), path.getNames());
  }

  @Test
  public void nameTestWin2() {
    Path path = create("a\\b\\c");
    Assert.assertEquals(Arrays.asList("a", "b", "c"), path.getNames());
  }

  @Test
  public void nameTestWin3() {
    Path path = create("a\\b\\c\\..\\.");
    Assert.assertEquals(Arrays.asList("a", "b", "c", "..", "."), path.getNames());
  }

  @Test
  public void endsWithTest1() {
    Path path = create("//////a/b/c/d/");
    Assert.assertTrue(path.endsWith("d"));
  }

  @Test
  public void endsWithTest2() {
    Path path = create("//////a/b/c/d/");
    Assert.assertTrue(path.endsWith("c/d"));
  }

  @Test
  public void endsWithTest3() {
    Path path = create("//////a/b/c/d/");
    Assert.assertTrue(path.endsWith("/a/b/c/d/"));
  }

  @Test
  public void endsWithTest4() {
    Path path = create("//////a/b/c/d/");
    Assert.assertTrue(path.endsWith("/a//b/c/d///"));
  }

  @Test
  public void endsWithTest5() {
    Path path = create("//////a/b/c/d/");
    Assert.assertFalse(path.endsWith("/"));
  }

  @Test
  public void endsWithTest6() {
    Path path = create("/");
    Assert.assertFalse(path.endsWith("d/"));
  }

  @Test
  public void startsWithTest1() {
    Path path = create("//////a/b/c/d/");
    Assert.assertFalse(path.startsWith("d"));
  }

  @Test
  public void startsWithTest2() {
    Path path = create("//////a/b/c/d/");
    Assert.assertFalse(path.startsWith("a"));
  }

  @Test
  public void startsWithTest3() {
    Path path = create("//////a/b/c/d/");
    Assert.assertTrue(path.startsWith("/a/b/"));
  }

  @Test
  public void startsWithTest4() {
    Path path = create("//////a/b/c/d/");
    Assert.assertFalse(path.startsWith("a/b"));
  }

  @Test
  public void rootTest1() {
    Path path = create("///");
    Assert.assertEquals(create("/"), path);
  }

  @Test
  public void rootTest2() {
    Path path = create("/");
    Assert.assertEquals(create("//"), path);
  }

  @Test
  public void rootParentIsNull() {
    Path path = create("/");
    Assert.assertEquals(null, path.getParent());
  }

  @Test
  public void toIndependentPathUnix() {
    Path path = create("a/b/c/");
    Assert.assertEquals(create("a/b/c"), path.toIndependentPath());
  }

  @Test
  public void emptyStringTest1() {
    Path path = create("");
    Assert.assertTrue(path.isRelative());
  }

  @Test
  public void emptyStringTest2() {
    Path path = create(".");
    Assert.assertTrue(path.isRelative());
  }

  @Test
  public void toIndependentPathWin() {
    Path path = create("a\\b\\c");
    Assert.assertEquals(create("a/b/c"), path.toIndependentPath());
  }

  @Test
  public void toIndependentPathAbsoluteUnix() {
    Path path = create("/a/b/c");
    Assert.assertEquals(create("///a/b///c"), path.toIndependentPath());
  }

  @Test(expected = InvalidPathException.class)
  public void toIndependentPathAbsoluteWin() {
    Path path = create("C:\\a\\b\\c");
    path.toIndependentPath();
  }

  @Test
  public void parentTest1() {
    Path path = create("/a/b/c/asdf/cx.xml");
    Assert.assertEquals(create("/a/b/c/asdf/"), path.getParent());
  }

  @Test
  public void parentTest2() {
    Path path = create("/a/b/c");
    Assert.assertEquals(create("/a/b"), path.getParent());
  }

  @Test
  public void getRootTestWin() {
    Path path = create("C:\\System\\A");
    Assert.assertEquals(create("C:\\"), path.getRoot());
    Assert.assertEquals("C:\\", path.getRoot().toString());
  }

  @Test
  public void getRootTestUnix() {
    Path path = create("/C/System/A");
    Assert.assertEquals(create("/"), path.getRoot());
    Assert.assertEquals("/", path.getRoot().toString());
  }

  @Test
  public void rootTestUnix1() {
    Path path = create("///");
    Assert.assertEquals(CommonPath.fromParts(Path.UNIX_SEPARATOR_CHAR, ""), path);
  }

  @Test
  public void rootTestUnix2() {
    Path path = create("///");
    Assert.assertEquals(CommonPath.fromParts(Path.UNIX_SEPARATOR_CHAR, CommonPath.UNIX_SEPARATOR), path);
  }

  @Test
  public void rootTestWin1() {
    Path path = create("A:\\\\");
    Assert.assertEquals(CommonPath.fromParts(Path.WIN_SEPARATOR_CHAR, "A"), path);
  }

  @Test
  public void rootTestWin2() {
    Path path = create("A:\\");
    Assert.assertEquals(CommonPath.fromParts(Path.WIN_SEPARATOR_CHAR, "A"), path);
  }

  @Test
  public void toNormalTestUni() {
    Path path = create("./././a/../a");
    Assert.assertEquals(create("a"), path.toNormal());
  }

  @Test
  public void toNormalTestUni2() {
    Path path = create("./././a/../.././././a////././");
    Assert.assertEquals(create("../a"), path.toNormal());
  }

  @Test
  public void toNormalTestWin() {
    Path path = create(".\\.\\a\\..\\..\\..\\a\\\\\\");
    Assert.assertEquals(create("..\\..\\a"), path.toNormal());
  }

  @Test
  public void getParentTestUni1() {
    Assert.assertEquals(create("/"), create("/a").getParent());
  }

  @Test
  public void getParentTestUni2() {
    Assert.assertEquals(null, create("").getParent());
  }

  @Test
  public void getParentTestUni3() {
    Assert.assertEquals(null, create("/").getParent());
  }

  @Test
  public void getParentTestWin1() {
    Assert.assertEquals(create("C:\\"), create("C:\\a").getParent());
  }

  @Test
  public void getParentTestWin2() {
    Assert.assertEquals(null, create("C:\\").getParent());
  }
}
