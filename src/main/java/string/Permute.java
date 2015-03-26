package string;

/**
 * @author Sreejith S
 * @since Mar 08, 2015
 */
public class Permute {


  public static void main(String[] args) {

    permutation("", "ABCD");
  }

  private static void permutation(String prefix, String suffix) {
    int n = suffix.length();
    if (n == 0) {
      System.out.println(prefix);
    } else {
      for (int i = 0; i < n; i++) {
        String newPrefix = prefix + suffix.charAt(i);
        String newSuffix = suffix.substring(0, i) + suffix.substring(i + 1);
        permutation(newPrefix, newSuffix);
      }
    }
  }

}
