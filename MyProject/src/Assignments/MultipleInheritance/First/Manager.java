package Assignments.MultipleInheritance.First;

public class Manager extends Employee {
    private String Department;
    public Manager(int EmpID,String EmpName,double EmpSalary,String Department){
        super(EmpID,EmpName,EmpSalary);
        this.Department=Department;

    }

    public void setDepartment(String department) {
        Department = department;
    }
}
