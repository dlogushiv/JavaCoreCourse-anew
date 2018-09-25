package module7.web;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        System.out.println(list);

        list.add(1, "Item 9");
        System.out.println(list);

        list.set(1, "Item 10");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("test 0");
        list1.add("test 1");

        list.addAll(list1);
        System.out.println(list);

        System.out.println(list.indexOf("Item 5"));
        System.out.println(list.indexOf("Item 3"));


        UnaryOperator<String> operator=new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if (s.contains("Item")){
                    return null;
                }
                return s;
            }
        };
        list.replaceAll(operator);
        System.out.println(list);
    }
}
