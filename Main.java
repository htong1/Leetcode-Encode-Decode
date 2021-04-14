import duplicate.*;
import onefold.*;
import majority.*;

class Main {
  public static void main(String[] args) {
    Codec yay = new Codec();
    yay.decode(yay.encode("https://www.youtube.com/watch?v=pBdKnPcNyl8"));
    int[] nums = {1,2,2,5,6,6,5,7,7,7,7};
    Duplicate sad = new Duplicate();
   System.out.println(sad.containsDuplicate(nums));
   singleNum welp = new singleNum();
   System.out.println("The only unique number in this array is " + welp.findSingle(nums));
   majorityNums fan = new majorityNums();
   System.out.println("The mode is:" + fan.findMajority(nums));
  }
}