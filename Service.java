import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Service {
    public User findUser(String email, String password){
        Connection connection = ConnectionWith.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM lesson2.users WHERE email = ? AND password = ? "
            );
            statement.setString(1,email);
            statement.setString(2,password);

            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                return new User(
                        rs.getString("email"),
                        rs.getString("password")
                );
            }
            return null;
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW", throwables);
        } finally {
            ConnectionWith.close(connection);
        }
    }
}
