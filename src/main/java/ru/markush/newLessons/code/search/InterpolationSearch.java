package ru.markush.newLessons.code.search;

public class InterpolationSearch {

    public static int search(Integer[] arr, int num2find) {
        return search(arr,num2find,0,arr.length -1);
    }

    public static int search(Integer[] arr, int num2find, int start, int end) {
        int base;
        int i = 0;

        while (end >= start && num2find >= arr[start] && num2find <= arr[end]) {
            i++;
            if (arr[end].equals(arr[start])) {
                break;
            }
            base = (int) (start +
                   1.0 * (end - start) / (arr[end] - arr[start])
                    * (num2find - arr[start]));

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
        if (arr[start].equals(num2find)) {
            System.out.println("найдено, количество шагов: " + i);
            return start;
        }
        System.out.println("Не найдено, количество шагов: " + i);
        return -1;
    }
}
