package c.a.junit.examples;

import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.mockito.Mockito.*;

class DataUtilsTest {

    private DataUtils dataUtils;
    private Random random = new Random();

    @BeforeEach
    void setUp() {
        dataUtils = new DataUtils();
    }

    @RepeatedTest(100)
    @Timeout(value = 100, unit = TimeUnit.MICROSECONDS)
    void addRandom_timeout(){
        for (int i = 0; i < 300; i++) {
            dataUtils.addData(random.nextInt());
        }
    }

    @Test
    void testIsPresent() {
        dataUtils.addData(0);

        boolean result = dataUtils.isPresent(0);
        Assertions.assertEquals(true, result);
    }
}
