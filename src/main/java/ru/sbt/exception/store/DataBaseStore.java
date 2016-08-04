package ru.sbt.exception.store;

import java.sql.SQLException;
import java.util.List;

public class DataBaseStore implements Store {

    private static Db db;

    public DataBaseStore() {
        db = new MyDataBase();
    }

    @Override
    public void save(String t) {
        try {
            db.insert(t);
        } catch (SQLException e) {
            throw new DbException("Error during write string from database", e);
        }
    }

    @Override
    public List<String> getAll() {
        try {
            return db.selectAll();
        } catch (SQLException e) {
            throw new DbException("Error during reading string from file", e);
        }
    }

}