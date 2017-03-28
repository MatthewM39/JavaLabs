package csu.csci325;

/**
 * Created by pwest on 11/17/15.
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
