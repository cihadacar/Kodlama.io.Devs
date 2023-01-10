package kodlama.io.kodlamaiodevs.webAPI.controllers;

import kodlama.io.kodlamaiodevs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlamaiodevs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs.business.request.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs.business.response.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlamaiodevs.business.response.GetByIdProgrammingLanguageResponse;
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
    @PostMapping("add")
    public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest){
        this.programmingLanguageService.add(createProgrammingLanguageRequest);
    }
    @PutMapping("update")
    public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
        programmingLanguageService.update(updateProgrammingLanguageRequest);
    }
    @DeleteMapping("delete")
    public void delete(int id){
        programmingLanguageService.delete(id);
    }
    @GetMapping("getall")
    public List<GetAllProgrammingLanguagesResponse> getAll(){
        return programmingLanguageService.getAll();
    }
    @GetMapping("getbyid")
    public GetByIdProgrammingLanguageResponse getById(int id){
        return programmingLanguageService.getById(id);
    }
}
