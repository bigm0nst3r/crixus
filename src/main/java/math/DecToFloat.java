package math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sreejith S
 * @since Feb 26, 2015
 */
public class DecToFloat {


  private static Map<Integer, String> numberMap;

  public static void main(String[] args) {

    Map<Integer, String> numbers = getNumberMap();

    List<Integer> l = new ArrayList<>();
    double num = 675.778;

    int count = 0;
    while (num % 1 != 0) {
      num = num * 10;
      count += 1;

    }

    System.out.println(count);
    System.out.println(num);

    Collections.reverse(l);


  }

  public static Map<Integer, String> getNumberMap() {
    Map<Integer, String> numbers = new HashMap<>();
    numbers.put(1, "1");
    numbers.put(2, "2");
    numbers.put(3, "3");
    numbers.put(4, "4");
    numbers.put(5, "5");
    numbers.put(6, "6");
    numbers.put(7, "7");
    numbers.put(8, "8");
    numbers.put(9, "9");
    numbers.put(10, "10");
    return numberMap;
  }
}
