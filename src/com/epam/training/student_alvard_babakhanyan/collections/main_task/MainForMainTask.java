package com.epam.training.student_alvard_babakhanyan.collections.main_task;

public class MainForMainTask {
    public static void main(String[] args) {
        Flower flower1 = new Flower("WildRose",100, 500, 5, 25);
        Flower flower2 = new Flower("ClimbingRose",15,400,3,50);
        Flower flower3 = new Flower("ModernGardenRose",65,1500,4,100);
        Bouquet list = new Bouquet();
        list.addFlower(flower1);
        list.addFlower(flower2);
        list.addFlower(flower3);
        list.collectBouquet(flower1.getName(), 25);
        list.findingFlowerByLengthOfStem(10,80);
        list.sortingFlowersByFreshness();

    }
}
