package Java_week4;

import java.util.Scanner;

public class JavaDay {
    public static void main(String[] args){

        // Get the first and last name of the user
// compare the first and last name if they're equal to each other
// if yes, --> your first and last name is the same
// if no, --> your first and last name is not the same.
        Scanner SC=new Scanner(System.in);
        System.out.println("Please enter your FirstName ");
        String FirstName=SC.next();
        System.out.println("Please enter your LastName ");
        String LastName=SC.next();
        if(FirstName.equals(LastName)) {
            System.out.println("Your First Name is equal to the LastName");

        }
        else
            System.out.println("Your FirstName and LastName is not the same");
    }
}
