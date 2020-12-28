package code.datastructures.arrays;

public class MoveToLeft {

  public int[] moveZeroToLeft(int[] arr) {
    int j = arr.length - 1;
    for (int i = arr.length -1 ; i >= 0; i--) {
      if (arr[i] != 0) {
        swap(i, j, arr);
        --j;
      }
    }
    for (int i = 0; i <= j; i++) {
      arr[i] = 0;
    }
    return arr;
  }

  private void swap(int i, int j, int[] arr) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
