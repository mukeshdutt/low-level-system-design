package org.example.database;

public class OracleSqlConnection implements IConnection  {
    @Override
    public void connect() {
        System.out.println("Oracle Connection has established.");
    }

    @Override
    public void isConnectionAlive() {
        System.out.println("Oracle connection is still alive.");
    }
}
