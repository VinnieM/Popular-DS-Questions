package code.utils;

public class TestData {

  // Suppressing Default Constructor for non-instantiability.
  private TestData() {
    throw new AssertionError("Cannot instantiate Constants class!!!");
  }

  public static final int[] tinyArray = {1, 2, 3, 4, 5};
  public static final int[] smallArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  public static final int[] mediumArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
      17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
      40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
  public static final int[] largeArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
      18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
      41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63,
      64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86,
      87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
  public static final int[] tinyArrayUnsorted = {5, 3, 4, 1, 2};
  public static final int[] smallArrayUnsorted = {9, 6, 10, 1, 3, 5, 2, 8, 4, 7};
  public static final int[] mediumArrayUnsorted = {47, 48, 27, 10, 5, 34, 24, 45, 12, 3, 11, 16, 14,
      15, 43, 46, 21, 18, 13, 50, 29, 7, 28, 49, 25, 17, 20, 33, 44, 23, 6, 30, 22, 40, 32, 4, 8,
      38, 26, 35, 39, 1, 2, 9, 31, 42, 19, 41, 37, 36};
  public static final int[] largeArrayUnsorted = {46, 25, 82, 74, 73, 53, 34, 43, 44, 80, 8, 64, 39,
      29, 58, 62, 55, 11, 70, 48, 22, 35, 93, 81, 51, 85, 2, 47, 32, 36, 50, 96, 41, 49, 33, 68, 12,
      21, 71, 31, 94, 63, 1, 72, 83, 84, 65, 54, 19, 16, 26, 61, 99, 90, 6, 97, 79, 95, 40, 3, 69,
      91, 18, 76, 87, 52, 77, 38, 88, 24, 59, 57, 27, 67, 7, 28, 98, 13, 45, 37, 92, 89, 66, 100,
      56, 10, 60, 78, 9, 5, 42, 23, 30, 14, 75, 15, 17, 4, 20, 86};
  public static final int[] tinyArrayReversed = {5, 4, 3, 2, 1};
  public static final int[] smallArrayReversed = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
}
