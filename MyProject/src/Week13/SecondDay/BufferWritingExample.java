package Week13.SecondDay;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWritingExample {
    public static void main(String[] args){
        //File file=new File("Sample.txt");
        try {
        BufferedWriter BRW=new BufferedWriter(new FileWriter("Simple.txt"));
        BRW.write("Hello World!");
        BRW.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
