package jetbrains.mps.smodel.resources;

/*Generated by MPS */

import jetbrains.mps.make.resources.IResource;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.model.SModel;

@Deprecated
public interface IFResource extends IResource {
  String packageName();
  Map<String, Object> contents();
  Map<SNodeReference, String> rootNodeNames();
  SModule module();
  SModel model();
}
