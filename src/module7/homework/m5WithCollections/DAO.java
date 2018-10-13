package module7.homework.m5WithCollections;

import java.util.ArrayList;

public interface DAO {
    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    ArrayList<Room> getAll();
}
