package jetbrains.mps.lang.actions.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.custom.BaseCustomApplicationPlugin;
import org.jetbrains.mps.util.Condition;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.ide.projectPane.CreateRootFilterEP;

public class ActionsMenuAdjustment_CustomApplicationPlugin extends BaseCustomApplicationPlugin {
  private Condition<SAbstractConcept> mySouldBeRemovedCondition = new Condition<SAbstractConcept>() {
    public boolean met(SAbstractConcept concept) {
      return concept.isSubConceptOf(MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x102ebc25367L, "jetbrains.mps.lang.actions.structure.NodeSubstituteActions")) || concept.isSubConceptOf(MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108fad1c116L, "jetbrains.mps.lang.actions.structure.SideTransformHintSubstituteActions")) || concept.isSubConceptOf(MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x11f8ec8c7e9L, "jetbrains.mps.lang.actions.structure.SmartEditorActions"));
    }
  };
  public ActionsMenuAdjustment_CustomApplicationPlugin() {
  }
  public void doInit() {
    CreateRootFilterEP.getInstance().addFilter(ActionsMenuAdjustment_CustomApplicationPlugin.this.mySouldBeRemovedCondition);
  }
  public void doDispose() {
    CreateRootFilterEP.getInstance().removeFilter(ActionsMenuAdjustment_CustomApplicationPlugin.this.mySouldBeRemovedCondition);
  }
}
