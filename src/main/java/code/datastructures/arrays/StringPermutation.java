package code.datastructures.arrays;

public class StringPermutation {

  public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) {
      return false;
    }
    int[] countArray = new int[26];
    for (int i = 0; i < s1.length(); i++) {
      countArray[s1.charAt(i) - 'a']++;
      countArray[s2.charAt(i) - 'a']--;
    }
    if (isArrayAllZeros(countArray)) {
      return true;
    }

    for (int i = s1.length(); i < s2.length(); i++) {
      countArray[s2.charAt(i) - 'a']--;
      countArray[s2.charAt(i - s1.length()) - 'a']++;
      if (isArrayAllZeros(countArray)) {
        return true;
      }
    }
    return isArrayAllZeros(countArray);
  }

  private boolean isArrayAllZeros(int[] intArray) {
    for (int i = 0; i < 26; i++) {
      if (intArray[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
