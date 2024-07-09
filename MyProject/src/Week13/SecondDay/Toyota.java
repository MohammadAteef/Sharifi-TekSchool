package Week13.SecondDay;

public class Toyota extends Vehicle {
    public Toyota(String CompanyName, int Speed) {
        super(CompanyName, Speed);
    }
    @Override
    public void MachineStart(){
        System.out.println("Toyota engineStart ");
    }
}
