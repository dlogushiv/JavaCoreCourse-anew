package module5.homework;

public class Main {
    public static void main(String[] args) {
        API bookingCom = new BookingComAPI();

        for (Room room : bookingCom.findRooms(150, 2, "Lybid", "Kiev")) {
            System.out.println(room);
        }

        for (Room room : bookingCom.getAllRooms()) {
            System.out.println(room);
        }
    }
}
