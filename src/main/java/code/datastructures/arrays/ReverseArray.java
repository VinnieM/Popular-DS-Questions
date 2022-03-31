package code.datastructures.arrays;

public class ReverseArray {

  /**
   * This function reverses an integer array.
   * This time complexity is O(n) and space complexity is O(1);
   */
  public int[] reverseArray(int[] array) {
    int low = 0, high = array.length - 1;
    while (low < high) {
      int temp = array[low];
      array[low] = array[high];
      array[high] = temp;
      ++low;
      --high;
    }
    return array;
  }
}