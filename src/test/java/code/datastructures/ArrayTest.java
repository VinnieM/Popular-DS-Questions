package code.datastructures;

import code.datastructures.arrays.ArrayUnion;
import code.datastructures.arrays.DuplicateNumber;
import code.datastructures.arrays.LargestSum;
import code.datastructures.arrays.MaxAndSecondMax;
import code.datastructures.arrays.MaxMinElement;
import code.datastructures.arrays.MinimumDeletions;
import code.datastructures.arrays.MoveElements;
import code.datastructures.arrays.MoveToLeft;
import code.datastructures.arrays.NegativeElements;
import code.datastructures.arrays.NthSmallestElement;
import code.datastructures.arrays.PatternRecognition;
import code.datastructures.arrays.ReverseArray;
import code.datastructures.arrays.RotateArray;
import code.datastructures.arrays.SmallestDifference;
import code.datastructures.arrays.SortCustomArray;
import code.datastructures.arrays.Urlify;
import code.datastructures.arrays.WindowSliding;
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
    int[] temp = {5, 4, 3, 2, 1};
    int[] returnValue = maxAndSecondMax.getMaxAndSecondMax(TestData.largeArrayUnsorted);
    Assert.assertArrayEquals(new int[]{100, 99}, returnValue);

    returnValue = maxAndSecondMax.getMaxAndSecondMax(TestData.mediumArrayUnsorted);
    Assert.assertArrayEquals(new int[]{50, 49}, returnValue);

    returnValue = maxAndSecondMax.getMaxAndSecondMax(temp);
    Assert.assertArrayEquals(new int[]{5, 4}, returnValue);
  }

  @Test
  public void testNthSmallest() {
    final NthSmallestElement smallestElement = new NthSmallestElement();
    int returnValue = smallestElement
        .findTheNthSmallestElement(TestData.smallArrayUnsorted, 5, 0,
            TestData.smallArrayUnsorted.length - 1);
    Assert.assertEquals(returnValue, 5);
    returnValue = smallestElement.findTheNthSmallestElement(new int[]{7,10,4,3,20,15}, 3, 0, 5);
    Assert.assertEquals(returnValue, 7);
  }

  @Test
  public void testSortArrayOfZeroOneAndTwo() {
    final SortCustomArray customArray = new SortCustomArray();
    int[] temp = {0, 0, 0, 0, 1, 1, 2, 2};
    int[] returnValue = customArray.sortCustomArray(new int[]{0, 2, 1, 0, 2, 0, 1, 0});
    int[] returnValue2 = customArray.sortCustomArray_Solution2(new int[]{0, 2, 1, 0, 2, 0, 1, 0});
    Assert.assertArrayEquals(temp, returnValue);
    Assert.assertArrayEquals(temp, returnValue2);
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
    int[] testValue3 = {1, 2, 3, -2, 5};
    int[] testValue4 = {-1, -2, -3, -4};
    Assert.assertEquals(sum.largestContiguousSubArray(testValue), 11);
    Assert.assertEquals(sum.largestContiguousSubArray(testValue2), 9);
    Assert.assertEquals(sum.largestContiguousSubArray(testValue3), 9);
    Assert.assertEquals(sum.largestContiguousSubArray(testValue4), -1);

    Assert.assertEquals(sum.kadanesAlgorithm(testValue), 11);
    Assert.assertEquals(sum.kadanesAlgorithm(testValue2), 9);
    Assert.assertEquals(sum.kadanesAlgorithm(testValue3), 9);
    Assert.assertEquals(sum.kadanesAlgorithm(testValue4), -1);
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
  public void testMaximumSum() {
    WindowSliding windowSliding = new WindowSliding();
    int[] test1 = {100, 200, 300, 400};
    int[] test2 = {1, 4, 2, 10, 23, 3, 1, 0, 20};
    int[] test3 = {2, 3};
    int result1 = 700, result2 = 39, result3 = -1;

    Assert.assertEquals(windowSliding.getMaximumSum(test1, 2), result1);
    Assert.assertEquals(windowSliding.getMaximumSum(test2, 4), result2);
    Assert.assertEquals(windowSliding.getMaximumSum(test3, 3), result3);
  }

  @Test
  public void testTotalNumberOfPattern() {
    PatternRecognition pattern = new PatternRecognition();
    String text1 = "bcdefbcbebc|abcdebcfgsdf|cbdbesfbcy|1bcdef23423bc32";
    String text2 = "aaaakjlhaa|aaadsaaa|easaaad|sa";
    String text3 = "bcdefbcbebc|abcdebcfgsdf|cbdbesfbcy|1bcdef23423bc32";
    String text4 = "bcdefbcbebc|abcdebcfgsdf|cbdbesfbcy|1bcdef23423bc32";

    Assert.assertEquals(pattern.getTotalNumberOfPatterns(text1, "bc"), 8);
    Assert.assertEquals(pattern.getTotalNumberOfPatterns(text2, "aa"), 10);
    Assert.assertEquals(pattern.getTotalNumberOfPatterns(text3, "b"), 11);
    Assert.assertEquals(pattern.getTotalNumberOfPatterns(text4, ""), 0);
  }

  @Test
  public void testMinimumNumberOfDeletions() {
    MinimumDeletions minDeletions = new MinimumDeletions();
    String test1 = "aab";
    String test2 = "aaabbbcc";
    String test3 = "ceabaacb";
    Assert.assertEquals(minDeletions.minimumDeletions(test1), 0);
    Assert.assertEquals(minDeletions.minimumDeletions(test2), 2);
    Assert.assertEquals(minDeletions.minimumDeletions(test3), 2);
  }

  @Test
  public void testMoveZeroToLeft() {
    MoveToLeft moveToLeft = new MoveToLeft();
    int[] testValue = {1, 3, 0, 2, 5, 0, 7};
    int[] expectedValue = {0, 0, 1, 3, 2, 5, 7};
    Assert.assertArrayEquals(moveToLeft.moveZeroToLeft(testValue), expectedValue);
  }

  @Test
  public void testSmallestDifference() {
    SmallestDifference smallestDifference = new SmallestDifference();
    int[] testArray1 = {-1, 5, 10, 20, 28, 3};
    int[] testArray2 = {26, 134, 135, 15, 17};
    int[] expectedValue = {28, 26};
    Assert.assertArrayEquals(expectedValue,
        smallestDifference.smallestDifference(testArray1, testArray2));
  }

  @Test
  public void testMoveElements() {
    MoveElements moveElements = new MoveElements();
    Assert.assertArrayEquals(moveElements.moveElementToRight(new int[]{2, 1, 2, 2, 2, 3, 4, 2}, 2)
        , new int[]{4, 1, 3, 2, 2, 2, 2, 2});
  }

  @Test
  public void testUrlify() {
    Urlify url = new Urlify();
    char[] expected = "Mr%20John%20Smith ".toCharArray();
    Assert.assertArrayEquals(expected, url.urlify("Mr John Smith     ".toCharArray(), 13));
  }

  @Test
  public void testPrintPowerSet() {
    arrayQuestions.printPowerSet("ABC");
  }
}
