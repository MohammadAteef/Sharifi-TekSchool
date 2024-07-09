package Java_week1.day6;

import java.util.Locale;

public class Example {
    public static void main(String[] args) {
        String SC = "Hello World";
        System.out.println(SC.length());
        System.out.println();
        System.out.println("**************************************************");
        System.out.println(SC.length() - 1);
        int lng = SC.length() - 1;
        System.out.println(SC.charAt(lng));
        System.out.println(SC.substring(6, SC.length() - 2));

        String message = "Hello Java Classmate";
        System.out.println(message.replace("H", "J"));
        System.out.println(message.replaceAll("Hello Java Classmate", "Hello Java World"));
        System.out.println(message.replace("Hello", "Hi"));
        System.out.println(message.replaceFirst("H", ""));

        String FName = "TONY";
        String LName = "alexander";
        System.out.println(FName.toLowerCase());
        System.out.println(LName.toUpperCase());
        String msg = "Ahmad   @gmail.com";
        System.out.println(msg.replace(" ", ""));
        System.out.println(msg.subSequence(0, 5));
        String std = "I am a good Student in Java Class";
        
    }

}
