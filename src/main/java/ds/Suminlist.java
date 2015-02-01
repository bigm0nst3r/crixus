package ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sreejith S
 * @since Jan 26, 2015
 */
public class Suminlist {

  public static void main(String[] args) {

    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();

    l1.add(3);
    l1.add(1);
    l1.add(3);

    l2.add(5);
    l2.add(9);
    l2.add(2);

    int number1 = getNumber(l1);
    int number2 = getNumber(l2);
    Integer sum = number1+number2;

    List<char[]> beep = Arrays.asList(sum.toString().toCharArray());

    System.out.println("@@@");

  }

  private static int getNumber(List<Integer> l1) {

    String s="";
    for (Integer integer : l1) {
      s+=integer;
    }
    return Integer.parseInt(s);
  }

  private static int[] getLastDigit(Integer sum) {
    int[] ints = new int[2];
    ints[0] = sum%10;
    ints[1] = sum/10;
    return ints;
  }

  private static List listWithLessElements(List<Integer> l1, List<Integer> l2) {
    if(l1.size() >= l2.size()){
      return l1;
    }
    return l2;
  }

}
