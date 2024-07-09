package Java_week9.Day1;

import java.util.Scanner;

public class Test {
    int ID;
    String FirstName,LastName,Gender,DateOfBirth,Occupation;
    public void PrintUserProf(){
        System.out.println("ID= "+ID);
        System.out.println("First Name= "+FirstName);
        System.out.println("Last Name= "+LastName);
        System.out.println("Gender= "+Gender);
        System.out.println("Date of Birth= "+DateOfBirth);
        System.out.println("Occupation= "+Occupation);
    }
    public void UserInput(){
        Scanner SC=new Scanner(System.in);
        System.out.println("Please enter the"+"\u001B[31m"+" ID");
        ID=SC.nextInt();
        System.out.println("Please enter First Name for the User");
        FirstName=SC.next();
        System.out.println("Please enter Last Name for the User");
        LastName=SC.next();
        System.out.println("Please enter Gender for the User");
        Gender=SC.next();
        System.out.println("Please enter Date Of Birth for the User");
        DateOfBirth=SC.next();
        System.out.println("Please enter Occupation for the User");
        Occupation=SC.next();

    }


}
