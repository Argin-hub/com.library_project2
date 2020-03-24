package dao;



import entity.Readers;
import entity.ReadersCard;

import java.util.List;

public interface ReadersCardDao {
    void add(ReadersCard readersCard);
    List<ReadersCard> getReaderCard();
    ReadersCard getFromId(int id);
    void update(ReadersCard readersCard);
    void remove(ReadersCard readersCard);
}
