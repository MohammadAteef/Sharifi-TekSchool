package Java_week4;

import java.util.Scanner;

public class NewE {

    public static void main(String[] args){
        Scanner SC=new Scanner(System.in);
        System.out.println("Please enter the mark in digit");
        double Rng= SC.nextDouble();
        if(Rng>=90)
            System.out.println("The Grade is A");
        else if(Rng>=80)
            System.out.println("The Grad is B");
        else if (Rng>=70)
            System.out.println("the Grade is C");
        else if (Rng>=60)
            System.out.println("the Grade is D");
        else
            System.out.println("Fail");

    }
}
