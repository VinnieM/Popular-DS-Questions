package code.datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

  /**
   * Find the duplicate number in an unsorted array. Time complexity O(n2), Space complexity is
   * O(1). Returns -1 is duplicate numbers are not found. Level - Easy.
   */
  public int findDuplicateNumbers(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (i !=j && arr[i] == arr[j]) {
          return arr[i];
        }
      }
    }
    return -1;
  }

  /**
   * Find the duplicate number in an unsorted array. Time complexity is O(n) and space complexity is
   * O(n).
   * Level - Easy
   */
  public int findDuplicateNumbersBetterWay(int[] arr) {
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
  public int findDuplicateNumbersAnotherWay(int[] arr) {
    quickSort(0, arr.length - 1, arr);
    int j = 0;
    for (int i = 1; i < arr.length; i++, j++) {
      if (arr[j] == arr[i]) {
        return arr[j];
      }
    }
    return -1;
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
