package Selections;

import sortingAlg.HeapSort;
import sortingAlg.InsertionSort;

public class OptionTwo extends Options{

    public OptionTwo(int[] arr) {
        super(arr);
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
