package main;

import fileread.FileReader;

public class Main {

    private FileReader fileRead;

    public void startModule(String file) {
        fileRead = new FileReader(file);
    }

    public static void main(String[] args) {
    }
}
