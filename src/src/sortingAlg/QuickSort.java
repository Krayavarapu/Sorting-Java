package sortingAlg;

//import java.util.ArrayList;

public class QuickSort extends Sort {

    //returns the pivot index
    public int partition(int list[], int low, int high) {

        int pivot = list[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (list[j] <= pivot) {
                i++;

                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        int temp = list[i+1];
        list[i+1] = list[high];
        list[high] = temp;

        return (i+1);
    }

    @Override
    public int[] sort(int list[]) {

        sort(list, 0, (list.length - 1));

        return list;
    }
    public void sort(int list[], int low, int high) {

        if (low < high) {
            int pi = partition(list, low, high);

            sort(list, low, pi-1);
            sort(list, pi+1, high);
        }

        //return list;
    }

    //returns the pivot index
//    public int partition(int list[], int low, int high) {
//
//        int pivot = list[high];
//        int i = (low - 1);
//
//        for (int j = low; j < high; j++) {
//            if (list[j] <= pivot) {
//                i++;
//
//                int temp = list[i];
//                list[i] = list[j];
//                list[j] = temp;
//            }
//        }
//
//        int temp = list[i+1];
//        list[i+1] = list[high];
//        list[high] = temp;
//
//        return (i+1);
//    }


}
