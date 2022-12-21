package kodlama.io.kodlamaiodevs.business.concretes;

import kodlama.io.kodlamaiodevs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlamaiodevs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs.business.response.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlamaiodevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlamaiodevs.entities.ProgrammingLanguage;
import org.apache.catalina.webresources.CachedResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    ProgrammingLanguageRepository programmingLanguageRepository;
    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

//    @Override
//    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
//        if(programmingLanguage.getName().equals(""))
//            throw new Exception("İsim boş geçilemez.");
//        programmingLanguageRepository.add(programmingLanguage);
//    }
//    @Override
//    public void update(ProgrammingLanguage programmingLanguage) throws Exception {
//        if(programmingLanguage.getName().equals(""))
//            throw new Exception("İsim boş geçilemez.");
//        programmingLanguageRepository.update(programmingLanguage);
//    }
//    @Override
//    public void delete(ProgrammingLanguage programmingLanguage) throws Exception {
//        programmingLanguageRepository.delete(programmingLanguage);
//    }

    @Override
    public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setName(createProgrammingLanguageRequest.getName());
        programmingLanguageRepository.save(programmingLanguage);
    }

    @Override
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
        List<GetAllProgrammingLanguagesResponse> programmingLanguagesResponses = new ArrayList<>();

        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            GetAllProgrammingLanguagesResponse programmingLanguagesResponseItem = new GetAllProgrammingLanguagesResponse();
            programmingLanguagesResponseItem.setId(programmingLanguage.getId());
            programmingLanguagesResponseItem.setName(programmingLanguage.getName());

            programmingLanguagesResponses.add(programmingLanguagesResponseItem);
        }
        return programmingLanguagesResponses;
    }

    /*@Override
    public ProgrammingLanguage getById(int id) throws Exception {
        return programmingLanguageRepository.getById(id);
    }*/
}
