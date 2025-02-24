package jetbrains.mps.make.script;

/*Generated by MPS */

import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.resources.IPropertiesAccessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Collections;

public interface IJob {
  IResult execute(Iterable<IResource> input, IJobMonitor mon, IPropertiesAccessor pa, @NotNull ProgressMonitor monitor);
  class Stub implements IJob {
    public Stub() {
    }
    @Override
    public IResult execute(Iterable<IResource> input, IJobMonitor mon, IPropertiesAccessor pa, @NotNull ProgressMonitor monitor) {
      return new IResult.FAILURE(Sequence.fromIterable(Collections.<IResource>emptyList()));
    }
  }
}
