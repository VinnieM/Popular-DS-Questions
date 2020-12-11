package code.datastructures.recursion;

public class FindFactorial {

  /**
   * This function finds the factorial of a given number.
   */
  public int factorial(int number) {
    return number == 0 ? 1 : number * factorial(number - 1);
  }
}
