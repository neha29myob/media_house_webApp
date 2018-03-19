package DatabaseOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyPostgresConnection {

    public static Connection getMyPostgresConnection() throws SQLException, ClassNotFoundException {
        String hostName = "localhost";
        String dbName = "postgres";
        String userName = "postgres";
        String password = "postgres";
        return getMyPostgresConnection(hostName,dbName,userName,password);
    }

    public static Connection getMyPostgresConnection(String hostName, String dbName,
                                                         String userName, String password)
            throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        String connectionURL = "jdbc:postgresql://localhost:5432/postgres";

        Connection con = DriverManager.getConnection(connectionURL, userName, password);
        return con;
        //jdbc:postgresql://localhost:5432/postgresDB
    }


}
