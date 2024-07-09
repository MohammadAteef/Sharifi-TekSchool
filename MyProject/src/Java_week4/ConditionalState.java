package Java_week4;

public class ConditionalState {
    public static void main(String[] args){
          /*
    Question: Favorite Color Picker

    You have two color options: String color1 = "Red"; and String color2 = "Blue";.
    You like the color "Red" more than "Blue".
    Using the conditional operator, determine which color is your favorite.
    Store your favorite color in a variable called favoriteColor.
    Print out your favorite color. What is the color?
*/
        String color1="Red";
        String color2="Blue";
        System.out.println("which color you like among Red and Blue");
        String FavoriteColor=(color1.equals("Red") ? color1:color2);
        System.out.println("my Favorite color is "+FavoriteColor);


    }
}
