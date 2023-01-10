package kodlama.io.kodlamaiodevs.business.concretes;

import kodlama.io.kodlamaiodevs.business.abstracts.SubTechnologyService;
import kodlama.io.kodlamaiodevs.business.request.CreateSubTechnologyRequest;
import kodlama.io.kodlamaiodevs.business.request.UpdateSubTechnologyRequest;
import kodlama.io.kodlamaiodevs.business.response.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlamaiodevs.business.response.GetAllSubTechnologiesResponse;
import kodlama.io.kodlamaiodevs.business.response.GetByIdProgrammingLanguageResponse;
import kodlama.io.kodlamaiodevs.business.response.GetByIdSubTechnologyResponse;
import kodlama.io.kodlamaiodevs.dataAccess.abstracts.SubTechnologyRepository;
import kodlama.io.kodlamaiodevs.entities.ProgrammingLanguage;
import kodlama.io.kodlamaiodevs.entities.SubTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubTechnologyManager implements SubTechnologyService {

    SubTechnologyRepository subTechnologyRepository;
    @Autowired
    public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository) {
        this.subTechnologyRepository = subTechnologyRepository;
    }

    @Override
    public void add(CreateSubTechnologyRequest createSubTechnologyRequest) {
        SubTechnology subTechnology = new SubTechnology();
        subTechnology.setName(createSubTechnologyRequest.getName());
        subTechnologyRepository.save(subTechnology);
    }

    @Override
    public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest) {
        SubTechnology subTechnology = subTechnologyRepository.getReferenceById(updateSubTechnologyRequest.getId());
        subTechnology.setName(updateSubTechnologyRequest.getName());
        subTechnologyRepository.save(subTechnology);
    }

    @Override
    public void delete(int id) {
        subTechnologyRepository.deleteById(id);
    }

    @Override
    public List<GetAllSubTechnologiesResponse> getAll() {
        List<SubTechnology> subTechnologies = subTechnologyRepository.findAll();
        List<GetAllSubTechnologiesResponse> subTechnologiesResponses = new ArrayList<>();

        for (SubTechnology subTechnology : subTechnologies) {
            GetAllSubTechnologiesResponse subTechnologiesResponseItem = new GetAllSubTechnologiesResponse();
            subTechnologiesResponseItem.setId(subTechnology.getId());
            subTechnologiesResponseItem.setName(subTechnology.getName());

            subTechnologiesResponses.add(subTechnologiesResponseItem);
        }
        return subTechnologiesResponses;
    }

    @Override
    public GetByIdSubTechnologyResponse getById(int id) {
        SubTechnology subTechnology = subTechnologyRepository.findById(id).get();
        GetByIdSubTechnologyResponse subTechnologyResponse = new GetByIdSubTechnologyResponse();
        subTechnologyResponse.setName(subTechnology.getName());
        return subTechnologyResponse;
    }
}
