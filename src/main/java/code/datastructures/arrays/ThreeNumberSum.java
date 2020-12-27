package code.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers, are there elements a, b, c in array such that a + b + c =
 * target Number. Find all unique triplets in the array and the triplets should be in ascending
 * order.
 */
public class ThreeNumberSum {

  /**
   * Naive solution. Time complexity is O(n3) and Space complexity is O(1).
   */
  public List<Integer[]> threeNumberSum(int[] array, int totalValue) {
    List<Integer[]> returnValue = new ArrayList<>();
    Arrays.sort(array);
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        for (int k = j + 1; k < array.length; k++) {
          if (array[i] + array[j] + array[k] == totalValue) {
            Integer[] intArray = {array[i], array[j], array[k]};
            returnValue.add(intArray);
          }
        }
      }
    }
    return returnValue;
  }

  public List<Integer[]> threeNumberSum_Solution2(int[] array, int totalValue) {
    Arrays.sort(array);
    List<Integer[]> returnValue = new ArrayList<>();

    for (int i = 0; i < array.length; i++) {
      int j = i + 1, k = array.length - 1;
      while (j < k) {
        if (array[i] + array[j] + array[k] > totalValue) {
          --k;
        } else if (array[i] + array[j] + array[k] < totalValue) {
          ++j;
        } else if (array[i] + array[j] + array[k] == totalValue) {
          Integer[] intArray = {array[i], array[j], array[k]};
          returnValue.add(intArray);
          ++j;
          --k;
        }
      }
    }
    return returnValue;
  }
}
