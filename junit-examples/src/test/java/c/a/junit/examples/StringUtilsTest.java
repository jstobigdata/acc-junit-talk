package c.a.junit.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class StringUtilsTest {

    @Test
    @DisplayName("concatenate(): with valid input")
    void testConcatenate() {
        String result = StringUtils.concatenate("str1", "str2");
        Assertions.assertEquals("str1"+"str2", result);
    }

    @Test
    @DisplayName("concatenate(): Except NullPointerException")
    void concatenate_with_null() {
        NullPointerException exception =  assertThrows(NullPointerException.class, () ->{
            StringUtils.concatenate(null, "hello");
        });
    }
}
