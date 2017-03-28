package csu.csci325;

/**
 * Created by pwest on 11/10/15.
 */
public class LinkedList<T> extends QueueWrapper<T> {
    private class Node<T> {
        public T mVal;
        public Node<T> mNext;
    }

    Node<T> mHead, mTail;
    int mSize;

    public LinkedList() {
        mHead = mTail = null;
        mSize = 0;
    }

    @Override
    public void enqueue(T element) {
        Node <T> newNode = new Node<T>();
        newNode.mVal = element;

        if (mTail != null) {
            mTail.mNext = newNode;
        }

        mTail = newNode;

        if (mHead == null) {
            mHead = mTail;
        }

        mSize++;
    }

    @Override
    public T dequeue() {
        T ret = first();
        if (mHead != null) {
            mHead = mHead.mNext;
            mSize--;
        }
        if (mHead == null) {
            mTail = null;
        }
        return ret;
    }

    @Override
    public T first() {
        if (mHead != null) {
            return mHead.mVal;
        }
        return null;
    }

    @Override
    public int size() {
        return mSize;
    }
}
