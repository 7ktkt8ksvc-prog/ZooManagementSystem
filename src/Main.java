import java.sql.*; // 1. Import SQL libraries

public class Main {
    // Database connection details
    private static final String URL = "jdbc:postgresql://localhost:5432/zoo_db";
    private static final String USER = "postgres";
    private static final String PASS = "";
    public static void main(String[] args) {
        // 2. Establish database connection
        try (Connection connection = DriverManager.getConnection(URL, USER, PASS)) {
            System.out.println("Connected to PostgreSQL successfully!");

            // 3. CREATE: Add a new animal
            addAnimal(connection, "Sherkhan", "Tiger", 4);

            // 4. READ: Display all animals
            System.out.println("\n--- List of Animals in Database ---");
            displayAnimals(connection);

            // 5. UPDATE: Update animal information
            updateAnimalAge(connection, "Simba", 7);

            // 6. DELETE: Remove an animal (Bonus for higher grade)
            deleteAnimal(connection, "Sherkhan");

        } catch (SQLException e) {
            // Log connection or query errors
            System.err.println("Database Error: " + e.getMessage());
        }
    }

    // Method to Add an Animal
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

    // Method to Read all Animals
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

    // Method to Update Animal Age
    public static void updateAnimalAge(Connection conn, String name, int newAge) throws SQLException {
        String sql = "UPDATE animals SET age = ? WHERE name = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, newAge);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
            System.out.println("Updated " + name + "'s age to " + newAge);
        }
    }

    // Method to Delete an Animal (Additional CRUD feature)
    public static void deleteAnimal(Connection conn, String name) throws SQLException {
        String sql = "DELETE FROM animals WHERE name = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Animal deleted: " + name);
            }
        }
    }
}