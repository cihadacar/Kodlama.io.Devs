package kodlama.io.kodlamaiodevs.business.abstracts;

import kodlama.io.kodlamaiodevs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs.business.response.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlamaiodevs.entities.ProgrammingLanguage;

import java.util.List;
public interface ProgrammingLanguageService {
    void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
//    void update(ProgrammingLanguage programmingLanguage) throws Exception;
//    void delete(ProgrammingLanguage programmingLanguage) throws Exception;
    List<GetAllProgrammingLanguagesResponse> getAll();
//    ProgrammingLanguage getById(int id) throws Exception;
}
