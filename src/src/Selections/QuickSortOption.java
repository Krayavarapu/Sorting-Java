package Selections;

import sortingAlg.QuickSort;

public class QuickSortOption extends Options{

    public QuickSortOption(int arr[]) {
        super(arr);
        sendToGivenAlgorithm(arr);
    }

    @Override
    public void sendToGivenAlgorithm(int arr[]) {
        QuickSort newSort = new QuickSort();
        newSort.sort(arr);
    }

    @Override
    public boolean isChosen() {
        chosen = true;
        return chosen;
    }

}
