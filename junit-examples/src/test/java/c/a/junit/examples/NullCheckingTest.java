package c.a.junit.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NullCheckingTest {

    @Test
    void concatenate() {
        assertEquals("helloworld", StringUtils.concatenate("hello", "world"));
        NullPointerException exception =  assertThrows(NullPointerException.class, () ->{
           StringUtils.concatenate(null, "hello");
        });
    }

    @Test
    void testExpectedExceptionWithParentType() {

        assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("One");
        });
    }

    //TODO - 2 - not supported anymore
    //@Test(expected = NullPointerException.class)
    //void exception_in_anotherways() {

    //}
}
