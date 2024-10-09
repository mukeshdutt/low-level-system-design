package org.example.database;

public class Main {

    public static void main(String[] args) {

        Application app;
        IDatabaseFactory factory;

        String type = "ORACLE";

        if(type.equals("MYSQL")) {
            factory = new MySQLFactory();
        } else if(type.equals("ORACLE")) {
            factory = new OracleFactory();
        } else if (type.equals("POSTGRESQL")) {
            factory = new PostgreFactory();
        } else {
            throw new UnsupportedOperationException("");
        }

        app = new Application(factory);
        app.ConnectionOps();
        app.QueryOps();
    }
}
