package Java_week5;

import java.util.Scanner;

public class GameExample {
    public static void main(String[] args){
          /*
    Online Game Access
    Objective: Check if a user can access a specific level in an online game.
    A user wants to access a special level in a game.
    The requirements are that the user must either be a VIP member or have played the game for
    more than 100 hours.
    The user provides their details:
    boolean isVIP = false;
    int gameHoursPlayed = 105;
    (Both values can be changed for testing)
    Determine if the user can access the special level.
    if VIP member or hoursPlayed is greater than 100
    Print out if the user has access or not.
*/
        int vip=1;
        int[] accesshr={25,50,75,100};
        Scanner SC=new Scanner(System.in);
        System.out.println("PLease enter your VIP Number");
        int grant=SC.nextInt();
        int HrAccess;
        if(grant==vip){
            System.out.println("You are VIP Member");
            HrAccess=accesshr[3];
            System.out.println("You are granted 100 Hr");

        }
    }
}
