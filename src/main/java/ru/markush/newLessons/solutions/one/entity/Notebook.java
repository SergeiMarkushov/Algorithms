package ru.markush.newLessons.solutions.one.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notebook {
    private NotebookCompany company;
    private int price;
    private int ram;

}
