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
}
