package ru.sbt.exception.store;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Store store = new FileStore();
//        store.save("Hello !!!\n\r");
        List<String> allString = store.getAll();
        System.out.println();
        for (String s : allString) {
            System.out.println(s);
        }
    }
}
