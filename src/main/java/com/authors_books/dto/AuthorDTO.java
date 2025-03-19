package com.authors_books.dto;

public record AuthorDTO(
        Integer id,
        String name,
        String genre,
        String bookList
) {
}
