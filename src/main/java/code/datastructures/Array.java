package code.datastructures;

import java.util.Arrays;
import java.util.HashMap;

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

  /**
   * Program to sort an array containing only 0's, 1's and 2 without using any sorting algorithm and
   * without using any extra memory.
   */
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

  /**
   * Program to move all the negative elements to the left and positive elements to the right.
   */
  public void moveNegativeElementsToLeft(int[] arr) {
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        swap(arr, i, j);
        ++j;
      }
    }
  }

  /**
   * Program to find the union of 2 sorted arrays.
   */
  public void UnionOfTwoArrays(int[] array1, int[] array2) {
    int[] arrayToReturn = new int[array1.length + array2.length];
    int i = 0, j = 0, k = 0,
        array1Length = array1.length, array2Length = array2.length;
    quickSort(array1, 0, array1.length - 1);
    quickSort(array2, 0, array2.length - 1);
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
    System.out.println(Arrays.toString(arrayToReturn));
  }

  private void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pivot = getPivot(arr, low, high);
      quickSort(arr, low, pivot - 1);
      quickSort(arr, pivot + 1, high);
    }
  }

  private int getPivot(int[] arr, int low, int high) {
    int pivot = arr[high], j = low;
    for (int i = low; i < high; i++) {
      if (arr[i] < pivot) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        ++j;
      }
    }
    int temp = arr[j];
    arr[j] = arr[high];
    arr[high] = temp;
    return j;
  }

  /**
   * Cyclically rotate an array n number of times, where n is less than or equal to the size of the
   * array.
   */
  // 1,2,3,4,5
  public int[] cyclicRotationOfArray(int[] arr, int n) {
    int[] arrayToReturn = new int[arr.length];
    int i, j = 0;
    for (i = n; i < arr.length; i++, j++) {
      arrayToReturn[j] = arr[i];
    }
    for (i = 0; i < n; i++, j++) {
      arrayToReturn[j] = arr[i];
    }
    return arrayToReturn;
  }

  /**
   * Program to find the largest subarry.
   */
  public int largestSubArray(int[] arr) {
    int maxValue = arr[0];
    int currentMax = arr[0];
    for (int i = 1; i < arr.length; i++) {
      currentMax = Math.max(currentMax + arr[i], arr[i]);
      maxValue = Math.max(maxValue, currentMax);
    }
    return maxValue;
  }

  /**
   * Minimum number of jumps.
   */
  public int minimumNumberOfJumps(int[] arr) {
    int currentLength = arr.length - 1, totalJumps = 0,
        i = 0, value = 0;
    while (true) {
      value = arr[i];
      if (value >= currentLength) {
        return ++totalJumps;
      } else if (value == 0) {
        return -1;
      }
      i = i + value;
      ++totalJumps;
      currentLength -= i;
    }
  }

  /**
   * Find the duplicate number in an array where only one number is duplicated.
   */
  public int findDuplicateNumber(int[] arr) {
    if (arr.length > 1) {
      quickSort(arr, 0, arr.length - 1);
      int previous = 0;
      for (int i = 1; i < arr.length; i++) {
        if (arr[i] == arr[previous]) {
          return arr[i];
        }
        ++previous;
      }
      return -1;
    } else {
      return arr[0];
    }
  }

  /**
   * Find all the duplicate numbers in an array.
   */
  public void findDuplicatesNumbers(int[] arr) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int eachValue : arr) {
      if (hashMap.containsKey(eachValue)) {
        int value = hashMap.get(eachValue);
        hashMap.put(eachValue, ++value);
      } else {
        hashMap.put(eachValue, 1);
      }
    }
    hashMap.forEach((x, y) -> {
      if (y > 1) {
        System.out.println("The number " + x + " is repeating " + y + " times.");
      }
    });
  }

  /**
   * Merge 2 arrays without extra space
   */
  public void merge(int[] arr1, int[] arr2) {
    int i = 0, j = 0;
    int arr1Length = arr1.length, arr2Length = arr2.length;

    while (i < arr1Length && j < arr2Length) {
      if (arr1[i] < arr2[j]) {
        System.out.print(arr1[i] + " ");
        ++i;
      } else {
        System.out.print(arr2[j] + " ");
        ++j;
      }
    }
    while (i < arr1Length) {
      System.out.print(arr1[i] + " ");
      ++i;
    }
    while (j < arr2Length) {
      System.out.print(arr2[j] + " ");
      ++j;
    }
  }
}
