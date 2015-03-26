package robots.coordinates;

/**
 * @author Sreejith S
 * @since 3/27/15
 */
public class Motion {


  private Direction previousDirection;
  private int[] co_ord;

  public Motion(Direction previousDirection) {
    this.previousDirection = previousDirection;
    this.co_ord = new int[]{0,0};
  }

  public Direction getPreviousDirection() {
    return previousDirection;
  }

  public void setPreviousDirection(Direction previousDirection) {
    this.previousDirection = previousDirection;
  }


  public void incX(){

  }


  public void decX(){

  }


  public void incY(){

  }

  public void decY(){

  }
}
