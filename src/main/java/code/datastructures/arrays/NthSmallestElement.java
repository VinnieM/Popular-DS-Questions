package code.datastructures.arrays;

public class NthSmallestElement {

  /**
   * Function to find the nth smallest element in an array. Time complexity is O(n) in average case
   * and space complexity is O(n). Level - Medium
   */
  public int findTheNthSmallestElement(int[] array, int nThSmallest, int left, int right) {
    if (left < right) {
      int position = lomutoPartition(left, right, array);
      int count = position - left + 1;
      if (count == nThSmallest) {
        return array[position];
      }
      if (count > nThSmallest) {
        return findTheNthSmallestElement(array, nThSmallest, left, position - 1);
      }
      return findTheNthSmallestElement(array, nThSmallest - count, position + 1, right);
    }
    return -1;
  }

  /**
   * This partition picks the last element and puts all the smaller elements on the right side and
   * the greater elements on left side.
   */
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
