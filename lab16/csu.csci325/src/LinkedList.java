/**
 * Created by Matthew on 11/17/2015.
 */
public class LinkedList<T> extends QueueWrapper<T> {
    private class Node<T> {
        public T mVal;
        public Node<T> mNext;
    }

    Node<T> mHead, mTail; // creating the head and tail nodes
    int mSize; // size of the linked list

    public LinkedList() {
        mHead = mTail = null; // values set initially to null
        mSize = 0; // size is initially 0
    }

    @Override
    public void enqueue(T element) {
        Node <T> newNode = new Node<T>();
        newNode.mVal = element;

        if (mTail != null) { // if the last element isn't null, add a new node
            mTail.mNext = newNode;
        }

        mTail = newNode; // set mTail equal to newNode

        if (mHead == null) {
            mHead = mTail; // when mHead is null, set mHead to mTail
        }

        mSize++; // increase size of the linked list
    }

    @Override
    public T dequeue() {
        T ret = first();
        if (mHead != null) { // if the first element isnt null, set the head equal to the next element and decrement mSize
            mHead = mHead.mNext;
            mSize--;
        }
        if (mHead == null) { // if mHead is null, the linked list is empty so set mTail to null as well
            mTail = null;
        }
        return ret; // return what was dequeued
    }

    @Override
    public T first() {
        if (mHead != null) {
            return mHead.mVal; // return the value for the first element
        }
        return null;
    }

    @Override
    public int size() {
        return mSize;
    }
}
