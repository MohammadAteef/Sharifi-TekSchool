package Week13.FirsDay;
public class StringConfig {
     private int count=0;

    public StringConfig(String arr) {
        for(int i=0; i<arr.length()-1; i++) {
            if(arr.charAt(i)==' '){
                count = count + 1;
            }

        }
    }

    public int getCount() {
        return count;
    }
}
