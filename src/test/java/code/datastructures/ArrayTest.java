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

  @Test
  public void testSortArrayOfZeroOneAndTwo() {
    int[] temp = {0, 0, 0, 0, 1, 1, 2, 2};
    int[] returnValue = arrayQuestions.sortArrayOfZeroOneAndTwo(new int[]{0, 2, 1, 0, 2, 0, 1, 0});
    Assert.assertArrayEquals(temp, returnValue);
  }

  @Test
  public void testMoveNegativeElementsToLeft() {
    arrayQuestions.moveNegativeElementsToLeft(TestData.randomNumbers);
  }

  @Test
  public void testFindUnionOfArrays() {
    arrayQuestions.UnionOfTwoArrays(TestData.tinyArrayUnsorted, TestData.tinyArrayUnsorted);
  }

  @Test
  public void testCyclicRotationOfArray() {
    int[] testValue1 = {3, 4, 5, 1, 2};
    int[] testValue2 = {5, 1, 2, 3, 4};

    Assert.assertArrayEquals(testValue1,
        arrayQuestions.cyclicRotationOfArray(TestData.tinyArray, 2));
    Assert.assertArrayEquals(testValue2,
        arrayQuestions.cyclicRotationOfArray(TestData.tinyArray, 4));
  }

  @Test
  public void testLargestSubArray() {
    int[] testValue = {-3, 8, -2, 4, -5, 6};
    Assert.assertEquals(arrayQuestions.largestSubArray(testValue), 11);
  }

  @Test
  public void testSomething() {
    int[] temp = {1, 4, 3, 2, 6, 7};
    int[] temp2 = {1, 3, 5, 8, 9, 2, 6, 2, 6, 8, 9, 10, 4, 7, 10};
    int[] temp3 = {1, 0, 3, 2, 6, 7};
    Assert.assertEquals(arrayQuestions.minimumNumberOfJumps(temp), 2);
    Assert.assertEquals(arrayQuestions.minimumNumberOfJumps(temp2), 3);
    Assert.assertEquals(arrayQuestions.minimumNumberOfJumps(temp3), -1);
  }
}
