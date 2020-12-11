package code.datastructures.recursion;

public class FindSumOfDigits {

  /**
   * This function returns the sum of digits of a given number.
   */
  public int sumOfDigits(int number) {
    return number == 0 ? 0 : number + sumOfDigits(number - 1);
  }
}