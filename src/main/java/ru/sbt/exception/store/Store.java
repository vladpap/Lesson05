package ru.sbt.exception.store;

import java.util.List;

public interface Store {

    void save (String t);

    List<String> getAll();
}
