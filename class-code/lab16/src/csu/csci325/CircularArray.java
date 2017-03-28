package csu.csci325;

/**
 * Created by pwest on 11/10/15.
 */
public class CircularArray<T> extends QueueWrapper<T> {
    T[] mArray;
    int mHead, mTail;
    int mSize;
    public CircularArray() {
        mArray = (T[])(new Object[100]);
        mHead = mTail = mSize = 0;
    }
    @Override
    public void enqueue(T element) {
        if (mArray[mTail] != null) {
            // Increase the size of the array!  (make sure to fill the array in!)
            throw new RuntimeException("Circular Array is full");
        }
        mArray[mTail] = element;
        mTail = (mTail + 1) % mArray.length;
        mSize++;
    }

    @Override
    public T dequeue() {
        // Note: Remember to set a removed element to null!
        return null;
    }

    @Override
    public T first() {
        T ret = mArray[mHead];
        return ret;
    }

    @Override
    public int size() {
        return mSize;
    }
}
