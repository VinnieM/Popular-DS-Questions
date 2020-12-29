package code.datastructures;

import code.datastructures.sort.BubbleSort;
import code.datastructures.sort.InsertionSort;
import code.datastructures.sort.MergeSort;
import code.datastructures.sort.QuickSort;
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

  @Test
  public void testQuickSort() {
    QuickSort quickSort = new QuickSort();
    Assert.assertArrayEquals(quickSort.sort(TestData.tinyArrayUnsorted), TestData.tinyArray);
    Assert.assertArrayEquals(quickSort.sort(TestData.largeArrayUnsorted), TestData.largeArray);
  }

  @Test
  public void testMergeSort() {
    MergeSort mergeSort = new MergeSort();
    Assert.assertArrayEquals(mergeSort.sort(TestData.tinyArrayUnsorted), TestData.tinyArray);
    Assert.assertArrayEquals(mergeSort.sort(TestData.largeArrayUnsorted), TestData.largeArray);
  }
}