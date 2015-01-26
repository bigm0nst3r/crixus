package ds;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sreejith S
 * @since Jan 26, 2015
 */
public class Anagrams {


  public static void main(String[] args) {

    String str1 = "loin";
    String str2 = "lion";

    System.out.println(anagramTest(str1, str2));

  }

  private static boolean anagramTest(String str1, String str2) {

    char[] chars1 = str1.toCharArray();
    char[] chars2 = str2.toCharArray();

    Map<Character, Integer> counts1 = getCounts(chars1);
    Map<Character, Integer> counts2 = getCounts(chars2);

    return counts1.equals(counts2);
  }

  private static Map<Character, Integer> getCounts(char[] chars1) {
    Map<Character, Integer> m1 = new HashMap<>();
    for (char c : chars1) {
      if (!m1.containsKey(c)) {
        m1.put(c, 1);
      } else {
        m1.put(c, m1.get(c) + 1);
      }
    }
    return m1;
  }

}
