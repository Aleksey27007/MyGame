package com.my_game.model;

public class AuthorBook {
    int id;
    int authorID;
    int bookID;

    public AuthorBook(int id, int authorID, int bookID) {
        this.id = id;
        this.authorID = authorID;
        this.bookID = bookID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
}
