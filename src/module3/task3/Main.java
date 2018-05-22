package module3.task3;

//Create getters and setters for all fields and make fields private as OOP principle follows.
// Create 5 objects Course class.
// Create objects of others classes using every constructor.
// You must have 13 objects in Solution class.

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Course courseMath = new Course(new Date(), "Mathematics");
        Course courseLit = new Course(88, "Literature", "Meredith Jonson");
        Course courseArt = new Course(120, "Art", "Peter Edison");
        Course courseChem = new Course(new Date(), "Chemistry");
        Course courseUkr = new Course(60, "Ukrainian language", "Mariya Voloshko");

        Student student1 = new Student("J", "J", 3);
        Student student2 = new Student("D", new Course[]{courseLit, courseChem});
        CollegeStudent student3 = new CollegeStudent("K", "P", 9);

    }
}