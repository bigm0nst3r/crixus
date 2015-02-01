package ds.stack.hanoi;

/**
 * @author Sreejith S
 * @since Jan 26, 2015
 */
public class Game {

  public static void main(String[] args) {

    SetUp setUp = new SetUp(3);
    System.out.println("Game initialized...");

    setUp.makeMove(0, 2);
    setUp.makeMove(0, 1);
    System.out.println(setUp.hasWon());
    setUp.makeMove(2, 1);
    setUp.makeMove(0, 2);
    System.out.println(setUp.hasWon());
    setUp.makeMove(1, 0);
    setUp.makeMove(1, 2);
    setUp.makeMove(0, 2);
    System.out.println(setUp.hasWon());

  }

}
