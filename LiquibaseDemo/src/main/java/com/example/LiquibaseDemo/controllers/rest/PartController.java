package com.example.LiquibaseDemo.controllers.rest;

import com.example.LiquibaseDemo.model.Part;
import com.example.LiquibaseDemo.model.PartDTO;
import com.example.LiquibaseDemo.repositories.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/part")
public class PartController {
    private final PartRepository partRepository;

    @Autowired
    public PartController(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    @GetMapping
    public List<Part> getAllParts(){
        return partRepository.findAll();
    }

    @GetMapping("/{id}")
    public Part getPartById(@PathVariable Long id){
        return partRepository.getReferenceById(id);
    }

    @PostMapping("/new")
    public Part createPart(@RequestHeader HttpHeaders httpHeaders, @Valid PartDTO partDTO){
        Part part = new Part(partDTO.getName());
        partRepository.save(part);
        return part;
    }

    @DeleteMapping("/{id}")
    public void deletePart(@RequestHeader HttpHeaders httpHeaders, @PathVariable Long id){
        Part part = partRepository.getReferenceById(id);
        partRepository.delete(part);
    }
}
