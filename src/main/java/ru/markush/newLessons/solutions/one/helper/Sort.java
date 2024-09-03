package ru.markush.newLessons.solutions.one.helper;

import ru.markush.newLessons.solutions.one.entity.Notebook;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static List<Notebook> sortByPrice(List<Notebook> notebooks) {
        return notebooks.stream().sorted(Comparator.comparingInt(Notebook::getPrice)).collect(Collectors.toList());
    }

    public static List<Notebook> sortByRam(List<Notebook> notebooks) {
        return notebooks.stream().sorted(Comparator.comparingInt(Notebook::getRam)).collect(Collectors.toList());
    }

    public static List<Notebook> sortByCompany(List<Notebook> notebooks) {
        return notebooks.stream().sorted(Comparator.comparing(Notebook::getCompany)).collect(Collectors.toList());
    }

    public static List<Notebook> sort(List<Notebook> notebooks) {
        notebooks.sort(new NotebookComparator());
        return notebooks;
    }
}
