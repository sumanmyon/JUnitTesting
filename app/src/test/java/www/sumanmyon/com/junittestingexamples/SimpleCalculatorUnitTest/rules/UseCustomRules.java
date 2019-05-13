package www.sumanmyon.com.junittestingexamples.SimpleCalculatorUnitTest.rules;

import org.junit.Rule;
import org.junit.Test;

public class UseCustomRules {
    @Rule
    public CustomRules rules = new CustomRules();

    @Test
    public void testWarning(){
        rules.getLogger().warning("Very bad problem ");
    }
}
