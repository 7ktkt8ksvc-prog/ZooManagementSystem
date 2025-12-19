public class Main {

    public static void main(String[] args) {

        // Create objects
        Animal animal1 = new Animal("Leo", "Lion", 5);
        Animal animal2 = new Animal("Molly", "Elephant", 10);

        Zookeeper keeper1 = new Zookeeper("John", 7);
        Zookeeper keeper2 = new Zookeeper("Anna", 3);

        Zoo zoo = new Zoo("Almaty Zoo", "Kazakhstan");

        // Output to console
        zoo.displayInfo();
        animal1.displayInfo();
        animal2.displayInfo();
        keeper1.displayInfo();
        keeper2.displayInfo();

        // Compare animals by age
        if (animal1.getAge() > animal2.getAge()) {
            System.out.println(animal1.getName() + " is older than " + animal2.getName());
        } else {
            System.out.println(animal2.getName() + " is older than " + animal1.getName());
        }
    }
}
