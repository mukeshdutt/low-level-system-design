package org.example.database;

public class OracleSqlQuery implements IQueries {
    @Override
    public void selectQuery() {
        System.out.println("Oracle select query has executed.");
    }

    @Override
    public void dropQuery() {
        System.out.println("Oracle drop query has executed.");
    }
}
