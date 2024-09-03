package ru.markush.newLessons.code.sort;

public class SelectionSort {
    public static void sort(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
