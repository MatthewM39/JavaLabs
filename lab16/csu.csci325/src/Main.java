/**
 * Created by Matthew on 11/17/2015.
 */


public class Main {

    public static void main(String[] args) {


        CircularArray myCircle = new CircularArray();
        LinkedList myList = new LinkedList();

        System.out.println("Begin CircularArray test");
        queueTest(myCircle);

        System.out.println("\nBegin LinkedList test");
        queueTest(myList);




    }

    public static void queueTest(Queue input){
        int size;
        // testing empty queue
        System.out.println("Beginning test");
        System.out.println("Testing empty queue: " + input.first());

        // adding 20 elements for testing
        for(int i = 1; i <= 20; i++) {
            input.enqueue(i);
        }
        System.out.println("Adding integers 1-20 to the queue \nFirst element: " + input.first() + "\nSize: " + input.size());
        System.out.println("Testing first element: " + input.first());

        // testing dequeue
        System.out.println("Dequeuing first element: " + input.dequeue());
        System.out.println("Testing first element now: " + input.first());

        // dequeue past the size of the queue
        System.out.println("Now dequeing past the queue size. Last five elements should be null");
        size = input.size();
        for(int i = 0; i <= size + 4; i++){
            System.out.print(input.dequeue() + " ");
        }

        // test current size and enqueuing elements after the queue has been emptied
        System.out.println("\nAll elements removed, current size: " + input.size());
        System.out.println("Testing first element: " + input.first());
        System.out.println("Enqueuing 42 and 20");
        input.enqueue(42);
        input.enqueue(20);
        System.out.println("Current size: " + input.size());
        System.out.println("First: " + input.first());
        System.out.println("Dequeing elements: " + input.dequeue() + " " + input.dequeue());


        // test adding over 100 elements to the queue
        System.out.println("Enqueing integers 0 - 99");
        for(int i = 0; i < 100; i++){
            input.enqueue(i);
        }
        System.out.println("Size " + input.size());
        System.out.println("Enqueing integer 100");
        input.enqueue(100);
        System.out.println("Size " + input.size());



    }
}
