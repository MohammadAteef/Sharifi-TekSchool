package Java_week1.day3;

public class Test {
    static int b=44;
    public static void main(String[] args){

        for(int i=1; i<=50; i++) {

            if(i%2==1){
                System.out.println("the number "+i+" is odd ");
            }
            else {
                System.out.println("the number "+i+" is even ");
            }

        }

        String Fname="Ahmad";
        System.out.println(Fname.length());
        System.out.println(Fname.charAt(3));


    }
}
