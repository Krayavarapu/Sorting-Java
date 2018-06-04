package tests;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import sortingAlg.InsertionSort;

public class InsertionSortAlgorithm {

    @Test
    public void testUnorderedValues() {
        int arr[] = {2, 3, 1, 9, 8, 6, 7, 5, 4};
        int expectedArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        InsertionSort firstSort = new InsertionSort();
        firstSort.sort(arr);

        assertArrayEquals(expectedArr, arr);

    }

    @Test
    public void testOrderedValues() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int expectedArr[] = {1, 2, 3, 4, 5, 6};

        InsertionSort secondSort = new InsertionSort();
        secondSort.sort(arr);

        assertArrayEquals(expectedArr, arr);

    }

}
