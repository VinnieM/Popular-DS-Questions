package code.datastructures.arrays;

public class MoveElements {

  public int[] moveElementToRight(int[] arr, int elementToMove) {
    int i = 0, j = arr.length - 1;
    while (i < j) {
      while (arr[j] == elementToMove && i < j) {
        --j;
      }
      if (arr[i] == elementToMove) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      ++i;
    }
    return arr;
  }
}
