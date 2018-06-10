package sortingAlg;

import java.util.ArrayList;

public class HeapSort extends Sort {

    @Override
    public void sort(int arr[]) {

        int x = arr.length;

        for (int i = x/2 - 1; i >= 0; i--) {
            heapify(arr, x, i);
        }

        for (int i = x-1; i>= 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public void heapify(int arr[], int n, int i) {
        int largestVal = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr[left] > arr[largestVal]) {
            largestVal = left;
        }

        if (right < n && arr[right] > arr[largestVal]) {
            largestVal = right;
        }

        if (largestVal != i) {
            int swap = arr[i];
            arr[i] = arr[largestVal];
            arr[largestVal] = swap;

            heapify(arr, n, largestVal);
        }
    }
}
