package org.example;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

  private Array arrayQuestions = new Array();

  @Test
  public void testReverseArray() {
    int[] reversedArray = arrayQuestions.reverseArray(TestData.smallArray);
    Assert.assertArrayEquals(TestData.smallArrayReversed, reversedArray);
  }
}
