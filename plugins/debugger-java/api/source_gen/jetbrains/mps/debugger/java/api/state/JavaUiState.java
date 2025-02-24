package jetbrains.mps.debugger.java.api.state;

/*Generated by MPS */

import jetbrains.mps.debug.api.AbstractUiState;
import jetbrains.mps.debug.api.AbstractDebugSession;
import com.sun.jdi.ObjectReference;
import jetbrains.mps.debugger.java.api.state.proxy.JavaStackFrame;
import jetbrains.mps.debugger.java.api.state.proxy.JavaThread;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.debugger.java.api.state.proxy.JavaLocation;

public abstract class JavaUiState extends AbstractUiState {
  protected JavaUiState(AbstractDebugSession debugSession) {
    super(debugSession);
  }
  public abstract ObjectReference getThisObject();
  @Override
  public abstract JavaStackFrame getStackFrame();
  @Override
  public abstract JavaThread getThread();
  /**
   * Invokes evaluation while blocking current thread (must be EDT by the way) and showing a progress window.
   */
  @Nullable
  public abstract <R> R invokeEvaluationSynchronously(_FunctionTypes._return_P0_E0<? extends R> command);


  /**
   * Need this method where TraceInfoUtil has been used, just picked a place visible from all locations.
   */
  public static String modelNameFromLocation(JavaLocation location) {
    String unitName = location.getUnitName();
    // XXX no idea why we don't expect nested unit names, like com.package.A.B here. 
    // just kept the way it was in TraceInfoUtil.modelFqNameFromUnitName 
    int lastDot = unitName.lastIndexOf('.');
    return (lastDot == -1 ? "" : unitName.substring(0, lastDot));
  }
}
