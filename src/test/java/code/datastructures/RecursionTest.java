package code.datastructures;

import code.datastructures.recursion.CheckSubsequence;
import code.datastructures.recursion.FindFactorial;
import code.datastructures.recursion.FindSumOfDigits;
import code.datastructures.recursion.Palindrome;
import code.datastructures.recursion.Permutations;
import code.datastructures.recursion.ReverseString;
import org.junit.Assert;
import org.junit.Test;

public class RecursionTest {

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
    final CheckSubsequence subsequence = new CheckSubsequence();
    Assert.assertTrue(subsequence.subSequenceForStrings("AXY", "ADXCPY"));
    Assert.assertTrue(subsequence.subSequenceForStrings("gksrek", "geeksforgeeks"));
    Assert.assertFalse(subsequence.subSequenceForStrings("AXY", "YADXCP"));
  }

  @Test
  public void testPrintAllPermutations() {
    final Permutations permutations = new Permutations();
    int[] x = {1, 2, 3};
    permutations.printAllPermutations(x, 0, 2);
  }
}
