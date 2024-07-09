package Java_week5;

public class NewExample {
    public static void main(String[] args){
        /*
         *
         * Given a String of message
         *
         * String message = "Learning java is fun!";
         * Using loops. print all characters of this String by using toCharArray()
         *
         * */
        String message = "Learning java is fun!";
        int i=0;
        char[] arr;
        while (i<message.length()){
            arr=message.toCharArray();
            System.out.print(arr[i]);
            i++;

        }


    }
}
