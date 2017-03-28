import static org.junit.Assert.*;

/**
 * Created by pwest on 9/22/15.
 */
public class PushCounterPanelTest {

    @org.junit.Test
    public void testIncrementLabel() throws Exception {
        PushCounterPanel push = new PushCounterPanel();
        push.incrementLabel();
        assertTrue(push.getCount() == 1);
        assertTrue(push.getCount() != 2);
        push.incrementLabel();
        assertTrue(push.getCount() != 1);
        assertTrue(push.getCount() == 2);
    }
}