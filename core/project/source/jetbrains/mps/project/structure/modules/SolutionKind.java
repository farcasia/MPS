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
package jetbrains.mps.project.structure.modules;

/**
 *  It was a temporary way to mark solution as a plugin (at that time: 10/25/11)
 *  One can specify a solution kind in the properties dialog of MPS.
 *  The SolutionKind establishes the place of the solution in the
 *  MPS modules' hierarchy (Core - Editor - Workbench)
 *  TODO: review the usages again
 */
public enum SolutionKind {
  NONE ("None"),
  PLUGIN_CORE ("Core plugin"),
  PLUGIN_EDITOR ("Editor plugin"),
  PLUGIN_OTHER ("Other");

  private final String myPresentation;

  SolutionKind(String presentation) {
    myPresentation = presentation;
  }

  @Override
  public String toString() {
    return myPresentation;
  }
}
