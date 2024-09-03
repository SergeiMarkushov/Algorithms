package ru.markush.newLessons.code.search;

import ru.markush.newLessons.code.MyArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArray.isShuffle = false;
        Integer[] array = MyArray.getArray(10);

        System.out.println(Arrays.toString(array));

        System.out.println(BinarySearch.search(array, 10));

        System.out.println(ExpSearch.search(array, 10));
        System.out.println(InterpolationSearch.search(array,10));
    }
}
