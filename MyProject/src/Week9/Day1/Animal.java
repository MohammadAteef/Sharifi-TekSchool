package Week9.Day1;

public class Animal {
    String AnimalName,AnimalType;
    String AnimalMovement;
    public Animal(String AnimalName,String AnimalType,String AnimalMove){
        this.AnimalName=getAnimalName();
        this.AnimalType=getAnimalType();
        this.AnimalMovement=getAnimalMovement();
        SetAnimalName(AnimalName);
        SetAnimalType(AnimalType);
        SetAnimalMove(AnimalMove);
    }
    public String getAnimalName() {
        return AnimalName;
    }
    public String getAnimalType(){
        return AnimalType;
    }
    public String getAnimalMovement() {
        return AnimalMovement;
    }
    public void SetAnimalName(String AnimalName){
        this.AnimalName=AnimalName;
    }
    public void SetAnimalType(String AnimalType){
        this.AnimalType=AnimalType;
    }
    public void SetAnimalMove(String AnimalMovement){
        this.AnimalMovement=AnimalMovement;
    }
    public void ShowAnimalINformation(){
        System.out.println(AnimalName);
        System.out.println(AnimalType);
        System.out.println(AnimalMovement);
    }
}
