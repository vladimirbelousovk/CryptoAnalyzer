package ru.javarush.cryptoanalyzer.konovalov.util;

import ru.javarush.cryptoanalyzer.konovalov.exception.EnteredFileNotExistException;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import static ru.javarush.cryptoanalyzer.konovalov.printer.Printable.println;

public class PathFinder {
    public static boolean isFileExist() {
        return fileExist;
    }

    public static void setFileExist(boolean fileExist) {
        PathFinder.fileExist = fileExist;
    }

    private static boolean fileExist = false;

    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String fileName) {
        PathFinder.fileName = fileName;
    }

    private static String fileName;

    public static String getRoot() {
        String root = System.getProperty("user.dir");
        return root + File.separator + "text" + File.separator;
    }

    public static void checkExistenceOfFile(String filename) throws EnteredFileNotExistException {
        if (Files.exists(Path.of(getRoot() + filename))) {
            setFileName(filename);
            setFileExist(true);
            println("The file exists and is saved in parameters");
        } else {
            throw new EnteredFileNotExistException("File does not exist!");
        }
    }
}