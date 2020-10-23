package code.datastructures;

public class Array {

  /**
   * Reverse an array in place. This is done in O(n) time and O(1) space.
   */
  public int[] reverseArray(int[] arr) {
    int low = 0, high = arr.length - 1;
    while (low < high) {
      int temp = arr[high];
      arr[high] = arr[low];
      arr[low] = temp;
      ++low;
      --high;
    }
    return arr;
  }

  /**
   * Get the Max and Min in an Array in O(n) time and O(1) space.
   */
  public int[] getMaxAndMinElement(int[] arr) {
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return new int[]{max, min};
  }

  /**
   * Get the Nth smallest element in an Array
   */
  public int getNthSmallest(int[] arr, int element) {
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == element) {
        swap(arr, i, arr.length - 1);
      }
      if (arr[i] < element) {
        swap(arr, i, j);
        ++j;
      }
    }
    swap(arr, j, arr.length - 1);
    return j;
  }

  public void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
