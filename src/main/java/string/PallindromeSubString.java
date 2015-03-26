package string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sreejith S
 * @since Mar 20, 2015
 */
public class PallindromeSubString {


  public static void main(String[] args) {

    String str = "javac";

    List<String> pal = new ArrayList<>();
    findPallindromes(str, pal);
  }

  private static void findPallindromes(String str, List<String> pallindromes) {

    int len = str.length();
    if (len < 3) {
      return;
    }
    if (isPallindrome(str)) {
      pallindromes.add(str);
    }

    String substring1 = str.substring(0, len - 1);
    String substring2 = str.substring(1, len);

    if (isPallindrome(substring1)) {
      pallindromes.add(substring1);
    }
    if (isPallindrome(substring2)) {
      pallindromes.add(substring2);
    }
    findPallindromes(str.substring(1, len - 1), pallindromes);
  }

  private static boolean isPallindrome(String _str) {

    int len = _str.length();
    char[] _chars = _str.toCharArray();

    for (int i = 0; i < len; i++) {
      if (_chars[i] != _chars[len - i - 1]) {
        return false;
      }
    }

    return true;
  }


}
