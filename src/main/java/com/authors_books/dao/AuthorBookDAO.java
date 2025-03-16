package com.authors_books.dao;

import com.authors_books.datasource.DataSource;
import com.authors_books.model.AuthorBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorBookDAO {
    private final Connection CONNECTION = DataSource.getDataSource().getConnection();

    public List<AuthorBook> read() throws SQLException {
        List<AuthorBook> list = new ArrayList<>();

        String query = "SELECT * FROM authors_books";

        try(PreparedStatement preparedStatement = CONNECTION.prepareStatement(query)) {

            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()) {
                Integer id = rs.getInt("id");
                Integer author_id = rs.getInt("author_id");
                Integer book_id = rs.getInt("book_id");

                list.add(new AuthorBook(id, author_id, book_id));
            }
        }
        return list;
    }
}
