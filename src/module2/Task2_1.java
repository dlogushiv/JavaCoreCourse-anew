package module2;

/**
 * Created by Home on 24.07.2017.
 */
public class Task2_1 {
    public static void main(String[] args) {
        int[] arrayInt = {-3, 5, 67, -45, 4, 26, 15, 44, -7, 1};
        double[] arrayDouble = {-3, 5, 0, -45, 4, 26, 15, 44, -7, 67};

        System.out.println("Sum " + sumOfIntegers(arrayInt));
        System.out.println("Min " + minOfIntegers(arrayInt));
        System.out.println("Max " + maxOfIntegers(arrayInt));
        System.out.println("Max positive " + maxPositiveOfIntegers(arrayInt));
        System.out.println("Multiplication " + multiplication(arrayInt));
        System.out.println("Modulus of first and last elements " + modulus(arrayInt));
        System.out.println("Second largest " + secondLargest(arrayInt));

    }

    static int sumOfIntegers(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    static int minOfIntegers(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    static int maxOfIntegers(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static int maxPositiveOfIntegers(int[] array) {
        int maxPos = 0;
        boolean flag = false;
        for (int i : array) {
            if (i > 0 & i > maxPos) {
                maxPos = i;
                flag = true;
            }
        }
        return (flag ? maxPos : 0);
    }

    static float multiplication(int[] array) {
        float mult = 1;
        for (int element : array) {
            mult *= element;
        }
        return mult;
    }

    static int modulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    static int secondLargest(int[] array) {
        int secondLargest = 0;
        int t;
        // array sorting
        for (int k = 0; k < array.length; k++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    t = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = t;
                }
            }
        }
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i - 1] != array[i]) {
                secondLargest = array[i - 1];
                break;
            }
        }
        return (secondLargest > 0 ? secondLargest : -1);
    }
}
