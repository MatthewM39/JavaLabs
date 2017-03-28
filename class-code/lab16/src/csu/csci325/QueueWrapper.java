package csu.csci325;

/**
 * Created by pwest on 11/10/15.
 */
public abstract class QueueWrapper<T> implements Queue<T> {
    @Override
    public void add(T element) {
        enqueue(element);
    }
    @Override
    public T remove() {
        return dequeue();
    }
    @Override
    public boolean isEmpty() {
        return size() <= 0;
    }
}
