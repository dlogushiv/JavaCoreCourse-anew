package module7.homework.m5WithCollections;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        API bookingCom = new BookingComAPI();
        API tripAdvisor = new TripAdvisorAPI();
        API google = new GoogleAPI();

        Controller controller = new Controller();

        // homework
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

//        // hard part of homework
//        controller.save(new Room(101,200,3,new Date(),"Kiss", "Orlando"));
//        controller.save(new Room(205,600,2,new Date(),"Hilton", "LasVegas"));
//        controller.save(new Room(308,400,2,new Date(),"Paradise", "LA"));
//
//        for (Room room : controller.getAllRooms()) {
//            System.out.println(room);
//        }
//
//        controller.update(new Room(205,300,3,new Date(),"Ho-ho","Poltava"));
//
//        for (Room room : controller.getAllRooms()) {
//            System.out.println(room);
//        }
//
//        controller.delete(new Room(205,300,3,new Date(),"Ho-ho","Poltava"));
//
//        for (Room room : controller.getAllRooms()) {
//            System.out.println(room);
//        }
//
//        System.out.println(controller.findById(400));




    }
}
