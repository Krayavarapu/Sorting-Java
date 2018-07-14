package sortingAlg;

import fileread.FileWrite;

public class InsertionSort extends Sort {

    @Override
    public int[] sort(int list[]) {
        //int low = 0;
        int high = list.length;
        for (int i = 1; i < high; i++) {
            int key = list[i];
            int j = i-1;

            while (j >= 0 && key < list[j]) {
                list[j+1] = list[j];
                j = j - 1;
            }
            list[j+1] = key;
        }

        sendToFileWrite(list);

        return list;

    }

    public void sendToFileWrite(int arr[]) {
        FileWrite fw = new FileWrite(arr);
    }

}
