package jetbrains.mps.core.tool.environment.classloading;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import java.util.Collection;

/*package*/ class ContainerUtil {
  public ContainerUtil() {
  }
  public static <T> void addAll(@NotNull Collection<T> collection, @NotNull T... elements) {
    // noinspection ManualArrayToCollectionCopy 
    for (T element : elements) {
      collection.add(element);
    }
  }
}
