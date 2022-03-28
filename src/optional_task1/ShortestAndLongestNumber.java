package optional_task1;

public class ShortestAndLongestNumber{
    public static void main(String[] args) {

                int[] numbers = {12343, -2123362, 12, 122185911, 2222331};
                int shortest = numbers[0];
                int longest = numbers[0];
                int ShortestLength = 1;
                int LongestLength = 1;

                for (int fLoop = 0; fLoop < numbers.length; fLoop++) {
                    if (Math.abs(numbers[fLoop]) <= Math.abs(shortest)) {
                        shortest = numbers[fLoop];
                    }
                    if (Math.abs(numbers[fLoop]) >= Math.abs(longest)) {
                        longest = numbers[fLoop];
                    }
                }
                int ShortestCopy = shortest;
                while (ShortestCopy / 10 != 0) {
                    ShortestCopy = ShortestCopy / 10;
                    ShortestLength++;
                }


                int LongestCopy = longest;
                while (LongestCopy / 10 != 0) {
                    LongestCopy = LongestCopy / 10;
                    LongestLength++;
                }

                System.out.println(" Shortest number is " + shortest + " shortest number's length is " + ShortestLength);
                System.out.println(" Longest number is " + longest + " longest number's length is " + LongestLength);
            }
    }


