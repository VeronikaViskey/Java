import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionWith {
    private ConnectionWith(){}

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/lesson2",
                    "root",
                    "");
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW", throwables);
        }
    }
    public static void close(Connection connection){
        try {
            connection.close();
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW", throwables);
        }
    }
}
