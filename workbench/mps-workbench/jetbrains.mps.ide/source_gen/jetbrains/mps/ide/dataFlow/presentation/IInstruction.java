package jetbrains.mps.ide.dataFlow.presentation;

/*Generated by MPS */

import java.util.Set;

public interface IInstruction<T extends IInstruction<T>> {
  Set<T> succ();
  Set<T> pred();
}
