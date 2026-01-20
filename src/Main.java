import animals.*;
import zookeepers.*;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Animal lion = new Mammal("Leo", 5, 190);
        Animal parrot = new Bird("Polly", 2, 1.2);
        Animal snake = new Reptile("Sly", 4, 15);

        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);
        zoo.addAnimal(snake);

        Feeder feeder = new Feeder("Alex");
        feeder.assignAnimal(lion);
        feeder.assignAnimal(parrot);
        feeder.assignAnimal(snake);

        Veterinarian vet = new Veterinarian("Dr. Smith");
        vet.assignAnimal(lion);
        vet.assignAnimal(snake);

        feeder.performDuties();
        vet.performDuties();

        System.out.println("\nSorted by weight:");
        zoo.sortByWeight().forEach(System.out::println);
    }
}
