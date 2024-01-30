package c.a.junit.examples;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class JUnit2ParameterExample {

    /**
     *  - displayed
     *  - disabled
     *  - Parameterised Test
     */

    @Test
    @Disabled("need fix for Null")
    void multiply_withNull() {
        Number result = Calculator.multiply(null, null);
        assertEquals(null, result);
    }

    @Test
    void multiply_withValidInput() {
        Number result = Calculator.multiply(1,2);
        assertEquals(2, result);
    }

    @Test
    void divide_withNull() {
        Number result = Calculator.divide(null, null);
        assertEquals(null, result);
    }

    @Test
    void divide_withValidInput() {
        Number result = Calculator.divide(8,2);
        assertEquals(result, 4);
    }

    @ParameterizedTest
    @MethodSource("data")
    void parameter_example(int a, int b, int expectedResult) {
        Number result = Calculator.divide(a,b);

        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> data() {
        return Stream.of(
                arguments(1, 2, 0),
                arguments(2, 2,1),
                arguments(12, 1,12)
        );
    }
}
