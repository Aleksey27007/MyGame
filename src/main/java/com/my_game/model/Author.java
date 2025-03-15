package com.my_game.model;

import java.util.List;

public class Author {
    private int id;
    private String name;
    private String genre;
    private int age;
    private List<Book> bookList;

    public Author(int id, String name, String genre, int age) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
