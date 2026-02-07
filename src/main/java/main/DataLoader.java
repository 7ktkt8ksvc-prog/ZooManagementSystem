package main;

import animals.Mammal;
import animals.Bird;
import animals.AnimalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(AnimalRepository repository) {
        return args -> {
            // Lion (Mammal)
            Mammal lion = new Mammal();
            lion.setName("Lion");
            repository.save(lion);

            // Eagle (Bird)
            Bird eagle = new Bird();
            eagle.setName("Eagle");
            repository.save(eagle);

            System.out.println("--- Data successfully added to the database! ---");
        };
    }
}