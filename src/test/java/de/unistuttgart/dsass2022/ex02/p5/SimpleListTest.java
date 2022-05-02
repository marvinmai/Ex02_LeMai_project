package de.unistuttgart.dsass2022.ex02.p5;

import java.util.Map;
import java.util.Optional;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class SimpleListTest {

    private final Map<SimpleList<Integer>, SimpleList<Integer>> testListCouples;

    public SimpleListTest() {
        this.testListCouples = TestListData.getTestListCouples();
    }

    @Test
    public void testSimpleList() {
        SimpleList<Integer> list = new SimpleList<>();
        list.prepend(55);
        list.prepend(676);
        list.prepend(3);

        assertEquals(Optional.of(55), Optional.of(list.getElement(2)));
    }

    @Test
    public void testSimpleListSort() {
        for (Map.Entry<SimpleList<Integer>, SimpleList<Integer>> couple: testListCouples.entrySet()) {
            couple.getKey().sort();

            assertEquals(couple.getKey(), couple.getValue());
        }
    }

}
