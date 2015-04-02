package robot;

/**
 * @author Sreejith S
 * @since 4/2/15
 */
public class Robot {


  private State state;

  Robot(State state) {
    this.state = state;
  }


  public void move(Motion motion){
    state.update(motion);
  }


  public State getState() {
    return state;
  }
}
