package code.datastructures.arrays;

public class NegativeElements {

  /**
   * This function moves all the negative elements to the left side of the array. Time complexity is O(n) space complexity is O(1).
   * Level - Easy.
   */
  public void moveNegativeElementsToLeft(int[] arr) {
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        ++j;
      }
    }
  }
}
