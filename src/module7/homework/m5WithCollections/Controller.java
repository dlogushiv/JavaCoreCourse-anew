package module7.homework.m5WithCollections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Controller {
    private ArrayList<API> apis = new ArrayList<>();
//    private DAOHardImpl daoHard = new DAOHardImpl();

    public Controller(ArrayList<API> apis) {
        this.apis = apis;
    }

    public Controller() {
        apis.add(new BookingComAPI());
        apis.add(new TripAdvisorAPI());
        apis.add(new GoogleAPI());
    }

    ArrayList<Room> requestRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> request = new ArrayList<>();
        for (API api : apis) {
            request.addAll(api.findRooms(price, persons, city, hotel));
        }
        DAOImpl daoImpl = new DAOImpl();
        for (Room room : request) {
            daoImpl.save(room);
        }
        return request;
    }

    ArrayList<Room> checkEqualsRooms(API api1, API api2) {
        ArrayList<Room> results1 = api1.getAllRooms();
        ArrayList<Room> results2 = api2.getAllRooms();
        ArrayList<Room> result = new ArrayList<>();

        for (Room result1 : results1) {
            for (Room result2 : results2) {
                if (result1.equals(result2)) {
                    result.add(result1);
                    break;
                }
            }
        }
        Set<Room> roomSet = new HashSet<>();
        roomSet.addAll(result);
        result.clear();
        result.addAll(roomSet);
        return result;
    }

//    Room save(Room room) {
//        return daoHard.save(room);
//    }
//
//    boolean delete(Room room) {
//        return daoHard.delete(room);
//    }
//
//    Room update(Room room) {
//        return daoHard.update(room);
//    }
//
//    Room findById(long id) {
//        return daoHard.findById(id);
//    }
//
//    ArrayList<Room> getAllRooms() {
//        return daoHard.getAll();
//    }

}
