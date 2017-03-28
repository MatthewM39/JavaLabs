/**
 * Created by Matthew on 11/23/2015.
 */

// K = Key
// V = Value

public interface Hash<K, V> {

    // inserts the value into the hash object hashed (indexed) by key.
    public void put (K key, V value);

    // returns the object whose object.key.equals(key).
    public V get(K key);

    // return the number of key-value pairs in the hash object.
    public int size();
}
