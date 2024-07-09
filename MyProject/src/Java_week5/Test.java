package Java_week5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
     /*    Question: Age Verification for a Theme Park Ride
    A theme park ride has an age restriction. Only those who are 12 years old or older can go on the ride.
    A visitor wants to try the ride and provides their age: int visitorAge = 10; (This value can be changed for testing).
    Check the visitor's age against the age restriction.
    Determine:
    If the visitor is old enough for the ride.
    If the visitor is too young.
    Print out whether the visitor can go on the ride or not. */
        Scanner SC=new Scanner(System.in);
        System.out.println("Please enter you age");
        int age=SC.nextInt();
        if(age>=12){
            System.out.println("You can ride");
        }
        else {
            System.out.println("You are restricted to the ride");
        }
    }
}
