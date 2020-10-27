package code.datastructures;

public class Array {

  /**
   * Reverse an array in place. This is done in O(n) time and O(1) space.
   */
  public int[] reverseArray(int[] arr) {
    int low = 0, high = arr.length - 1;
    while (low < high) {
      int temp = arr[high];
      arr[high] = arr[low];
      arr[low] = temp;
      ++low;
      --high;
    }
    return arr;
  }

  /**
   * Get the Max and Min in an Array in O(n) time and O(1) space.
   */
  public int[] getMaxAndMinElement(int[] arr) {
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return new int[]{max, min};
  }

  /**
   * Get the Nth smallest element in an Array
   */
  public int getNthSmallest(int[] arr, int low, int high, int element) {
    int pivot = lomutoPartition(arr, low, high);
    if (element == pivot) {
      return arr[pivot];
    } else if (element < pivot) {
      return getNthSmallest(arr, low, pivot - 1, element);
    } else {
      return getNthSmallest(arr, pivot + 1, high, element);
    }
  }

  private int lomutoPartition(int[] arr, int low, int high) {
    int pivot = arr[high], j = low;
    for (int i = low; i < high; i++) {
      if (arr[i] < pivot) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        ++j;
      }
    }
    swap(arr, j, high);
    return j;
  }

  private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public int[] sortArrayOfZeroOneAndTwo(int[] arr) {
    int low = 0, mid = 0, high = arr.length - 1;
    while (mid <= high) {
      if (arr[mid] == 0) {
        swap(arr, low, mid);
        ++low;
        ++mid;
      } else if (arr[mid] == 1) {
        ++mid;
      } else {
        swap(arr, mid, high);
        --high;
      }
    }
    return arr;
  }
}
