class Main {
  public static void main(String[] args) {
    Codec yay = new Codec();
    yay.decode(yay.encode("https://www.youtube.com/watch?v=pBdKnPcNyl8"));
  }
}