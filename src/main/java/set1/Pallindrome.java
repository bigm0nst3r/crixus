package set1;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Sreejith S
 * @since Jan 15, 2015
 */
public class Pallindrome {


  public static void main(String[] args) {

    List<String> list = new LinkedList<String>();

    list.add("a");
    list.add("bcd");
    list.add("ef");
    list.add("g");
    list.add("f");
    list.add("ed");
    list.add("c");
    list.add("ba");

    StringBuilder sb = new StringBuilder();
    for (String s : list) {
      sb.append(s);
    }

    int length = sb.toString().length();

    int half = getHalf(length);

    String sub1 = sb.substring(0, half);

    String sub2;
    if (length % 2 != 0) {
      sub2 = sb.substring(half + 1, length);
    } else {
      sub2 = sb.substring(half, length);
    }

    String sub2reverse = new StringBuffer(sub2).reverse().toString();

    if (sub1.equals(sub2reverse)) {
      System.out.println("yaaay");
    }


  }

  private static int getHalf(int length) {

    if (length % 2 == 0) {
      return length / 2;
    } else {
      return (length - 1) / 2;
    }
  }

}
