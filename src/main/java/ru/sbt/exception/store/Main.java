package ru.sbt.exception.store;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Store storeFile = new FileStore();
//        storeFile.save("Hello !!!\n\r");
//        printList(storeFile.getAll());

        Store storeDB = new DataBaseStore();
        storeDB.save("Hello DB");
        printList(storeDB.getAll());
    }

    private static void printList(List<String> allString) {
        for (String s : allString) {
            System.out.println(s);
        }
    }

}