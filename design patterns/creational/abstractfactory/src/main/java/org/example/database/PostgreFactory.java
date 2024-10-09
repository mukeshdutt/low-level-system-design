package org.example.database;

public class PostgreFactory implements IDatabaseFactory {

    @Override
    public IConnection createConnection() {
        return new PostgreSqlConnection();
    }

    @Override
    public IQueries executeQuery() {
        return new PostgreSqlQuery();
    }
}
