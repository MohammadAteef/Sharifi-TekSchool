package Java_week5;

import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        Scanner SC=new Scanner(System.in);
        System.out.println("Please enter how old are you?");
        int age = SC.nextInt();
        if (age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }

    }
}
