package animals;

import jakarta.persistence.*; // Міндетті түрде керек
import java.util.Objects;

@Entity
@Table(name = "animals")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animal_type")
public abstract class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private double weight; // Сенің кодындағы салмақ айнымалысы

    // JPA үшін бос конструктор
    protected Animal() {}

    protected Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract String getSpecies();
    public abstract void makeSound();

    // Геттер мен сеттерлер
    public Long getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setWeight(double weight) { this.weight = weight; }

    public void gainWeight(double amount) {
        this.weight += amount;
    }

    @Override
    public String toString() {
        return getSpecies() + " | " + name + " | age=" + age + " | weight=" + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return name.equalsIgnoreCase(animal.name)
                && getSpecies().equalsIgnoreCase(animal.getSpecies());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name != null ? name.toLowerCase() : null, getSpecies() != null ? getSpecies().toLowerCase() : null);
    }
}