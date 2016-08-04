package ru.sbt.exception.store;

import java.sql.SQLException;
import java.util.List;

public interface Db extends AutoCloseable {

    void insert(String line) throws SQLException;

    List<String> selectAll(String line) throws SQLException;


}
