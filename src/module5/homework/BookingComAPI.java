package module5.homework;

import java.util.Date;

public class BookingComAPI implements API {
    private static Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(1, 200, 2, new Date(), "Quine Hotel", "London");
        rooms[1] = new Room(2, 500, 3, new Date(), "Paradise", "LA");
        rooms[2] = new Room(3, 100, 2, new Date(), "Budi Bora", "Goa");
        rooms[3] = new Room(4, 300, 1, new Date(), "MonAmi", "Paris");
        rooms[4] = new Room(5, 150, 2, new Date(), "Lybid", "Kiev");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room neededRoom = new Room(0, price, persons, new Date(), city, hotel);
        int length = neededRoomCounter(neededRoom);
        Room[] foundRooms = new Room[length];
        if (length == 0) {
            return foundRooms;
        } else {
            int i = 0;
            for (Room room : rooms) {
                if (room.equals(neededRoom)&& room.getHotelName().equals(neededRoom.getHotelName())){
                    foundRooms[i]=room;
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

    public static int neededRoomCounter(Room neededRoom) {
        int counter = 0;
        for (Room room : rooms) {
            if (room.equals(neededRoom) && room.getHotelName().equals(neededRoom.getHotelName())) {
                counter++;
            }
        }
        return counter;
    }
}
