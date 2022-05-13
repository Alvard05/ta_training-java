package com.epam.training.student_alvard_babakhanyan.collections.main_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bouquet implements SortingFlowers,FindingFlowers {
    private int costOfBouquet;

    List <Flower> flowerList = new ArrayList<Flower>();
    public void addFlower(Flower flower){
        flowerList.add(flower);
    }


    @Override
    public List<Flower> findingFlowerByLengthOfStem(int minStemLength,int maxStemLength) {
        System.out.println(" ");
        System.out.println("Finding flowers, which length of stems are within the specified range");
        for(Flower f: flowerList){
            if(f.getStemLength()>= minStemLength && f.getStemLength()<= maxStemLength){

                System.out.println(f);
            }
        }
        return null;
    }

    @Override
    public List<Flower> collectBouquet( String name, int count) {

          for(int i = 0;i< flowerList.size();i++) {
              if (flowerList.get(i).getName().equals(name)) {
                  int costOfDecoration = count * 50;//for each flower decoration costs 50;

                  costOfBouquet = count * flowerList.get(i).getCost() + costOfDecoration;

                  System.out.println("Bouquet" + " " + "costs " + costOfBouquet);

              } } return flowerList;}


    @Override
    public List<Flower> sortingFlowersByFreshness() {
        Collections.sort(flowerList, new Comparator<Flower>() {
            @Override
            public int compare(Flower o1, Flower o2) {
                return o1.getFreshness()-o2.getFreshness();
            }
        });
        System.out.println(" ");
        System.out.println("Sorting flowers by freshness");
        System.out.println(flowerList );
        return null;

    }
}
