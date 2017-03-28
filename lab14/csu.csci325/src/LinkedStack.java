/**
 * Created by Matthew on 11/10/2015.
 */
public class LinkedStack<T> implements Stack<T>{
    
    private int sizeCount;  // size of the Stack
    private LinearNode<T> top;

    public LinkedStack(){
        sizeCount = 0; // size initially 0
        top = null; // top is initially null
    }


    // push a new element onto the stack
    @Override
    public void push(T element) {
        LinearNode<T> temp = new LinearNode<T>(element);
        temp.setNext(top);
        sizeCount++; // increment size
        top = temp; // set the top equal to the new
    }

    // removes the top item from the stack and returns it
    @Override
    public T pop() {
        if(sizeCount >= 1) { //insures the size is greater than or equal to one
            T result = top.getElement();
            top = top.getNext();
            sizeCount--; // decrement size
            return result; // return the item from the stack
        }
        return null; // return null if the stack is empty
    }

    // returns something from the stack without removing it from the stack
    @Override
    public T peek() {
        if(sizeCount >= 1) { // insure the stack size is greater than 0
            T result = top.getElement(); // get the top element
            return result; // return it
        }
        return null;
    }

    // checks the size of the stack to return if it is empty
    @Override
    public boolean isEmpty() {
        if(sizeCount == 0){
            return true;
        }
        return false;
    }

    // return the size of the stack
    @Override
    public int size() {
        return sizeCount;
    }
}
