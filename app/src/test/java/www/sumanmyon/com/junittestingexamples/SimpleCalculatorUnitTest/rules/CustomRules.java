package www.sumanmyon.com.junittestingexamples.SimpleCalculatorUnitTest.rules;

import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.util.logging.Logger;

public class CustomRules implements TestRule {

    private Logger logger;

    public Logger getLogger(){
        return logger;
    }
    @Override
    public Statement apply(Statement base, Description description) {
        logger = Logger.getLogger(CustomRules.class.getSimpleName() + " : this is my custom rule.");
        try {
            base.evaluate();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return base;
    }
}
