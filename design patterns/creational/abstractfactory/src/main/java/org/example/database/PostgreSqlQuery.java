package org.example.database;

public class PostgreSqlQuery implements  IQueries {
    @Override
    public void selectQuery() {
        System.out.println("postgresql select query has executed.");
    }

    @Override
    public void dropQuery() {
        System.out.println("postgresql drop query has executed.");
    }
}
