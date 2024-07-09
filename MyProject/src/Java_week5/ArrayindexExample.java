package Java_week5;

import java.util.Scanner;

public class ArrayindexExample {
    public static void main(String[] args){
             String[] studentNames = {
            "mathias", "mahdi", "farhad", "Heala", "saqib",
            "wahidullah", "saliman", "mehwand", "abdul samad",
            "fazil omer", "rostam", "amena", "mansoor", "mostepha",
            "crystal", "darya", "hamed", "khatira", "hasibullah",
            "wasim", "safiullah", "maryam", "maya", "zubaida", "masnoor"};
             for(String ext:studentNames){
                 System.out.print(ext+" ");
             }
             System.out.println("\nPlease enter your name from the list");
             Scanner SC=new Scanner(System.in);
             String name=SC.next();
             for (int i=0; i<studentNames.length; i++){
                 if(name.equals(studentNames[i])){
                     System.out.println("the index of the name that you select is "+i);
                 }
             }

        /*
         * Write a java program that if we ask for X value it should display the number of records
         * in that array
         * String name = "mathias";
         * Expected output:
         * */

    }
}
