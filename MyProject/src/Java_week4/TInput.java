package Java_week4;


import java.util.Scanner;

public class TInput {
    public static void main(String[] args)
    {
        String phoneNumber;
        String firstName;
        String lastName;
        double salary;
        String city;
        Scanner SCS=new Scanner(System.in);
        System.out.println("Please enter Phone Number");
        phoneNumber=SCS.nextLine();
        System.out.println("Please enter First Name");
        firstName=SCS.nextLine();
        System.out.println("Please enter Last Name");
        lastName=SCS.nextLine();
        System.out.println("Please enter the Salary");
        salary=SCS.nextDouble();
        System.out.println("the Phone number is "+phoneNumber+" And the FirstName is "+firstName+" And the Last Name is "+lastName+" And the Salary is "+salary);

        /*
         *
         * Print the entire information of employee
         * */

       // int id;
       // String FName;
       // String LName;
       // Scanner SC=new Scanner(System.in);
       // System.out.print("Please enter ID ");
      //  id=SC.nextInt();
       // System.out.println("Please enter FirstName ");
      //  FName=SC.next();
      //  System.out.println("Please enter LastName ");
      //  LName=SC.next();
       // System.out.println("the ID is "+id+" And the FirstName is "+FName+" And the Last Name is "+LName);

    }
}
