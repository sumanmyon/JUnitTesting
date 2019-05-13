package www.sumanmyon.com.junittestingexamples.SimpleCalculatorUnitTest.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JUnitRuleTest {

    @Rule
    public Timeout timeout = new Timeout(1000);

    //@Test(timeout = 1000)
    @Test
    public void testA() throws Exception{

    }

    //@Test(timeout = 1000)
    @Test
    public void testB() throws Exception{

    }

    //@Test(timeout = 1000)
    @Test
    public void testC() throws Exception{

    }

}
