package com.authors_books.servlets;

import com.authors_books.dto.AuthorDTO;
import com.authors_books.mapper.AuthorMapper;
import com.authors_books.model.Author;
import com.authors_books.service.author.AuthorService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/author")
public class AuthorServlet extends HttpServlet {

    private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;
    private final AuthorService authorService;

    public AuthorServlet(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        AuthorDTO authorDTO = new AuthorDTO((Integer) req.getAttribute("id"),
//                (String) req.getAttribute("name"), (String) req.getAttribute("genre"), (String) req.getAttribute("bookList"));

        try {
            authorService.createAuthor(new Author((Integer) req.getAttribute("id"),
                (String) req.getAttribute("name"), (String) req.getAttribute("genre"), (String) req.getAttribute("bookList")));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        printWriter.write("author created");
        printWriter.close();
    }
}
