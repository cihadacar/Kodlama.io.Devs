package kodlama.io.kodlamaiodevs.webAPI.controllers;

import kodlama.io.kodlamaiodevs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlamaiodevs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs.business.response.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlamaiodevs.entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
    ProgrammingLanguageService programmingLanguageService;
    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService){
        this.programmingLanguageService = programmingLanguageService;
    }
    /*@PostMapping("add")
    public void add(ProgrammingLanguage programmingLanguage) throws Exception{
        programmingLanguageService.add(programmingLanguage);
    }
    @PutMapping("update")
    public void update(ProgrammingLanguage programmingLanguage) throws Exception{
        programmingLanguageService.update(programmingLanguage);
    }
    @DeleteMapping("delete")
    public void delete(ProgrammingLanguage programmingLanguage) throws Exception{
        programmingLanguageService.delete(programmingLanguage);
    }
    @GetMapping("getbyid")
    public ProgrammingLanguage getById(int id) throws Exception {
        return programmingLanguageService.getById(id);
    }*/
    @GetMapping("getall")
    public List<GetAllProgrammingLanguagesResponse> getAll(){
        return programmingLanguageService.getAll();
    }

    @PostMapping("add")
    public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest){
        this.programmingLanguageService.add(createProgrammingLanguageRequest);
    }
}
