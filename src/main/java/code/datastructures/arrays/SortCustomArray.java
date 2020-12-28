package code.datastructures.arrays;

public class SortCustomArray {

  /**
   * Sort an array which contains only 0, 1, 2 in O(n) time and O(1) space.
   * This algorithm is also called the Dijkstra's Dutch national flag problem.
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

  /**
   * Alternate approach to solving the Dutch National problem.
   */
  public int[] sortCustomArray_Solution2(int[] arr) {
    int low = 0, mid = 0, high = 0;
    for (int i : arr) {
      if (i == 0) {
        ++low;
      } else if (i == 1) {
        ++mid;
      } else {
        ++high;
      }
    }
    int i = 0;
    while (low > 0) {
      arr[i] = 0;
      --low;
      ++i;
    }
    while (mid > 0) {
      arr[i] = 1;
      --mid;
      ++i;
    }
    while (high > 0) {
      arr[i] = 2;
      --high;
      ++i;
    }

    return arr;
  }
}