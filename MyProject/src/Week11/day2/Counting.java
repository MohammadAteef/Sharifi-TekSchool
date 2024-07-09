package Week11.day2;

public class Counting {
    public static void main(String[] args){
        String strTwo = "Hello JAVA12903809123809123(#*&%(*@#&%#!@&*%(!%123123132";
        char[] ch=strTwo.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char c: ch){
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }

}
