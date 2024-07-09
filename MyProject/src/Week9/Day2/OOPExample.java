package Week9.Day2;
import java.util.Random;
import java.util.Scanner;
public class OOPExample {
    private int ArraySize;
    private int[] Arr;
    public static void main(String[] args){
        OOPExample obj=new OOPExample();
        obj.SetArraySize();
        obj.AssignValueOfArray();
    }
    private void SetArraySize(){
        Scanner SC=new Scanner(System.in);
        System.out.println("Please enter the Size of Array");
        ArraySize=SC.nextInt();
        Arr=new int[ArraySize];
    }
    private void AssignValueOfArray(){
        Random RNumber=new Random();
        for(int i=0; i<ArraySize; i++){
            Arr[i]=RNumber.nextInt(50);
        }
        for(int i=0; i<ArraySize;i++){
            if(Arr[i]%2==0){
                System.out.println(Arr[i]);
            }
        }

    }
}
