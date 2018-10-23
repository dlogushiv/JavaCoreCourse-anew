package module8.webinar.generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};
        List<String> stringList = new ArrayList<>();
        stringList.add("w");

        Integer[] ints = {1, 2, 3};
        List<Integer> integerList = new ArrayList<>();
        integerList.add(22);

        StartGenerics.fromArrayToCollection2(strings, stringList);
        StartGenerics.fromArrayToCollection2(ints, integerList);

        System.out.println(stringList);
        System.out.println(integerList);
    }
}
