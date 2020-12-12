package code.datastructures.arrays;

public class NthSmallestElement {

  public int findTheNthSmallestElement(int[] arr, int nThSmallest, int low, int high) {
    if (low < high) {
      int pivot = lomutoPartition(low, high, arr);
      if (pivot == nThSmallest) {
        return arr[pivot];
      }
      if (nThSmallest > pivot) {
        return findTheNthSmallestElement(arr, nThSmallest, pivot + 1, high);
      }
      return findTheNthSmallestElement(arr, nThSmallest, low, pivot - 1);
    }
    return -1;
  }

  public int lomutoPartition(int low, int high, int[] arr) {
    int pivot = arr[high], j = low;
    for (int i = low; i < high; i++) {
      if (arr[i] < pivot) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        ++j;
      }
    }
    int temp = arr[high];
    arr[high] = arr[j];
    arr[j] = temp;
    return j;
  }
}
