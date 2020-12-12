package code.datastructures.recursion;

import java.util.Arrays;

public class Permutations {

  /**
   * Given an array, print all possible unique permutations.
   */
  public void printAllPermutations(int[] arr, int start, int end) {
    if (start == end) {
      System.out.println(Arrays.toString(arr));
    } else {
      for (int i = start; i <= end; i++) {
        swap(start, i , arr);
        printAllPermutations(arr, start + 1, end);
        swap(start, i, arr);
      }
    }
  }

  private void swap(int i, int j, int[] arr) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
