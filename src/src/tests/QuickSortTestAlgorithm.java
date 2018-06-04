package tests;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

//import java.util.ArrayList;
import sortingAlg.QuickSort;

public class QuickSortTestAlgorithm {

    @Test
    public void testListOfUnOrderedValues() {

        int[] list = {8, 4, 9, 1, 2, 3, 6, 5, 7};
        int[] expectedList = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        QuickSort qs = new QuickSort();
        qs.sort(list);

       assertArrayEquals(expectedList, list);
       assertEquals(1, list[0]);

    }

    @Test
    public void testListOrderedValues() {
        int[] list = {1, 2, 3, 4, 5, 6};
        int[] expectedList = {1, 2, 3, 4, 5, 6};

        QuickSort qs = new QuickSort();
        qs.sort(list);

        assertArrayEquals(expectedList, list);
        assertEquals(1, list[0]);

    }

}
