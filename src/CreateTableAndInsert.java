import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableAndInsert {
    public static void createNewTableAndInsert() {
        String url = "jdbc:sqlite:my_database.db";

        String createTable = "CREATE TABLE IF NOT EXISTS users ("
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " name TEXT NOT NULL,"
                + " age INTEGER,"
                + " email TEXT NOT NULL"
                + ");";

        String insertData = "INSERT INTO users (name, age, email) VALUES "
                + "('John', 30, 'john@example.com'),"
                + "('Alice', 25, 'alice@example.com'),"
                + "('Bob', 35, 'bob@example.com');";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // Створюємо таблицю
            stmt.execute(createTable);
            // Вставляємо дані
            stmt.execute(insertData);
            System.out.println("Таблиця створена та дані вставлені.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}