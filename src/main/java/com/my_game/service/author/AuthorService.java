package com.my_game.service.author;

import com.my_game.dto.AuthorDTO;
import com.my_game.dto.BookDTO;
import com.my_game.model.Author;
import com.my_game.model.Book;

import java.util.List;

public interface AuthorService {
    Author getAuthorById(Long authorID);
    Author createAuthor(AuthorDTO author, BookDTO book);
    Author updateNameAuthor(Long bookID, String newName);
    Author updateAuthorBook(Long bookID, AuthorDTO author);
    boolean deleteBook(Long bookID);
    List<Author> getAuthors();
}
