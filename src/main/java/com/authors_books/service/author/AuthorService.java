package com.authors_books.service.author;

import com.authors_books.model.Author;

import java.sql.SQLException;
import java.util.List;

public interface AuthorService {

    Author createAuthor(Author author) throws SQLException;

    List<Author> readAuthors() throws SQLException;

    List<Author> updateAuthorNameByID(Integer id, String newName) throws SQLException;

    List<Author> deleteAuthorByID(Integer id) throws SQLException;
}
