package tests;

import fileread.FileReader;
import org.junit.Test;

//import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class test_read_file {

    //This checks if all neccesary String values are properly transferred to List of String(Only when regex is ',')
    @Test
    public void checkIfStringsFromValTransfer() {
        String file = "extraneous_files/numbers.txt.txt";

        FileReader fr = new FileReader(file);
        ArrayList<String> list = fr.getListOfVals();
        String expectedArr[] = {"1", "3", "7", "2", "4", "6", "5"};
        for (int i = 0; i < list.size(); i++) {
            assertEquals(expectedArr[i], list.get(i));
        }

    }

    //This checks to see when a file with no numerical strings is read and transferred to List of String(Only when regex is ',')
    @Test
    public void checkFileWithOnlyNonNumStrings() {
        String file = "extraneous_file/noNumbers.txt";

        FileReader fr = new FileReader(file);
        ArrayList<String> list = fr.getListOfVals();
        String extpectedArr[] = {};

       // assertEquals(0, list.size());
        assertTrue(list.size() == extpectedArr.length);
    }

    @Test
    public void checkIfFileIsReadProperly() {
        String file = "extraneous_files/numbers.txt";

        FileReader fr = new FileReader(file);
        int arr[] = fr.getNumArray();
        int expectedArr[] = {1, 3, 7, 2, 4, 6, 5};

        assertArrayEquals(expectedArr, arr);

    }

    @Test
    public void checkIfFileIsReadEvenWithNonNumFile() {
        String file = "extraneous_files/noNumbers.txt";

        FileReader fr = new FileReader(file);
        int arr[] = fr.getNumArray();
        int expectedArr[] = {};

        assertArrayEquals(expectedArr, arr);
    }


}
