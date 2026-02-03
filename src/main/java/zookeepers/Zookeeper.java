package zookeepers;

import animals.Animal;
import java.util.ArrayList;
import java.util.List;

public abstract class Zookeeper {

    protected String name;
    protected List<Animal> assignedAnimals = new ArrayList<>();

    public Zookeeper(String name) {
        this.name = name;
    }

    public void assignAnimal(Animal animal) {
        assignedAnimals.add(animal);
    }

    public abstract void performDuties();
}

