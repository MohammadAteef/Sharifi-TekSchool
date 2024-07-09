package Java_week5;

import java.util.Scanner;

public class teamPractice {
    public static void main(String[] args){
         /*    Sports Ranking:
    Objective: Maintain a leaderboard of top 5 sports teams and display the top team.
    Steps:
    Declare a 1D array to hold the names of 5 teams.
    Populate the array with names based on their ranking.
    To find the top-ranked team, access the element at index 0.
    Print the name of the top-ranked team.
*/
        String[] team={"Dragon","Titan","Pioneer","Tiger","Lion"};
        int C=0;
        for(int i=0; i<team.length; i++) {
            System.out.print(++C+":"+team[i] + " ");
        }
        System.out.println("***********************************");
        System.out.println("Please select which team is in top");
        Scanner SC=new Scanner(System.in);
        int rank=SC.nextInt();
        switch (rank) {
            case 1:
                System.out.println("the top team is "+team[0]);
            case 2:
                System.out.println("the top team is "+team[1]);
            case 3:
                System.out.println("the top team is "+team[2]);
            case 4:
                System.out.println("the top team is "+team[3]);
            case 5:
                System.out.println("the top team is "+team[4]);
            default:
                System.out.println("You entered the wrong choice");
        }






    }
}
