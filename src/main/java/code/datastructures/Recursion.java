package code.datastructures;

/**
 * This class contains recursive problems
 */
public class Recursion {

  /**
   * Find the factorial of a number.
   */
  public int factorial(int number) {
    return number == 0 ? 1 : number * factorial(number - 1);
  }

  /**
   * Find the sum of digits of a given number.
   */
  public int sumOfDigits(int number) {
    return number == 0 ? 0 : number + sumOfDigits(number - 1);
  }

  /**
   * Reverse a string.
   */
  public String reverseString(String str) {
    return str.length() == 0 ? str
        : str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
  }

  /**
   * Checks if the String is a palindrome.
   */
  public boolean isPalindrome(String str, int start, int end) {
    if (start > end) {
      return true;
    }
    if (str.charAt(start) == str.charAt(end)) {
      return isPalindrome(str, ++start, --end);
    }
    return false;
  }
}
