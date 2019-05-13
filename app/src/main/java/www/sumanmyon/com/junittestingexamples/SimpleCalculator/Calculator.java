package www.sumanmyon.com.junittestingexamples.SimpleCalculator;

public class Calculator {

    public Calculator() {
    }

    public int addTwoNumbers(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if(b==0) throw new IllegalArgumentException("Cannot be divided by zero.");
        return a/b;
    }
}
