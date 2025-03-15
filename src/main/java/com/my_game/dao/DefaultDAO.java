package com.my_game.dao;

import java.sql.SQLException;
import java.util.List;

public interface DefaultDAO<T> {
    void create(Object entity) throws SQLException;
    List<T> read(String tableName) throws SQLException;
    List<T> update(Integer id, String newName) throws SQLException;
    public List<T> delete(Integer id) throws SQLException;
}
