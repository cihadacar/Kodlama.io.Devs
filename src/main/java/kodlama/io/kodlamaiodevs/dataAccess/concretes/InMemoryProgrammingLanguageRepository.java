//package kodlama.io.kodlamaiodevs.dataAccess.concretes;
//
//import com.sun.net.httpserver.Authenticator;
//import kodlama.io.kodlamaiodevs.dataAccess.abstracts.ProgrammingLanguageRepository;
//import kodlama.io.kodlamaiodevs.entities.ProgrammingLanguage;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.util.concurrent.SuccessCallback;
//
//import java.text.MessageFormat;
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
//    private List<ProgrammingLanguage> programmingLanguageList;
//    @Autowired
//    public InMemoryProgrammingLanguageRepository() {
//        programmingLanguageList = new ArrayList<ProgrammingLanguage>();
//        programmingLanguageList.add(new ProgrammingLanguage(1, "R"));
//        programmingLanguageList.add(new ProgrammingLanguage(2, "Go"));
//        programmingLanguageList.add(new ProgrammingLanguage(3, "C++"));
//        programmingLanguageList.add(new ProgrammingLanguage(4, "Java"));
//        programmingLanguageList.add(new ProgrammingLanguage(5, "Objective-C"));
//    }
//    @Override
//    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
//        for (ProgrammingLanguage programmingLanguageToAdd :programmingLanguageList) {
//            if (programmingLanguageToAdd.getName().equalsIgnoreCase(programmingLanguage.getName()))
//                throw new Exception("Bu isimde bir programlama dili mevcut.");
//            else if (programmingLanguageToAdd.getId()==programmingLanguage.getId())
//                throw new Exception(MessageFormat.format("Bu index kullaniliyor. Siradaki index: {0}. ", programmingLanguageList.size()+1));
//        }
//        programmingLanguageList.add(programmingLanguage);
//    }
//    @Override
//    public void update(ProgrammingLanguage programmingLanguage) throws Exception{
//        for (ProgrammingLanguage programmingLanguageToUpdate : programmingLanguageList) {
//            if (programmingLanguageToUpdate.getName().equalsIgnoreCase(programmingLanguage.getName()))
//                throw new Exception("Bu isimde bir programlama dili mevcut.");
//            if (programmingLanguageToUpdate.getId() == programmingLanguage.getId())
//                programmingLanguageToUpdate.setName(programmingLanguage.getName());
//            else
//                throw new Exception("Böyle bir kayıt bulunamadı.");
//        }
//    }
//    @Override
//    public void delete(ProgrammingLanguage programmingLanguage) throws Exception{
//        for (ProgrammingLanguage programmingLanguageToDelete : programmingLanguageList) {
//            if (programmingLanguage.getId()==programmingLanguageToDelete.getId() ||
//                    programmingLanguage.getName().equalsIgnoreCase(programmingLanguageToDelete.getName())){
//                programmingLanguageList.remove(programmingLanguageToDelete);
//                break;
//            }
//            if (programmingLanguageToDelete.getId()==programmingLanguageList.size() && (programmingLanguageToDelete.getId()!=(programmingLanguage.getId())
//                    || !programmingLanguageToDelete.getName().equals(programmingLanguage.getName())))
//                throw new Exception("Böyle bir kayıt bulunamadı.");
//        }
//    }
//    @Override
//    public List<ProgrammingLanguage> getAll() {
//        return programmingLanguageList;
//    }
//    @Override
//    public ProgrammingLanguage getById(int id) throws Exception {
//        for (ProgrammingLanguage programmingLanguage : programmingLanguageList) {
//            if (programmingLanguage.getId() == id)
//                return programmingLanguage;
//        }
//        throw new Exception("Bu Id'ye sahip bir dil bulunamadi.");
//    }
//}
