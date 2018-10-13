package module7.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Timer;

public class SpeedTest {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();
        long start,finish;
        int length = 100000;

        System.out.println("\tArrayList and Integers:");
        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            integerArrayList.add((int) Math.random() * 100);
        }
        finish=System.currentTimeMillis();
        System.out.println("1. Time of adding " + length + " integers to ArrayList: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            integerArrayList.set(i,(int) Math.random() * 100);
        }
        finish=System.currentTimeMillis();
        System.out.println("2. Time of setting " + length + " integers to ArrayList: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            integerArrayList.get(i);
        }
        finish=System.currentTimeMillis();
        System.out.println("3. Time of getting " + length + " integers to ArrayList: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            integerArrayList.remove(0);
        }
        finish=System.currentTimeMillis();
        System.out.println("4. Time of removing " + length + " integers to ArrayList: " + (finish - start));


        System.out.println("\tLinkedList and Integers:");
        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            integerLinkedList.add((int) Math.random() * 100);
        }
        finish=System.currentTimeMillis();
        System.out.println("1. Time of adding " + length + " integers to LinkedList: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            integerLinkedList.set(i,(int) Math.random() * 100);
        }
        finish=System.currentTimeMillis();
        System.out.println("2. Time of setting " + length + " integers to LinkedList: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            integerLinkedList.get(i);
        }
        finish=System.currentTimeMillis();
        System.out.println("3. Time of getting " + length + " integers to LinkedList: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            integerLinkedList.remove(0);
        }
        finish=System.currentTimeMillis();
        System.out.println("4. Time of removing " + length + " integers to LinkedList: " + (finish - start));


        System.out.println("\tArrayList and Strings:");
        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            stringArrayList.add(randomAlphaNumeric(15));
        }
        finish=System.currentTimeMillis();
        System.out.println("1. Time of adding " + length + " strings to ArrayList: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            stringArrayList.set(i,randomAlphaNumeric(15));
        }
        finish=System.currentTimeMillis();
        System.out.println("2. Time of setting " + length + " strings to ArrayList: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            stringArrayList.get(i);
        }
        finish=System.currentTimeMillis();
        System.out.println("3. Time of getting " + length + " strings to ArrayList: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            stringArrayList.remove(0);
        }
        finish=System.currentTimeMillis();
        System.out.println("4. Time of removing " + length + " strings to ArrayList: " + (finish - start));

        System.out.println("\tLinkedList and Strings:");
        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            stringLinkedList.add(randomAlphaNumeric(15));
        }
        finish=System.currentTimeMillis();
        System.out.println("1. Time of adding " + length + " strings to LinkedList: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            stringLinkedList.set(i,randomAlphaNumeric(15));
        }
        finish=System.currentTimeMillis();
        System.out.println("2. Time of setting " + length + " strings to LinkedList: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            stringLinkedList.get(i);
        }
        finish=System.currentTimeMillis();
        System.out.println("3. Time of getting " + length + " strings to LinkedList: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            stringLinkedList.remove(0);
        }
        finish=System.currentTimeMillis();
        System.out.println("4. Time of removing " + length + " strings to LinkedList: " + (finish - start));
    }

    // copied from https://dzone.com/articles/generate-random-alpha-numeric
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
}
