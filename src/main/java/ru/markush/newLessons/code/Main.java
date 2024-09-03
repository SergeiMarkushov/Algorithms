package ru.markush.newLessons.code;

import ru.markush.newLessons.code.sort.BubbleSort;

import java.util.Arrays;

public class Main {
    static int lengthArr = 10;
    static long start;
    static Integer[] arr = MyArray.getArray(lengthArr);
    public static void main(String[] args) {
        startTime();
        BubbleSort.sort(arr); // 5979
//        CocktailSort.sort(arr); //4240
//        CombSort.sort(arr); //14
//        SelectionSort.sort(arr); //1045
//        InsertionSort.sort(arr); //1080
//        CountingSort.sort(arr); //4
//        Arrays.sort(arr);//Сортировка Блоха. //19
        System.out.println(Arrays.toString(arr));
        endTime();


    }

    private static void startTime() {
        start = System.currentTimeMillis();
    }

    private static void endTime() {
        System.out.println(System.currentTimeMillis() - start);
    }
}
