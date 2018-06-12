package fileread;

import java.io.IOException;
//import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.ArrayList;
import java.util.List;


//import static java.lang.System.arraycopy;


public class FileReader {

    private List<String[]> list;
    //protected String arr[] = {};
    protected int numArray[];
    protected ArrayList<String> listOfVals;

    public FileReader(String file) {
        readFile(file);
    }

    public void readFile(String file) {
        list = new ArrayList<>();
        try {
            for (String line : Files.readAllLines(Paths.get(file))) {
               String[] arr = line.split(",");
//                arr = Arrays.copyOf(arr, arr.length + val.length);
//                System.arraycopy(val, 0, arr, arr.length, val.length);
                list.add(arr);
            }

            getFullListOfValues(list);
        }

        catch(IOException ex) {
            ex.printStackTrace();
        }

    }

    public void getFullListOfValues(List<String[]> list) {
        listOfVals = new ArrayList<>();

        for (String[] line : list) {
            for (String val : line) {
                listOfVals.add(val);
            }
        }
    }

    public void convertStringToIntArray(ArrayList<String> list) {

        numArray = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            String val = list.get(i);
            int num = Integer.parseInt(val);
            numArray[i] = num;
        }

        //return numArray;

    }

    public ArrayList<String> getListOfVals() {
        return listOfVals;
    }

    public int[] getNumArray() {
        return numArray;
    }


}
