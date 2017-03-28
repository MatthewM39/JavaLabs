

/**
 * Created by Matthew on 11/17/2015.
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
