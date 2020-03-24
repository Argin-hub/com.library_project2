package dao;

import entity.PositionWorker;

import java.util.List;

public interface PositionWorkerDao {
    void add(PositionWorker positionWorker);
    List<PositionWorker> getPositionWorker();
    PositionWorker getFromId(int id);
    void update(PositionWorker positionWorker);
    void remove(PositionWorker positionWorker);
}
