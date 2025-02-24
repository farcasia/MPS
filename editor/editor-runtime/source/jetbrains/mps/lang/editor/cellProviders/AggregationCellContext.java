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
package jetbrains.mps.lang.editor.cellProviders;

import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.smodel.adapter.MetaAdapterByDeclaration;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.util.annotation.ToRemove;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.model.SNode;

/**
 * Igor Alshannikov
 * Date: Nov 29, 2006
 */
public class AggregationCellContext extends BasicCellContext {
  public static final Object LINK = new Object();
  public static final Object CHILD_CONCEPT = new Object();
  public static final Object CURRENT_CHILD_NODE = new Object();

  @Deprecated
  @ToRemove(version = 3.5)
  public AggregationCellContext(SNode parentNode, SNode currentChild, SNode linkDeclaration) {
    super(parentNode);
    SNode origin = SModelUtil.getGenuineLinkDeclaration(linkDeclaration);
    put(LINK, MetaAdapterByDeclaration.getContainmentLink(origin));
    final SNode linkDeclarationTarget = SModelUtil.getLinkDeclarationTarget(linkDeclaration);
    put(CHILD_CONCEPT, MetaAdapterByDeclaration.getConcept(linkDeclarationTarget));
    put(CURRENT_CHILD_NODE, currentChild);
  }

  public AggregationCellContext(SNode parentNode, SNode currentChild, SContainmentLink link, SAbstractConcept childConcept) {
    super(parentNode);
    put(LINK, link);
    put(CHILD_CONCEPT, childConcept);
    put(CURRENT_CHILD_NODE, currentChild);
  }
}
