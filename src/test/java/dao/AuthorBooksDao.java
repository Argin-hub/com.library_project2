package dao;

import entity.AuthorBooks;

import java.util.List;
import java.util.NoSuchElementException;



public interface AuthorBooksDao {
    void add(AuthorBooks authorBooks);
    List<AuthorBooks> getAuthor();




    AuthorBooks getFromId(int idauthor_books) throws NoSuchElementException;
    void update(AuthorBooks authorBooks);
    void remove(AuthorBooks authorBooks);
}
