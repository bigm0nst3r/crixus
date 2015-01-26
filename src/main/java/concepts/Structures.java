package concepts;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sreejith S
 * @since Jan 25, 2015
 */
public class Structures {


  public static void main(String[] args) {

    /**
     * Array List with initial capacity
     */
    List l = new ArrayList(20);


    // right shit by 1 = division by 2
    // right shit by 2 = division by 4
    // right shit by 3 = division by 8
    // right shit by 4 = division by 16
    // right shit by n = division by 2^n

    System.out.println(80 >> 4);   // 80/16 =  5
    System.out.println(40 >> 3);   // 40/8  =  5
    System.out.println(10 >> 2);   // 10/4  =  2
    System.out.println(5 >> 1);
    System.out.println(2 >> 1);
    System.out.println(1 >> 1);

  }

}
