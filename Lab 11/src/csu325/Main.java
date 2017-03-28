package csu325;

public class Main {

    public static void main(String[] args) {

        List list;
        list = new ArrayList();

        // give the list values
        for (int i = 0; i <= 10; i++){
            list.add(new Integer(i));
        }

        // test the values. should consist of 11 integers
        System.out.println("Array Test \nList size: " + list.size());
        printList(list);


        list = new SlinkedList();

        list.add (new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        list.add(new Integer(5));
        System.out.println("\n\nSlinked Test \nList size: " + list.size());
        printList(list);

    }

    // print each value in the list
    public static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Item " + (i + 1) + ":   " + list.get(i));
        }
    }
}
