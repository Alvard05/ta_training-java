package com.epam.training.student_alvard_babakhanyan.collections.main_task;

import java.util.List;

public interface FindingFlowers {
    List<Flower> findingFlowerByLengthOfStem(int minStemLength, int maxStemLength);
    List<Flower> collectBouquet(String name, int count);
}
