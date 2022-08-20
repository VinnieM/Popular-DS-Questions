package code.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {

  public int[] twoSums(int target, int[] nums) {
    Map<Integer, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int difference = target - nums[i];
      if (hashMap.containsKey(difference)) {
        return new int[]{hashMap.get(difference), i};
      } else {
        hashMap.put(nums[i], i);
      }
    }
    return null;
  }
}