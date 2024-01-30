package c.a.junit.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class Mockito1DataUtils {
    @Mock
    DataUtils dataUtils;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        when(dataUtils.isPresent(anyInt())).thenReturn(true);
    }

    @Test
    void testIsPresent() {
        //dataUtils.addData(0);

        boolean result = dataUtils.isPresent(0);
        Assertions.assertEquals(true, result);
        assertThat(result).isEqualTo(true);
    }



}
