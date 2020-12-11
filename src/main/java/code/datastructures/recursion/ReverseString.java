package code.datastructures.recursion;

public class ReverseString {

  /**
   * This function reverses a String.
   */
  public String reverse(String str) {
    return str.length() == 0 ? str
        : str.substring(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
  }
}
