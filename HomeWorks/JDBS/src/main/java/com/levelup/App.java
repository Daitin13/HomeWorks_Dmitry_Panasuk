package com.levelup;

import oracle.jrockit.jfr.tools.ConCatRepository;

import java.sql.Connection;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws SQLException {
        Connection connection=DBConector.getInstance().getConnection();
        connection.close();
        System.out.println("OK");
    }
}
