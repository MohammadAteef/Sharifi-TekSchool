package Java_week4;

import java.util.Scanner;

public class TesExample {
    public static void main(String[] args){
        /*
         *
         * Monday        -- 1
         * Tuesday       -- 2
         * Wednesday     -- 3
         * Thursday      -- 4
         * Friday        -- 5
         * Saturday      -- 6
         * Sunday        -- 7
         *
         * */
        System.out.println("Please enter day of the week");
        Scanner SC=new Scanner(System.in);
        String WeekDay=SC.next();
        switch (WeekDay) {
            case "Monday":
                System.out.println("the day is Monday");
                break;
            case "Tuesday":
                System.out.println("the day is Tuesday");
                break;
            case "Wednesday":
                System.out.println("the day is Wednesday");
                break;
            case "Thursday":
                System.out.println("the day is Thursday");
                break;
            case "Friday":
                System.out.println("the day is Friday");
                break;
            case "Saturday":
                System.out.println("the day is Satarday");
                break;
            case "Sunday":
                System.out.println("the day is Sunday");
                break;

            default:
                System.out.println("You entered the name which is not in WeekDay");



        }




    }
}
