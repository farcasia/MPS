package jetbrains.mps.baseLanguage.collections.unittest.simple_operations;

/*Generated by MPS */

import junit.framework.TestCase;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ISelector;
import junit.framework.Assert;

public class Sort_Test1 extends TestCase {
  public Sort_Test1() {
  }
  public void test_1() {
    List<Integer> expected = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 4, 5);
    List<Integer> list = ListSequence.fromListAndArray(new ArrayList<Integer>(), 2, 4, 1, 5, 3);
    List<Integer> list_sorted = ListSequence.fromList(list).sort(new ISelector<Integer, Integer>() {
      public Integer select(Integer it) {
        return it;
      }
    }, true).toListSequence();
    int index = 0;
    for (Integer i : ListSequence.fromList(list_sorted)) {
      Assert.assertEquals(ListSequence.fromList(expected).getElement(index), i);
      index++;
    }
  }
  public void test_2() {
    List<Integer> expected = ListSequence.fromListAndArray(new ArrayList<Integer>(), 5, 4, 3, 2, 1);
    List<Integer> list = ListSequence.fromListAndArray(new ArrayList<Integer>(), 2, 4, 1, 5, 3);
    List<Integer> list_sorted = ListSequence.fromList(list).sort(new ISelector<Integer, Integer>() {
      public Integer select(Integer it) {
        return it;
      }
    }, false).toListSequence();
    int index = 0;
    for (Integer i : ListSequence.fromList(list_sorted)) {
      Assert.assertEquals(ListSequence.fromList(expected).getElement(index), i);
      index++;
    }
  }
}
