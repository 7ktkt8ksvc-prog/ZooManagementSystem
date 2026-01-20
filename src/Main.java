import java.sql.*; // 1. SQL кітапханаларын импорттау

public class Main {
    // Database connection details
    private static final String URL = "jdbc:postgresql://localhost:5432/zoo_db";
    private static final String USER = "postgres";
    private static final String PASS = "";

    public static void main(String[] args) {
        // 2. Базамен байланыс орнату
        try (Connection connection = DriverManager.getConnection(URL, USER, PASS)) {
            System.out.println("Connected to PostgreSQL successfully!");

            // 3. CREATE (Write): Жаңа жануар қосу
            addAnimal(connection, "Sherkhan", "Tiger", 4);

            // 4. READ: Барлық жануарларды көрсету
            System.out.println("\n--- List of Animals in Database ---");
            displayAnimals(connection);

            // 5. UPDATE: Мәліметті жаңарту
            updateAnimalAge(connection, "Simba", 7);

        } catch (SQLException e) {
            // Қате болса, оны консольге шығару
            System.err.println("Connection error: " + e.getMessage());
        }
    }

    // Жануар қосу әдісі
    public static void addAnimal(Connection conn, String name, String species, int age) throws SQLException {
        String sql = "INSERT INTO animals (name, species, age) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, species);
            pstmt.setInt(3, age);
            pstmt.executeUpdate();
            System.out.println("Animal added: " + name);
        }
    }

    // Тізімді оқу әдісі
    public static void displayAnimals(Connection conn) throws SQLException {
        String sql = "SELECT * FROM animals";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        " | Name: " + rs.getString("name") +
                        " | Species: " + rs.getString("species") +
                        " | Age: " + rs.getInt("age"));
            }
        }
    }

    // Жасын жаңарту әдісі
    public static void updateAnimalAge(Connection conn, String name, int newAge) throws SQLException {
        String sql = "UPDATE animals SET age = ? WHERE name = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, newAge);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
            System.out.println("Updated " + name + "'s age to " + newAge);
        }
    }
}