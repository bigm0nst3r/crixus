package careercup.string;

/**
 * @author Sreejith S
 * @since Mar 15, 2015
 */
public class Permutation {

  public static void main(String[] args) {

    String input = "abc";

    permute("",input);
  }

  private static void permute(String prefix, String suffix) {

    if (suffix.length() == 0) {
      System.out.println(prefix);
    } else {
      for (int i = 0; i < suffix.length(); i++) {
        String newPrefix = prefix + suffix.charAt(i);
        String newSuffix = suffix.substring(0, i) + suffix.substring(i + 1);
        permute(newPrefix, newSuffix);
      }
    }

  }

}
