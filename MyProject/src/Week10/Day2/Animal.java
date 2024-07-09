package Week10.Day2;

public class Animal {
      public final String Name;
      public final int age;
    public Animal(String name, int age) {
        this.Name = name;
        this.age = age;
        DisplayAnimalInformation();
    }
    private void DisplayAnimalInformation(){
        System.out.println(Name);
        System.out.println(age);
    }
    /*
Steps:

Define a superclass Animal with attributes name and age.
Define a subclass Dog inheriting from Animal with an additional attribute breed.
Implement a constructor for the superclass Animal that initializes its attributes.
Implement a constructor for the subclass Dog that initializes its attributes and calls the superclass
constructor using the super keyword.
Create an instance of Dog in the main method.
Set values for the attributes of the Dog object.
Access and display the attributes of both the superclass Animal and the subclass Dog using getter methods.
Compile and run the program to verify the output.
 */
}
