import duplicate.*;
import onefold.*;

class Main {
  public static void main(String[] args) {
    Codec yay = new Codec();
    yay.decode(yay.encode("https://www.youtube.com/watch?v=pBdKnPcNyl8"));
    int[] nums = {1,2,2,5,6,6,5,7,7};
    Duplicate sad = new Duplicate();
   sad.containsDuplicate(nums);
   singleNum welp = new singleNum();
   welp.findSingle(nums);
  }
}