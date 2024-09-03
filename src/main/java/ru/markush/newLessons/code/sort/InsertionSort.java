package ru.markush.newLessons.code.sort;

public class InsertionSort {
    public static void sort(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int value = arr[i];

            while (j >= 0 && arr[j] > value) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
        }
    }
}
