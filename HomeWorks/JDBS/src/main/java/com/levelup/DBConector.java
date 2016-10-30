package com.levelup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConector
{
    private static DBConector instance;
    private DBConector() throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
    }
    public static DBConector  getInstance() throws SQLException {
        if(instance!=null){
            return instance;
        }
        synchronized (DBConector.class){
            if(instance!=null){
                return instance;
            }
            instance = new DBConector();
            return instance;
        }
    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres",
                "546317290");
    }

}
