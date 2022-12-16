package kodlama.io.kodlamaiodevs.dataAccess.abstracts;

import kodlama.io.kodlamaiodevs.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
    /*void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void update(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(ProgrammingLanguage programmingLanguage) throws Exception;
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id) throws Exception;*/
}
