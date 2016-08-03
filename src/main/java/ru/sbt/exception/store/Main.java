package ru.sbt.exception.store;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Store store = new FileStore();
        List<String> allString = store.getAll();
    }
}
