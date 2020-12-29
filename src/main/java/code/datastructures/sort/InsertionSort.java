package code.datastructures.sort;

public class InsertionSort {

  public void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int value = arr[i], j = i - 1;
      while (j >= 0 && arr[j] > value) {
        arr[j + 1] = arr[j];
        --j;
      }
      arr[j + 1] = value;
    }
  }
}
