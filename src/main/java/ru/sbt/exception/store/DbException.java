package ru.sbt.exception.store;

public class DbException extends StoreException {

    public DbException(String message) {
        super(message);
    }

    public DbException(String message, Throwable cause) {
        super(message, cause);
    }
}