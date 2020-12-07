package code.datastructures;

import java.util.Arrays;

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
  public boolean isPalindrome(String str) {
    return isPalindromeRecursive(str, 0, str.length() - 1);
  }

  /**
   * Recursive function which does the check.
   */
  private boolean isPalindromeRecursive(String str, int start, int end) {
    if (start > end) {
      return true;
    }
    if (str.charAt(start) == str.charAt(end)) {
      return isPalindromeRecursive(str, ++start, --end);
    }
    return false;
  }

  /**
   * Function to check if first string is a subsequence of the second string.
   */
  public boolean checkSubSequenceInString(String firstString, String secondString) {
    return checkSubsequencePalindrome(firstString, secondString, firstString.length() - 1,
        secondString.length() - 1);
  }

  /**
   * Recursive function which checks for subsequence.
   */
  private boolean checkSubsequencePalindrome(String firstString, String secondString, int i,
      int j) {
    if (i == 0) {
      return true;
    }
    if (j == 0) {
      return false;
    }
    if (firstString.charAt(i) == secondString.charAt(j)) {
      return checkSubsequencePalindrome(firstString, secondString, --i, --j);
    }
    return checkSubsequencePalindrome(firstString, secondString, i, --j);
  }

  public void printAllPermutations(int[] arr, int startIndex, int endIndex) {
    if (startIndex == endIndex) {
      System.out.println(Arrays.toString(arr));
    }
    for (int i = startIndex; i <= endIndex; i++) {
      swapIntArray(startIndex, i, arr);
      printAllPermutations(arr, startIndex + 1, endIndex);
      swapIntArray(startIndex, i, arr);
    }
  }

  public void swapIntArray(int i, int j, int[] arr) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
