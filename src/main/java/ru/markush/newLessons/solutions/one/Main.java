package ru.markush.newLessons.solutions.one;


import ru.markush.newLessons.solutions.one.entity.Notebook;
import ru.markush.newLessons.solutions.one.helper.NotebookCreator;
import ru.markush.newLessons.solutions.one.helper.Sort;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebooks = NotebookCreator.builder()
                .minPrice(500)
                .maxPrice(2000)
                .stepPrice(50)
                .minRam(4)
                .maxRam(24)
                .stepRam(2)
                .build()
                .createNotebooks(30);

        List<Notebook> sortedNotebooks = Sort.sort(notebooks);
        for (Notebook sortedNotebook : sortedNotebooks) {
            System.out.println(sortedNotebook.toString());
        }
    }
}
