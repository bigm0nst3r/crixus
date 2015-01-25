package set1.group;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Sreejith S
 * @since Jan 18, 2015
 */
public class Group {


  public static void main(String[] args) {

    List<Pair> pairs = new ArrayList<Pair>();

    pairs.add(new Pair(1, 2));
    pairs.add(new Pair(2, 3));
    pairs.add(new Pair(5, 6));
    pairs.add(new Pair(2, 9));

    findPairsAndShow(pairs);

  }

  private static void findPairsAndShow(List<Pair> pairs) {
    List<Integer> taken = new ArrayList<Integer>();

    List<Set<Integer>> _groups = new ArrayList<Set<Integer>>();

    for (Pair pair : pairs) {


      int main = pair.getMain();
      int companion = pair.getCompanion();

      if(!taken.contains(main)) {
        taken.add(main);
        taken.add(companion);
        Set<Integer>
            groups = new HashSet<Integer>();
        groups.add(main);
        groups.add(companion);
        getOthers(companion, pairs, pairs.indexOf(pair), groups);

        _groups.add(groups);
      }
    }

    System.out.println(_groups);
  }

  private static Set<Integer> getOthers(int companion, List<Pair> pairs, int start,
                                            Set<Integer> group) {

    for (int i = start+1; i < pairs.size(); i++) {
      if(pairs.get(i).getMain()==companion){
        group.add(pairs.get(i).getCompanion());
        getOthers(pairs.get(i).getCompanion(),pairs,i, group);
      }
    }

    return group;
  }


}
