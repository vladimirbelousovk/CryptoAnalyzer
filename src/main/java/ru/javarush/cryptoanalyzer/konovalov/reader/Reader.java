package ru.javarush.cryptoanalyzer.konovalov.reader;

import java.io.*;

public class Reader {
    public static BufferedReader getReader(String filePath) throws FileNotFoundException {
    FileReader fileReader = new FileReader(filePath);
    BufferedReader writer = new BufferedReader(fileReader);
        return writer;
}
}
