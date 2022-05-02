package de.unistuttgart.dsass2022.ex02.p5;

import java.util.HashMap;
import java.util.Map;

public class TestListData {


    /**
     * Provides data with unsorted and sorted data in descending order to test sorting algorithms.
     * @return  Map with test list couples, one is unsorted and the other is sorted in descending order.
     *          key of map: unsorted list, value of map: sorted list
     */
    public static Map<SimpleList<Integer>, SimpleList<Integer>> getTestListCouples() {
        Map<SimpleList<Integer>, SimpleList<Integer>> testListCouples = new HashMap<>();
        testListCouples.put(getTestList1(), getTestList1Sorted());
        testListCouples.put(getTestList2(), getTestList2Sorted());
        testListCouples.put(getTestList3(), getTestList3Sorted());
        testListCouples.put(getTestList4(), getTestList4Sorted());

        return testListCouples;
    }

    private static SimpleList<Integer> getTestList1Sorted() {
        SimpleList<Integer> sortedTestList = new SimpleList<>();
        sortedTestList.prepend(989898);
        sortedTestList.prepend(3162);
        sortedTestList.prepend(99);
        sortedTestList.prepend(14);
        sortedTestList.prepend(12);
        sortedTestList.prepend(6);
        sortedTestList.prepend(5);
        sortedTestList.prepend(3);
        sortedTestList.prepend(1);
        sortedTestList.prepend(0);

        return sortedTestList;
    }

    private static SimpleList<Integer> getTestList1() {
        SimpleList<Integer> testList = new SimpleList<>();
        testList.prepend(5);
        testList.prepend(989898);
        testList.prepend(12);
        testList.prepend(1);
        testList.prepend(14);
        testList.prepend(0);
        testList.prepend(99);
        testList.prepend(3);
        testList.prepend(6);
        testList.prepend(3162);

        return testList;
    }

    private static SimpleList<Integer> getTestList2() {
        SimpleList<Integer> testList = new SimpleList<>();
        testList.prepend(4);
        testList.prepend(12);

        return testList;
    }

    private static SimpleList<Integer> getTestList2Sorted() {
        SimpleList<Integer> testList = new SimpleList<>();
        testList.prepend(12);
        testList.prepend(4);

        return testList;
    }

    private static SimpleList<Integer> getTestList3() {
        SimpleList<Integer> testList = new SimpleList<>();
        testList.prepend(4);

        return testList;
    }

    private static SimpleList<Integer> getTestList3Sorted() {
        SimpleList<Integer> testList = new SimpleList<>();
        testList.prepend(4);

        return testList;
    }

    private static SimpleList<Integer> getTestList4() {
        SimpleList<Integer> testList = new SimpleList<>();

        return testList;
    }

    private static SimpleList<Integer> getTestList4Sorted() {
        SimpleList<Integer> testList = new SimpleList<>();

        return testList;
    }
}
