package code.datastructures;

import code.datastructures.matrix.AddMatrix;
import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {

  @Test
  public void addMatrixTest() {
    int[][] input = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
    int[][] expectedValue = {{2, 2, 2, 2}, {4, 4, 4, 4,}, {6, 6, 6, 6}, {8, 8, 8, 8}};
    AddMatrix add = new AddMatrix();
    Assert.assertArrayEquals(expectedValue, add.addMatrix(input, input));
  }
}
