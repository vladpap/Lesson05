package ru.sbt.exception.store;

import java.sql.SQLException;

public interface Db extends AutoCloseable {

    void insert(String line) throws SQLException;

    void selectAll(String line) throws SQLException;
}
