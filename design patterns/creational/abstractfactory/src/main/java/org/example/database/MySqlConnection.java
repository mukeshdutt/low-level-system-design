package org.example.database;

public class MySqlConnection implements IConnection {
    @Override
    public void connect() {
        System.out.println("MySQL Connection has established.");
    }

    @Override
    public void isConnectionAlive() {
        System.out.println("MySQL connection is still alive.");
    }
}
