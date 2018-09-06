package module5.homework;

public class Main {
    public static void main(String[] args) {
        API bookingCom = new BookingComAPI();
        API trAd=new TripAdvisorAPI();

        for (Room room : trAd.findRooms(500, 3, "Paradise", "LA")) {
            System.out.println(room);
        }

//        for (Room room : bookingCom.getAllRooms()) {
//            System.out.println(room);
//        }
    }
}
