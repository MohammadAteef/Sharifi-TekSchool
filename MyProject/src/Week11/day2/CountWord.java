package Week11.day2;

public class CountWord {
    public static void main(String[] args){
        String str = "Welcome to Welcome to TekSchool Java is Java fun";
        String[] strcount=str.split(" ");

// Find the count of each word in this string
// For instance
// Welcome -> 2
// to -> 2

        for(int i=0; i< strcount.length-1; i++)
        {
            String StrCheck=strcount[0];
            int count=1;
            if(StrCheck.equals(strcount[i+1])){
                StrCheck=strcount[i+1];
                count=count+1;
                System.out.println(StrCheck+" is using "+count);
                StringBuilder SB=new StringBuilder();

            }
        }


    }
}
