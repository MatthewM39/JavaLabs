package csu.csci325;

import java.util.Scanner;

/**
 * Created by pwest on 11/3/15.
 */
public class PostFix {
    private Stack<Integer> mStack = new ArrayStack<Integer>();

    int peek() {
        return mStack.peek();
    }

    void addElement(String element) {
        System.out.println(mStack + "pushing " + element);
        if (element.equals("+")) {
            int a = mStack.pop();
            int b = mStack.pop();
            mStack.push(a + b);
        } else if (element.equals("-")) {
            int a = mStack.pop();
            int b = mStack.pop();
            mStack.push(b - a);
        } else if (element.equals("*")) {
            int a = mStack.pop();
            int b = mStack.pop();
            mStack.push(b * a);
        } else if (element.equals("/")) {
            int a = mStack.pop();
            int b = mStack.pop();
            mStack.push(b / a);
        } else {
            mStack.push(Integer.parseInt(element));
        }
        System.out.println(mStack);
    }

    public static void main(String[] args) {
        PostFix pf = new PostFix();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            pf.addElement(scan.next());
        }
        System.out.println(pf.peek());
    }
}
