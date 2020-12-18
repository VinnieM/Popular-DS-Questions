package code.datastructures.arrays;

import java.util.Objects;

public class PatternRecognition {

  /**
   * Return the number of times the provided pattern appears in the string. Time complexity is O(n +
   * m). Time complexity is O(1).
   * Level - Medium.
   */
  public int getTotalNumberOfPatterns(String text, String pattern) {
    if (pattern.length() == 0) {
      return 0;
    }
    int patternHash, currentText;
    int patternSum = 0, textSum = 0, total = 0, i = 0;

    for (i = 0; i < pattern.length(); i++) {
      patternSum += pattern.charAt(i);
      textSum += text.charAt(i);
    }
    patternHash = getHashcode(patternSum);
    currentText = getHashcode(textSum);

    if (patternHash == currentText) {
      for (i = 0; i < pattern.length(); i++) {
        if (text.charAt(i) != pattern.charAt(i)) {
          break;
        }
        if (i == pattern.length() - 1) {
          ++total;
        }
      }
    }
    for (i = pattern.length(); i < text.length(); i++) {
      textSum += text.charAt(i) - text.charAt(i - pattern.length());
      currentText = getHashcode(textSum);
      if (currentText == patternHash) {
        for (int j = 0, k = (i - pattern.length() + 1); j < pattern.length(); j++, k++) {
          if (text.charAt(k) != pattern.charAt(j)) {
            break;
          }
          if (j == pattern.length() - 1) {
            ++total;
          }
        }
      }
    }
    return total;
  }

  private int getHashcode(int value) {
    return Objects.hash(value);
  }
}
