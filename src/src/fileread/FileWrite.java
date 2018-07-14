package fileread;

//import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
//import java.io.File;
import java.io.UnsupportedEncodingException;


public class FileWrite {

    //File file;

    PrintWriter pw;

    protected int[] array;

    public FileWrite(int[] arr) {
        array = arr;
        writeToFile(array);
    }

    public PrintWriter writeToFile(int[] arr) {
        try {
            pw = new PrintWriter("Sorted_Values.txt", "UTF-8");
            for (int i = 0; i < arr.length; i++) {
                pw.print(arr[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return pw;
    }







}
