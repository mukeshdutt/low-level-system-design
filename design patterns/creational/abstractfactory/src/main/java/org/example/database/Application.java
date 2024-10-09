package org.example.database;

public class Application {

    private final IConnection connection;
    private final IQueries query;

    public Application(IDatabaseFactory factory) {
        connection = factory.createConnection();
        query = factory.executeQuery();
    }

    public void ConnectionOps() {
        connection.connect();
        connection.isConnectionAlive();
    }

    public void QueryOps() {
        query.selectQuery();
        query.dropQuery();
    }
}
