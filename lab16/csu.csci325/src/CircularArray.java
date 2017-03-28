/**
 * Created by Matthew on 11/17/2015.
 */
public class CircularArray<T> extends QueueWrapper<T> {
    T[] mArray;
    int mHead, mTail;
    int mSize;
    public CircularArray() {
        mArray = (T[])(new Object[100]); // declare initially with 100 slots
        mHead = mTail = mSize = 0; // initialize to 0
    }
    @Override
    public void enqueue(T element) {
        if (mArray[mTail] != null) { // if the last element is not null, you need to extend the array
            extendArray();
        }
        mArray[mTail] = element; // set the last element in the array equal to the passed element
        mTail = (mTail + 1) % mArray.length;  /// set the new tail
        mSize++; // increment size
    }

    @Override
    public T dequeue() {

        T result = mArray[mHead]; // set the result equal to the first element

        if (mSize > 0){ // only do stuff for queues when stuff is enqueued

            mArray[mHead] = null; // set the head in the array to null
            mHead = (mHead + 1) % mArray.length; // set mHead to a new value if necessary

            mSize--; // decrease size
        }
        return result;
    }

    @Override
    public T first() {
        T ret = mArray[mHead]; // returns the first element
        return ret;
    }

    @Override
    public int size() {
        return mSize; // returns the size
    }

    private void extendArray(){

        T[] newArray = (T[]) (new Object[mArray.length * 2]);  //make a new array
        for (int scan = 0; scan < mSize; scan++){ // set the values in the new array equal to the values in the old one
            newArray[scan] = mArray[mHead];
            mHead = (mHead + 1) % mArray.length;
        }
        mHead = 0; // now set mHead to 0
        mTail = mSize; // make the tail the current size
        mArray = newArray; // now set mArray equal to the new array
    }


}
