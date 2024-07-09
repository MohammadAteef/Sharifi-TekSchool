package Week14.Day1;

import java.util.ArrayList;

public class CollectionExample {
    public static void main(String[] args){
        String[] Names={"Ahmad","Mahmood","Asad"};
        ArrayList<String> Name=new ArrayList<>();
        for(String N:Names){
            Name.add(N);
        }
        System.out.println(Name);
    }
}
