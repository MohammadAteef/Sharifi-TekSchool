package Java_week4;

public class Condition {
    public static void main(String[] args){
        // Declare one boolean isWeatherClear and initialize it as false
// write down an if statement that is going to check if the weather is clear
// if yes --> Print --> Yes, the weather is clear!
// else --> Print --> No, the weather is not clear!
        boolean isWeatherClear=false;
        if(isWeatherClear)
        {
            System.out.println("Yes, the weather is clear!");
        }
        else {
            System.out.println("No, the weather is not clear!");
        }



           /*
    Question 1: Weather Decisions

    1. Declare three boolean variables: isRaining, hasUmbrella, and isWindy.
    Assign any values of your choice to these variables.
    Write a condition to determine if you should go out or stay indoors. What is the result based on your values?
    Using the same variables, determine if you should take an umbrella when going out. Which conditions
    influenced your decision?
    Finally, decide if you should wear a windbreaker based on the given conditions.
*/
        boolean isRaining=true;
        boolean hasUmbrella=true;
        boolean isWindy=false;
        if (isRaining) {
            System.out.println("yes its raining");
            if (hasUmbrella)
                System.out.println("yes I have umbrella");
            else
                System.out.println("I don't have umbrella");
        }
        if (isWindy)
            System.out.println("Yes it is wendy ");


    }



}
