package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test() {
        int k = Main.sum(5, 10);
        assertEquals(15, k);
    }

    @Test
    public void testMulti() {
        int k = Main.multi(3, 2);
        assertEquals(6, k);
    }

    @Test
    public void testSub() {
        int k = Main.sub(5, 2);
        assertEquals(3, k);
    }

    @Test
    public void testDiv() {
        int k = Main.div(10, 2);
        assertEquals(5, k);
    }
}