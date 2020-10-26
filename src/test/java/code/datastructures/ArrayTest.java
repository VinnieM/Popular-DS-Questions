package code.datastructures;

import code.utils.TestData;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

  private final Array arrayQuestions = new Array();


  @Test
  public void testReverseArray() {
    int[] reversedArray = arrayQuestions.reverseArray(TestData.smallArray);
    Assert.assertArrayEquals(TestData.smallArrayReversed, reversedArray);
  }

  @Test
  public void testGetMaxAndMinValue() {
    int[] returnValue = arrayQuestions.getMaxAndMinElement(TestData.largeArrayUnsorted);
    Assert.assertArrayEquals(new int[]{100, 1}, returnValue);

    returnValue = arrayQuestions.getMaxAndMinElement(TestData.mediumArrayUnsorted);
    Assert.assertArrayEquals(new int[]{50, 1}, returnValue);
  }

  @Test
  public void testNthSmallest() {
    int returnValue = arrayQuestions
        .getNthSmallest(TestData.randomNumbers, 0, TestData.randomNumbers.length - 1, 39);
    Assert.assertEquals(returnValue, -310);

    returnValue = arrayQuestions
        .getNthSmallest(TestData.randomNumbers, 0, TestData.randomNumbers.length - 1, 21);
    Assert.assertEquals(returnValue, -372);

    returnValue = arrayQuestions
        .getNthSmallest(TestData.randomNumbers, 0, TestData.randomNumbers.length - 1, 115);
    Assert.assertEquals(returnValue, 41);
  }
}
