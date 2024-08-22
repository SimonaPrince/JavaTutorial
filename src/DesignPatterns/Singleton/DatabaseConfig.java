package DesignPatterns.Singleton;

import java.sql.Connection;

public class DatabaseConfig {
    private static Connection connection;

    private DatabaseConfig(Connection conn){
            this.connection=conn;
    }
    public static DatabaseConfig getInstance(){
        if(connection == null)
            return new DatabaseConfig(connection);


        return null;
    }
}
