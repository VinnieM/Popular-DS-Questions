package code.datastructures.matrix;

public class PrintMatrix {

  /**
   * This function prints a NxM matrix.
   */
  public void printMatrix(int[][] matrix) {
    for (int x = 0; x < matrix.length; x++) {
      for (int y = 0; y < matrix[x].length; y++) {
        if (matrix[x][y] < 9) {
          System.out.println(matrix[x][y] + " ");
        } else {
          System.out.println(matrix[x][y] + "  ");
        }
      }
    }
  }
}
