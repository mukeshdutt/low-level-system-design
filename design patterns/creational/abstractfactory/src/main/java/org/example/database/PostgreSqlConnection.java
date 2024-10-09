package org.example.database;

public class PostgreSqlConnection implements IConnection {
    @Override
    public void connect() {
        System.out.println("PostgreSQL Connection has established.");
    }

    @Override
    public void isConnectionAlive() {
        System.out.println("PostgreSQL connection is still alive.");
    }
}
