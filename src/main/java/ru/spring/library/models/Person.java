package ru.spring.library.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Person {

    @NotEmpty(message = "Not correct value")
    @Size(min = 2, max = 100, message = "Name should be between 2 and 30 characters")
    private String name;

    private int birthYear;

    private int id;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
