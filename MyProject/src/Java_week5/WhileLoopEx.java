package Java_week5;

import java.util.Scanner;

public class WhileLoopEx {
    public static void main(String args[]){
        /*
         * Ask the user for a number
         *  Print the multiplication table using while loop
         *   from start to endPoint
         *   Where start and end are numbers entered by the user
         *
         *  */
        System.out.print("enter the number to print its multiplication ");
        Scanner SC=new Scanner(System.in);
        int Choice=SC.nextInt();
        System.out.println("enter the start point");
        int StrPoint=SC.nextInt();
        System.out.println("enter the end point");
        int EndPoint=SC.nextInt();
        int i=1;
        while (StrPoint<=EndPoint){
            System.out.println(i+" * "+Choice+" = "+i*Choice);
            StrPoint++;
            i++;
        }

    }
}
