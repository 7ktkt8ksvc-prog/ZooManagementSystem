package animals;

import java.util.Objects;

public abstract class Animal {

    private String name;
    private int age;
    private double weight;

    protected Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract String getSpecies();
    public abstract void makeSound();

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }

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
        return Objects.hash(name.toLowerCase(), getSpecies().toLowerCase());
    }
}
