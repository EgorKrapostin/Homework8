import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    /**
     * Объявите три массива:
     * Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
     * Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
     * Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
     */
    public static void task1() {
        System.out.println("Задача 1: ");

        int[] array = {1, 2, 3};
        double[] array1 = {1.57, 7.654, 9.986};
        int[] array2 = new int[30];
    }

    /**
     * Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
     */
    public static void task2() {
        System.out.println("Задача 2: ");
        int[] array = {1, 2, 3};
        double[] array1 = {1.57, 7.654, 9.986};
        int[] array2 = new int[30];

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }

    /**
     * Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
     */
    public static void task3() {
        System.out.println("Задача 3: ");
        int[] array = {1, 2, 3};
        double[] array1 = {1.57, 7.654, 9.986};
        int[] array2 = new int[30];

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array1[i] + " ");
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }

    /**
     * Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
     */
    public static void task4() {
        System.out.println("Задача 4: ");
        int[] array = {1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
            System.out.println(array[i]);
        }
    }
}