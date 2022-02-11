package Main_task;

public class RandomNum {
    public static void main(String[] args) {
        int min  = 0;
        int max = 50;
        for (int i = 0; i < 5 ; i++) {
            int random_number = min + (int) (Math.random() * max);
            System.out.println(" " + random_number);
        }


    }
}
