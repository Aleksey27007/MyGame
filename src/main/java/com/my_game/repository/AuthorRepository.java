package com.my_game.repository;

public interface AuthorRepository<T>{
    T create();
    void read();
    T update();
    T delete();
}
