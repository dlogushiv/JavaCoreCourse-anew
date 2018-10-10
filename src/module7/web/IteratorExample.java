package module7.web;

import module7.homework.User;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorExample {

    public static void main(String[] args) {
        Set<User> userSet=new HashSet<>();

        userSet.add(new User(1, "Vasya", "Pupkin", "Moscow", 1200));
        userSet.add(new User(2, "Anya", "Y", "Kiev", 18000));
        userSet.add(new User(3, "Petya", "Lym", "Kolom", 2000));
        userSet.add(new User(4, "Sonya", "Petrov", "Vish", 100));

        Iterator<User> userIterator = userSet.iterator();

        while (userIterator.hasNext()){
            User user=userIterator.next();
            System.out.println(user.getFirstName()+" "+user.getLastName());
        }


    }
}
