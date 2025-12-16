// Zoo.java
import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<Animal> animals;
    private ArrayList<Zookeeper> zookeepers;

    // Constructor
    public Zoo(String name) {
        this.name = name;
        animals = new ArrayList<>();
        zookeepers = new ArrayList<>();
    }

    // Add Animal
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // Add Zookeeper
    public void addZookeeper(Zookeeper zookeeper) {
        zookeepers.add(zookeeper);
    }

    // Display all animals
    public void showAnimals() {
        System.out.println("Animals in " + name + ":");
        for (Animal a : animals) {
            a.displayInfo();
        }
    }

    // Display all zookeepers
    public void showZookeepers() {
        System.out.println("Zookeepers in " + name + ":");
        for (Zookeeper z : zookeepers) {
            z.displayInfo();
        }
    }
}
