package jetbrains.mps.lang.plugin.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.ArrayList;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.SNodePointer;

public class ModificationStatement_Constraints extends BaseConstraintsDescriptor {
  public ModificationStatement_Constraints() {
    super(MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181de4920dL, "jetbrains.mps.lang.plugin.structure.ModificationStatement"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181de4920dL, 0x1188f2392baL, "point"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181de4920dL, 0x1188f2392baL), this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_184bjp_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              SNode contents = SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(_context.getReferenceNode(), MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181de4920dL, "jetbrains.mps.lang.plugin.structure.ModificationStatement")), MetaAdapterFactory.getReferenceLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181de4920dL, 0x1181dea4861L, "modifiedGroup")), MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181da058d2L, 0x1190f76acfcL, "contents"));
              if (SNodeOperations.isInstanceOf(contents, MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1190f756bc5L, "jetbrains.mps.lang.plugin.structure.ElementListContents"))) {
                return ListScope.forResolvableElements(ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(contents, MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1190f756bc5L, "jetbrains.mps.lang.plugin.structure.ElementListContents")), MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1190f756bc5L, 0x1190f75fe95L, "reference"))).where(new IWhereFilter<SNode>() {
                  public boolean accept(SNode it) {
                    return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11840f36089L, "jetbrains.mps.lang.plugin.structure.GroupAnchor"));
                  }
                }).toListSequence());
              }
              return ListScope.forResolvableElements(new ArrayList<SNode>());
            }
          }
        };
      }
    });
    references.put(MetaAdapterFactory.getReferenceLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181de4920dL, 0x1181dea4861L, "modifiedGroup"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181de4920dL, 0x1181dea4861L), this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_184bjp_a0a0a0a0a1a0b0a2a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              List<SNode> actionGroupDeclarations = SModelOperations.rootsIncludingImported(SNodeOperations.getModel(_context.getContextNode()), MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181da058d2L, "jetbrains.mps.lang.plugin.structure.ActionGroupDeclaration"));
              SNode groupDeclaration = SNodeOperations.getNodeAncestor(_context.getReferenceNode(), MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181da058d2L, "jetbrains.mps.lang.plugin.structure.ActionGroupDeclaration"), false, false);
              List<SNode> thisGroupChildGroups = ((List<SNode>) ListSequence.fromList(SNodeOperations.getNodeDescendants(groupDeclaration, null, false, new SAbstractConcept[]{})).where(new IWhereFilter<SNode>() {
                public boolean accept(SNode it) {
                  return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181da058d2L, "jetbrains.mps.lang.plugin.structure.ActionGroupDeclaration"));
                }
              }).toListSequence());
              ListSequence.fromList(thisGroupChildGroups).addElement(groupDeclaration);
              return ListScope.forResolvableElements(ListSequence.fromList(actionGroupDeclarations).subtract(ListSequence.fromList(thisGroupChildGroups)).toListSequence());
            }
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_184bjp_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:00000000-0000-4000-0000-011c89590361(jetbrains.mps.lang.plugin.constraints)", "6836281137582795096");
  private static SNodePointer breakingNode_184bjp_a0a0a0a0a1a0b0a2a2 = new SNodePointer("r:00000000-0000-4000-0000-011c89590361(jetbrains.mps.lang.plugin.constraints)", "6836281137582795790");
}
