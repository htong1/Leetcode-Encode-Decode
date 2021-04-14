package majority;
import java.util.*;

public class majorityNums {
    public int findMajority(int []nums){
        int most = 0;
        //int count = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
        int current = nums[i];
        if(current == nums[i+1]){
           //count++;
        }
        }
        return most;
    }
}

//count current number frequency. 
/* int most = 0;
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
        int current = nums[i];
        if(current == nums[i+1]){
           count++;
        }
        }
        return most;*/
