package csu.csci325;

public class Main {

    public static void main(String[] args) {
        Stack<String> msg = new ArrayStack<String>();
        msg.push(new String("HI"));
        msg.push("First");
        msg.push("Second");
        msg.push("Third");
        msg.push("Fourth");
        //System.out.println(msg.peek());
        while (!msg.isEmpty()) {
            System.out.println(msg.pop());
        }
	// write your code here
    }
}
