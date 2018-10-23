package module8.webinar.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StartGenerics {
    public static void main(String[] args) {
//        // very bad practice (using class Object)
//        List<Object> list = new ArrayList<>();
//        list.add("test");
//        list.add(11);
    }


    // very bad practice (using class Object)
    static Object[] fromArrayToCollection1(Object[] a, Collection<Object> c) {
        for (Object o : a) {
            c.add(o);
        }
        return a;
    }

    // real generics use some uppercase letter: T; E; other instead of class type

    static <T> Collection<T> fromArrayToCollection2(T[] array, Collection<T> c) {
        // T element = a[1];
        for (T element : array) {
            c.add(element);     // correct
        }
        return c;
    }
}
