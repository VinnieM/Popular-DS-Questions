package code.datastructures.recursion;

public class Palindrome {

  /**
   * This function checks if the given string is a palindrome.
   * Level - Easy
   */
  public boolean isPalindrome(String str) {
    return palindromeRecursive(str, 0, str.length() - 1);
  }

  private boolean palindromeRecursive(String str, int start, int end) {
    if (start > end) {
      return true;
    } else if (str.charAt(start) == str.charAt(end)) {
      return palindromeRecursive(str, ++start, --end);
    }
    return false;
  }
}
