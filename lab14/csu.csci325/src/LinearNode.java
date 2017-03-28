/**
 * Created by Matthew on 11/10/2015.
 */
public class LinearNode<T> {


    private LinearNode<T> mNext;
    private T mElement;

    public LinearNode(){
        mNext = null;
        mElement = null;
    }

    // set mNext equal to null and the element mElement equal to the passed parameter
    public LinearNode (T elem){
        mNext = null;
        mElement = elem;
    }

    // return the next node
    public LinearNode<T> getNext(){
        return mNext;
    }

    // set the next node
    public void setNext(LinearNode<T> node){
        mNext = node;
    }

    // return the element
    public T getElement(){
        return mElement;
    }

    // set the element
    public void setElement(T elem){
        mElement = elem;
    }



}
