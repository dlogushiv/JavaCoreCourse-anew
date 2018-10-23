package module8.webinar;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class TreeSetExample {
    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task("test something");
        Task task2 = new Task("calculate sum of an array");
        Task task3 = new Task("calculate");

        Map<Date, Task> map = new TreeMap<>();
        map.put(new Date(), task2);
        Thread.sleep(100);
        map.put(new Date(), task1);
        Thread.sleep(100);
        map.put(new Date(), task3);
        System.out.println(map);

        Map<Task, Date> map1 = new TreeMap<>();
        map1.put(task2, new Date());
        map1.put(task1, new Date());
        map1.put(task3, new Date());
        System.out.println(map1);

    }
}
