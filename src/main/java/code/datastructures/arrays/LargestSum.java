package code.datastructures.arrays;

public class LargestSum {

  /**
   * This function finds the maximum sum present inside a contiguous sub array. Time complexity is
   * O(n) and space complexity is O(1).
   * Level - Medium.
   */
  public int largestContiguousSubArray(int[] arr) {
    int currentMax = arr[0], totalToReturn = 0;
    for (int i = 1; i < arr.length; i++) {
      currentMax = Math.max(arr[i], currentMax + arr[i]);
      totalToReturn = Math.max(currentMax, totalToReturn);
    }
    return totalToReturn;
  }
}
