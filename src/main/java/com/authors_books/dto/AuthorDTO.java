package com.authors_books.dto;

import java.util.List;

public record AuthorDTO(
        Long id,
        String name,
        String genre,
        List<String> booksName
) {
}
