package dao;



import entity.Readers;

import java.util.List;

public interface ReadersDao {
    void add(Readers readers);
    List<Readers> getReaders();
    Readers getFromId(int id);
    void update(Readers readers);
    void remove(Readers readers);
}
