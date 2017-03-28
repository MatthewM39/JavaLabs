package csu.csci325;

public class Main {

    public static void main(String[] args) {
        List list;
        list = new ArrayList();
        list = new SlinkedList();

        list.add (new Integer(15));
        list.add(new Integer(45));
        for (int i = 0; i < 10; i++ ) {
            list.add(new Integer(i));
        }
        for (int i = 0; i < 10; i++ ) {
            list.add(new Float(i + 1.0));
        }
        System.out.println("size = " + list.size());
        printList(new ArrayList());
        printList(new SlinkedList());
	// write your code here
    }

    public static void printList(List list){
        // print the list...
    }
}
