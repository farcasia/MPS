/*
 * Copyright 2003-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.ide.ui.dialogs.properties.persistence;

import com.intellij.openapi.extensions.AbstractExtensionPointBean;
import com.intellij.openapi.extensions.ExtensionPointName;
import com.intellij.openapi.project.Project;
import com.intellij.util.xmlb.annotations.Attribute;
import org.apache.log4j.Logger;
import org.jetbrains.mps.openapi.ui.persistence.TabFactory;
import org.picocontainer.PicoContainer;

public class FacetTabEP extends AbstractExtensionPointBean {
  public static final ExtensionPointName<FacetTabEP> EP_NAME = ExtensionPointName.create("com.intellij.mps.facetTabFactory");

  @Attribute("facetType")
  public String facetType;
  @Attribute("className")
  public String className;

  private final PicoContainer myContainer;
  private TabFactory myFactory;

  public FacetTabEP(Project ideaProject) {
    myContainer = ideaProject.getPicoContainer();
  }

  public TabFactory getFacetTabFactory() {
    if (myFactory == null) {
      try {
        myFactory = instantiate(className, myContainer);
      } catch (ClassNotFoundException e) {
        String msg = String.format("Failed to load extension. Class %s, point %s", className, EP_NAME.getName());
        Logger.getLogger(FacetTabEP.class).error(msg, e);
        throw new RuntimeException(msg, e);
      }
    }
    return myFactory;
  }
}
