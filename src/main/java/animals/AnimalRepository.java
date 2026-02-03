package animals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    // Бұл жерге код жазудың керегі жоқ, JpaRepository бәрін өзі істейді
}