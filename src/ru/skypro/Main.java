package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // task 1
        int[] arr = generateRandomArray();

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
            System.out.println(arr[i]);

        }
        System.out.println("сумма трат за текущий месяц составила :" + total + "рублей");

        // task 2

        int minExpence = arr[0];
        int maxExpence = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxExpence) {
                maxExpence = arr[i];
            }
            if (minExpence > arr[i]) {
                minExpence = arr[i];
            }


        }
        System.out.println("максимальная трата за день составила :" + maxExpence + "рублей");
        System.out.println("Минимальная трата за день составила :" + minExpence + "рублей");

        //task 3

        float avgExpence = (float) total / arr.length;


        System.out.println("Средняя трата за день составила : " + avgExpence + "рублей");

        // task 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);


        }

        System.out.println();
        // task 5

        int [][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {

            matrix[i][i] = 1;
            matrix[i][matrix [i].length - 1 - i] = 1;

        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //task 6

        int [] array= {5,4,3,2,1};
        System.out.println(Arrays.toString(array));
        int [] arrayRewerse = new int [array.length];
        int temp = array.length-1;
        for (int i = 0; i < array.length; i++) {
            arrayRewerse[i]= array[temp];
            temp--;

        }
        System.out.println(Arrays.toString(arrayRewerse));



    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
