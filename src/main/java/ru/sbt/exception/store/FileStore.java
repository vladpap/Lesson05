package ru.sbt.exception.store;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileStore implements Store {

    public FileStore() {
    }

    public void save(String t) {

    }

    public List<String> getAll() {
        List<String> strings = new ArrayList<String>();

        try {
            strings = Files.readAllLines(new File("filestore.txt").toPath());
        } catch (IOException e) {
            throw new StoreException("Error during reading string from file", e);
        }
        return null;
    }
}
