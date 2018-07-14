package fileread;

import java.io.IOException;
//import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.ArrayList;
import java.util.List;
import Selections.*;


//import static java.lang.System.arraycopy;


public class FileReader {

    //private List<String[]> list;
    private Options option;
    protected int numArray[];
    protected ArrayList<String> listOfVals;

    public FileReader(String file) {
        readFile(file);
        listOfVals = new ArrayList<>();
        numArray = new int[listOfVals.size()];
    }

    public void readFile(String file) {
        List<String[]> list = new ArrayList<>();
        try {
            for (String line : Files.readAllLines(Paths.get(file))) {
                if (line.length() > 0) {
                    String[] arr = line.split(",");
//                arr = Arrays.copyOf(arr, arr.length + val.length);
//                System.arraycopy(val, 0, arr, arr.length, val.length);
                    list.add(arr);
                }
                else if (line.length() == 0) {
                    String[] arr = {};
                    list.add(arr);
                }
            }

            getFullListOfValues(list);
        }

        catch(IOException ex) {
            ex.printStackTrace();
        }

    }

    public void getFullListOfValues(List<String[]> list) {

        for (String[] line : list) {
            for (String val : line) {
                listOfVals.add(val);
            }
        }

        convertStringToIntArray(listOfVals);
    }

    public void convertStringToIntArray(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {
            String val = list.get(i);
            int num = Integer.parseInt(val);
            numArray[i] = num;
        }

        //return numArray;

    }

    public void sendToInsertionSortOption() {

        option = new InsertionSortOption(getNumArray());
    }

    public void sendToHeapSortOption() {

        option = new HeapSortOption(getNumArray());
    }

    public void sendToQuickSortOption() {

        option = new QuickSortOption(getNumArray());
    }

    public ArrayList<String> getListOfVals() {
        return listOfVals;
    }

    public int[] getNumArray() {
        return numArray;
    }


}
