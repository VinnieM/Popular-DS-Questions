package code.datastructures;

import code.datastructures.recursion.FindFactorial;
import code.datastructures.recursion.FindSumOfDigits;
import code.datastructures.recursion.Palindrome;
import code.datastructures.recursion.ReverseString;
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
    final ReverseString reverseString = new ReverseString();
    Assert.assertEquals(reverseString.reverse("Hello World"), "dlroW olleH");
    Assert.assertEquals(reverseString.reverse("ABC"), "CBA");
  }

  @Test
  public void testPalindrome() {
    final Palindrome palindrome = new Palindrome();
    Assert.assertTrue(palindrome.isPalindrome("civic"));
    Assert.assertTrue(palindrome.isPalindrome("malayalam"));
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
