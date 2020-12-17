package code.datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

  /**
   * Find the duplicate number in an unsorted array. Time complexity O(n2), Space complexity is
   * O(1). Returns -1 is duplicate numbers are not found. Level - Easy.
   */
  public int findDuplicateNumber_Naive(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (i != j && arr[i] == arr[j]) {
          return arr[i];
        }
      }
    }
    return -1;
  }

  /**
   * Find the duplicate number in an unsorted array. Time complexity is O(n) and space complexity is
   * O(n). Level - Easy
   */
  public int findDuplicateNumber_ExtraSpace(int[] arr) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      if (set.contains(arr[i])) {
        return arr[i];
      }
      set.add(arr[i]);
    }
    return -1;
  }

  /**
   * This function finds the duplicate number in a given array in O(n Log n) time and O(1) space.
   * Level - Medium.
   */
  public int findDuplicateNumber_Sorting(int[] arr) {
    quickSort(0, arr.length - 1, arr);
    int j = 0;
    for (int i = 1; i < arr.length; i++, j++) {
      if (arr[j] == arr[i]) {
        return arr[j];
      }
    }
    return -1;
  }

  /**
   * This function finds the duplicate number, where an array contains N + 1 integers. Time complexity is O(n) and space complexity is O(1).
   * Level - Medium.
   */
  public int findDuplicateNumber_Fastest(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int index = Math.abs(arr[i]) - 1;
      if (index < arr.length -1 ) {
        if (arr[index] < 0) {
          return Math.abs(arr[index]);
        }
        arr[index] = -arr[index];
      }
    }
    return -1;
  }

  /**
   * Find the duplicate number in a string where it time should be less than O(n2) and space should
   * be O(1).
   */
  public int findDuplicateNum(int[] arr) {
    int slow = 0, fast = 0;
    do {
      slow = arr[slow];
      fast = arr[arr[fast]];
    } while (slow != fast);
    slow = 0;
    while (slow != fast) {
      slow = arr[slow];
      fast = arr[fast];
    }
    return slow;
  }

  private void quickSort(int low, int high, int[] arr) {
    if (low < high) {
      int pivot = lomutoPartition(low, high, arr);
      quickSort(low, pivot - 1, arr);
      quickSort(pivot + 1, high, arr);
    }
  }

  private int lomutoPartition(int low, int high, int[] arr) {
    int pivot = arr[high], j = low;
    for (int i = low; i < high; i++) {
      if (arr[i] < pivot) {
        swap(i, j, arr);
        ++j;
      }
    }
    swap(j, high, arr);
    return j;
  }

  private void swap(int i, int j, int[] arr) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
