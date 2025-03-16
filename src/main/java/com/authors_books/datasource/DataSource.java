package com.authors_books.datasource;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DataSource {
    private static DataSource dataSource;
    private final Properties properties = new Properties();
//    private final ComboPooledDataSource pooledDataSource;

    public static DataSource getDataSource() {
        if (dataSource == null) {
            dataSource = new DataSource();
        }
        return dataSource;
    }

    private DataSource() {
        try (InputStream input = new FileInputStream("src/main/resources/db.properties")) {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return dataSource.getConnection();
    }
}
