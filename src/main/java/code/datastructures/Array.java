package code.datastructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Stack;

public class Array {

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
   * Find all the duplicate numbers in an array.
   */
  public void findAllDuplicatesNumbers(int[] arr) {
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

  /**
   * This the Kadane's Algorithm which is used to find the longest subarray sequence.
   */
  public int kadanesAlgorithm(int[] arr) {
    int currentMax = arr[0], maxSum = arr[0];
    for (int i = 1; i < arr.length; i++) {
      currentMax = Math.max(currentMax + arr[i], arr[i]);
      maxSum = Math.max(currentMax, maxSum);
    }
    return maxSum;
  }

  /**
   * Given an array, move all the zeros to the left and other elements to the right in O(n) time and
   * O(1) space.
   */
  public int[] moveZeroToLeft(int[] arr) {
    int j = arr.length - 1;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] != 0) {
        arr[j] = arr[i];
        --j;
      }
    }
    while (j >= 0) {
      arr[j] = 0;
      --j;
    }
    return arr;
  }

  /**
   * Any person in the queue can bribe the person directly in front of them to swap positions. If
   * two people swap positions, they still wear the same sticker denoting their original places in
   * line. One person can bribe at most two others.
   */
  public void newYearChaos(int[] arr) {
    boolean isChaos = false;
    int bribe = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] - (i + 1) > 2) {
        isChaos = true;
        break;
      }
      for (int j = Math.max(0, arr[i] - 2); j < i; j++) {
        ++bribe;
      }
    }
    if (isChaos) {
      System.out.println("Too Chaotic");
    } else {
      System.out.println(bribe);
    }
  }

  /**
   * Merge Overlapping intervals.
   */
  public void mergeIntervals(Interval[] intervalArray) {
    if (intervalArray.length < 1) {
      return;
    }
    Arrays.sort(intervalArray, Comparator.comparingInt(o -> o.start));
    Stack<Interval> stack = new Stack<>();
    stack.push(intervalArray[0]);

    for (int i = 1; i < intervalArray.length; i++) {
      Interval eachInterval = stack.peek();
      if (eachInterval.end > intervalArray[i].start) {
        eachInterval.end = intervalArray[i].end;
        stack.pop();
        stack.push(eachInterval);
      } else if (eachInterval.end < intervalArray[i].start) {
        stack.add(intervalArray[i]);
      }
    }
    stack.forEach(System.out::println);
  }

  /**
   * Program to print the power set of a given string.
   */
  public void printPowerSet(String arg) {
    for (int i = 0; i < arg.length(); i++) {
      for (int j = i; j < arg.length(); j++) {
        System.out.println(arg.substring(i, j + 1));
      }
    }
  }
}

/**
 * Creating Interval class for Merge Intervals problem.
 */
class Interval {

  int start, end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public String toString() {
    return start + " " + end;
  }
}