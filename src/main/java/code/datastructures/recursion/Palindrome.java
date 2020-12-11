package code.datastructures.recursion;

public class Palindrome {

  public boolean isPalindrome(String str) {
    return palindromeRecursive(str, 0, str.length() - 1);
  }

  public boolean palindromeRecursive(String str, int start, int end) {
    if (start > end) {
      return true;
    } else if (str.charAt(start) == str.charAt(end)) {
      return palindromeRecursive(str, ++start, --end);
    }
    return false;
  }
}