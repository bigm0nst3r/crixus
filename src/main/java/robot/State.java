package robot;

/**
 * @author Sreejith S
 * @since 4/2/15
 */
public class State {

  private int X;
  private int Y;
  private Direction direction;

  public State(int x, int y, Direction direction) {
    X = x;
    Y = y;
    this.direction = direction;
  }

  public int getX() {
    return X;
  }

  public void setX(int x) {
    X = x;
  }

  public int getY() {
    return Y;
  }

  public void setY(int y) {
    Y = y;
  }

  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }


  public void update(Motion motion) {
    switch (motion) {
      case STRAIGHT:
        incrementCoOrd();
        break;
      case RIGHT:
        setDirection(getDirection().clockWise());
        break;
      case LEFT:
        setDirection(getDirection().counterClockWise());
        break;
    }
  }

  private void incrementCoOrd() {
    switch (getDirection()) {
      case RIGHT:
        incrementX();
        break;
      case LEFT:
        decrementX();
        break;
      case UP:
        incrementY();
        break;
      case DOWN:
        decrementY();
        break;
    }
  }

  private void decrementY() {
    Y -= 1;
  }

  private void incrementY() {
    Y += 1;
  }

  private void decrementX() {
    X -= 1;
  }

  private void incrementX() {
    X += 1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    State state = (State) o;

    if (X != state.X) {
      return false;
    }
    return Y == state.Y;

  }

  @Override
  public int hashCode() {
    int result = X;
    result = 31 * result + Y;
    return result;
  }
}

