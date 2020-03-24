package dao;


import entity.Message;

import java.util.Date;
import java.util.List;

public interface MessageDao {
    void add(Message message);
    List<Message> getMessage();
    Message getFromDate(Date date);
    void update(Message message);
    void remove(Message message);
}
