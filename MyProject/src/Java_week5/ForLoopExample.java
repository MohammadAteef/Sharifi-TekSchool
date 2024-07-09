package Java_week5;

public class ForLoopExample {
    public static void main(String[] args){
        // Given an array of int[] numbers = {10, 0, 1, 2, 3, 4, 5, 6, 11, 20, 23, 87, 89};
// Print only Even numbers
// Extra Point: Count how many even numbers have you found!
// Extra Point: Count how many odd numbers have you found!
        int[] numbers = {10, 0, 1, 2, 3, 4, 5, 6, 11, 20, 23, 87, 89};
        int TotalEven=0;
        int CountEven=0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2==0 && numbers[i]!=0) {
                System.out.println(numbers[i]+" ");
                CountEven++;
                TotalEven = TotalEven + numbers[i];
            }

        }
        System.out.println("the count is "+CountEven);
        System.out.println("the total Even number is " + TotalEven);
    }
}
