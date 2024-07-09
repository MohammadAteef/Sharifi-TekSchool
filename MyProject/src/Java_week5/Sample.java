package Java_week5;
import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        int Securitycode=1234;
        int Numberoftry=1;
                do {
                    System.out.println("Please enter the code");
                    Scanner SC=new Scanner(System.in);
                    int EnteredCode=SC.nextInt();
                    if (Securitycode == EnteredCode) {
                        System.out.println("Access granted!");
                        break;
                    }
                    else {
                        System.out.println("Access is denied");
                    }
                    System.out.println("You can try "+(5-Numberoftry)+" mor times");
                    Numberoftry++;
                    continue;

                } while (Numberoftry<=5);
    }
}
