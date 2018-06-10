package Selections;

import sortingAlg.HeapSort;
import sortingAlg.InsertionSort;

public class HeapSortOption extends Options{

    public HeapSortOption(int[] arr) {
        super(arr);
        sendToGivenAlgorithm(arr);
    }

    @Override
    public void sendToGivenAlgorithm(int arr[]) {
        HeapSort newSort = new HeapSort();
        newSort.sort(arr);
    }

    @Override
    public boolean isChosen() {
        chosen = true;
        return chosen;
    }
}
