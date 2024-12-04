package com.example.gitpractice2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    public void testAdd() {
        int result = 2 + 3;
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        int result = 2 * 3;
        assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        int result = 6 / 2;
        assertEquals(3, result);
    }
}
