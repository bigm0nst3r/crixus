package robots.coordinates;

/**
 * @author Sreejith S
 * @since 3/27/15
 */
public enum Direction {

  L {
    @Override
    public String toString() {
      return "moving Left";
    }
  },
  R {
    @Override
    public String toString() {
      return "moving Right";
    }
  };

}
