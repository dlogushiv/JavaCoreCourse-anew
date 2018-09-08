package module5.homework;

public class Controller {
    private API apis[] = new API[3];

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        apis[0] = bookingComAPI;
        apis[1] = tripAdvisorAPI;
        apis[2] = googleAPI;
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        int allRoomsQuantity = 0;
        int requestRoomsQuantity = 0;
        Room[] tempRequest;
        Room[] request;
        for (API api : apis) {
            allRoomsQuantity += api.getAllRooms().length;
        }
        tempRequest = new Room[allRoomsQuantity];
        for (int i = 0; i < apis.length; i++) {
            for (int k = 0; k < apis[i].findRooms(price, persons, city, hotel).length; k++) {
                tempRequest[requestRoomsQuantity] = apis[i].findRooms(price, persons, city, hotel)[k];
                requestRoomsQuantity++;
            }
        }
        int j = 0;
        request = new Room[requestRoomsQuantity];
        DAOImpl daoImpl = new DAOImpl();
        while (tempRequest[j] != null) {
            request[j] = tempRequest[j];
            daoImpl.save(request[j]);
            j++;
        }
        return request;
    }

    Room[] checkEqualsRooms(API api1, API api2) {
        Room[] result1 = api1.getAllRooms();
        Room[] result2 = api2.getAllRooms();
        Room[] result;
        int q1 = result1.length;
        int q2 = result2.length;
        int counter = 0;
        for (int i = 0; i < q1; i++) {
            for (int j = 0; j < q2; j++) {
                if (result1[i].equals(result2[j])) {
                    counter++;
                    break;
                }
            }
        }
        result = new Room[counter];
        int c = 0;
        for (int i = 0; i < q1; i++) {
            for (int j = 0; j < q2; j++) {
                if (result1[i].equals(result2[j])) {
                    result[c] = result1[i];
                    c++;
                    break;
                }
            }
        }
        return result;
    }
}
