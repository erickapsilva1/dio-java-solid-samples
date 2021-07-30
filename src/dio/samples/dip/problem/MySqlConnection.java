package dio.samples.dip.problem;

import java.sql.*;

public class MySqlConnection {

    public static Connection createConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/sample";
        String user = "root";
        String password = "root";

        Connection connection = null;
        connection = DriverManager.getConnection(url, user, password);

        return connection;
    }

}
