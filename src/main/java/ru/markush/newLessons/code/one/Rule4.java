package ru.markush.newLessons.code.one;

public class Rule4 {

    public static boolean findDuplicate(int[] array) { // О(n)
        for (int i = 0; i < array.length; i++) { // О(n)
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    if (array[i] == array[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
/*
Имеем 2 цикла, второй цикл будет определять сложность
так как они вложены друг в друга получаем O(n)*O(n) = O(n^2)
 */