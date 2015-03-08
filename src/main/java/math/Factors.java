package math;

/**
 *
 * Find the square root of a number
 *
 * @author Sreejith S
 * @since Feb 25, 2015
 */
public class Factors {


  public static void main(String[] args) {

    int digit = 64;

    double sqrt = Math.sqrt(64);
    int i = 1;
    while (i<=sqrt){
      if(digit%i==0){
        System.out.println(i);
        System.out.println(digit/i);
      }
      i++;
    }

  }

}
