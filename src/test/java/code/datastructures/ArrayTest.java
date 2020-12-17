package code.datastructures;

import code.datastructures.arrays.ArrayUnion;
import code.datastructures.arrays.DuplicateNumber;
import code.datastructures.arrays.LargestSum;
import code.datastructures.arrays.MaxAndSecondMax;
import code.datastructures.arrays.MaxMinElement;
import code.datastructures.arrays.NegativeElements;
import code.datastructures.arrays.NthSmallestElement;
import code.datastructures.arrays.ReverseArray;
import code.datastructures.arrays.RotateArray;
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
        .findTheNthSmallestElement(TestData.randomNumbers, 39, 0,
            TestData.randomNumbers.length - 1);
    Assert.assertEquals(returnValue, -310);

    returnValue = smallestElement
        .findTheNthSmallestElement(TestData.randomNumbers, 21, 0,
            TestData.randomNumbers.length - 1);
    Assert.assertEquals(returnValue, -372);

    returnValue = smallestElement
        .findTheNthSmallestElement(TestData.randomNumbers, 115, 0,
            TestData.randomNumbers.length - 1);
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
    final ArrayUnion union = new ArrayUnion();
    int[] expectedValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Assert.assertArrayEquals(expectedValue,
        union.mergeSortedArrays(TestData.tinyArray, TestData.tinyArray2));
    int[] set1 = {1, 4, 5, 9, 10, 15, 20};
    int[] set2 = {2, 3, 8, 13, 21};
    union.mergeArrays(set1, set2);
  }

  @Test
  public void testCyclicRotationOfArray() {
    final RotateArray rotate = new RotateArray();
    int[] testValue1 = {3, 4, 5, 1, 2};
    int[] testValue2 = {5, 1, 2, 3, 4};

    Assert.assertArrayEquals(testValue1,
        rotate.cyclicRotation(TestData.tinyArray, 2));
    Assert.assertArrayEquals(testValue2,
        rotate.cyclicRotation(TestData.tinyArray, 4));
  }

  @Test
  public void testLargestSubArray() {
    final LargestSum sum = new LargestSum();
    int[] testValue = {-3, 8, -2, 4, -5, 6};
    int[] testValue2 = {1, 2, 3, -2, 5};
    Assert.assertEquals(sum.largestContiguousSubArray(testValue), 11);
    Assert.assertEquals(sum.largestContiguousSubArray(testValue2), 9);
  }

  @Test
  public void testFindDuplicateNumber() {
    final DuplicateNumber duplicate = new DuplicateNumber();
    int[] testValue = {3, 60, 8, 10, 2, 1, 3, -3, 9};
    int[] testValue1 = {1, 1};
    int[] testValue2 = {1, 1, 2};
    int[] testValue3 = {1, 2, 3};
    Assert.assertEquals(duplicate.findDuplicateNumber_Naive(testValue), 3);
    Assert.assertEquals(duplicate.findDuplicateNumber_Naive(testValue1), 1);
    Assert.assertEquals(duplicate.findDuplicateNumber_Naive(testValue2), 1);
    Assert.assertEquals(duplicate.findDuplicateNumber_Naive(testValue3), -1);

    Assert.assertEquals(duplicate.findDuplicateNumber_ExtraSpace(testValue), 3);
    Assert.assertEquals(duplicate.findDuplicateNumber_ExtraSpace(testValue1), 1);
    Assert.assertEquals(duplicate.findDuplicateNumber_ExtraSpace(testValue2), 1);
    Assert.assertEquals(duplicate.findDuplicateNumber_ExtraSpace(testValue3), -1);

    Assert.assertEquals(duplicate.findDuplicateNumber_Sorting(testValue), 3);
    Assert.assertEquals(duplicate.findDuplicateNumber_Sorting(testValue1), 1);
    Assert.assertEquals(duplicate.findDuplicateNumber_Sorting(testValue2), 1);
    Assert.assertEquals(duplicate.findDuplicateNumber_Sorting(testValue3), -1);

    Assert.assertEquals(duplicate.findDuplicateNumber_Fastest(testValue), 3);
    Assert.assertEquals(duplicate.findDuplicateNumber_Fastest(testValue1), 1);
    Assert.assertEquals(duplicate.findDuplicateNumber_Fastest(testValue2), 1);
    Assert.assertEquals(duplicate.findDuplicateNumber_Fastest(testValue3), -1);
  }

  @Test
  public void testKadanesAlgorithm() {
    int[] testValue = {1, 2, 3, -2, 5};
    int[] testValue2 = {-1, -2, -3, -4};
    Assert.assertEquals(arrayQuestions.kadanesAlgorithm(testValue), 9);
    Assert.assertEquals(arrayQuestions.kadanesAlgorithm(testValue2), -1);
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
