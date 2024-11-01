package org.example.database;

public class MySQLFactory implements IDatabaseFactory {

    @Override
    public IConnection createConnection() {
        return new MySqlConnection();
    }

    @Override
    public IQueries executeQuery() {
        return new MySqlQuery();
    }
}