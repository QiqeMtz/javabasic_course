package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    private final String URL      = "jdbc:postgresql://localhost:5432/";
    private final String DB       = "platzijava";
    private final String USER  = "platzijava";
    private final String PASSWORD = "platzijava";

    public Connection connection = null;

    public Connection connect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL+DB, USER, PASSWORD);
            if (connection != null) {
                System.out.println("Connection to PostgreSQL established");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return connection;
        }
    }

    public boolean disconnect() throws SQLException {
        if (connection.isClosed())
            return true;
        else {
            try {
                connection.close();
                return true;
            } catch (Exception e){
                e.printStackTrace();
                return false;
            }
        }
    }
}
