package robot;

/**
 * @author Sreejith S
 * @since 4/2/15
 */
public class RobotMovement {


  public static void main(String[] args) {

    State initialState = new State(0, 0, Direction.RIGHT);

    Robot robot = new Robot(initialState);
    robot.move(Motion.STRAIGHT);
    robot.move(Motion.RIGHT);
    robot.move(Motion.STRAIGHT);
    robot.move(Motion.RIGHT);
    robot.move(Motion.STRAIGHT);
    robot.move(Motion.RIGHT);
    robot.move(Motion.STRAIGHT);
    System.out.println(checkForLoopMotion(robot, initialState));

  }

  private static boolean checkForLoopMotion(Robot robot, State initialState) {
    return robot.getState().equals(initialState);
  }

}
