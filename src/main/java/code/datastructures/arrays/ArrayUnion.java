package code.datastructures.arrays;

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
}
