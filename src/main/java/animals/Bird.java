package animals;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import interfaces.Feedable;

@Entity
@DiscriminatorValue("Bird") // Базадағы "animal_type" бағанына осы мән жазылады
public class Bird extends Animal implements Feedable {

    // JPA базадан деректі оқығанда осы бос конструкторды пайдаланады
    public Bird() {
        super();
    }

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