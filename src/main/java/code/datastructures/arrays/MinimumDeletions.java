package code.datastructures.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A string s is called good if there are no two different characters in s that have the same
 * frequency. Given a string s, return the minimum number of characters you need to delete to make s
 * good. The frequency of a character in a string is the number of times it appears in the string.
 * For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.
 */
public class MinimumDeletions {

  public int minimumDeletions(String s) {
    Map<Character, Integer> hashMap = new HashMap<>();
    for (char eachChar : s.toCharArray()) {
      hashMap.put(eachChar, hashMap.getOrDefault(eachChar, 0) + 1);
    }
    Set<Integer> hashSet = new HashSet<>();
    int returnData = 0;
    for (Map.Entry<Character, Integer> eachEntry : hashMap.entrySet()) {
      int x = eachEntry.getValue();
      while (hashSet.contains(x)) {
        --x;
        ++returnData;
      }
      if (x != 0) {
        hashSet.add(x);
      }
    }
    return returnData;
  }
}
