package csu.csci325;

/**
 * Created by pwest on 11/17/15.
 */
public class HashingWithChaining<K, V> implements Hash<K, V> {
    public class Node {
        public K mKey;
        public V mValue;
        Node mNext;
    }

    private Object mTable[];

    public HashingWithChaining() {
        mTable = (new Object[100]);
        for (int i = 0; i < mTable.length; i++) {
            mTable[i] = null;
        }
    }

    @Override
    public void put(K key, V value) {
        Node newNode = new Node();
        newNode.mKey = key;
        newNode.mValue = value;
        newNode.mNext = null;

        int idx = key.hashCode() % mTable.length;

        if (mTable[idx] != null ) {
            //Collision!
            newNode.mNext = (Node)mTable[idx];
            mTable[idx] = newNode;
        } else {
            mTable[idx] = newNode;
        }
    }

    @Override
    public V get(K key) {
        int idx = key.hashCode() % mTable.length;
        Node node = (Node)mTable[idx];
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
