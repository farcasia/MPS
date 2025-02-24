package jetbrains.mps.debugger.api.ui.breakpoints;

/*Generated by MPS */

import jetbrains.mps.debugger.core.breakpoints.BreakpointPainterEx;
import jetbrains.mps.debug.api.breakpoints.ILocationBreakpoint;
import org.jetbrains.mps.openapi.model.SNodeReference;

/*package*/ class BreakpointPainter extends BreakpointPainterEx<ILocationBreakpoint> {
  public BreakpointPainter(ILocationBreakpoint mpsBreakpoint) {
    super(mpsBreakpoint);
  }
  @Override
  protected SNodeReference getSNode() {
    return myBreakpoint.getLocation().getNodePointer();
  }
}
