import junit.framework.TestCase;

/**
 * Created by Matthew on 9/28/2015.
 */
public class PushRandomPanelTest extends TestCase {

    @org.junit.Test
    public void testRandomNumber() throws Exception{
        PushRandomPanel push = new PushRandomPanel();
        int tempInt;

        // simulate 500 button presses and insures they are between 1 and 100
        for (int i = 0; i < 500; i++){

            push.getMButton().doClick();
            tempInt = Integer.parseInt(push.getMLabel().getText());
            assertTrue(tempInt >= 1 && tempInt <= 100);

            // prints out when the value is 1 or 100 to confirm they are possible
            if (tempInt == 1 || tempInt == 100){
                System.out.println("Value of " + tempInt + " is included!");
            }

        }
    }

}