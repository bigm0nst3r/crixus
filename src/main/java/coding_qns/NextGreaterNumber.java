package coding_qns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Sreejith S
 * @since Jan 25, 2015
 */
public class NextGreaterNumber {

  public static void main(String[] args) {

    int n = 218765;

    int length = new Integer(n).toString().length();
    for (int i = 2; i < length; i++) {
      String subs = new Integer(n).toString().substring(length - i, length);
      List<Integer> comb = new ArrayList();
      permutation("", subs, comb);

      Collections.sort(comb);

      String prefix = new Integer(n).toString().substring(0, length-i);
      for (Integer digits : comb) {
        String _d = prefix+digits.toString();
        int combination = Integer.parseInt(_d);
        if(combination > n){
          System.out.println(combination);
          System.exit(0);
        }
      }
    }


  }

  private static void permutation(String prefix, String str, List p) {
    int n = str.length();
    if (n == 0) {
      p.add(Integer.parseInt(prefix));
    } else {
      for (int i = 0; i < n; i++) {
        permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1),p);
      }
    }
  }


}
