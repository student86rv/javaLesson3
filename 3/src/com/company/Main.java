package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[][] arr = initArr(5, 6);

        System.out.println("Исходный массив:");
        printArr(arr);
        invertIndex(arr);
        System.out.println("Перестановка элементов:");
        printArr(arr);
        invertValue(arr);
        System.out.println("Инверсия значений:");
        printArr(arr);
    }

    private static int[][] initArr(int size, int length) {
        int[][] arr = new int[size][length];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = random.nextInt(2);
            }
        }
        return arr;
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    private static void invertIndex(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            invertSingleArrIndex(arr[i]);
        }
    }

    private static void invertValue(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            invertSingleArrValue(arr[i]);
        }
    }

    private static void invertSingleArrIndex(int[] singleArr) {
        int tmp;
        for (int i = 0; i < singleArr.length; i++) {
            tmp = singleArr[i];
            singleArr[i] = singleArr[(singleArr.length - 1) - i];
            singleArr[(singleArr.length - 1) - i] = tmp;
            if (i == singleArr.length / 2 - 1) {
                break;
            }
        }
    }

    private static void invertSingleArrValue(int[] singleArr) {
        for (int i = 0; i < singleArr.length; i++) {
            if (singleArr[i] == 1) {
                singleArr[i] = 0;
            } else if (singleArr[i] == 0) {
                singleArr[i] = 1;
            }
        }
    }
}
