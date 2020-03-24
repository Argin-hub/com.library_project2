package dao;

import entity.Books;

import java.util.List;

public interface BooksDao {
        void add(Books books);
        List<Books> getBook();
        Books getFromId(int id);
        void update(Books book);
        void remove(Books book);
}
