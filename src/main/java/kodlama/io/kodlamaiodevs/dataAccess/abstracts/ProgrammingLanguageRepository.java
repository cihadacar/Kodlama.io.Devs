package kodlama.io.kodlamaiodevs.dataAccess.abstracts;

import kodlama.io.kodlamaiodevs.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void update(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(ProgrammingLanguage programmingLanguage) throws Exception;
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id) throws Exception;
}
