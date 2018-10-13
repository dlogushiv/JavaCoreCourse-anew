package module7.homework.m5WithCollections;

import java.util.ArrayList;
import java.util.Date;

public class TripAdvisorAPI implements API {
    private ArrayList<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        rooms.add(new Room(201, 400, 3, new Date(), "Paradise", "LA"));
        rooms.add(new Room(202, 150, 2, new Date(), "Lybid", "Kiev"));
        rooms.add(new Room(203, 200, 4, new Date(), "ChouCho", "Poltava"));
        rooms.add(new Room(204, 50, 1, new Date(), "238", "Tokio"));
        rooms.add(new Room(205, 500, 3, new Date(), "Paradise", "LA"));
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
