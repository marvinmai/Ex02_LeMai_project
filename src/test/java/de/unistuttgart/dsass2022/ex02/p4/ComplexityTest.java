package de.unistuttgart.dsass2022.ex02.p4;

import static org.junit.Assert.*;
import org.junit.*;

public class ComplexityTest {

    private static final int[] numbers = {0, 1, 4, 5, 6, 19};

    @Test
    public void testFirst() {
        for (int n: numbers) {
            assertEquals(Complexity.couldBeBetter1(n), Complexity.isDoneBetter1(n));
        }

    }

    @Test
    public void testSecond() {
        for (int n: numbers) {
            assertEquals(Complexity.couldBeBetter2(n), Complexity.isDoneBetter2(n));
        }
    }

    @Test
    public void testThird() {
        for (int n: numbers) {
            assertEquals(Complexity.couldBeBetter3(n), Complexity.isDoneBetter3(n));
        }
    }
}
