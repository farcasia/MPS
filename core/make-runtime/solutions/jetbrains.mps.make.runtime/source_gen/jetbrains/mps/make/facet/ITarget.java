package jetbrains.mps.make.facet;

/*Generated by MPS */

import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.internal.make.runtime.util.DefaultHName;

public interface ITarget {
  ITarget.Name getName();
  boolean requiresInput();
  boolean producesOutput();
  Iterable<Class<? extends IResource>> expectedInput();
  Iterable<Class<? extends IResource>> expectedOutput();
  Iterable<ITarget.Name> before();
  Iterable<ITarget.Name> notBefore();
  Iterable<ITarget.Name> after();
  Iterable<ITarget.Name> notAfter();
  IConfig createConfig();
  <T> T createParameters(Class<T> varCls);
  <T> T createParameters(Class<T> varCls, T copyFrom);
  IJob createJob();
  class Name extends DefaultHName<IFacet.Name> {
    public Name(String name) {
      super(name);
    }
    @Override
    protected final IFacet.Name createParentName(String parentFqName) {
      return new IFacet.Name(parentFqName);
    }
  }
}
