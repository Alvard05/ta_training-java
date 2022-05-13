package com.epam.training.student_alvard_babakhanyan.collections.main_task;

public class Flower {
    private String name;
    private int count;
    private int cost;
    private int freshness;
    private int stemLength;

    Flower(String name,int count,int cost, int freshness, int stemLength){
        this.name =name;
        this.count = count;
        this.cost = cost;
        this.freshness = freshness;
        this.stemLength = stemLength;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
         this.count = count;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    @Override
    public String toString() {
        return  '{' + name + ' ' +
                ", count= " + count +
                ", cost= " + cost + " AMD" +
                ", freshness= " + freshness + " days" +
                ", stemLength= " + stemLength + " cm " +
                '}';
    }
}
