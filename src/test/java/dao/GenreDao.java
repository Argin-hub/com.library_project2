package dao;

import entity.Genre;

import java.util.List;

public interface GenreDao {
    void add(Genre genre);
    List<Genre> getGenre();
    Genre getFromId(int id);
    void update(Genre genre);
    void remove(Genre genre);
}
