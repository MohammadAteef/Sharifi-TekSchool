package Week13.SecondDay;
public class Vehicle {
    String CompanyName;
    int Speed;
    public Vehicle(String CompanyName, int Speed){
        this.CompanyName=CompanyName;
        this.Speed=Speed;
    }
    public void MachineStart(){
        System.out.println("the Vehicle Start");
    }

    private String getCompanyName() {
        return CompanyName;
    }

    private int getSpeed() {
        return Speed;
    }
    public void DisplayVehicleInfo(){
        System.out.println(getCompanyName());
        System.out.println(getSpeed());
    }
}
