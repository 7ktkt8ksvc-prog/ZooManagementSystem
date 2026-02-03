package animals;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import interfaces.Feedable;
import interfaces.Playable;

@Entity
@DiscriminatorValue("Mammal") // Базадағы "animal_type" бағанына осы мән жазылады
public class Mammal extends Animal implements Feedable, Playable {

    // JPA базадан деректі оқығанда осы бос конструкторды пайдаланады
    public Mammal() {
        super();
    }

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