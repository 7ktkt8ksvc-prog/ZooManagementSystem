package zookeepers;

public class Veterinarian extends Zookeeper {

    public Veterinarian(String name) {
        super(name);
    }

    @Override
    public void performDuties() {
        assignedAnimals.forEach(a ->
                System.out.println("Vet " + name + " checks " + a.getName())
        );
    }
}
