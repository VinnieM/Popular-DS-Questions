package code.datastructures.arrays;

public class RotateArray {

  public int[] cyclicRotation(int[] arr, int numberOfRotations) {
    int j = 0;
    int[] returnValue = new int[arr.length];
    for (int i = numberOfRotations; i < arr.length; i++) {
      returnValue[j] = arr[i];
      ++j;
    }
    for (int i = 0; i < numberOfRotations; i++, j++) {
      returnValue[j] = arr[i];
    }
    return returnValue;
  }
}
