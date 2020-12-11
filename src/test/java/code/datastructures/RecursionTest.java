package code.datastructures;

import code.datastructures.recursion.FindFactorial;
import code.datastructures.recursion.FindSumOfDigits;
import org.junit.Assert;
import org.junit.Test;

public class RecursionTest {

  private final Recursion recursion = new Recursion();

  @Test
  public void testFactorial() {
    final FindFactorial factorial = new FindFactorial();
    Assert.assertEquals(factorial.factorial(3), 6);
    Assert.assertEquals(factorial.factorial(0), 1);
    Assert.assertEquals(factorial.factorial(4), 24);
  }

  @Test
  public void testSumOfDigits() {
    final FindSumOfDigits sumOfDigits = new FindSumOfDigits();
    Assert.assertEquals(sumOfDigits.sumOfDigits(2), 3);
    Assert.assertEquals(sumOfDigits.sumOfDigits(10), 55);
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

  @Test
  public void testPrintAllPermutations() {
    int[] x = {1, 2, 3};
    recursion.printAllPermutations(x, 0, 2);
  }
}
