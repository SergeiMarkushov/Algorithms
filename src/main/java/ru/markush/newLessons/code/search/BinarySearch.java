package ru.markush.newLessons.code.search;

import org.w3c.dom.ls.LSOutput;

public class BinarySearch {

    public static int search(Integer[] arr, int num2find) {
        return search(arr,num2find,0,arr.length -1);
    }

    public static int search(Integer[] arr, int num2find, int start, int end) {
        int base;
        int i = 0;

        while (end >= start) {
            i++;
            base = (start + end) / 2;
            System.out.println("base: " + base);

            if (arr[base] == num2find) {
                System.out.println("Найдено, количество шагов: " + i);
                return base;
            }
            if (arr[base] < num2find) {
                start = base + 1;
            } else {
                end = base - 1;
            }
        }
        System.out.println("Не найдено, количество шагов: " + i);
        return -1;
    }
}
