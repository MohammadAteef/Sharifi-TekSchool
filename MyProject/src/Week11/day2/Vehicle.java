package Week11.day2;
public class Vehicle {
    private String Model;
    private String Make;
    private String Year;
    public Vehicle(String Model,String Make,String Year){
        this.Model=Model;
        this.Make=Make;
        this.Year=Year;
    }
    public void ShowCarInfo(){
        System.out.println(getMake());
        System.out.println(getModel());
        System.out.println(getYear());
    }
    public void Start(){
        System.out.println("The Vehicle Start!");
    }
    public void Stop(){
        System.out.println("The Vehicle Stop!");
    }
    public String getModel() {
        return Model;
    }

    public String getMake() {
        return Make;
    }

    public String getYear() {
        return Year;
    }
}
