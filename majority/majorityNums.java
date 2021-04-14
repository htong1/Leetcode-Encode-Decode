package majority;
import java.util.*;

public class majorityNums {
    public int findMajority(int []nums){
        int most = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i], map.get(nums[i]) + 1);
      } else {
        map.put(nums[i], 1);
      }
    }
    for (Map.Entry<Integer, Integer> set : map.entrySet()) {
      if (set.getValue() > nums.length/2) {
        most = set.getKey();
      }
      continue;
    }
    return most;
    }
}
