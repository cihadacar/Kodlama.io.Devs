package kodlama.io.kodlamaiodevs.business.concretes;

import kodlama.io.kodlamaiodevs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlamaiodevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlamaiodevs.entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.findAll();
    }

    /*@Override
    public ProgrammingLanguage getById(int id) throws Exception {
        return programmingLanguageRepository.getById(id);
    }*/
}
