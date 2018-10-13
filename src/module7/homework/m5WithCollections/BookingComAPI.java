package module7.homework.m5WithCollections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComAPI implements API {
    private ArrayList<Room> rooms = new ArrayList<>();

    public BookingComAPI() {
        rooms.add(new Room(101, 200, 2, new Date(), "Quine Hotel", "London"));
        rooms.add(new Room(102, 500, 3, new Date(), "Paradise", "LA"));
        rooms.add(new Room(103, 100, 2, new Date(), "Budi Bora", "Goa"));
        rooms.add(new Room(104, 300, 1, new Date(), "MonAmi", "Paris"));
        rooms.add(new Room(105, 150, 2, new Date(), "Lybid", "Kiev"));
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
