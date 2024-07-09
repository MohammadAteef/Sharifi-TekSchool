package Java_week5;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args){
      String[] BookTitle=new String[4];
      System.out.println("Please enter books titles");
      Scanner SC=new Scanner(System.in);
        BookTitle[0]=SC.next();
        BookTitle[1]=SC.next();
        BookTitle[2]=SC.next();
        BookTitle[3]=SC.next();
        System.out.println(BookTitle[0]);
        System.out.println(BookTitle[1]);
        System.out.println(BookTitle[2]);
        System.out.println(BookTitle[3]);



    }
}
