package com.authors_books.service.author;

import com.authors_books.dao.impl.AuthorDAOImpl;
import com.authors_books.model.Author;

import java.sql.SQLException;
import java.util.List;

public class AuthorServiceImpl implements AuthorService{
    private final AuthorDAOImpl authorDAO;


    public AuthorServiceImpl(AuthorDAOImpl authorDAO) {
        this.authorDAO = authorDAO;
    }


    @Override
    public Author createAuthor(Author author) throws SQLException {
        return authorDAO.create(author);
    }

    @Override
    public List<Author> readAuthors() throws SQLException {
        return authorDAO.read("authors");
    }

    @Override
    public List<Author> updateAuthorNameByID(Integer id, String newName) throws SQLException {
        return authorDAO.update(id, newName);
    }

    @Override
    public List<Author> deleteAuthorByID(Integer id) throws SQLException {
        return authorDAO.delete(id);
    }


}
