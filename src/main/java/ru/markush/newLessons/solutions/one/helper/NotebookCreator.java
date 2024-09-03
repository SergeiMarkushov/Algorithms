package ru.markush.newLessons.solutions.one.helper;

import lombok.*;
import ru.markush.newLessons.solutions.one.entity.Notebook;
import ru.markush.newLessons.solutions.one.entity.NotebookCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Getter
@Setter
@AllArgsConstructor
@Builder
public class NotebookCreator {
    private static final Random RANDOM = new Random();

    private int minPrice;
    private int maxPrice;
    private int stepPrice;
    private int minRam;
    private int maxRam;
    private int stepRam;

    public List<Notebook> createNotebooks(int size) {
        List<Notebook> notebooks = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            notebooks.add(create());
        }
        return notebooks;
    }
    public Notebook create() {
        return new Notebook(
                generateRandomNoteCompany(),
                generateRandomPrice(minPrice,maxPrice,stepPrice),
                generateRandomRam(minRam,maxRam,stepRam)
        );
    }

    private int generateRandomPrice(int min, int max, int step) {
        return generateValue(min, max, step);

    }
    private int generateRandomRam(int min, int max, int step) {
       return generateValue(min, max, step);
    }

    private NotebookCompany generateRandomNoteCompany() {
        return NotebookCompany.values()[RANDOM.nextInt(NotebookCompany.values().length)];
    }

    private int generateValue(int min, int max, int step) {
        int range = (max - min) / step + 1;
        return RANDOM.nextInt(range) * step + min;
    }
}
