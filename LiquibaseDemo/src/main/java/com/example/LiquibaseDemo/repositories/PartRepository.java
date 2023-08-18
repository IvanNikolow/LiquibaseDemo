package com.example.LiquibaseDemo.repositories;

import com.example.LiquibaseDemo.model.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartRepository extends JpaRepository<Part, Long> {
}
