package animals;

import interfaces.Feedable;

public class Bird extends Animal implements Feedable {

    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String getSpecies() {
        return "Bird";
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps");
    }

    @Override
    public void feed() {
        gainWeight(0.5);
        System.out.println(getName() + " was fed (seeds)");
    }
}

