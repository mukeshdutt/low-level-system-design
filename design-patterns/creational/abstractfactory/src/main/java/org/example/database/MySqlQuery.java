package org.example.database;

public class MySqlQuery implements IQueries {
    @Override
    public void selectQuery() {
        System.out.println("MySQL select query has executed.");
    }

    @Override
    public void dropQuery() {
        System.out.println("MySQL drop query has executed.");
    }
}
