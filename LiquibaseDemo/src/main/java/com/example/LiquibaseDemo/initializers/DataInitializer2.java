//package com.example.LiquibaseDemo.initializers;
//
//import com.example.LiquibaseDemo.model.Part;
//import com.example.LiquibaseDemo.model.UnitOfMeasure;
//import com.example.LiquibaseDemo.repositories.PartRepository;
//import com.example.LiquibaseDemo.repositories.UnitOfMeasureRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class DataInitializer2 implements CommandLineRunner {
//    private final PartRepository partRepository;
//    private final UnitOfMeasureRepository uOMRepository;
//
//    public DataInitializer2(PartRepository partRepository , UnitOfMeasureRepository uOMRepository) {
//        this.partRepository = partRepository;
//        this.uOMRepository = uOMRepository;
//    }
//    @Override
//    public void run(String... args) throws Exception {
//
//        Part part01 = new Part("Argon");
//        Part part02 = new Part("Calcium");
//        Part part03 = new Part("Magnesium");
//        Part part04 = new Part("Oxygen");
//        List<Part> savedParts = partRepository.saveAll(Arrays.asList(part01, part02, part03, part04));
//
//        UnitOfMeasure uOM01 = new UnitOfMeasure("kg");
//        UnitOfMeasure uOM02 = new UnitOfMeasure("g");
//        UnitOfMeasure uOM03 = new UnitOfMeasure("l");
//        UnitOfMeasure uOM04 = new UnitOfMeasure("%");
//        List<UnitOfMeasure> savedUOMs = uOMRepository.saveAll(Arrays.asList(uOM01, uOM02, uOM03, uOM04));
//    }
//}
