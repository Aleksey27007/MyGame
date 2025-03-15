package com.my_game.model;

import java.util.List;

public class Author {
    private Integer id;
    private String name;
    private String genre;
    private Integer age;
    private List<Book> bookList;

    public Author(Integer id, String name, String genre, Integer age) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
