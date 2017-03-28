package csu.csci325;

/**
 * Created by pwest on 10/20/15.
 */
public class SlinkedList implements List {
    class Node {
        Object mVal;
        Node mNext;
    }
    private Node mHead;

    public SlinkedList () {
        mHead = null;
    }

    @Override
    public Object get(int index) {
        // Hint: How many time do you iterate through the list?
        return null;
    }

    @Override
    public void add(Object obj) {
        Node newNode = new Node();
        newNode.mVal = obj;
        newNode.mNext = mHead;
        mHead = newNode;
    }

    @Override
    public int size() {
        int size = 0;
        Node rover = mHead;

        while (rover != null) {
            size++;
            rover = rover.mNext;
        }

        return size;
    }
}
