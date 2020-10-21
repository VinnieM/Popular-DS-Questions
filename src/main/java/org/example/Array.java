package org.example;

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
}
