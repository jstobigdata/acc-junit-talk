package c.a.junit.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    //TODO - 3 - Explain displaed

    /**
     *  - displayed
     *  - disabled
     *  - Parameterised Test
     */

    @Test
    @Disabled("need fix for Null")
    void multiply_withNull() {
        Number result = Calculator.multiply(null, null);
        Assertions.assertEquals(null, result);
    }

    @Test
    void multiply_withValidInput() {
        Number result = Calculator.multiply(1,2);
        Assertions.assertEquals(2, result);
    }

    @Test
    void divide_withNull() {
        Number result = Calculator.divide(null, null);
        Assertions.assertEquals(null, result);
    }

    @Test
    void divide_withValidInput() {
        Number result = Calculator.divide(8,2);
        Assertions.assertEquals(result, 0);
    }


}
