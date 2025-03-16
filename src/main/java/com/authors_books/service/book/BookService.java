package com.authors_books.service.book;

import com.authors_books.model.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookService {
    Book createBook(Book book) throws SQLException;

    List<Book> readBooks() throws SQLException;

    List<Book> updateBookNameByID(Integer id, String newName) throws SQLException;

    List<Book> deleteBookByID(Integer id) throws SQLException;
}
