package jetbrains.mps.baseLanguage.tuples.generator.template.helpers;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.core.behavior.INamedConcept__BehaviorDescriptor;
import jetbrains.mps.util.SNodeOperations;

public class TupleDeclarationUtil {
  public TupleDeclarationUtil() {
  }
  public static String getResolveInfo(SNode tupleDeclaration) {
    String fqName = INamedConcept__BehaviorDescriptor.getFqName_idhEwIO9y.invoke(tupleDeclaration);
    String packageName = SNodeOperations.getModelLongName(jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations.getModel(tupleDeclaration));
    if (fqName.startsWith(packageName + ".")) {
      return "[" + packageName + "]" + fqName.substring(packageName.length() + 1);
    }
    return fqName;
  }
}
