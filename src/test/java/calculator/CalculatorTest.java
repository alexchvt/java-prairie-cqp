package calculator;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class CalculatorTest {

    @Test
    public void addition() {
        //set
        Calculator calculator = new Calculator();
        //test
        int result = calculator.addition(1, 2);
        //assert
        assertEquals(3, result);
    }

    @Test
    public void subtraction() {
        //set
        Calculator calculator = new Calculator();
        //test
        int result = calculator.subtraction(2, 1);
        //assert
        assertEquals(1, result);
    }

    @Test
    public void divide() {
        //set
        Calculator calculator = new Calculator();
        //test
        float result = calculator.divide(4, 2);
        //assert
        assertEquals(2f, result);
    }

    @Test
    public void divide_by_zero() throws ArithmeticException {
        //set
        Calculator calculator = new Calculator();
        //test
        float result = calculator.divide(2, 0);
        //assert
        assertEquals(0f, result);

    }


}
