package se.chalmers.dm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {

    public static Connection createPostgresConnection() throws SQLException {
         Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/websitedb");
    return connection;
    }


}
