import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){
        int result= calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void canSubtract(){
        int result= calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void canMultiply(){
        int result= calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void canDivide(){
        double result= calculator.divide(5, 2);
        assertEquals(2.5, result, 0.0);
    }

}
