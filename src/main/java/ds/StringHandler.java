package ds;

/**
 * @author Sreejith S
 * @since Jan 26, 2015
 */
public class StringHandler {

  public static void main(String[] args) {

    String str = "helloworld";

    boolean containsUnique = false;

    for(char c : str.toCharArray()){
      if(str.indexOf(c) == str.lastIndexOf(c)){
        containsUnique = true;
      } else {
        containsUnique = false;
        break;
      }
    }

    System.out.println(containsUnique);


  }

}
