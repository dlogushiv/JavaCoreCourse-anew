package module5.homework;

public class Main {
    public static void main(String[] args) {
        API bookingCom = new BookingComAPI();
        API tripAdvisor = new TripAdvisorAPI();
        API google = new GoogleAPI();

        Controller controller = new Controller();
        System.out.println("\nFirst request:");
        for (Room room : controller.requestRooms(500, 3, "Paradise", "LA")) {
            System.out.println(room);
        }
        System.out.println("\nSecond request:");
        for (Room room : controller.requestRooms(150, 2, "Lybid", "Kiev")) {
            System.out.println(room);
        }
        System.out.println("\nThird request:");
        for (Room room : controller.requestRooms(100, 2, "Budi Bora", "Goa")) {
            System.out.println(room);
        }

        System.out.println("\nCheck equals rooms from BookingCom and TripAdvisor");
        for (Room room : controller.checkEqualsRooms(bookingCom, tripAdvisor)) {
            System.out.println(room);
        }
        System.out.println("\nCheck equals rooms from BookingCom and Google");
        for (Room room : controller.checkEqualsRooms(bookingCom, google)) {
            System.out.println(room);
        }
        System.out.println("\nCheck equals rooms from TripAdvisor and Google");
        for (Room room : controller.checkEqualsRooms(tripAdvisor, google)) {
            System.out.println(room);
        }
    }
}
