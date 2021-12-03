package code.datastructures.arrays;

public class MaxAndSecondMax {

  /**
   * Get the Max and second max from an array. Time complexity is O(n) and space complexity is O(1).
   * Level - Easy.
   */
  public int[] getMaxAndSecondMax(int[] arr) {
    int max = arr[0], secondMax = Integer.MIN_VALUE;
    for (int i = 0; i< arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != max && arr[i] > secondMax) {
        secondMax = arr[i];
      }
    }
    return new int[]{max, secondMax};
  }
}
