package structures.map;

/**
 * @author Sreejith S
 * @since Feb 20, 2015
 */
public interface IMap<K, V> {


  void put(K key, V value);


  V get(K key);

}
