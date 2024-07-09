package Java_week5;

import java.util.Locale;
import java.util.Scanner;

public class CalcSample {
    public static void main(String[] args){
        System.out.println("Welcome to my Basic Calculator");
        System.out.println("**** **** **** **** **** **** **** **** ****");
        System.out.println("Do you want to do some basic calculation?");
        System.out.println("enter your Choice for Yes 'y' and for No 'n'");
        Scanner SC=new Scanner(System.in);
        String Choice=SC.nextLine().toLowerCase(Locale.ROOT);
        if(Choice.equals("y")){
            System.out.println("Select your Calculation Choice");
            System.out.println("1:Addition(+)\n2:Subtraction(-)\n3:Multiplication(*)\n4:Division(/)");
            int CalcChoice=SC.nextInt();
            if (CalcChoice==1) {
                System.out.println("select number of operand involve in Addition");
                System.out.println("1:Two Number\n2:Three Number\n3:Four Number");
                int AddChoice=SC.nextInt();
                switch (AddChoice){
                    case 1:
                        System.out.println("enter your First Digit");
                        double AddFirstDigit=SC.nextDouble();
                        System.out.println("enter your Second Digit");
                        double AddSecondDigit=SC.nextDouble();
                        double AddTwoDigitResult=AddFirstDigit+AddSecondDigit;
                        System.out.println("The result of Addition is "+AddTwoDigitResult);
                        break;
                    case 2:
                        System.out.println("enter your First Digit");
                        double Add2FirstDigit=SC.nextDouble();
                        System.out.println("enter your Second Digit");
                        double Add2SecondDigit=SC.nextDouble();
                        System.out.println("enter your Third Digit");
                        double Add2ThirdDigit=SC.nextDouble();
                        double AddThreeDigitResult=Add2FirstDigit+Add2SecondDigit+Add2ThirdDigit;
                        System.out.println("The result of Addition is "+AddThreeDigitResult);
                        break;
                    case 3:
                        System.out.println("enter your First Digit");
                        double Add3FirstDigit=SC.nextDouble();
                        System.out.println("enter your Second Digit");
                        double Add3SecondDigit=SC.nextDouble();
                        System.out.println("enter your Third Digit");
                        double Add3ThirdDigit=SC.nextDouble();
                        System.out.println("enter your Fourth Digit");
                        double Add3FourthDigit=SC.nextDouble();
                        double AddFourthDigitResult=Add3FirstDigit+Add3SecondDigit+Add3ThirdDigit+Add3FourthDigit;
                        System.out.println("The result of Addition is "+AddFourthDigitResult);
                        break;
                    default:
                        System.out.println("You didn't select the right Choice");

                }

            } else if (CalcChoice==2) {
                System.out.println("select number of operand involve in Subtraction");
                System.out.println("1:Two Number\n2:Three Number\n3:Four Number");
                int SubChoice=SC.nextInt();
                switch (SubChoice){
                    case 1:
                        System.out.println("enter your first Digit");
                        double Sub1FirstDigit=SC.nextDouble();
                        System.out.println("enter your Second Digit");
                        double Sub1SecondDigit=SC.nextDouble();
                        double Sub1Result=Sub1FirstDigit-Sub1SecondDigit;
                        System.out.println("The subtraction result is "+Sub1Result);
                        break;
                    case 2:
                        System.out.println("enter your first Digit");
                        double Sub2FirstDigit=SC.nextDouble();
                        System.out.println("enter your Second Digit");
                        double Sub2SecondDigit=SC.nextDouble();
                        System.out.println("enter your Third Digit");
                        double Sub2ThirdDigit=SC.nextDouble();
                        double Sub2Result=Sub2FirstDigit-Sub2SecondDigit-Sub2ThirdDigit;
                        System.out.println("The subtraction result is "+Sub2Result);
                        break;
                    case 3:
                        System.out.println("enter your first Digit");
                        double Sub3FirstDigit=SC.nextDouble();
                        System.out.println("enter your Second Digit");
                        double Sub3SecondDigit=SC.nextDouble();
                        System.out.println("enter your Third Digit");
                        double Sub3ThirdDigit=SC.nextDouble();
                        System.out.println("enter your Fourth Digit");
                        double Sub3FourthDigit=SC.nextDouble();
                        double Sub3Result=Sub3FirstDigit-Sub3SecondDigit-Sub3ThirdDigit-Sub3FourthDigit;
                        System.out.println("The subtraction result is "+Sub3Result);
                        break;
                    default:
                        System.out.println("You didn't select the right Choice");
                }

            } else if (CalcChoice==3) {
                System.out.println("select number of operand involve in Multiplication");
                System.out.println("1:Two Number\n2:Three Number\n3:Four Number");
                int MulChoice=SC.nextInt();
                switch (MulChoice){
                    case 1:
                        System.out.println("Enter your first Digit");
                        double Mul1FirstDigit=SC.nextDouble();
                        System.out.println("Enter your Second Digit");
                        double Mul1SecondDigit=SC.nextDouble();
                        double Mul1Result=Mul1FirstDigit*Mul1SecondDigit;
                        System.out.println("the multiplication result is "+Mul1Result);
                        break;
                    case 2:
                        System.out.println("Enter your first Digit");
                        double Mul2FirstDigit=SC.nextDouble();
                        System.out.println("Enter your Second Digit");
                        double Mul2SecondDigit=SC.nextDouble();
                        System.out.println("Enter your Third Digit");
                        double Mul2ThirdDigit=SC.nextDouble();
                        double Mul2Result=Mul2FirstDigit*Mul2SecondDigit*Mul2ThirdDigit;
                        System.out.println("the multiplication result is "+Mul2Result);
                        break;
                    case 3:
                        System.out.println("Enter your first Digit");
                        double Mul3FirstDigit=SC.nextDouble();
                        System.out.println("Enter your Second Digit");
                        double Mul3SecondDigit=SC.nextDouble();
                        System.out.println("Enter your Third Digit");
                        double Mul3ThirdDigit=SC.nextDouble();
                        System.out.println("Enter your Fourth Digit");
                        double Mul3FourthDigit=SC.nextDouble();
                        double Mul3Result=Mul3FirstDigit*Mul3SecondDigit*Mul3ThirdDigit*Mul3FourthDigit;
                        System.out.println("the multiplication result is "+Mul3Result);
                        break;
                    default:
                        System.out.println("You didn't select the right Choice");
                }

            } else if (CalcChoice==4) {
                System.out.println("select number of operand involve in division");
                System.out.println("1:Two Number\n2:Three Number\n3:Four Number");
                int DivChoice=SC.nextInt();
                switch (DivChoice){
                    case 1:
                        System.out.println("Enter your first Digit");
                        double FirstDigit=SC.nextInt();
                        System.out.println("Enter your Second Digit");
                        double SecondDigit=SC.nextInt();
                        double DivTwoDigitResult=FirstDigit/SecondDigit;
                        System.out.println("The Result is "+DivTwoDigitResult);
                        break;
                    case 2:
                        System.out.println("Enter your first Digit");
                        double FirstDigit2=SC.nextDouble();
                        System.out.println("Enter your Second Digit");
                        double SecondDigit2=SC.nextDouble();
                        System.out.println("Enter your Third Digit");
                        double ThirdDigit2=SC.nextDouble();
                        double DivThDigitResult2=FirstDigit2/SecondDigit2/ThirdDigit2;
                        System.out.println("The Result is "+DivThDigitResult2);
                        break;
                    case 3:
                        System.out.println("Enter your first Digit");
                        double FirstDigit3=SC.nextDouble();
                        System.out.println("Enter your Second Digit");
                        double SecondDigit3=SC.nextDouble();
                        System.out.println("Enter your Third Digit");
                        double ThirdDigit3=SC.nextDouble();
                        System.out.println("Enter your Fourth Digit");
                        double FourthDigit3=SC.nextDouble();
                        double DivFDigitResult3=FirstDigit3/SecondDigit3/ThirdDigit3/FourthDigit3;
                        System.out.println("The Result is "+DivFDigitResult3);
                        break;
                    default:
                        System.out.println("You didn't select from Choice");
                }

            } else
                System.out.println("You entered the Wrong decision");

        } else if (Choice.equals("n")) {
            System.out.println("Have a nice time");
            SC.close();
          }else
            System.out.println("You entered the wrong Choice");

    }
}
