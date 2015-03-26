package structures.map;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sreejith S
 * @since Feb 22, 2015
 */
public class MapUsage {


  public static void main(String[] args) throws ClassNotFoundException {


    MyMap map = new MyMap();

    map.put(1, "hiii");
    map.put(11, "hiii2");

    map.put(21, "hiii3");
    map.put(2, "hiiiboo");

    String v = "hi";

    System.out.println("k");

    System.out.println(map.get(21));

//    Class<?> aClass = Class.forName("structures.map.MyMap");
//    List l = new ArrayList<>();
//    System.out.println(aClass.getName());


  }

}
