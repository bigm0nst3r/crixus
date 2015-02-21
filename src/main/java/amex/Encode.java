package amex;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Sreejith S
 * @since Feb 18, 2015
 */
public class Encode {


  public static void main(String[] args) {

    String input = "aaaabbcccdd";
    Map<Character, Integer> inp = new LinkedHashMap<>();

    char[] chars = input.toCharArray();

    for (char aChar : chars) {
      if(!inp.containsKey(aChar)){
        inp.put(aChar, new Integer(0));
      }
      inp.put(aChar, inp.get(aChar)+1);
    }

    StringBuilder beep = new StringBuilder();
    for (Map.Entry<Character, Integer> entry : inp.entrySet()) {
      beep.append(entry.getKey()).append(entry.getValue());
    }

    System.out.println(beep.toString());

  }

}
