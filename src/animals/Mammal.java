package animals;

import interfaces.Feedable;
import interfaces.Playable;

public class Mammal extends Animal implements Feedable, Playable {

    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String getSpecies() {
        return "Mammal";
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes mammal sound");
    }

    @Override
    public void feed() {
        gainWeight(2.0);
        System.out.println(getName() + " was fed (meat)");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing");
    }
}
