package ds.stack.hanoi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sreejith S
 * @since Jan 26, 2015
 */
public class SetUp {


  private int numberOfRings;
  private List<Tower> towers;
  private List<Ring> rings;

  public SetUp(int numberOfRings) {
    this.numberOfRings = numberOfRings;
    buildTowers();
    buildRings();
    addRingsToFirstTower();
  }


  private void addRingsToFirstTower() {
    for (Ring ring : rings) {
      towers.get(0).addRing(ring);
    }
  }

  private void buildRings() {
    rings = new ArrayList<>();
    for (int i = numberOfRings; i > 0; i--) {
      rings.add(new Ring(i));
    }
  }

  private void buildTowers() {
    towers = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      towers.add(new Tower());
    }
  }

  public boolean hasWon() {
    if(towers.get(2).getNumberOfRings() == numberOfRings){
      return true;
    }
    return false;
  }

  public void makeMove(int sourceTower, int destinationTower) {
    Ring topRing = towers.get(sourceTower).getTopRing();
    if(topRing!= null){
      try {
        towers.get(destinationTower).addRing(topRing);
        towers.get(sourceTower).removeRing();
      } catch (UnsupportedOperationException e){
        System.out.println("Could not add ring");
      }
    }
  }
}
