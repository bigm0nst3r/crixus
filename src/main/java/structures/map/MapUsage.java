package structures.map;

/**
 * @author Sreejith S
 * @since Feb 22, 2015
 */
public class MapUsage {


  public static void main(String[] args) {


    MyMap map = new MyMap();

    map.put(1, "hiii");
    map.put(11, "hiii2");
    map.put(21, "hiii3");
    map.put(2, "hiiiboo");

    System.out.println("k");

    System.out.println(map.get(21));

  }

}
