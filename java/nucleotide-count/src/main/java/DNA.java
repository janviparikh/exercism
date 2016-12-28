import java.util.HashMap;
import java.util.Map;

public class DNA {
  private Map<Character, Integer> nucleotideMap = new HashMap<>();

  public DNA(String nucleotides) {
    char[] nucleotideChars = nucleotides.toCharArray();
    nucleotideMap.put('A', 0);
    nucleotideMap.put('C', 0);
    nucleotideMap.put('G', 0);
    nucleotideMap.put('T', 0);
    for (char nucleotide : nucleotideChars) {
      int oldCount = nucleotideMap.get(nucleotide);
      nucleotideMap.put(nucleotide, oldCount + 1);
    }
  }


  public int count(char nucleotide) throws IllegalArgumentException {
    if (!nucleotideMap.containsKey(nucleotide)) {
      throw new IllegalArgumentException();
    }
    return nucleotideMap.get(nucleotide);
  }

  public Map<Character, Integer> nucleotideCounts() {
    return nucleotideMap;
  }
}
