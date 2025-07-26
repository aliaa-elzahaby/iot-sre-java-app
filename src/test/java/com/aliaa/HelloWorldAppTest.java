package com.aliaa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldAppTest {
    @Test
    void testGreet() {
        HelloWorldApp app = new HelloWorldApp();
        assertEquals("Hello, Aliaa!", app.greet("Aliaa"));
    }
}
