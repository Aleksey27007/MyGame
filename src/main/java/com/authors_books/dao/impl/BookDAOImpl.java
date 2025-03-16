package com.authors_books.dao.impl;

import com.authors_books.dao.DefaultDAO;
import com.authors_books.datasource.DataSource;
import com.authors_books.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements DefaultDAO {

    private final Connection CONNECTION = DataSource.getDataSource().getConnection();

    @Override
    public Book create(Object entity) throws SQLException {
        CONNECTION.setAutoCommit(false);

        Book book = (Book) entity;
        String query = "INSERT books(name, author) VALUES(?, ?)";

        try (PreparedStatement preparedStatement = CONNECTION.prepareStatement(query)) {

            preparedStatement.setString(1, book.getName());
            preparedStatement.setString(2, book.getAuthor().getName());

            preparedStatement.executeUpdate();
        }
        return book;
    }

    @Override
    public List<Book> read(String tableName) throws SQLException {
        List<Book> books = new ArrayList<>();

        String query = "SELECT * FROM " + tableName;

        try(PreparedStatement preparedStatement = CONNECTION.prepareStatement(query)) {

            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
//                String author = rs.getString("author");

                books.add(new Book(id, name));
            }
        }
        return books;
    }

    @Override
    public List<Book> update(Integer id, String newName) throws SQLException{

        String query = "UPDATE books SET name='?' WHERE id='?'";

        try(PreparedStatement preparedStatement = CONNECTION.prepareStatement(query)) {

            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();

        }

        return read("books");
    }

    @Override
    public List<Book> delete(Integer id) throws SQLException{

        String query = "DELETE FROM authors WHERE id='?'";

        try(PreparedStatement preparedStatement = CONNECTION.prepareStatement(query)) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();


        }

        return read("books");
    }
}
