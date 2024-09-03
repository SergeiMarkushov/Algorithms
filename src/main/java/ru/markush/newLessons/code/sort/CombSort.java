package ru.markush.newLessons.code.sort;

public class CombSort {
    public static void sort(Integer[] arr) { //les 2. 1.12.12
        int gap = arr.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1) {
                gap = (int) (gap / 1.24733095003979);
            }
            int i = 0;
            swapped = false;
            while (i + gap < arr.length) {
                if (arr[i].compareTo(arr[i + gap]) > 0) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    swapped = true;
                }
                i++;
            }
        }
    }
}
