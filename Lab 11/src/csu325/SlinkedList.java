package csu325;

/**
 * Created by Matthew on 10/28/2015.
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
        Node rover = mHead;
       for (int i = 0; i < index; i++){ // goto the specified index
           rover = rover.mNext;
       }
        return rover.mVal; // return the value of rover
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