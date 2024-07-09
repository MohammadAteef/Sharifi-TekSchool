package Java_week9.Day3;

public class OOPExample {
    // Create a method which is going to Covert C to F
// Call & Test your Method.
// F = (°C × 9/5) + 32
// C = (°F − 32) x 5/9
    public double CelsiusToFahrenheit(double Celsius){
        double F=(Celsius*9/5)+32;
        return F;

    }
    public double FahrenheitToCelsius(double Fahrenhit){
        double C=(Fahrenhit-32)*5/9;
        return C;

    }

}
