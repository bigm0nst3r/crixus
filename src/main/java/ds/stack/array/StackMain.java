package ds.stack.array;

/**
 * @author Sreejith S
 * @since Feb 02, 2015
 */
public class StackMain {


  public static void main(String[] args) {


    ArrayBack ab = new ArrayBack();
    ab.push(10);
    ab.push(20);
    ab.push(30);
    ab.push(40);
    ab.push(50);
    ab.push(60);

    System.out.println(ab.pop());
    System.out.println(ab.pop());
    System.out.println(ab.pop());
    System.out.println(ab.pop());
    System.out.println(ab.pop());

  }

}
