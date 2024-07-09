package Assignments.MultipleInheritance.First;

public class Employee {
    private int EmpID;
    private String EmpName;
    private double Salary;
    public Employee(int EmpID,String EmpName,double EmpSalary){
        this.EmpID=EmpID;
        this.EmpName=EmpName;
        Salary=EmpSalary;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
