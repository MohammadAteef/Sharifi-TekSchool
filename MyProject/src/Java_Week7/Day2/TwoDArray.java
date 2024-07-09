package Java_Week7.Day2;

import java.util.Random;

public class TwoDArray {
    public static void main(String[] args){
        String message = "Welcome TO TekSchool Java IS EASY! 123*&^^%^%%!@#)_!@#@#)!(*@$)(*!asdljhasdjklh";

// Fill in the array with random numbers from 1 to 15
        Random random = new Random();


        int[] arrayOfNumbers = new int[20];

// Fill the above array using loops
        for(int i=0; i<20; i++){
            int randomNumber = random.nextInt(15) + 1;
            arrayOfNumbers[i]=randomNumber;
            System.out.print(arrayOfNumbers[i]+" ");
        }

    }
}
