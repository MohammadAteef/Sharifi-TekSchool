package Week11.day2;

public class Car extends Vehicle {
    private int NumberOfDoors;
    private double EngineSize;

    public Car(String Model, String Make, String Year, int numberOfDoors, double engineSize) {
        super(Model, Make, Year);
        NumberOfDoors = numberOfDoors;
        EngineSize = engineSize;
        Start();
        ShowCarInfo();
        System.out.println("the engine size is "+getEngineSize());
        System.out.println("The number of doors is "+getNumberOfDoors());
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public double getEngineSize() {
        return EngineSize;
    }
}
