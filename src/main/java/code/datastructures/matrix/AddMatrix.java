package code.datastructures.matrix;

public class AddMatrix {

  public int[][] addMatrix(int[][] firstMatrix, int[][] secondMatrix) {
    for (int i = 0; i < firstMatrix.length; i++) {
      for (int j = 0; j < firstMatrix[i].length; j++) {
        secondMatrix[i][j] += firstMatrix[i][j];
      }
    }
    return secondMatrix;
  }
}
