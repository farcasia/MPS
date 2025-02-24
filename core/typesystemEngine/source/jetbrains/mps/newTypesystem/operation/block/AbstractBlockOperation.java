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
package jetbrains.mps.newTypesystem.operation.block;

import jetbrains.mps.newTypesystem.operation.AbstractOperation;
import jetbrains.mps.newTypesystem.state.blocks.Block;
import org.jetbrains.mps.openapi.model.SNode;

import java.util.List;

public abstract class AbstractBlockOperation extends AbstractOperation {
  Block myBlock;

  public AbstractBlockOperation(Block block) {
    myBlock = block;
    setRule(block.getNodeModel(), block.getNodeId());
  }

  public Block getBlock() {
    return myBlock;
  }

  @Override
  public List<SNode> getVariables() {
    return myBlock.getVariables(null);
  }
}
