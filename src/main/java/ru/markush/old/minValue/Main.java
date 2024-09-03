package ru.markush.old.minValue;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {54,42,73,41,31,53,16,24,57,42,74,55,36};

        // найти минимальный элемент и его индекс

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("value = " + minValue + "; " + "Index = " + minIndex );

    }
}
