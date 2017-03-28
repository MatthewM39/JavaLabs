package csu.csci325;

/**
 * Created by pwest on 10/29/15.
 */
public class ArrayStack<T> implements Stack<T> {
    T[] mArray;
    int mTop;
    public ArrayStack() {
        mArray = (T[]) (new Object[100]);
        mTop = 0;
    }
    @Override
    public void push(T element) {
        mArray[mTop] = element;
        mTop++;

        if (mTop >=  mArray.length) {
            System.err.println("Stack is full!");
        }
    }

    @Override
    public T pop() {
        if (mTop <= 0) {
            return null;
        }
        mTop--;
        T ret = mArray[mTop];
        mArray[mTop] = null;
        return ret;
    }

    @Override
    public T peek() {
        if (mTop <= 0) {
            return null;
        }
        return mArray[mTop - 1];
    }

    @Override
    public boolean isEmpty() {
        return mTop == 0;
    }

    @Override
    public int size() {
        return mTop;
    }

    public String toString() {
        String ret = "";
        for (int i = 0; i < mArray.length && mArray[i] != null; i++) {
            ret += mArray[i] + " ";
        }
        return ret;
    }
}
