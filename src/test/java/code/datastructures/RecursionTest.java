package code.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class RecursionTest {

  private final Recursion recursion = new Recursion();

  @Test
  public void testFactorial() {
    Assert.assertEquals(recursion.factorial(3), 6);
    Assert.assertEquals(recursion.factorial(0), 1);
    Assert.assertEquals(recursion.factorial(4), 24);
  }

  @Test
  public void testSumOfDigits() {
    Assert.assertEquals(recursion.sumOfDigits(2), 3);
    Assert.assertEquals(recursion.sumOfDigits(10), 55);
  }

  @Test
  public void testReverseString() {
    Assert.assertEquals(recursion.reverseString("Hello World"), "dlroW olleH");
    Assert.assertEquals(recursion.reverseString("ABC"), "CBA");
  }

  @Test
  public void testPalindrome() {
    Assert.assertTrue(recursion.isPalindrome("civic"));
    Assert.assertTrue(recursion.isPalindrome("malayalam"));
  }

  @Test
  public void testCheckSubSequenceInString() {
    Assert.assertTrue(recursion.checkSubSequenceInString("AXY", "ADXCPY"));
    Assert.assertTrue(recursion.checkSubSequenceInString("gksrek", "geeksforgeeks"));
    Assert.assertFalse(recursion.checkSubSequenceInString("AXY", "YADXCP"));
  }
}
