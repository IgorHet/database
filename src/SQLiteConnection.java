import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {
    public static Connection connect() {
        String url = "jdbc:sqlite:my_database.db"; // Шлях до бази даних
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Підключення успішне!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}