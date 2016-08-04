package ru.sbt.exception.store;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyDataBase implements Db {

    private static List<String> listDb;

    public MyDataBase() {
        listDb = new ArrayList<>();
    }

    @Override
    public void insert(String line) throws SQLException {
        if (isRandom()) {
            throw new SQLSyntaxErrorException();
        } else {
            listDb.add(line);
        }
    }

    @Override
    public List<String> selectAll() throws SQLException {
        if (isRandom()) {
            throw new SQLNonTransientException();
        } else {
            return new ArrayList<>(listDb);
        }
    }

    @Override
    public void close() throws Exception {
        if (isRandom()) {
            throw new SQLTimeoutException();
        }
    }

    private boolean isRandom() {
        Date date = new Date();
        if (date.getTime() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}