package org.example.database;

public interface IDatabaseFactory {
    IConnection createConnection();
    IQueries executeQuery();
}
