// Main.java
public class Main {
    public static void main(String[] args) {
        // Create animals
        Animal lion = new Animal("Leo", "Lion", 5);
        Animal elephant = new Animal("Ella", "Elephant", 10);

        // Create zookeepers
        Zookeeper john = new Zookeeper("John", 7);
        Zookeeper sarah = new Zookeeper("Sarah", 3);

        // Create zoo
        Zoo cityZoo = new Zoo("City Zoo");

        // Add animals and zookeepers
        cityZoo.addAnimal(lion);
        cityZoo.addAnimal(elephant);
        cityZoo.addZookeeper(john);
        cityZoo.addZookeeper(sarah);

        // Display information
        cityZoo.showAnimals();
        cityZoo.showZookeepers();

        // Compare animals (example: by age)
        System.out.println("\nComparing animals by age:");
        if (lion.getAge() > elephant.getAge()) {
            System.out.println(lion.getName() + " is older than " + elephant.getName());
        } else if (lion.getAge() < elephant.getAge()) {
            System.out.println(elephant.getName() + " is older than " + lion.getName());
        } else {
            System.out.println(lion.getName() + " and " + elephant.getName() + " are the same age");
        }
    }
}