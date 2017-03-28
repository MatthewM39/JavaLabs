import junit.framework.TestCase;

/**
 * Created by Matthew on 10/6/2015.
 */
public class IntegerCountTest extends TestCase {


    IntegerCount count1 = new IntegerCount();

    // tests Account() and getOccurences(). Account() calls getOccurences()
    public void testAccountOccurence() throws Exception {

        // inputs 5, and increments the number of 5's to 1
        count1.account(5);
        assertTrue(count1.returnVal(4) == 1);

        // incremements the number of 100s to 1
        count1.account(100);
        assertTrue(count1.returnVal(99) == 1);

        // incremements the number of 5's to 2
        count1.account(5);
        assertTrue(count1.returnVal(4) == 2);

        // incremements the number of 1's to 1
        count1.account(1);
        assertTrue(count1.returnVal(0) == 1);

        // inputting a number above 100 results in no increment
        count1.account(101);
        assertTrue(count1.returnVal(100) == 0);

        // inputting a number < 1 results in no increment
        count1.account(-1);
        assertTrue(count1.returnVal(-2) == 0);



    }

    // should print "1:2 40:3"
    public void testPrint() throws Exception {
        count1.account(1);
        count1.account(40);
        count1.account(1);
        count1.account(40);
        count1.account(40);
        count1.print();
    }
}