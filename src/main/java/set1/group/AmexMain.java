package set1.group;

import set1.AmEx;

/**
 * @author Sreejith S
 * @since Jan 19, 2015
 */
public class AmexMain {


  public static void main(String[] args) {

    AmEx<String> ds = new AmEx<String>();

    ds.add("str1");
    ds.add("str2");
    ds.add("str3");
    ds.add("str4");

    System.out.println("-----------");
    ds.reverse();

    ds.add("str5");
    ds.add("str6");
    ds.add("str7");

    /**
     * Should print 4,3,2,1,5,6,7
     */
    for (int i = 0; i < 7; i++) {
      System.out.print(ds.get(i) + "<-->");
    }

    System.out.println("-----------");

    ds.reverse();

    ds.add("str8");
    ds.add("str9");
    ds.add("str10");
    /**
     * Should print 7,6,5,1,2,3,4,8,9,10
     */

    for (int i = 0; i < 10; i++) {
      System.out.print(ds.get(i) + "<-->");
    }

    System.out.println("***");
  }

}
