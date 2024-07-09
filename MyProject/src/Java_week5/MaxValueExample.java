package Java_week5;

public class MaxValueExample {
    public static void main(String[] args){
        /*
         *
         * Given int[] numbers = {1, 2, 3, 30, 5, 50, 7, 8, 9, 10};
         * // Find the maximum value using enhanced for loop
         *
         * */
        int[] numbers = {1, 2, 3, 30, 5, 50, 7, 8, 9, 10};
        int max=numbers[0];
        int count=1;
        for(int C:numbers){
            max=C;
            if(max<numbers[count]){
                max=numbers[count];
            }
        }
        count++;
        System.out.println("the max number is"+max);
    }

}
