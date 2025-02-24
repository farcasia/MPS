package jetbrains.mps.lang.smodel.generator.baseLanguage.util;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.structure.behavior.EnumerationDataTypeDeclaration__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class DataTypeUtil {
  public DataTypeUtil() {
  }
  public static SNode getDefaultMember(SNode enumDatatype) {
    SNode defMember = EnumerationDataTypeDeclaration__BehaviorDescriptor.getDefaultMember_idhEwIM$p.invoke(enumDatatype);
    if (defMember != null) {
      return defMember;
    }
    return ListSequence.fromList(SLinkOperations.getChildren(enumDatatype, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xfc26875dfbL, 0xfc32151efeL, "member"))).first();
  }
}
