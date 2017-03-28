package csu.csci325;

/**
 * Created by Matthew on 11/5/2015.
 */
public class Main {

    public static void main(String args[]){

        List list;
        list = new ArrayList();

        // add items to the created list
        list.add("eseht");
        list.add("era");
        list.add("sdrawkcab");
        list.add("sdrow");

        // test reversing the words. should print "these words are backwards"
        for (int i = 0; i < 4; i++) {
            System.out.print(ReverseSentence.ReverseWord((String)list.get(i)) + " ");
        }

        // make list a new ArrayList again and tests it with only one value. should print "amazing"
        list = new ArrayList();
        list.add("gnizama");
        System.out.print(ReverseSentence.ReverseWord((String)list.get(0)));

        // calls ReverseSentence and tests user input
        System.out.println("\n---Now testing user input---");
        ReverseSentence mySent = new ReverseSentence();
        ReverseSentence.main(null);

    }

}
