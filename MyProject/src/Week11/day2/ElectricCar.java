package Week11.day2;

public class ElectricCar extends Vehicle {
    private String Battery;

    public ElectricCar(String Model, String Make, String Year, String battery) {
        super(Model, Make, Year);
        Battery = battery;
    }

    public String getBattery() {
        return Battery;
    }
}
