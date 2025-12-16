// Animal.java
public class Animal {
    private String name;
    private String species;
    private int age;

    // Constructor
    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // Getters
    public String getName() { return name; }
    public String getSpecies() { return species; }
    public int getAge() { return age; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setSpecies(String species) { this.species = species; }
    public void setAge(int age) { this.age = age; }

    // Method to display info
    public void displayInfo() {
        System.out.println("Animal Name: " + name + ", Species: " + species + ", Age: " + age);
    }
}
