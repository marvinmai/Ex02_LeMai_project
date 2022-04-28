package de.unistuttgart.dsass2022.ex02.p4;

import static org.junit.Assert.*;
import org.junit.*;

public class ComplexityTest {

    @Test
    public void testFirst() {
        int n = 19;

        assertEquals(Complexity.isDoneBetter1(n), Complexity.couldBeBetter1(n));
    }

    @Test
    public void testSecond() {
        int n = 19;

        assertEquals(Complexity.isDoneBetter2(n), Complexity.couldBeBetter2(n));
    }

    @Test
    public void testThird() {
        int n = 19;

        assertEquals(Complexity.isDoneBetter3(n), Complexity.couldBeBetter3(n));
    }
}
