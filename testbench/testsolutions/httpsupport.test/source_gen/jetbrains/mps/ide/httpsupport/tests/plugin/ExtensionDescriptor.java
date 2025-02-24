package jetbrains.mps.ide.httpsupport.tests.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DefaultExtensionDescriptor;
import jetbrains.mps.smodel.structure.Extension;
import java.util.Arrays;

public class ExtensionDescriptor extends DefaultExtensionDescriptor {
  private Extension[] extensions = new Extension[]{new RH_simple_Extension(), new RH_requiredParams_Extension(), new RH_conditional_Extension(), new RH_exception_Extension(), new RH_turnBack1_Extension(), new RH_turnBack2_Extension(), new RH_conflicting2_Extension(), new RH_conflicting1_Extension()};
  public ExtensionDescriptor() {
  }
  @Override
  public Iterable<? extends Extension> getExtensions() {
    return Arrays.asList(extensions);
  }
}
