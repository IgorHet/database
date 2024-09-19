public class Main {
    public static void main(String[] args) {
        // Підключення до бази даних
        SQLiteConnection.connect();

        // Створення таблиці та вставка даних
        CreateTableAndInsert.createNewTableAndInsert();

        // Вибірка всіх даних
        System.out.println("Дані в таблиці:");
        SelectAndDelete.selectData();

        // Видалення користувача Bob
        SelectAndDelete.deleteBob();

        // Вибірка даних після видалення
        System.out.println("Дані після видалення Bob:");
        SelectAndDelete.selectData();
    }
}