package module7.homework.m5WithCollections;

import java.util.ArrayList;

public class DAOHardImpl implements DAO {
    int DBL = 10;
    Room[] hardRooms = new Room[DBL];

    @Override
    public Room save(Room room) {
        if (hardRooms[DBL - 1] != null) {
            System.out.println("Database is full. Room was not saved.");
            return null;
        } else if (hardRooms[0] == null) {
            hardRooms[0] = room;
        } else {
            for (int i = hardRooms.length - 2; i >= 0; i--) {
                if (hardRooms[i] != null) {
                    hardRooms[i + 1] = room;
                    break;
                }
            }
        }
        System.out.println("Room was saved to database.");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        if (getRoomIndex(room) == -1) {
            System.out.println("Room was not delete from database.");
            return false;
        } else {
            for (int i = getRoomIndex(room); i < DBL - 1; i++) {
                hardRooms[i] = hardRooms[i + 1];
            }
            System.out.println("Room was delete from database.");
        }
        return true;
    }

    @Override
    public Room update(Room room) {
        if (getRoomIndex(room) == -1) {
            System.out.println("Room was not found in database.");
            return null;
        } else {
            hardRooms[getRoomIndex(room)] = room;
            System.out.println("Room was updated in database.");
        }
        return room;
    }

    @Override
    public Room findById(long id) {
        for (Room room : hardRooms) {
            if (room != null && room.getId() == id) {
                System.out.println("Room was found in database.");
                return room;
            }
        }
        System.out.println("Room was not found in database.");
        return null;
    }

    @Override
    public ArrayList<Room> getAll() {
        ArrayList<Room> allRooms = new ArrayList<>();
        for (Room room : hardRooms) {
            if (room != null) {
                allRooms.add(room);
            }
        }
        return allRooms;
    }

    public int getRoomIndex(Room room) {
        for (int i = 0; i < DBL; i++) {
            if (room.getId() == hardRooms[i].getId()) {
                return i;
            }
        }
        return -1;
    }
}
