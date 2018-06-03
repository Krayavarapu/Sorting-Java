package tests;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import sortingAlg.QuickSort;

public class QuickSortTest {

    @Test
    public void testListOfUnOrderedValues() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(3);
        list.add(8);
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(1);

        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(4);
        expectedList.add(6);
        expectedList.add(7);
        expectedList.add(8);

        QuickSort qs = new QuickSort();
        qs.sort(list, 0, 7);

        for (int i = 0; i < list.size(); i++) {
            assertTrue(list.get(i) == expectedList.get(i));
        }
    }

    @Test
    public void testListOrderedValues() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(4);

        QuickSort qs = new QuickSort();
        qs.sort(list, 0, 3);

        for (int i = 0; i < list.size(); i++) {
            assertTrue(list.get(i) == expectedList.get(i));
        }

    }

}
