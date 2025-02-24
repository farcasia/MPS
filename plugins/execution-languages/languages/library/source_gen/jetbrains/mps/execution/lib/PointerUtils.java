package jetbrains.mps.execution.lib;

/*Generated by MPS */

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import org.apache.log4j.Level;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;

/**
 * static methods container class
 * responsible for converting node refs into string and the other way around
 * also supports lists of node refs
 */
public final class PointerUtils {
  private static final Logger LOG = LogManager.getLogger(PointerUtils.class);
  private PointerUtils() {
  }

  @Nullable
  public static SNodeReference stringToPointer(String pointerString) {
    if ((pointerString == null || pointerString.length() == 0)) {
      return null;
    }
    try {
      return PersistenceFacade.getInstance().createNodeReference(pointerString);
    } catch (PersistenceFacade.IncorrectModelReferenceFormatException problem) {
      if (LOG.isEnabledFor(Level.WARN)) {
        LOG.warn("Parsing problem when converting the pointer " + pointerString, problem);
      }
    } catch (PersistenceFacade.IncorrectNodeIdFormatException problem) {
      if (LOG.isEnabledFor(Level.WARN)) {
        LOG.warn("Parsing problem when converting the pointer " + pointerString, problem);
      }
    }
    return null;
  }

  public static String pointerToString(@NotNull SNodeReference pointer) {
    return PersistenceFacade.getInstance().asString(pointer);
  }

  public static ClonableList<String> nodesToCloneableList(List<SNode> nodes) {
    return new ClonableList<String>(ListSequence.fromList(nodes).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return PointerUtils.pointerToString(SNodeOperations.getPointer(it));
      }
    }).toListSequence());
  }

  public static ClonableList<String> nodeToCloneableList(SNode node) {
    return new ClonableList<String>(PointerUtils.pointerToString(SNodeOperations.getPointer(node)));
  }

  public static List<SNodeReference> clonableListToNodes(ClonableList<String> clonableList) {
    List<SNodeReference> list = ListSequence.fromList(new ArrayList<SNodeReference>());
    for (String string : clonableList) {
      ListSequence.fromList(list).addElement(stringToPointer(string));
    }
    return list;
  }
}
