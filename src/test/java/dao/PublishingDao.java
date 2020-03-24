package dao;



import entity.Publishing;

import java.util.List;

public interface PublishingDao {
    void add(Publishing publishing);
    List<Publishing> getPublishing();
    Publishing getFromId(int id);
    void update(Publishing publishing);
    void remove(Publishing publishing);
}
