package Java_week9.Day3;

import java.util.Scanner;

public class RunnerClass {
    public static void main(String[] args){
        System.out.println("Please Select the Choice");
        System.out.println("1.Celsius To Fahrenhite\n2.Fahrenhite To Celsius");
        Scanner SC=new Scanner(System.in);
        int Choice=SC.nextInt();
        switch (Choice){
            case 1:
                System.out.println("Please enter Celsius to change to Fahrenhite");
                double Celsius=SC.nextDouble();
                OOPExample objS=new OOPExample();
                System.out.println("The Fahrenhite For the "+Celsius+" is "+objS.CelsiusToFahrenheit(Celsius));
            case 2:
                System.out.println("Please enter Fahrenhite to change to Celsius");
                double Fahrenhit=SC.nextDouble();
                OOPExample objF=new OOPExample();
                System.out.println("The Celsius For the "+Fahrenhit+" is "+objF.CelsiusToFahrenheit(Fahrenhit));
            default:
                System.out.println("you enter the wrong Choice");
        }

    }
}
