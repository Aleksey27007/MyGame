package com.my_game.service.author;

import com.my_game.datasource.DataSource;
import com.my_game.dto.AuthorDTO;
import com.my_game.dto.BookDTO;
import com.my_game.model.Author;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AuthorServiceImpl implements AuthorService {
    private final Connection CONNECTION = DataSource.getDataSource().getConnection();

    @Override
    public Author getAuthorById(Long authorID) {
        return null;
    }

    @Override
    public Author createAuthor(AuthorDTO author, BookDTO book) {
        return null;
    }

    @Override
    public Author updateNameAuthor(Long bookID, String newName) {
        return null;
    }

    @Override
    public Author updateAuthorBook(Long bookID, AuthorDTO author) {
        return null;
    }

    @Override
    public boolean deleteBook(Long bookID) {
        return false;
    }

    @Override
    public List<Author> getAuthors() throws SQLException {
        List<Author> authors = new ArrayList<>();

        Statement statement = CONNECTION.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM authors");

        while(rs.next()) {
            Author author = new Author();
            author.setName(rs.getString(2));
            author.setGenre(rs.getString(3));
            author.setAge(rs.getInt(4));

            authors.add(author);
        }
        return authors;
    }
}
