package Week11.day1;

public class Employee {
    private int ID;
    private String EmployeeFirstName;
    private String EmployeeLastName;
    private String EmployeeAddress;
    private String EmployeeJobTitle;
    private String EmployeeShift;
    private double EmployeeSalary;
    public Employee(String FName,String LName,String Address,String JobTitle,String Shift,double Salary){
        this.EmployeeFirstName=FName;
        this.EmployeeLastName=LName;
        this.EmployeeAddress=Address;
        this.EmployeeJobTitle=JobTitle;
        this.EmployeeShift=Shift;
        this.EmployeeSalary=Salary;

    }

    public int getID() {
        return ID;
    }

    public String getEmployeeFirstName() {
        return EmployeeFirstName;
    }

    public String getEmployeeLastName() {
        return EmployeeLastName;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public String getEmployeeJobTitle() {
        return EmployeeJobTitle;
    }

    public String getEmployeeShift() {
        return EmployeeShift;
    }

    public double getEmployeeSalary() {
        return EmployeeSalary;
    }
}
