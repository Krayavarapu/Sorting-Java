package Selections;

import sortingAlg.InsertionSort;

public class OptionOne extends Options{

    public OptionOne(int arr[]) {
        super(arr);
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