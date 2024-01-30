package c.a.junit.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
public class DataUtilsUsingMockito {
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
