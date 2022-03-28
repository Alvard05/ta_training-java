package com.epam.training.student_alvard_babakhanyan.fundamentals.main_task;
public class RandomNum {
    public static void main(String[] args) {
        int min  = 0;
        int max = 50;
        int count = Integer.parseInt(args[0]);
        for (int i = 0; i < count ; i++) {
            int random_number = min + (int) (Math.random() * max);
            System.out.println(" " + random_number);
        }
    }
}
