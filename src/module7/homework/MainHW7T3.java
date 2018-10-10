package module7.homework;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static module7.homework.Currency.UAH;
import static module7.homework.Currency.USD;

public class MainHW7T3 {
    public static void main(String[] args) {
        User user1 = new User(1, "Vasya", "Pupkin", "Moscow", 1200);
        User user2 = new User(2, "Anya", "Y", "Kiev", 18000);
        User user3 = new User(3, "Petya", "Lym", "Kolom", 2000);
        User user4 = new User(4, "Sonya", "Petrov", "Vish", 100);
        User user5 = new User(5, "Mila", "Kunis", "NY", 5000);
        User user6 = new User(6, "Stepa", "Velik", "Skaz", 3000);
        User user7 = new User(7, "Vanya", "Kaban", "Kiev", 20000);
        User user8 = new User(8, "Kolya", "Ryb", "Vish", 700);
        User user9 = new User(9, "Olya", "Krav", "Poltava", 1500);
        User user10 = new User(10, "Ksy", "Tym", "Ovruch", 6800);

        Order order1 = new Order(1, 700, UAH, "Iron", "Eldo", user10);
        Order order2 = new Order(2, 100, UAH, "Coffee", "TeaLand", user5);
        Order order3 = new Order(3, 15000, USD, "Car", "AutoTrade", user7);
        Order order4 = new Order(4, 1100, UAH, "Phone", "Allo", user8);
        Order order5 = new Order(5, 750, USD, "Tires", "Avtozvuk", user7);
        Order order6 = new Order(6, 1500, UAH, "Chair", "MebHouse", user9);
        Order order7 = new Order(7, 700, UAH, "Iron", "Eldo", user4);
        Order order8 = new Order(8, 2000, USD, "IPhone", "AppleHATA", user2);
        Order order9 = new Order(4, 1100, UAH, "Phone", "Allo", user8);
        Order order10 = new Order(6, 1500, UAH, "Chair", "MebHouse", user9);
//        Order order9 = new Order(9, 200, UAH, "Toy", "Antoshka", user2);
//        Order order10 = new Order(10, 500, UAH, "Fan", "Fox", user6);

        Set<Order> orderSet = new TreeSet<>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return Long.compare(o1.getId(), o2.getId());

//                return o1.getPrice()-o2.getPrice();

//                if (o1.getId() != o2.getId() && o1.getPrice() - o2.getPrice() < 0) return -1;
//                if (o1.getId() != o2.getId() && o1.getPrice() - o2.getPrice() > 0) return 1;
//                if (o1.getId() != o2.getId() && o1.getPrice() - o2.getPrice() == 0) return 0;
//                return 0;
            }
        });
        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order3);
        orderSet.add(order4);
        orderSet.add(order5);
        orderSet.add(order6);
        orderSet.add(order7);
        orderSet.add(order8);
        orderSet.add(order9);
        orderSet.add(order10);
        System.out.println(orderSet);

        // task-3-1 - check if set contain Order where User’s lastName is - “Petrov”
        boolean fl = false;
        for (Order order : orderSet) {
            if (order.getUser().getLastName().equals("Petrov")) {
                fl = true;
                break;
            }
        }
        if (fl) System.out.println("Set contains Petrov.");
        else System.out.println("Set not contains Petrov.");

        // task-3-2 - print Order with largest price using only one set method - get
        int maxPrice = 0;
        for (Order order : orderSet) {
            if (order.getPrice() > maxPrice)
                maxPrice = order.getPrice();
        }
        for (Order order : orderSet) {
            if (order.getPrice() == maxPrice) {
                System.out.println("Order with max price: " + order);
                break;
            }
        }

        // task-3-3 - delete orders where currency is USD using Iterator
        Iterator<Order> iterator = orderSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency() == USD) iterator.remove();
        }
        System.out.println(orderSet);
    }
}
