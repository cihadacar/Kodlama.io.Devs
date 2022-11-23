package kodlama.io.kodlamaiodevs.dataAccess.concretes;

import kodlama.io.kodlamaiodevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlamaiodevs.entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
    private List<ProgrammingLanguage> programmingLanguageList;
    @Autowired
    public InMemoryProgrammingLanguageRepository() {
        programmingLanguageList = new ArrayList<ProgrammingLanguage>();
        programmingLanguageList.add(new ProgrammingLanguage(1, "R"));
        programmingLanguageList.add(new ProgrammingLanguage(2, "Go"));
        programmingLanguageList.add(new ProgrammingLanguage(3, "C++"));
        programmingLanguageList.add(new ProgrammingLanguage(4, "Java"));
        programmingLanguageList.add(new ProgrammingLanguage(5, "Objective-C"));
    }
    @Override
    public void add(ProgrammingLanguage programmingLanguageToAdd) throws Exception {
        for (ProgrammingLanguage programmingLanguage :programmingLanguageList) {
            if (programmingLanguageToAdd.getName() == programmingLanguage.getName())
                throw new Exception("Bu isimde bir programlama dili mevcut.");
        }
        programmingLanguageList.add(programmingLanguageToAdd);
    }
    @Override
    public void update(ProgrammingLanguage programmingLanguage) throws Exception{
        for (ProgrammingLanguage programmingLanguageToUpdate : programmingLanguageList) {
            if (programmingLanguageToUpdate.getName() == programmingLanguage.getName())
                throw new Exception("Bu isimde bir programlama dili mevcut.");
        }
        for (ProgrammingLanguage programmingLanguageToUpdate : programmingLanguageList) {
            if (programmingLanguageToUpdate.getId() == programmingLanguage.getId())
                programmingLanguageToUpdate.setName(programmingLanguage.getName());
        }
    }
    @Override
    public void delete(ProgrammingLanguage programmingLanguageToDelete) throws Exception{
        for (ProgrammingLanguage programmingLanguage : programmingLanguageList) {
            if (programmingLanguageToDelete.getId()==(programmingLanguage.getId())
                    || programmingLanguageToDelete.getName().equals(programmingLanguage.getName()))
                programmingLanguageList.remove(programmingLanguage);
        }
        for (ProgrammingLanguage programmingLanguage : programmingLanguageList) {
            if (programmingLanguageToDelete.getId()==(programmingLanguage.getId())
                    || programmingLanguageToDelete.getName().equals(programmingLanguage.getName()))
                throw new Exception("Böyle bir kayıt bulunamadı.");
        }
    }
    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageList;
    }
    @Override
    public ProgrammingLanguage getById(int id) throws Exception {
        for (ProgrammingLanguage programmingLanguage : programmingLanguageList) {
            if (programmingLanguage.getId() == id)
                return programmingLanguage;
        }
        throw new Exception("Bu Id'ye sahip bir dil bulunamadi.");
    }
}
