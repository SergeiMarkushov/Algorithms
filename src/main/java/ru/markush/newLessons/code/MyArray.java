package ru.markush.newLessons.code;

import java.util.Arrays;
import java.util.Random;

public class MyArray {
    private static final Random RANDOM = new Random();
    public static boolean isShuffle;
    public static Integer[] getArray(int length) {
        Integer[] arr = new Integer[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(-50,50);
        }
        if (!isShuffle) {
            Arrays.sort(arr);
        }
        return arr;
    }


}
