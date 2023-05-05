// Geeks
// eldar_zainaliev_hw_3
// ОСНОВНОЕ ДЗ:

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double[] array = {-1.1, 2.2, -3.3, 4.4, -5.5, 6.6, -7.7, 8.8, -9.9, 10.0, -11.1, 12.2, -13.3, 14.4, -15.5};
        double result = 0;
        int positiveNumber = 0;
        boolean sorted = false;
        for (double i : array) {
            if (i < 0) {
                sorted = true;
            } else if (i > 0 && sorted) {
                result += i;
                positiveNumber++;
            }
        }
        System.out.println((int)result/positiveNumber);
        System.out.println();

        // ДОПОЛНИТЕЛЬНОЕ ДЗ:
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}