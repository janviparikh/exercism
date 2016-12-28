import java.util.HashMap;
import java.util.Map;

public class WordCount {
  public Map<String, Integer> phrase(String words) {
    Map<String, Integer> wordCountMap = new HashMap<>();
    String[] wordArray = words.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split(" ");
    for (String word : wordArray) {
      if ("".equals(word)) {
        continue;
      }
      if (wordCountMap.containsKey(word)) {
        wordCountMap.put(word, wordCountMap.get(word) + 1);
      } else {
        wordCountMap.put(word, 1);
      }
    }
    return wordCountMap;
  }
}
