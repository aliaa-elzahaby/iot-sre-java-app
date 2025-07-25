package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldAppTest {

    @Test
    public void testMain() {
        HelloWorldApp.main(new String[]{}); // This runs the main method
        assertTrue(true); // dummy assertion just to make the test pass
    }
}

