package main_task;
public class ReverseArgs {
    public static void main(String[] args) {
        String str = args[0];
        char[] reverseArray = str.toCharArray();
        System.out.println(" ");
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            System.out.print(reverseArray[i]);
            //System.out.println(reverseArray[i]);
        }
    }
}