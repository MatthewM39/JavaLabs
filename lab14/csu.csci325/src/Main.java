/**
 * Created by Matthew on 11/10/2015.
 */
public class Main {
    public static void main(String args[]){
        LinkedStack myStack = new LinkedStack();

        System.out.println("Testing peek on empty stack: " +  myStack.peek());
        System.out.println("List is empty: " + myStack.isEmpty());
        System.out.println("Adding numbers 1-5 to the stack");


        // push 1,2,3,4,5 to the stack
        for(int i = 1; i < 6; i++) {
            myStack.push(i);
        }

        System.out.println("List is empty: " + myStack.isEmpty());

        System.out.println("Size of Stack: " + myStack.size());
        System.out.println("Peeking: " + myStack.peek());
        System.out.println("Poppping: "+ myStack.pop());
        System.out.println("Peeking next: " + myStack.peek());

        System.out.print("Popping 4,3, and 2: ");
        for (int i = 0; i < 3; i++){
            System.out.print(myStack.pop());
        }


        System.out.println("\nPeeking: " + myStack.peek());
        System.out.println("Popping " + myStack.peek() + ": " + myStack.pop());
        System.out.println("Testing peek again, should be null: " + myStack.peek());
        System.out.println("Testing pop, should be null: " + myStack.pop());
        System.out.println("Adding 12345 to the stack");

        myStack.push(12345);
        System.out.println("Peeking: " + myStack.peek());
    }
}
