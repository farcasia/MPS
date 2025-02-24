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
package jetbrains.mps.ide;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

public class ThreadUtilsTest {
  @Test
  public void errorIsWrappedInInvocationTargetException() {
    Error thrown[] = new Error[1];
    Exception exception = ThreadUtils.runInUIThreadAndWait(() -> {
      thrown[0] = new Error("Error intentionally thrown from EDT");
      throw thrown[0];
    });

    assertNotNull(exception);
    assertThat(exception, is(instanceOf(InvocationTargetException.class)));
    assertSame(thrown[0], exception.getCause());
  }
}
