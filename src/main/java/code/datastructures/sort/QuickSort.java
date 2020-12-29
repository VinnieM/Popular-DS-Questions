package code.datastructures.sort;

public class QuickSort {

  /**
   * This is the standard quicksort algorithm. The average case time complexity is O(n log n) and
   * worst case is O(n2). The space complexity is O(log n). This space is used in the stack to store
   * recursive calls.
   */
  public int[] sort(int[] arr) {
    return quickSort(0, arr.length - 1, arr);
  }

  private int[] quickSort(int low, int high, int[] arr) {
    if (low < high) {
      int pivot = lomutoPartition(low, high, arr);
      quickSort(low, pivot - 1, arr);
      quickSort(pivot + 1, high, arr);
    }
    return arr;
  }

  private int lomutoPartition(int low, int high, int[] arr) {
    int pivot = arr[high], j = low;
    for (int i = low; i < high; i++) {
      if (arr[i] < pivot) {
        swap(i, j, arr);
        ++j;
      }
    }
    swap(j, high, arr);
    return j;
  }

  private void swap(int i, int j, int[] arr) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
