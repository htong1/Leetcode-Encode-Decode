import duplicate.*;

class Main {
  public static void main(String[] args) {
    Codec yay = new Codec();
    yay.decode(yay.encode("https://www.youtube.com/watch?v=pBdKnPcNyl8"));
    int[] nums = {1,2,3,2};
    Duplicate sad = new Duplicate();
   sad.containsDuplicate(nums);
  }
}