package code.datastructures;

import code.datastructures.sort.BubbleSort;
import code.datastructures.sort.InsertionSort;
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

  @Test
  public void testInsertionSort() {
    InsertionSort sort = new InsertionSort();
    Assert.assertArrayEquals(sort.insertionSort(TestData.tinyArrayUnsorted), TestData.tinyArray);
    Assert.assertArrayEquals(sort.insertionSort(TestData.largeArrayUnsorted), TestData.largeArray);
  }
}