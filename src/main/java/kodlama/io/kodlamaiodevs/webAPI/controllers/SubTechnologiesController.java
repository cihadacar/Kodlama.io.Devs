package kodlama.io.kodlamaiodevs.webAPI.controllers;

import kodlama.io.kodlamaiodevs.business.abstracts.SubTechnologyService;
import kodlama.io.kodlamaiodevs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs.business.request.CreateSubTechnologyRequest;
import kodlama.io.kodlamaiodevs.business.request.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs.business.request.UpdateSubTechnologyRequest;
import kodlama.io.kodlamaiodevs.business.response.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlamaiodevs.business.response.GetAllSubTechnologiesResponse;
import kodlama.io.kodlamaiodevs.business.response.GetByIdProgrammingLanguageResponse;
import kodlama.io.kodlamaiodevs.business.response.GetByIdSubTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subtechnologies")
public class SubTechnologiesController {
    SubTechnologyService subTechnologyService;

    @Autowired
    public SubTechnologiesController(SubTechnologyService subTechnologyService) {
        this.subTechnologyService = subTechnologyService;
    }
    @PostMapping("add")
    public void add(CreateSubTechnologyRequest createSubTechnologyRequest){
        this.subTechnologyService.add(createSubTechnologyRequest);
    }
    @PutMapping("update")
    public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest) {
        subTechnologyService.update(updateSubTechnologyRequest);
    }
    @DeleteMapping("delete")
    public void delete(int id){
        subTechnologyService.delete(id);
    }
    @GetMapping("getall")
    public List<GetAllSubTechnologiesResponse> getAll(){
        return subTechnologyService.getAll();
    }
    @GetMapping("getbyid")
    public GetByIdSubTechnologyResponse getById(int id){
        return subTechnologyService.getById(id);
    }
}
