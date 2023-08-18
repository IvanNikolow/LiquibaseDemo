package com.example.LiquibaseDemo.controllers.rest;

import com.example.LiquibaseDemo.model.UnitOfMeasure;
import com.example.LiquibaseDemo.model.UnitOfMeasureDTO;
import com.example.LiquibaseDemo.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/uom")
public class UnitOfMeasureController {
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    public UnitOfMeasureController(UnitOfMeasureRepository unitOfMeasureRepository) {
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @GetMapping
    public List<UnitOfMeasure> getAllUOM(){
        return unitOfMeasureRepository.findAll();
    }

    @GetMapping("/{id}")
    public UnitOfMeasure getUOMById(@PathVariable Long id){
        return unitOfMeasureRepository.getReferenceById(id);
    }

    @PostMapping("/new")
    public UnitOfMeasure createUOM(@RequestHeader HttpHeaders httpHeaders, @Valid UnitOfMeasureDTO unitOfMeasureDTO){
        UnitOfMeasure unitOfMeasure = new UnitOfMeasure(unitOfMeasureDTO.getName());
        unitOfMeasureRepository.save(unitOfMeasure);
        return unitOfMeasure;
    }

}
