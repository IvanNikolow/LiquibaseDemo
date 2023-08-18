package com.example.LiquibaseDemo.model;

import org.antlr.v4.runtime.misc.NotNull;

import javax.validation.constraints.Size;

public class UnitOfMeasureDTO {

    @NotNull
    @Size(min = 1, max = 64, message = "name must be between 1 and 64 symbols.")
    private String name;

    public UnitOfMeasureDTO() {
    }

    public UnitOfMeasureDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
