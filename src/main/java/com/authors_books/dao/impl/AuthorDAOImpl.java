package com.authors_books.dao.impl;

import com.authors_books.dao.DefaultDAO;
import com.authors_books.datasource.DataSource;
import com.authors_books.model.Author;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOImpl implements DefaultDAO {
    private final Connection CONNECTION = DataSource.getDataSource().getConnection();


    @Override
    public Author create(Object entity) throws SQLException {
        CONNECTION.setAutoCommit(false);

        Author author = (Author) entity;
        String query = "INSERT authors(name, genre, age) VALUES(?, ?, ?)";

        try (PreparedStatement preparedStatement = CONNECTION.prepareStatement(query)) {

            preparedStatement.setString(1, author.getName());
            preparedStatement.setString(2, author.getGenre());
            preparedStatement.setInt(3, author.getAge());

            preparedStatement.executeUpdate();
        }
        return author;
    }

    @Override
    public List<Author> read(String tableName) throws SQLException {
        List<Author> authors = new ArrayList<>();

        String query = "SELECT * FROM " + tableName;

        try(PreparedStatement preparedStatement = CONNECTION.prepareStatement(query)) {

            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String genre = rs.getString("genre");
                int age = rs.getInt("age");

                authors.add(new Author(id, name, genre, age));
            }
        }
        return authors;
    }

    @Override
    public List<Author> update(Integer id, String newName) throws SQLException{

        String query = "UPDATE authors SET name = '?' WHERE id = '?'";

        try(PreparedStatement preparedStatement = CONNECTION.prepareStatement(query)) {

            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();

        }

        return read("authors");
    }

    @Override
    public List<Author> delete(Integer id) throws SQLException{

        String query = "DELETE FROM authors WHERE id='?'";

        try(PreparedStatement preparedStatement = CONNECTION.prepareStatement(query)) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();


        }

        return read("authors");
    }
}
