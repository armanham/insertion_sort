package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        insertionSorting(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void insertionSorting(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int current = array[i];
            int counter = i - 1;
            while (counter >= 0 && current < array[counter]) {
                array[counter + 1] = array[counter];
                counter--;
            }
            array[counter + 1] = current;
        }
    }
}
