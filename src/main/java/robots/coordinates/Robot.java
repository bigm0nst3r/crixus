package robots.coordinates;

/**
 * @author Sreejith S
 * @since 3/27/15
 */
public class Robot {


  private Motion motion;

  public Robot(Motion motion) {
    this.motion = motion;
  }


  public void move(Direction direction, boolean goForward) {

    if(direction != null){

      Direction previousDirection = getMotion().getPreviousDirection();

      switch (direction){

        case L:
//          if()
          break;

        case R:

      }


    }
  }


  public Motion getMotion() {
    return motion;
  }

  public void setMotion(Motion motion) {
    this.motion = motion;
  }
}
