package dio.samples.dip.solution.problem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection implements DbConnection {

    public static Connection createConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/sample";
        String user = "root";
        String password = "root";

        Connection connection = null;
        connection = DriverManager.getConnection(url, user, password);

        return connection;
    }

}
