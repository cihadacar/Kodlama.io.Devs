package kodlama.io.kodlamaiodevs.business.abstracts;

import kodlama.io.kodlamaiodevs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs.business.request.CreateSubTechnologyRequest;
import kodlama.io.kodlamaiodevs.business.request.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs.business.request.UpdateSubTechnologyRequest;
import kodlama.io.kodlamaiodevs.business.response.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlamaiodevs.business.response.GetAllSubTechnologiesResponse;
import kodlama.io.kodlamaiodevs.business.response.GetByIdProgrammingLanguageResponse;
import kodlama.io.kodlamaiodevs.business.response.GetByIdSubTechnologyResponse;

import java.util.List;

public interface SubTechnologyService {
    void add(CreateSubTechnologyRequest createSubTechnologyRequest);
    void update(UpdateSubTechnologyRequest updateSubTechnologyRequest);
    void delete(int id);
    List<GetAllSubTechnologiesResponse> getAll();
    GetByIdSubTechnologyResponse getById(int id);
}
