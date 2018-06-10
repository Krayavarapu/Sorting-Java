package tests;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import sortingAlg.HeapSort;

public class HeapSortAlgorithm {

    @Test
    public void testUnorderedArray() {
        int arr[] = {4, 2, 3, 7, 5, 1, 6};
        int expectedArr[] = {1, 2, 3, 4, 5, 6, 7};

        HeapSort firstSort = new HeapSort();
        firstSort.sort(arr);

        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testOrderedArray() {
        int arr[] = {1, 2, 3, 4, 5};
        int expectedArr[] = {1, 2, 3, 4, 5};

        HeapSort sort = new HeapSort();
        sort.sort(arr);

        assertArrayEquals(expectedArr, arr);
    }
}
