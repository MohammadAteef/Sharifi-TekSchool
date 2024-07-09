package Java_week5;

public class ApplelComp {
    public static void main(String[] args){
         /*
    Question: Apple Comparison
    You have two apples with weights: double apple1Weight = 150.0; and double apple2Weight = 155.5;.
    Compare the weights of the two apples.

    Determine:

    If the weights are the same.
    If the weights are different.
    Print out the results of your comparisons.
*/
        double apple1Weight = 150.0;
        double apple2Weight = 155.5;
        if (apple1Weight==apple2Weight)
            System.out.println("The Weights are the same for both apple");
        else if (apple1Weight>apple2Weight) {
            System.out.println("The Weights of the apple one is more then apple2");
        }
        else
        System.out.println("The Weights of the apple2 is more then apple1");

    }
}
