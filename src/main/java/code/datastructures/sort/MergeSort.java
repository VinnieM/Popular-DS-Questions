package code.datastructures.sort;

public class MergeSort {

  public int[] sort(int[] arr) {
    if (arr.length < 2) {
      return arr;
    }
    int midPoint = arr.length / 2;
    int[] leftArray = new int[midPoint];
    int[] rightArray = new int[arr.length - midPoint];

    for (int i = 0; i < midPoint; i++) {
      leftArray[i] = arr[i];
    }
    for (int i = midPoint, j = 0; i < arr.length; i++, j++) {
      rightArray[j] = arr[i];
    }
    sort(leftArray);
    sort(rightArray);
    return mergeArray(leftArray, rightArray, arr);
  }

  private int[] mergeArray(int[] leftArray, int[] rightArray, int[] mainArray) {
    int i = 0, j = 0, k = 0;
    while (i < leftArray.length && j < rightArray.length) {
      if (leftArray[i] < rightArray[j]) {
        mainArray[k++] = leftArray[i++];
      } else {
        mainArray[k++] = rightArray[j++];
      }
    }
    while (i < leftArray.length) {
      mainArray[k++] = leftArray[i++];
    }
    while (j < rightArray.length) {
      mainArray[k++] = rightArray[j++];
    }
    return mainArray;
  }
}
