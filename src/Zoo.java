import animals.Animal;
import java.util.*;
import java.util.stream.Collectors;

public class Zoo {

    private Set<Animal> animals = new HashSet<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> searchBySpecies(String species) {
        return animals.stream()
                .filter(a -> a.getSpecies().equalsIgnoreCase(species))
                .collect(Collectors.toList());
    }

    public List<Animal> sortByWeight() {
        return animals.stream()
                .sorted(Comparator.comparingDouble(Animal::getWeight))
                .collect(Collectors.toList());
    }

    public List<Animal> filterByAge(int minAge) {
        return animals.stream()
                .filter(a -> a.getAge() >= minAge)
                .collect(Collectors.toList());
    }
}
