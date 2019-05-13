package www.sumanmyon.com.junittestingexamples.SimpleCalculatorUnitTest;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import www.sumanmyon.com.junittestingexamples.SimpleCalculator.Calculator;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametricTest {

    private int a;
    private int b;
    private int c;

    public ParametricTest(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dataSet(){
        Object[][] objects = new Object[][]{
                {2,3,5},
                {3,4,7},
                {10,20,30}
        };

        return Arrays.asList(objects);
    }

    @Test
    public void testAddingTwoNumbers(){
        Calculator calculator = new Calculator();
        int result = calculator.addTwoNumbers(a, b);
        assertEquals(c,result);
    }
}
