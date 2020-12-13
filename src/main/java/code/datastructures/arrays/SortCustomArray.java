package code.datastructures.arrays;

public class SortCustomArray {

  /**
   * Sort an array which contains only 0, 1, 2 in O(n) time and O(1) space.
   */
  public int[] sortCustomArray(int[] arr) {
    int low = 0, mid = 0, high = arr.length - 1;
    while (mid <= high) {
      if (arr[mid] == 0) {
        swap(low, mid, arr);
        ++low;
        ++mid;
      } else if (arr[mid] == 1) {
        ++mid;
      } else if (arr[mid] == 2) {
        swap(mid, high, arr);
        --high;
      }
    }
    return arr;
  }

  private void swap(int i, int j, int[] arr) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}