package com.authors_books.model;

public class AuthorBook {
    Integer id;
    Integer authorID;
    Integer bookID;

    public AuthorBook(Integer id, Integer authorID, Integer bookID) {
        this.id = id;
        this.authorID = authorID;
        this.bookID = bookID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
}
