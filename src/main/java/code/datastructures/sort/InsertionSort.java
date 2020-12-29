package code.datastructures.sort;

public class InsertionSort {

  /**
   * Standard insertion sort algorithm. Time complexity is O(n2) and Space complexity is O(1).
   */
  public int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int value = arr[i], j = i - 1;
      while (j >= 0 && arr[j] > value) {
        arr[j + 1] = arr[j];
        --j;
      }
      arr[j + 1] = value;
    }
    return arr;
  }
}
