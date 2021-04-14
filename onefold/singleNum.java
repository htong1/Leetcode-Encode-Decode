package onefold;

import java.util.*;

public class singleNum {
  public int findSingle(int[] nums) {
    int num = 0;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i], map.get(nums[i]) + 1);
      } else {
        map.put(nums[i], 1);
      }
    }
    for (Map.Entry<Integer, Integer> set : map.entrySet()) {
      if (set.getValue() == 1) {
        num = set.getKey();
      }
      return num;
    }
    return -1;
  }
}