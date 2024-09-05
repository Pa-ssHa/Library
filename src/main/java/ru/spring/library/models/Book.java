package ru.spring.library.models;

import jakarta.validation.constraints.NotEmpty;

public class Book {

    private int id;
    @NotEmpty(message = "Ведите название книги")

    private String title;
    @NotEmpty(message = "Ведите автора книги")

    private String author;
    private int year;

    public Book() {
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
