package tests;

import fileread.FileReader;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class test_read_file {

    @Test
    public void checkIfFileIsReadProperly() {
        String file = "extraneous_files/numbers.txt";

        FileReader fr = new FileReader(file);
        int arr[] = fr.getNumArray();
        int expectedArr[] = {1, 4, 7, 5, 3, 2, 6};

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
