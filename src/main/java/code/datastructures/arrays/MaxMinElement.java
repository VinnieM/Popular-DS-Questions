package code.datastructures.arrays;

public class MaxMinElement {

  /**
   * Get the max and min element in an unsorted array. Time complexity is O(n) and space complexity
   * is O(1).
   * Level - Easy.
   */
  public int[] getMaxAndMinElement(int[] arr) {
    int max = arr[0], min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return new int[]{max, min};
  }
}
