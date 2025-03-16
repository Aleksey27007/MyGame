package com.authors_books.service.book;

import com.authors_books.dao.impl.BookDAOImpl;
import com.authors_books.model.Book;

import java.sql.SQLException;
import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookDAOImpl bookDAO;


    public BookServiceImpl(BookDAOImpl bookDAO) {
        this.bookDAO = bookDAO;
    }


    @Override
    public Book createBook(Book book) throws SQLException {
        return bookDAO.create(book);
    }

    @Override
    public List<Book> readBooks() throws SQLException {
        return bookDAO.read("books");
    }

    @Override
    public List<Book> updateBookNameByID(Integer id, String newName) throws SQLException {
        return bookDAO.update(id, newName);
    }

    @Override
    public List<Book> deleteBookByID(Integer id) throws SQLException {
        return bookDAO.delete(id);
    }


}
