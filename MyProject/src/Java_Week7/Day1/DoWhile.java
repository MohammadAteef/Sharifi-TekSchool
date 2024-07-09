package Java_Week7.Day1;

public class DoWhile {
    public static void main(String[] args){
       int [][] arr={{1,2,3},{1,2,3},{1,2,3}};
       for(int r=0; r< arr.length; r++){
           for (int c=0; c< arr.length; c++) {
               System.out.print(arr[r][c]);
           }
           System.out.println();
       }


    }

}
