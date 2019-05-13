package www.sumanmyon.com.junittestingexamples.SimpleCalculatorUnitTest;

import org.junit.*;

import www.sumanmyon.com.junittestingexamples.SimpleCalculator.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @BeforeClass
    public static void init(){
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void close(){
        System.out.println("@AfterClass");
    }

    @Before
    public void setUp(){
       calculator = new Calculator();
       System.out.println("set up");
    }

    @After
    public void tearDown(){
        calculator = null;
        System.out.println("tear down");
    }

    @Test
    public void testAddingTwoNumbers(){
        int a = 2;
        int b = 3;
        int result = calculator.addTwoNumbers(a, b);
        assertEquals(5,result);
    }

    @Test
    public void testSubtractingTwoNumber(){
        assertEquals(2,calculator.subtract(5,3));
    }

    @Test
    public void testMultiplyingTwoNumbers(){
        assertEquals(6,calculator.multiply(2,3));
    }

    @Test
    public void testDivisionByNonZero(){
        assertEquals(2, calculator.divide(6,3));
    }

    @Test(expected = IllegalArgumentException.class)
    @Ignore
    public void testDivisionByZero(){
        assertEquals(2, calculator.divide(6,0));
    }
}
