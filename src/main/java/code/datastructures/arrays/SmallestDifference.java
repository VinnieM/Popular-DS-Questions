package code.datastructures.arrays;

import java.util.Arrays;

public class SmallestDifference {

  /**
   * This function returns a number from each array where the difference is closest to zero. The
   * time complexity is O(n+m log(n) + log(m)). Space complexity is O(1).
   */
  public int[] smallestDifference(int[] arr1, int[] arr2) {
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    int i = 0, j = 0, result = 0, currentSum = Integer.MAX_VALUE;
    int[] arrayToReturn = new int[2];
    while (i < arr1.length && j < arr2.length) {
      int number1 = arr1[i], number2 = arr2[j];
      if (number1 > number2) {
        result = number1 - number2;
        ++j;
      } else {
        result = number2 - number1;
        ++i;
      }
      if (result == 0) {
        return new int[]{number1, number2};
      }
      if (currentSum > result) {
        currentSum = result;
        arrayToReturn[0] = number1;
        arrayToReturn[1] = number2;
      }
    }
    return arrayToReturn;
  }
}
