package review;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlFlowTest {

    ControlFlow instance;

    @BeforeEach
    void setUp(){
        instance = new ControlFlow();
    }

    @Test
    void testMyMethod(){

        String expected = "true";
        // . indicates that you are trying to access objects in within instance
        String actual = instance.myMethod(4);

        assertEquals(expected, actual);
    }

    @Test
    void switchMethodTest(){

        String actual = instance.switchMethod(3);

        assertEquals("that's four", actual);
    }

    @Test
    void testForMethod(){
        String actual = instance.forMethod();

    }

}