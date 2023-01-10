package kodlama.io.kodlamaiodevs.business.abstracts;

import kodlama.io.kodlamaiodevs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs.business.request.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs.business.response.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlamaiodevs.business.response.GetByIdProgrammingLanguageResponse;

import java.util.List;
public interface ProgrammingLanguageService {
    void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
    void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
    void delete(int id);
    List<GetAllProgrammingLanguagesResponse> getAll();
    GetByIdProgrammingLanguageResponse getById(int id);
}
