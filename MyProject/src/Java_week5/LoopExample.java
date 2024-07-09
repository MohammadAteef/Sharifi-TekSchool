package Java_week5;

public class LoopExample {
    public static void main(String[] args){
        /*
    Print Array Elements
    You are given an array of integers: int[] numbers = {3, 7, 2, 8, 5};.
    Write a program using a for loop that prints the elements in the array.
    Keep a running total and add each array element to this total during each iteration of the loop.
*/
        int[] numbers = {3, 7, 2, 8, 5};
        int total=0;
        for(int i=0; i<numbers.length; i++){
            System.out.println("this is the number"+numbers[i]);
            total=total+numbers[i];
        }
        System.out.println("the total is "+total);
    }
}
