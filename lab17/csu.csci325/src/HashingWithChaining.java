/**
 * Created by Matthew on 11/23/2015.
 */
public class HashingWithChaining<K, V> implements Hash<K, V> {

    int count = 0; // counter variable for the hash

    public class Node {
        public K mKey;
        public V mValue;
        Node mNext;
    }

    private Object mTable[]; // table for the hash

    // constructor which initializes the mTable Object Array to null for each index
    public HashingWithChaining() {
        mTable = (new Object[100]);
        for (int i = 0; i < mTable.length; i++) {
            mTable[i] = null;
        }
    }

    @Override
    public void put(K key, V value) {

        // create a new node, pass the values to the node
        Node newNode = new Node();
        newNode.mKey = key;
        newNode.mValue = value;
        newNode.mNext = null; // next is initially null


        int idx = key.hashCode() % mTable.length;

        if (mTable[idx] != null ) { // check to see if the index already has a value. If so, collision occurs

            newNode.mNext = (Node)mTable[idx]; // to handle the collision, set mNext (initially null) equal to mTable[idx]
            mTable[idx] = newNode; // set mTable[idx] equal to newNode so that mNext is correct
        }

        else { // if the index is empty, set mTable[idx] equal to the newNode
            mTable[idx] = newNode;
        }
        count++; // increment the number of objects stored in the hash
    }

    @Override
    public V get(K key) {

       try {
            int idx = key.hashCode() % mTable.length;
            Node node = (Node) mTable[idx];

            while (key.equals(node.mKey) != true) { // if the node's key isn't equal to the key, navigate through the nodes until the key is reached
                if (node.mNext != null) { // make sure you don't reach the end of the nodes
                    node = node.mNext;
                }
            }
            /* DPW: If node is null, then this would be a NNullPointerException!  -10 */
            return node.mValue;
        }

       // catch an unused key
        catch (NullPointerException exception){
            System.out.print("ERROR! Your key hasn't been used. Key attempted: " + key + "\nReturned: ");
            return null;
        }

    }

    @Override
    public int size() {
        return count;
    }
}
