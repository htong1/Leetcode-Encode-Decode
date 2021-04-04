import java.util.HashMap;
public class Codec {
HashMap<String, String> map = new HashMap<String, String>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
            String charMap = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    String token = "";
    int num = 0;
    for (int i = 0; i < 6; i++) {
      num = (int)Math.floor(Math.random() * 62);
        token += charMap.charAt(num);
    }
    String tinyUrl = "https://tinyurl.com/" + token;
     map.put(tinyUrl, longUrl);
     return tinyUrl;
  }
       public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
    }