package Zadachi7_13;

import java.util.Random;

public class prog7 {
    public static void main(String[] args) {
        int[] arr = new int[12];
        Random rand = new Random();
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(31) - 15;
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nМаксимальный элемент: " + max);
        System.out.println("Индекс последнего вхождения максимального элемента: " + index);
    }
}
