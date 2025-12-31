package animals;

import interfaces.Feedable;

public class Reptile extends Animal implements Feedable {

    public Reptile(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String getSpecies() {
        return "Reptile";
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " hisses");
    }

    @Override
    public void feed() {
        gainWeight(1.0);
        System.out.println(getName() + " was fed (insects)");
    }
}
