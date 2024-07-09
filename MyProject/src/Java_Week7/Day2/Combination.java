package Java_Week7.Day2;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args){
       for(int r=1; r<=8; r++){
           for(int c=1; c<=r; c++){
               System.out.print(" * ");
           }
           System.out.println();
       }

    }
}
