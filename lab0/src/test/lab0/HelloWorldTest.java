package test.lab0;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;
import lab0.HelloWorld;

/**
 * HelloWorld Tester.
 *
 * @author <Authors name>
 * @since <pre>08/24/2015</pre>
 * @version 1.0
 */
public class HelloWorldTest extends TestCase {
    public HelloWorldTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetMessage() throws Exception {
        assertTrue("Hello World".equals(HelloWorld.getMessage()));
    }

    public static Test suite() {
        return new TestSuite(HelloWorldTest.class);
    }
}
