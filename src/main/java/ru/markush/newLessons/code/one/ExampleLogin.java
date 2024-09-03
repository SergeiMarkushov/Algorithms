package ru.markush.newLessons.code.one;

public class ExampleLogin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int n = arr.length;

        for (int i = 0; i < n; i++) { //О(n)
            System.out.println(arr[i]);
        }

        for (int i = 0; i < n; i+=2) { //О(n)
            System.out.println(arr[i]);
        }

        for (int i = 1; i < n; i*=2) { //О(log(n))
            System.out.println(arr[i]);
        }

    }
}

/*
сложность О(n)
 */
