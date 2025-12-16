// Zookeeper.java
public class Zookeeper {
    private String name;
    private int experience; // in years

    // Constructor
    public Zookeeper(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    // Getters
    public String getName() { return name; }
    public int getExperience() { return experience; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setExperience(int experience) { this.experience = experience; }

    // Method to display info
    public void displayInfo() {
        System.out.println("Zookeeper Name: " + name + ", Experience: " + experience + " years");
    }
}
