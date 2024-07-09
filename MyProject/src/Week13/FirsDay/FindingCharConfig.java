package Week13.FirsDay;

public class FindingCharConfig {
    // String message = "Hello World"
// Design a method which will expect a string and a character to look for in a string
// and return the number occurrence of the character in the string.
    int Count=0;
    public int CountChar(String Str,char C){
        for(int i=0; i<Str.length()-1; i++){
            if(Str.charAt(i)==C){
                Count++;
            }
        }
        return Count;
    }
    public static void main(String[] args){
        FindingCharConfig obj=new FindingCharConfig();
       System.out.println(obj.CountChar("Hello and Hey Dear",'e'));
    }

}
