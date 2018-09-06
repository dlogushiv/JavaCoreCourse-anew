package module5.homework;

import java.util.Date;

public class GoogleAPI implements API {
    private static Room[] rooms = new Room[5];

    public GoogleAPI() {
        rooms[0] = new Room(1, 150, 2, new Date(), "Lybid", "Kiev");
        rooms[1] = new Room(2, 500, 3, new Date(), "Paradise", "LA");
        rooms[2] = new Room(3, 500, 3, new Date(), "Paradise", "LA");
        rooms[3] = new Room(4, 50, 1, new Date(), "238", "Tokio");
        rooms[4] = new Room(5, 100, 2, new Date(), "Budi Bora", "Goa");
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

    private static int neededRoomCounter(Room neededRoom) {
        int counter = 0;
        for (Room room : rooms) {
            if (room.equals(neededRoom) && room.getHotelName().equals(neededRoom.getHotelName())) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public Room[] getAllRooms() {
        return new Room[0];
    }
}