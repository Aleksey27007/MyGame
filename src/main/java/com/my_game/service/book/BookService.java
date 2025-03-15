package com.my_game.service.book;

import com.my_game.dto.AuthorDTO;
import com.my_game.dto.BookDTO;
import com.my_game.model.Book;

import java.util.List;

public interface BookService {
    Book getBookById(Long bookID);
    Book createBook(AuthorDTO author, BookDTO book);
    Book updateNameBook(Long bookID, String newName);
    Book updateAuthorBook(Long bookID, AuthorDTO author);
    boolean deleteBook(Long bookID);
    List<Book> getBooks();
}
