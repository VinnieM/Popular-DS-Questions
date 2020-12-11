package code.datastructures.recursion;

public class CheckSubsequence {

  /**
   * This function checks if the first string is a subsequence of the second one. E.G. hac is a
   * subsequence of cathartic, but bat is not a subsequence of table.
   */
  public boolean subSequenceForStrings(String firstString, String secondString) {
    return subSequenceRecursion(firstString, secondString, firstString.length() - 1,
        secondString.length() - 1);
  }

  private boolean subSequenceRecursion(String firstString, String secondString, int i, int j) {
    if (i == 0) {
      return true;
    }
    if (j == 0) {
      return false;
    }
    if (firstString.charAt(i) != secondString.charAt(j)) {
      return subSequenceRecursion(firstString, secondString, i, --j);
    } else {
      return subSequenceRecursion(firstString, secondString, --i, --j);
    }
  }
}
