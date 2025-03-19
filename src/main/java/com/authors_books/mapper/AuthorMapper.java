package com.authors_books.mapper;

import com.authors_books.dto.AuthorDTO;
import com.authors_books.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorDTO toAuthorDTO(Author author);

    List<AuthorDTO> toAuthorDTOList(List<Author> authors);

    Author toAuthor(AuthorDTO authorDTO);
}
