package com.my_game.dto;

import com.my_game.model.Book;

import java.util.List;

public record AuthorDTO(
        Integer id,
        String name,
        String genre,
        Integer age,
        List<Book>books
) {
}
