package Week14.Day2;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        int[] numbers = { 10, 15, 10, 1, 3, 5, 4, 0, 1, 1, 1, 0, 10 };
        HashSet<Integer> UniqueNumber=new HashSet<>();
        for(int N:numbers){
            if(UniqueNumber.add(N)){
                System.out.println(N);
            }
        }

    }
}
