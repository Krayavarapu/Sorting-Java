package Selections;

import sortingAlg.QuickSort;

public class OptionThree {

    protected int val[];
    boolean chosen;

    public OptionThree(int arr[]) {
        val = arr;
        chosen = false;
        sendToGivenAlgorithm(val);
    }

    public void sendToGivenAlgorithm(int arr[]) {
        QuickSort newSort = new QuickSort();
        newSort.sort(arr);
    }

    public boolean isChosen() {
        chosen = true;
        return chosen;
    }
}
