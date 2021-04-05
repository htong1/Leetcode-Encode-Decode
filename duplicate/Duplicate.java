package duplicate;
import java.util.HashSet;
public class Duplicate {
    public static void main(String[] args) {
    int[] nums = {1,2,3,2};
    Duplicate sad = new Duplicate();
   sad.containsDuplicate(nums);
  }
        public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> settt = new HashSet<Integer>();
            for(int i = 0; i < nums.length; i++){
            settt.add(nums[i]);
            }
            if(settt.size() == nums.length){
                return false;
            }
        return true;
    }
}
