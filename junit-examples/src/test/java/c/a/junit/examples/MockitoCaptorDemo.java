package c.a.junit.examples;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.LinkedList;

@ExtendWith(MockitoExtension.class)
public class MockitoCaptorDemo {

    @Mock
    LinkedList<Object> list;

    @Captor
    ArgumentCaptor argumentCaptor;

    @Test
    void argumentCaptor(){
        list.add(999);
        Mockito.verify(list).add(argumentCaptor.capture());

        assertEquals(999, argumentCaptor.getValue());

        Mockito.verify(list, Mockito.atLeast(1)).add(any());
    }
}
