package module5.homework;

import java.util.Date;

public class TripAdvisorAPI implements API {
    private static Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(1, 500, 3, new Date(), "Paradise", "LA");
        rooms[1] = new Room(2, 150, 2, new Date(), "Lybid", "Kiev");
        rooms[2] = new Room(3, 200, 4, new Date(), "ChouCho", "Poltava");
        rooms[3] = new Room(4, 50, 1, new Date(), "238", "Tokio");
        rooms[4] = new Room(5, 500, 3, new Date(), "Paradise", "LA");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room neededRoom = new Room(0, price, persons, new Date(), city, hotel);
        int length = neededRoomCounter(neededRoom);
        Room[] foundRooms = new Room[length];
        if (length != 0) {
            int i = 0;
            for (Room room : rooms) {
                if (room.equals(neededRoom) && room.getHotelName().equals(neededRoom.getHotelName())) {
                    foundRooms[i] = room;
                    i++;
                }
            }
        }
        return foundRooms;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }

    private static int neededRoomCounter(Room neededRoom) {
        int counter = 0;
        for (Room room : rooms) {
            if (room.equals(neededRoom) && room.getHotelName().equals(neededRoom.getHotelName())) {
                counter++;
            }
        }
        return counter;
    }
}
