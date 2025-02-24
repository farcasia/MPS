package jetbrains.mps.debugger.java.api.state.proxy;

/*Generated by MPS */

import jetbrains.mps.debug.api.programState.IStackFrame;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import jetbrains.mps.debug.api.programState.IWatchable;
import java.util.List;
import jetbrains.mps.debugger.java.api.state.watchables.JavaLocalVariable;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.sun.jdi.AbsentInformationException;
import jetbrains.mps.util.Pair;
import com.sun.jdi.StackFrame;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.ide.ThreadUtils;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.LocalVariable;
import com.sun.jdi.ObjectReference;
import jetbrains.mps.debugger.java.api.state.watchables.JavaThisObject;
import jetbrains.mps.debugger.java.api.state.watchables.JavaStaticContext;
import jetbrains.mps.debug.api.programState.IValue;
import jetbrains.mps.debugger.java.api.state.customViewers.CustomViewersManager;

public class JavaStackFrame extends ProxyForJava implements IStackFrame {
  private static final Logger LOG = LogManager.getLogger(JavaStackFrame.class);
  private final int myIndex;
  private final JavaLocation myLocation;
  private final JavaThread myThread;
  private IWatchable myContextWatchable;
  private final List<JavaLocalVariable> myVariables = ListSequence.fromList(new ArrayList<JavaLocalVariable>());
  private boolean myInitialized;
  public JavaStackFrame(JavaThread threadReference, int i) throws AbsentInformationException {
    super(new Pair<JavaThread, Integer>(threadReference, i));
    myIndex = i;
    myThread = threadReference;
    StackFrame stackFrame = getStackFrame();
    if (stackFrame != null) {
      myLocation = new JavaLocation(stackFrame.location());
    } else {
      myLocation = null;
    }
  }
  @Override
  @Nullable
  public JavaLocation getLocation() {
    return myLocation;
  }
  @Override
  public JavaThread getThread() {
    return myThread;
  }
  @Nullable
  public StackFrame getStackFrame() {
    assert !(ThreadUtils.isInEDT());
    try {
      return getFrame();
    } catch (Throwable t) {
      LOG.error(null, t);
      return null;
    }
  }
  @Override
  public synchronized List<IWatchable> getVisibleWatchables() {
    List<IWatchable> watchables = ListSequence.fromList(new ArrayList<IWatchable>());
    ListSequence.fromList(watchables).addSequence(ListSequence.fromList(myVariables));
    if (myContextWatchable != null) {
      ListSequence.fromList(watchables).addElement(myContextWatchable);
    }
    return watchables;
  }
  public synchronized List<JavaLocalVariable> getVisibleVariables() {
    return myVariables;
  }
  public synchronized IWatchable getContextWatchable() {
    return myContextWatchable;
  }
  public synchronized void initializeWatchables() {
    if (myInitialized) {
      return;
    }
    myInitialized = true;
    try {
      ListSequence.fromList(myVariables).addSequence(ListSequence.fromList(fetchVisibleVariables()));
      myContextWatchable = fetchContextWatchable();
    } catch (IncompatibleThreadStateException ignore) {
    } catch (AbsentInformationException ignore) {
    }
  }
  private List<JavaLocalVariable> fetchVisibleVariables() throws IncompatibleThreadStateException, AbsentInformationException {
    assert !(ThreadUtils.isInEDT());

    StackFrame stackFrame = getFrame();
    List<JavaLocalVariable> result = new ArrayList<JavaLocalVariable>();
    if (stackFrame != null) {
      for (LocalVariable variable : stackFrame.visibleVariables()) {
        ListSequence.fromList(result).addElement(new JavaLocalVariable(variable, this, myThread.getThread()));
      }
    }
    return result;
  }
  private IWatchable fetchContextWatchable() throws IncompatibleThreadStateException {
    assert !(ThreadUtils.isInEDT());

    StackFrame stackFrame = getFrame();
    if (stackFrame != null) {
      ObjectReference thisObject = stackFrame.thisObject();
      if (thisObject != null) {
        return new JavaThisObject(thisObject, this, myThread.getThread());
      } else {
        return new JavaStaticContext(stackFrame.location().declaringType(), myThread.getThread());
      }
    }
    return null;
  }
  private StackFrame getFrame() throws IncompatibleThreadStateException {
    return myThread.getThread().frame(myIndex);
  }
  @Override
  public IValue getValue(IWatchable watchable) {
    assert !(ThreadUtils.isInEDT());
    try {
      if (watchable instanceof JavaLocalVariable) {
        JavaLocalVariable localVariable = (JavaLocalVariable) watchable;
        return CustomViewersManager.getInstance().fromJdi(getFrame().getValue(localVariable.getLocalVariable()), myThread.getThread());
      }
    } catch (IncompatibleThreadStateException e) {
    }
    return null;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }

    JavaStackFrame that = (JavaStackFrame) o;
    if (myIndex != that.myIndex) {
      return false;
    }
    if ((myLocation != null ? !(myLocation.equals(that.myLocation)) : that.myLocation != null)) {
      return false;
    }
    if ((myThread != null ? !(myThread.equals(that.myThread)) : that.myThread != null)) {
      return false;
    }

    return true;
  }
  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + myIndex;
    result = 31 * result + ((myLocation != null ? (myLocation).hashCode() : 0));
    result = 31 * result + ((myThread != null ? (myThread).hashCode() : 0));
    return result;
  }
}
