package module8.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        User user1 = new User(10, "Ann");
        User user2 = new User(20, "Tim");
        User user3 = new User(30, "Lol");
        User user4 = new User(40, "Sol");
        User user5 = new User(50, "Cam");
        User user6 = new User(60, "Ted");
        User user7 = new User(70, "Bee");
        User user8 = new User(80, "Den");
        User user9 = new User(90, "Rik");


        userDAO.save(user1);
        userDAO.save(user2);
        userDAO.save(user3);
        userDAO.save(user4);
        userDAO.save(user5);
        userDAO.save(user6);
        userDAO.save(user7);
        userDAO.save(user8);
        userDAO.save(user9);
        System.out.println("\nUser database after saving all users:\n" + userDAO.getList());

        userDAO.delete(user5);
        System.out.println("\nUser database after deleting user 5:\n" + userDAO.getList());

        List<User> tempList = new ArrayList<>();
        tempList.add(user3);
        tempList.add(user4);
        tempList.add(user5);
        userDAO.deleteAll(tempList);
        System.out.println("\nUser database after deleting users 3 4 5:\n" + userDAO.getList());

        userDAO.saveAll(tempList);
        System.out.println("\nUser database after saving users 3 4 5:\n" + userDAO.getList());

        userDAO.deleteById(70);
        System.out.println("\nUser database after deleting user with id=70:\n" + userDAO.getList());

        System.out.println("\nUser with id=80:\n" + userDAO.get(80));
    }
}
