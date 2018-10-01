package module7.homework;

import java.util.*;

import static module7.homework.Currency.UAH;
import static module7.homework.Currency.USD;

public class MainHW7 {
    public static void main(String[] args) {
        User user1 = new User(1, "Vasya", "Pupkin", "Moscow", 1200);
        User user2 = new User(2, "Anya", "Y", "Kiev", 18000);
        User user3 = new User(3, "Petya", "Lym", "Kolom", 2000);
        User user4 = new User(4, "Sonya", "Dl", "Vish", 100);
        User user5 = new User(5, "Mila", "Kunis", "NY", 5000);
        User user6 = new User(6, "Stepa", "Velik", "Skaz", 3000);
        User user7 = new User(7, "Vanya", "Kaban", "Kiev", 20000);
        User user8 = new User(8, "Kolya", "Ryb", "Vish", 700);
        User user9 = new User(9, "Olya", "Krav", "Poltava", 1500);
        User user10 = new User(10, "Ksy", "Tym", "Ovruch", 6800);

        Order order1 = new Order(1, 700, UAH, "Iron", "Eldo", user10);
        Order order2 = new Order(2, 100, UAH, "Coffee", "TeaLand", user5);
        Order order3 = new Order(3, 15000, USD, "Car", "AutoTrade", user7);
        Order order4 = new Order(4, 1000, UAH, "Phone", "Allo", user8);
        Order order5 = new Order(5, 700, USD, "Tires", "Avtozvuk", user7);
        Order order6 = new Order(6, 1500, UAH, "Chair", "MebHouse", user9);
        Order order7 = new Order(7, 700, UAH, "Iron", "Eldo", user4);
        Order order8 = new Order(8, 2000, USD, "IPhone", "AppleHATA", user2);
        Order order9 = new Order(9, 200, UAH, "Toy", "Antoshka", user2);
        Order order10 = new Order(10, 500, UAH, "Fan", "Fox", user6);

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
        ordersList.add(order2);
        ordersList.add(order6);

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
                        && o1.getShopIdentification().equals(o2.getShopIdentification())) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                } else if (o1.getItemName().equals(o2.getItemName())) {
                    return o1.getShopIdentification().compareTo(o2.getShopIdentification());
                } else {
                    return o1.getItemName().compareTo(o2.getItemName());
                }
            }
        });
        System.out.println(ordersList);

        // task 2-4 - delete duplicates from the list
        // was added 2 duplicated orders (order2 & order6) to orderList
        // the duplicates were deleted by using Set
        Set<Order> orderSet = new HashSet<>();
        orderSet.addAll(ordersList);
        System.out.println("Orders without duplicates:\n" + orderSet);

        // task 2-5 - delete items where price less than 1500
        Set<Order> highPriceOrders = new HashSet<>();
        for (Order order : orderSet) {
            if (order.getPrice() >= 1500) {
                highPriceOrders.add(order);
            }
        }
        System.out.println("The orders where price is more than 1500:\n" + highPriceOrders);

        // task 2-6 - separate list for two list - orders in USD and UAH
        Set<Order> UAHOrders = new HashSet<>();
        Set<Order> USDOrders = new HashSet<>();
        for (Order order : orderSet) {
            if (order.getCurrency() == UAH) {
                UAHOrders.add(order);
            } else {
                USDOrders.add(order);
            }
        }
        System.out.println("Orders in UAH:\n" + UAHOrders);
        System.out.println("Orders in USD:\n" + USDOrders);

        // task 2-7 - separate list for as many lists as many unique cities are in User
        // it will be list of lists
        List<List<User>> resultList = new ArrayList<>();
        List<User> tempList;
        Set<String> unequalCities = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (User user : usersList) {
            unequalCities.add(user.getCity());
        }
        System.out.println("Unequal cities: " + unequalCities);
        for (String city : unequalCities) {
            tempList = new ArrayList<>();
            for (User user : usersList) {
                if (city.equals(user.getCity())) {
                    tempList.add(user);
                }
            }
            resultList.add(tempList);
        }
        System.out.println("List of users which split by unequal cities:\n" + resultList);
    }
}
