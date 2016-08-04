package ru.sbt.exception.store;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class FileStore implements Store {
    private static final String fileName = "filestore.txt";
    private static final Path path = Paths.get("./" + fileName);
    public FileStore() {
    }

    public void save(String t) {

        byte data[] = t.getBytes();
//        Path path = new File(fileName).toPath;

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(path, CREATE, APPEND))) {
            out.write(data, 0, data.length);
        } catch (IOException e) {
            throw new StoreException("Error during write string from file", e);
        }
    }

    public List<String> getAll() {
        List<String> strings;

        try {
            strings = Files.readAllLines(path);
        } catch (IOException e) {
            throw new StoreException("Error during reading string from file", e);
        }
        return strings;
    }
}
