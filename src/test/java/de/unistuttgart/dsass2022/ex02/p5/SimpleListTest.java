package de.unistuttgart.dsass2022.ex02.p5;

import java.util.Map;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class SimpleListTest {

    private final Map<SimpleList<Integer>, SimpleList<Integer>> testListCouples;

    public SimpleListTest() {
        this.testListCouples = TestListData.getTestListCouples();
    }

    @Test
    public void testSimpleList() {
        for (Map.Entry<SimpleList<Integer>, SimpleList<Integer>> couple: testListCouples.entrySet()) {
            couple.getKey().sort();

            assertEquals(couple.getKey(), couple.getValue());
        }
    }

}
