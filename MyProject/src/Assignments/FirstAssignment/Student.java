package Assignments.FirstAssignment;

public class Student extends Person {
    private int StudentID;
    public Student(String Name,int Age,int ID){
        super(Name,Age);
        this.StudentID=ID;

    }
    public int getStudenId( int StdID){
        return StdID;
    }
    public void DisplayStudentInfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getStudenId(StudentID));
    }
}
