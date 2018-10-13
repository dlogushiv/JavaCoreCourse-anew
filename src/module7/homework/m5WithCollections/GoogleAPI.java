package module7.homework.m5WithCollections;

import java.util.ArrayList;
import java.util.Date;

public class GoogleAPI implements API {
    private ArrayList<Room> rooms = new ArrayList<>();

    public GoogleAPI() {
        rooms.add(new Room(301, 150, 2, new Date(), "Lybid", "Kiev"));
        rooms.add(new Room(302, 600, 3, new Date(), "Paradise", "LA"));
        rooms.add(new Room(303, 500, 3, new Date(), "Paradise", "LA"));
        rooms.add(new Room(304, 50, 1, new Date(), "238", "Tokio"));
        rooms.add(new Room(305, 100, 2, new Date(), "Budi Bora", "Goa"));
    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        Room neededRoom = new Room(0, price, persons, new Date(), city, hotel);
        ArrayList<Room> foundRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.equals(neededRoom) && room.getHotelName().equals(neededRoom.getHotelName())) {
                foundRooms.add(room);
            }
        }
        return foundRooms;
    }

    @Override
    public ArrayList<Room> getAllRooms() {
        return rooms;
    }
}