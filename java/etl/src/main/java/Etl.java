import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Etl {
  public Map<String, Integer> transform(Map<Integer, List<String>> old) {
    Map<String, Integer> newMap = new HashMap<>();
    for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
      for (String value : entry.getValue()) {
        if (!newMap.containsKey(value.toLowerCase())) {
          newMap.put(value.toLowerCase(), entry.getKey());
        }
      }
    }
    return newMap;
  }
}
