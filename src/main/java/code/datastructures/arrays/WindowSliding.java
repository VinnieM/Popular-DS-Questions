package code.datastructures.arrays;

public class WindowSliding {

  /**
   * This is the window sliding algorithm. This technique is useful to compute a running average,
   * sum or finding adjacent pair.
   * Level - Medium.
   */
  public int slidingWindow(int[] arr, int windowSize) {
    int maxSum = 0, windowSum = 0;
    for (int i = 0; i < windowSize; i++) {
      maxSum += arr[i];
    }
    windowSum = maxSum;
    for (int i = windowSize; i < arr.length; i++) {
      windowSum += arr[i] - arr[i - windowSize];
      maxSum = Math.max(windowSum, maxSum);
    }
    return maxSum;
  }

  /**
   * Given an array of size n, find the maximum for sum for k consecutive elements. Time complexity
   * is O(n) and space complexity is O(1).
   * Level - Medium.
   */
  public int getMaximumSum(int[] arr, int k) {
    if (k > arr.length) {
      return -1;
    }
    int maxSum = 0, windowSum = 0;
    for (int i = 0; i < k; i++) {
      windowSum += arr[i];
    }
    maxSum = windowSum;
    for (int i = k; i < arr.length; i++) {
      windowSum += arr[i] - arr[i - k];
      maxSum = Math.max(maxSum, windowSum);
    }
    return maxSum;
  }
}
