package jetbrains.mps.smodel.resources;

/*Generated by MPS */

import jetbrains.mps.make.resources.IResource;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.model.SModel;

@Deprecated
public interface ITResource extends IResource, IDeltaResource {
  SModule module();
  SModel modelDescriptor();
}
