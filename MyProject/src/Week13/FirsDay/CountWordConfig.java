package Week13.FirsDay;

public class CountWordConfig {
    // Create a method to search for a specific word in a string
// method should expect a string and a word to look for
// and return the count of the word
    static int Count=0;
    public static int CountWord(String Statement,String word){
        for(String W:Statement.split(" ")){
            if(word.equals(W))
                Count++;

        }
        return Count;
    }
    public static void main(String[] args){
        System.out.println(CountWord("Hello World ,How is the World eather","World"));
    }
}
