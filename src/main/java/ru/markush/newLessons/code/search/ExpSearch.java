package ru.markush.newLessons.code.search;

import java.util.Objects;

public class ExpSearch {
    // всегда работает с бинарным поиском
    // 1 * 2 * 2 ...
    // for ArrayList or dynamic arrays

    public static int search(Integer[] array, int num2search) {
        if (Objects.equals(array[0], num2search)) {
            return 0;
        }

        int base = 1;
        int i = 0;

        while (base < array.length && array[base] <= num2search) {
            i++;
            if (Objects.equals(array[base], num2search)) {
                System.out.println("число найдено. ЭП. итерраций: " + i);
                return base;
            }
            base *= 2;
        }

        System.out.println(" ЭП. итерраций: " + i);
        return BinarySearch.search(array,num2search, base/2 + 1, Math.min(base - 1, array.length - 1));
    }


}
