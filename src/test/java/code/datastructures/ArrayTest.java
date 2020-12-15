package code.datastructures;

import code.datastructures.arrays.MaxAndSecondMax;
import code.datastructures.arrays.MaxMinElement;
import code.datastructures.arrays.NegativeElements;
import code.datastructures.arrays.NthSmallestElement;
import code.datastructures.arrays.ReverseArray;
import code.datastructures.arrays.SortCustomArray;
import code.utils.TestData;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

  private final Array arrayQuestions = new Array();

  @Test
  public void testReverseArray() {
    final ReverseArray reverseArray = new ReverseArray();
    int[] reversedArray = reverseArray.reverseArray(TestData.smallArray);
    Assert.assertArrayEquals(TestData.smallArrayReversed, reversedArray);
  }

  @Test
  public void testGetMaxAndMinValue() {
    final MaxMinElement maxMinElement = new MaxMinElement();
    int[] returnValue = maxMinElement.getMaxAndMinElement(TestData.largeArrayUnsorted);
    Assert.assertArrayEquals(new int[]{100, 1}, returnValue);

    returnValue = maxMinElement.getMaxAndMinElement(TestData.mediumArrayUnsorted);
    Assert.assertArrayEquals(new int[]{50, 1}, returnValue);
  }

  @Test
  public void testMaxAndSecondMax() {
    final MaxAndSecondMax maxAndSecondMax = new MaxAndSecondMax();
    int[] returnValue = maxAndSecondMax.getMaxAndSecondMax(TestData.largeArrayUnsorted);
    Assert.assertArrayEquals(new int[]{100, 99}, returnValue);

    returnValue = maxAndSecondMax.getMaxAndSecondMax(TestData.mediumArrayUnsorted);
    Assert.assertArrayEquals(new int[]{50, 49}, returnValue);
  }

  @Test
  public void testNthSmallest() {
    final NthSmallestElement smallestElement = new NthSmallestElement();
    int returnValue = smallestElement
        .findTheNthSmallestElement(TestData.randomNumbers, 39, 0, TestData.randomNumbers.length - 1);
    Assert.assertEquals(returnValue, -310);

    returnValue = smallestElement
        .findTheNthSmallestElement(TestData.randomNumbers,21,0, TestData.randomNumbers.length - 1);
    Assert.assertEquals(returnValue, -372);

    returnValue = smallestElement
        .findTheNthSmallestElement(TestData.randomNumbers, 115,0, TestData.randomNumbers.length - 1);
    Assert.assertEquals(returnValue, 41);
  }

  @Test
  public void testSortArrayOfZeroOneAndTwo() {
    final SortCustomArray customArray = new SortCustomArray();
    int[] temp = {0, 0, 0, 0, 1, 1, 2, 2};
    int[] returnValue = customArray.sortCustomArray(new int[]{0, 2, 1, 0, 2, 0, 1, 0});
    System.out.println(Arrays.toString(returnValue));
    Assert.assertArrayEquals(temp, returnValue);
  }

  @Test
  public void testMoveNegativeElementsToLeft() {
    final NegativeElements negativeElements = new NegativeElements();
    negativeElements.moveNegativeElementsToLeft(TestData.randomNumbers);
    System.out.println(Arrays.toString(TestData.randomNumbers));
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
  public void testFindDuplicateNumber() {
    int[] testValue = {3, 6, 8, 10, 2, 1, 3, -3, 9};
    int[] testValue1 = {1, 1};
    int[] testValue2 = {1, 1, 2};
    Assert.assertEquals(arrayQuestions.findDuplicateNumber(testValue), 3);
    Assert.assertEquals(arrayQuestions.findDuplicateNumber(testValue1), 1);
    Assert.assertEquals(arrayQuestions.findDuplicateNumber(testValue2), 1);
  }

  @Test
  public void testFindDuplicateNumbers() {
    int[] testValue = {3, 6, 8, 10, 2, 1, 3, -3, 9, 2};
    arrayQuestions.findAllDuplicatesNumbers(testValue);
  }

  @Test
  public void testMerge() {
    int[] testValue = {1, 3, 5, 7};
    int[] testValue2 = {0, 2, 6, 8, 9};
    arrayQuestions.merge(testValue, testValue2);
  }

  @Test
  public void testKadanesAlgorithm() {
    int[] testValue = {1, 2, 3, -2, 5};
    int[] testValue2 = {-1, -2, -3, -4};
    Assert.assertEquals(arrayQuestions.kadanesAlgorithm(testValue), 9);
    Assert.assertEquals(arrayQuestions.kadanesAlgorithm(testValue2), -1);
  }

  @Test
  public void testFindDuplicate() {
    int[] testValue = {3, 1, 3, 4, 2};
    Assert.assertEquals(arrayQuestions.findDuplicateNum(testValue), 3);
  }

  @Test
  public void testMoveZeroToLeft() {
    int[] testValue = {1, 3, 0, 2, 5, 0, 7};
    int[] expectedValue = {0, 0, 1, 3, 2, 5, 7};
    Assert.assertArrayEquals(arrayQuestions.moveZeroToLeft(testValue), expectedValue);
  }

  @Test
  public void testPrintPowerSet() {
    arrayQuestions.printPowerSet("ABC");
  }
}
