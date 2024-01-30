package c.a.junit.examples;

import org.junit.jupiter.api.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

class Junit1TimeoutExample {

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
