package com.my_game.dto;

import com.my_game.model.Author;

public record BookDTO (
        Integer id,
        String name,
        Author author
){

}

