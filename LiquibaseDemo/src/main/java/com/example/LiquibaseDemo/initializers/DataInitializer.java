package com.example.LiquibaseDemo.initializers;

import com.example.LiquibaseDemo.model.Part;
import com.example.LiquibaseDemo.repositories.PartRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {
    private final PartRepository partRepository;

    public DataInitializer(PartRepository partRepository) {
        this.partRepository = partRepository;
    }
    @Override
    public void run(String... args) throws Exception {

        Part part01 = new Part("Argon");
        Part part02 = new Part("Calcium");
        Part part03 = new Part("Magnesium");
        Part part04 = new Part("Oxygen");
        List<Part> savedParts = partRepository.saveAll(Arrays.asList(part01, part02, part03, part04));
    }
}
