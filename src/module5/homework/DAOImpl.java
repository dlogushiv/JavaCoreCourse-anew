package module5.homework;

import java.util.Date;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("Room with id " + room.getId() + " was saved to DB.");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room with id " + room.getId() + " was deleted from DB.");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room with id " + room.getId() + " was updated in DB.");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(id, 0, 0, new Date(), null, null);
        System.out.println("Room with id " + id + " was found in DB.");
        return room;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
