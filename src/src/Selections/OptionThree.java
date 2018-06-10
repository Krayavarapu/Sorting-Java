package Selections;

import sortingAlg.QuickSort;

public class OptionThree extends Options{

    public OptionThree(int arr[]) {
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
