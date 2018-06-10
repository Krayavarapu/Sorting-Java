package fileread;

import java.io.IOException;
//import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

//import static java.lang.System.arraycopy;


public class FileReader {

    private String arr[];

    public FileReader(String file) {
        readFile(file);
    }

    public void readFile(String file) {
        String val[] = {};
        try {
            for (String line : Files.readAllLines(Paths.get(file))) {
                arr = line.split("\"[^\\\\d]\"");
                val = Arrays.copyOf(val, val.length + arr.length);
                System.arraycopy(arr, 0, val, val.length, arr.length);
            }

            convertStringToIntArray(val);
        }

        catch(IOException ex) {
            ex.printStackTrace();
        }

    }

    public int[] convertStringToIntArray(String arr[]) {

        int numArray[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            num = numArray[i];
        }

        return numArray;

    }
}
