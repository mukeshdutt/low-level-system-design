package org.example.database;

public class OracleFactory implements IDatabaseFactory {

    @Override
    public IConnection createConnection() {
        return new OracleSqlConnection();
    }

    @Override
    public IQueries executeQuery() {
        return new OracleSqlQuery();
    }
}