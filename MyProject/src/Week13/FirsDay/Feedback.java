package Week13.FirsDay;
import java.util.Scanner;

public class Feedback {
    private  String[] arr;
    private int Size;
    public void FillArray(){
        Scanner SC=new Scanner(System.in);
        System.out.println("Please enter Size of Array");
        Size=SC.nextInt();
        arr=new String[Size];
        for(int i=0; i<Size;i++){
            System.out.println("please enter the user Name");
            arr[i]=SC.next();
        }

    }
    public void DisplayUserName(){
        for (int j=0; j<Size; j++){
            System.out.println(arr[j]);
        }
    }

}
