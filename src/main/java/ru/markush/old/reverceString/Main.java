package ru.markush.old.reverceString;

public class Main {
    public static void main(String[] args) {
        String word = "1234";

        System.out.println(reverce(word));
        System.out.println(reverceWordSB(word));
    }

    private static String reverce(String word) {
        String reverceWord = "";
        for (int i = word.length() - 1; i >= 0  ; i--) {
            reverceWord += word.charAt(i);
        }
        return reverceWord;
    }

    private static String reverceWordSB(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
