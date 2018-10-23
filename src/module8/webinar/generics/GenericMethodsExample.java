package module8.webinar.generics;

public class GenericMethodsExample {
    private static <T> void printArray(T[] arrayToPrint) {
        for (T element : arrayToPrint) {
            System.out.print(element + "; ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
