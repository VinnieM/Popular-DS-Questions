package code.datastructures.sort;

public class BubbleSort {

  /**
   * This is the standard Bubble sort. The time complexity is O(n2) and Space complexity is O(1).
   */
  public int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }
}
