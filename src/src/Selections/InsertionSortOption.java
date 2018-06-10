package Selections;

import sortingAlg.InsertionSort;

public class InsertionSortOption extends Options{

    public InsertionSortOption(int arr[]) {
        super(arr);
        sendToGivenAlgorithm(arr);
    }

    @Override
    public void sendToGivenAlgorithm(int arr[]) {
        InsertionSort newSort = new InsertionSort();
        newSort.sort(arr);
    }

    @Override
    public boolean isChosen() {
        chosen = true;
        return chosen;
    }


}