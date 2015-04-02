package robot;

/**
 * @author Sreejith S
 * @since 4/2/15
 */
public enum Direction {

  UP {
    @Override
    Direction clockWise() {
      return Direction.RIGHT;
    }

    @Override
    Direction counterClockWise() {
      return Direction.LEFT;
    }
  },

  DOWN {
    @Override
    Direction clockWise() {
      return Direction.LEFT;
    }

    @Override
    Direction counterClockWise() {
      return Direction.RIGHT;
    }
  },

  LEFT {
    @Override
    Direction clockWise() {
      return Direction.UP;
    }

    @Override
    Direction counterClockWise() {
      return Direction.DOWN;
    }
  },

  RIGHT {
    @Override
    Direction clockWise() {
      return Direction.DOWN;
    }

    @Override
    Direction counterClockWise() {
      return Direction.UP;
    }
  };

  abstract Direction clockWise();

  abstract Direction counterClockWise();

}
