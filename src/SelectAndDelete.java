import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectAndDelete {
    public static void selectData() {
        String url = "jdbc:sqlite:my_database.db";

        String selectAll = "SELECT * FROM users";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectAll)) {

            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getInt("age") + "\t" +
                        rs.getString("email"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteBob() {
        String url = "jdbc:sqlite:my_database.db";

        String deleteBob = "DELETE FROM users WHERE name = 'Bob'";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.execute(deleteBob);
            System.out.println("Користувач Bob був видалений.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}