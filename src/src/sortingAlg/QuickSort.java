package sortingAlg;

import java.util.ArrayList;

public class QuickSort {

    public ArrayList<Integer> sort(ArrayList<Integer> list, int low, int high) {

        if (low < high) {
            int pi = partition(list, low, high);

            sort(list, low, pi+1);
            sort(list, pi+1, high);
        }
        return list;
    }

    public void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    //returns the pivot index
    public int partition(ArrayList<Integer> list, int low, int high) {

        int pivot = list.get(high);

        int i = (low - 1);

        for (int j = low; j < high - 1; j++) {
            if (list.get(j) <= pivot) {
                i++;
                swap(list.get(i), list.get(j));
            }
        }

        swap(list.get(i+1), list.get(high));
        return (i+1);
    }

}
