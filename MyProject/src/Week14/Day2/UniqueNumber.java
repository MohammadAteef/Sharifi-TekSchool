package Week14.Day2;

import java.util.ArrayList;

public class UniqueNumber {
    public static void main(String[] args){
        int UniqueeN=0;

    int[] numbers = { 10, 15, 10, 1, 3, 5, 4, 0, 1, 1, 1, 0, 10 };
    for(int i=0; i<numbers.length-1;i++){
        UniqueeN=numbers[i];
       for(int j=1;j<i;j++) {
           if (numbers[i] != numbers[j]) {

               UniqueeN = numbers[j];

           }

       }

        System.out.println(UniqueeN);
    }


}
}
