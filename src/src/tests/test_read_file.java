package tests;

import fileread.FileReader;
import org.junit.Test;

//import java.lang.reflect.Array;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class test_read_file {

    //This checks if all neccesary String values are properly transferred to List of String(Only when regex is ',')
    @Test
    public void checkFileWithNumString() throws IOException {
        String file = "extraneous_files/numbers.txt";

        FileReader fr = new FileReader(file);
        ArrayList<String> list = fr.getListOfVals();
        ArrayList<String> expectedList = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.add("7");
        list.add("2");
        list.add("4");
        list.add("6");
        list.add("5");

        assertEquals(expectedList, list);

    }

    //This checks to see when a file with no numerical strings is read and transferred to List of String(Only when regex is ',')
    @Test
    public void checkFileWithOnlyNonNumStrings() throws IOException {
        String file = "noNumbers.txt";

        FileReader fr = new FileReader(file);
        ArrayList<String> list = fr.getListOfVals();
        ArrayList<String> expectedList = new ArrayList<>();

        assertEquals(expectedList, list);
    }

    @Test
    public void checkIfFileIsReadProperly() throws IOException{
        String file = "numbers.txt";

        FileReader fr = new FileReader(file);
        int arr[] = fr.getNumArray();
        int expectedArr[] = {1, 3, 7, 2, 4, 6, 5};

        assertArrayEquals(expectedArr, arr);

    }

    @Test
    public void checkIfFileIsReadEvenWithNonNumFile() throws IOException {
        String file = "noNumbers.txt";

        FileReader fr = new FileReader(file);
        int arr[] = fr.getNumArray();
        int expectedArr[] = {};

        assertArrayEquals(expectedArr, arr);
    }

}
