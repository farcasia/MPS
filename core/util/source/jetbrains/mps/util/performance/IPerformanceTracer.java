/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.util.performance;

/**
 * Interface which offers a cosy stack-like methods to track the performance (e.g. time consumption)
 *
 * Evgeny Gryaznov, Feb 23, 2010
 */
public interface IPerformanceTracer {

  void push(String taskName, boolean isMajor);

  void pop();

  String report(String... separate);

  void addText(String s);

  /**
   * Default implementation which tracks nothing
   */
  class NullPerformanceTracer implements IPerformanceTracer {

    @Override
    public void push(String taskName, boolean isMajor) {
    }

    @Override
    public void pop() {
    }

    @Override
    public String report(String... separate) {
      return null;
    }

    @Override
    public void addText(String s){
    }
  }
}
