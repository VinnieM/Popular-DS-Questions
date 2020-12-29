package code.datastructures;

import code.datastructures.sort.BubbleSort;
import code.utils.TestData;
import org.junit.Assert;
import org.junit.Test;

public class SortTest {

  @Test
  public void testBubbleSort() {
    BubbleSort sort = new BubbleSort();
    Assert.assertArrayEquals(sort.bubbleSort(TestData.tinyArrayUnsorted), TestData.tinyArray);
    Assert.assertArrayEquals(sort.bubbleSort(TestData.largeArrayUnsorted), TestData.largeArray);
  }
}
