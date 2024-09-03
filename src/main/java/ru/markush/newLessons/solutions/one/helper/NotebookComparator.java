package ru.markush.newLessons.solutions.one.helper;

import ru.markush.newLessons.solutions.one.entity.Notebook;

import java.util.Comparator;

public class NotebookComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook n1, Notebook n2) {
        if (n1.getPrice() == n2.getPrice()) {
            if (n1.getRam() == n2.getRam()) {
                return n1.getCompany().compareTo(n2.getCompany());
            } else {
                return Integer.compare(n1.getRam(), n2.getRam());
            }
        }else {
            return Integer.compare(n1.getPrice(), n2.getPrice());
        }
    }
}
