package module7.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainHW7 {
    public static void main(String[] args) {
        User user1 = new User(1, "Vasya", "Pupkin", "Moscow", 1200);
        User user2 = new User(2, "Anya", "Y", "Kiev", 18000);
        User user3 = new User(3, "Petya", "Lym", "Kolom", 2000);
        User user4 = new User(4, "Sonya", "Dl", "Vish", 100);
        User user5 = new User(5, "Mila", "Kunis", "NY", 5000);
        User user6 = new User(6, "Stepa", "Velik", "Skaz", 3000);
        User user7 = new User(7, "Vanya", "Kaban", "Kiev", 20000);
        User user8 = new User(8, "Kolya", "Ryb", "Vysh", 700);
        User user9 = new User(9, "Olya", "Krav", "Poltava", 1500);
        User user10 = new User(10, "Ksy", "Tym", "Ovruch", 6800);

        Order order1 = new Order(1, 700, Currency.UAH, "Iron", "Eldo", user10);
        Order order2 = new Order(2, 100, Currency.UAH, "Coffee", "TeaLand", user5);
        Order order3 = new Order(3, 15000, Currency.USD, "Car", "AutoTrade", user7);
        Order order4 = new Order(4, 1000, Currency.UAH, "Phone", "Allo", user8);
        Order order5 = new Order(5, 700, Currency.USD, "Tires", "Avtozvuk", user7);
        Order order6 = new Order(6, 1500, Currency.UAH, "Chair", "MebHouse", user9);
        Order order7 = new Order(7, 700, Currency.UAH, "Iron", "Eldo", user4);
        Order order8 = new Order(8, 2000, Currency.USD, "IPhone", "AppleHATA", user2);
        Order order9 = new Order(9, 200, Currency.UAH, "Toy", "Antoshka", user2);
        Order order10 = new Order(10, 500, Currency.UAH, "Fan", "Fox", user6);

        List<User> usersList = new ArrayList<>();
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);
        usersList.add(user5);
        usersList.add(user6);
        usersList.add(user7);
        usersList.add(user8);
        usersList.add(user9);
        usersList.add(user10);

        List<Order> ordersList = new ArrayList<>();
        ordersList.add(order1);
        ordersList.add(order2);
        ordersList.add(order3);
        ordersList.add(order4);
        ordersList.add(order5);
        ordersList.add(order6);
        ordersList.add(order7);
        ordersList.add(order8);
        ordersList.add(order9);
        ordersList.add(order10);

        System.out.println(ordersList);
        // task 2-1 - Order price in decrease order
        Collections.sort(ordersList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return o2.getPrice() > o1.getPrice() ? 1 : -1;
                }
            }
        });
        System.out.println(ordersList);

        // task 2-2 - Order price in increase order AND User city
        Collections.sort(ordersList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() == o2.getPrice() && o1.getUser().getCity().equals(o2.getUser().getCity())) {
                    return 0;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                } else {
                    return o1.getPrice() > o2.getPrice() ? 1 : -1;
                }
            }
        });
        System.out.println(ordersList);

        // task 2-3 - Order itemName AND shopIdentification AND User city
        Collections.sort(ordersList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getItemName().equals(o2.getItemName())
                        && o1.getShopIdentification().equals(o2.getShopIdentification())
                        && o1.getUser().getCity().equals(o2.getUser().getCity())) {
                    return 0;
                } else if (o1.getItemName().equals(o2.getItemName())
                        && o1.getShopIdentification().equals(o2.getShopIdentification())){
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }else if (o1.getItemName().equals(o2.getItemName())){
                    return o1.getShopIdentification().compareTo(o2.getShopIdentification());
                } else {
                    return o1.getItemName().compareTo(o2.getItemName());
                }
            }
        });
        System.out.println(ordersList);
    }
}
