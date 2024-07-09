package Java_week4;

import java.util.Scanner;

public class Smaple {
    public static void main(String[] args)
    {
        String msg="Hello, Java Bootcamp!";
        System.out.println("the string length is "+msg.length());

        String str1="Java";
        String str2="script";
        System.out.println("the string "+str1+str2+" is and the length of it "+(str1+str2).length());

        String St="How many letters are in this sentence?";
        String St2=St.replace(" ","");
        System.out.println("the length is "+St2.length());
        System.out.println("***** ****** ************ **************");
      //  String StrJava="Hello Java World";
      //  int firstIndex=StrJava.indexOf("Java");
       // int lastIndex=StrJava.lastIndexOf(St);
       // System.out.println(StrJava.substring(firstIndex,lastIndex));
        System.out.println("***** ****** ************ **************");

        String message="programming";
        System.out.println(message.substring(3));

        String Msg="bootcamp";
       // System.out.println(Msg.substring(0,4));
        int Findex=Msg.indexOf("b");
        int Lindex=Msg.indexOf("t")+1;
        System.out.println(Msg.substring(Findex,Lindex));

        String S="Programming";
        System.out.println(S.charAt(5));

        String STR="Learning Java is fun";
        int a=STR.length()/2;
        a--;
        System.out.println("the Middle is "+a);
        System.out.println(STR.charAt(a));

        //*   Write a Java program to replace all occurrences of 'a' with '@' in the string "Java Basics".
        //*    Expected Output: J@v@ B@sics


        String S1="Java Basics";
        System.out.println(S1.replace("a","@"));

        System.out.println("***** ****** ************ **************");

        String S3="flood door";
        String S4=S3.replace("o","e");
        System.out.println(S4);







    }
}
