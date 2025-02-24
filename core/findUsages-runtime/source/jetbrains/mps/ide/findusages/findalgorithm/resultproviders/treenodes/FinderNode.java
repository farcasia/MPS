/*
 * Copyright 2003-2016 JetBrains s.r.o.
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
package jetbrains.mps.ide.findusages.findalgorithm.resultproviders.treenodes;

import jetbrains.mps.ide.findusages.CantLoadSomethingException;
import jetbrains.mps.ide.findusages.CantSaveSomethingException;
import jetbrains.mps.ide.findusages.findalgorithm.finders.Finder;
import jetbrains.mps.ide.findusages.findalgorithm.finders.FinderUtils;
import jetbrains.mps.ide.findusages.findalgorithm.finders.IFinder;
import jetbrains.mps.ide.findusages.findalgorithm.finders.ReloadableFinder;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.project.Project;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.module.SearchScope;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import org.jetbrains.mps.openapi.util.SubProgressKind;

public class FinderNode extends BaseLeaf {
  private static final Logger LOG = LogManager.getLogger(FinderNode.class);

  private static final String FINDER = "finder";
  private static final String GENERATED_FINDER = "generated_finder";
  private static final String CLASS_NAME = "class_name";

  private IFinder myFinder;

  public FinderNode() {
  }

  public FinderNode(IFinder finder) {
    myFinder = finder;
  }

  public String getTaskName() {
    if (myFinder instanceof Finder) {
      return ((Finder) myFinder).getDescription();
    } else {
      LOG.warn("IFinder is deprecated and will be removed after 3.4. Please change " + myFinder.getClass().getName() + " accordingly");
      return myFinder.getClass().getName();
    }
  }

  @Override
  public SearchResults doGetResults(final SearchQuery query, @NotNull final ProgressMonitor monitor) {
    monitor.start(getTaskName(), 10);
    try {
      SearchResults results = myFinder.find(query, monitor.subTask(9, SubProgressKind.REPLACING));
      //todo [MM] move sorting from here to code building the actual tree. Otherwise, at least results produced by different finders may remain unsorted
      if (FinderUtils.isAllResultsIsNodes(results)) {
        FinderUtils.sortNodeResultsByEditorPosition(results);
        monitor.advance(1);
      }
      return results;
    } catch (Throwable t) {
      Logger.getLogger(getClass()).error(t.getMessage(), t);
      return new SearchResults();
    } finally {
      monitor.done();
    }
  }

  @Override
  public long getEstimatedTime(SearchScope scope) {
    return 2;
  }

  @Override
  public void write(Element element, Project project) throws CantSaveSomethingException {
    super.write(element, project);

    Element finderXML;
    if (myFinder instanceof ReloadableFinder) {
      finderXML = new Element(GENERATED_FINDER);
      String finderIdentity = ((ReloadableFinder) myFinder).getPersistenceIdentity();
      finderXML.setAttribute(CLASS_NAME, finderIdentity);

    } else {
      finderXML = new Element(FINDER);
      finderXML.setAttribute(CLASS_NAME, myFinder.getClass().getName());
    }
    element.addContent(finderXML);
  }

  @Override
  public void read(Element element, Project project) throws CantLoadSomethingException {
    super.read(element, project);
    if (element.getChild(FINDER) != null) {
      Element finderXML = element.getChild(FINDER);
      String finderName = finderXML.getAttribute(CLASS_NAME).getValue();
      try {
        Class finderClass = Class.forName(finderName);
        myFinder = (IFinder) finderClass.newInstance();
      } catch (Throwable t) {
        throw new CantLoadSomethingException("Can't instantiate finder " + finderName, t);
      }
    } else {
      Element finderXML = element.getChild(GENERATED_FINDER);
      String finderName = finderXML.getAttribute(CLASS_NAME).getValue();
      myFinder = new ReloadableFinder(finderName);
    }
  }
}
