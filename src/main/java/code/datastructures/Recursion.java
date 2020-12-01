package code.datastructures;

/**
 * This class contains recursive problems
 */
public class Recursion {

  public int factorial(int number) {
    return number == 0 ? 1 : number * factorial(number - 1);
  }
}
