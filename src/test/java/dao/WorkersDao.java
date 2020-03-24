package dao;



import entity.Workers;

import java.util.List;

public interface WorkersDao {
    void add(Workers workers);
    List<Workers> getWorkers();
    Workers getFromId(int id);
    void update(Workers workers);
    void remove(Workers workers);
}
