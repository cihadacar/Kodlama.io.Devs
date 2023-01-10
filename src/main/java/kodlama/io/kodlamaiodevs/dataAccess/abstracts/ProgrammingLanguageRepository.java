package kodlama.io.kodlamaiodevs.dataAccess.abstracts;

import kodlama.io.kodlamaiodevs.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
}
