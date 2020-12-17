package code.datastructures.arrays;

import java.util.Arrays;

public class ArrayUnion {

  /**
   * Merge 2 sorted Arrays. Time complexity is O(l + m + n). Space complexity is O(n).
   * Level - Medium.
   */
  public int[] mergeSortedArrays(int[] array1, int[] array2) {
    int[] arrayToReturn = new int[array1.length + array2.length];
    int i = 0, j = 0, k = 0,
        array1Length = array1.length, array2Length = array2.length;
    while (i < array1Length && j < array2Length) {
      if (array1[i] < array2[j]) {
        arrayToReturn[k++] = array1[i++];
      } else if (array1[i] > array2[j]) {
        arrayToReturn[k++] = array2[j++];
      } else if (array1[i] == array2[j]) {
        arrayToReturn[k++] = array1[i++];
        ++j;
      }
    }
    while (i < array1Length) {
      arrayToReturn[k++] = array1[i++];
    }
    while (j < array2Length) {
      arrayToReturn[k++] = array2[j++];
    }
    return arrayToReturn;
  }

  /**
   * Merge 2 sorted arrays without using extra space. We need to merge these two arrays such that
   * the initial numbers (after complete sorting) are in the first array and the remaining numbers
   * are in the second array.E.G - Array 1 - {3} Array2 {1, 2}. Output should be Array1 - {1} and
   * Array2 - {2, 3}. Time complexity is O(m log m + n). Space complexity is O(1).
   * Level - Medium.
   */
  public void mergeArrays(int[] array1, int[] array2) {
    for (int i = 0; i < array1.length - 1; i++) {
      if (array2[0] > array1[i]) {
        int temp = array2[0];
        array2[0] = array1[i + 1];
        array1[i + 1] = temp;
        Arrays.sort(array2);
      }
    }
  }
}
