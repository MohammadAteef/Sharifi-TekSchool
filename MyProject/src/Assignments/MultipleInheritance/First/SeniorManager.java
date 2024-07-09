package Assignments.MultipleInheritance.First;

public class SeniorManager {
    private int YearsOfExperience;
    public SeniorManager(int EmpID,String EmpName,double EmpSalary,String EmpDepartment,int YearsOfExperience){
        super();
        this.YearsOfExperience=YearsOfExperience;
    }

    public int getYearsOfExperience() {
        return YearsOfExperience;
    }
    public double getSalaryBonus(double Salary,int yearsOfExperience){
        return (Salary/YearsOfExperience*10);
    }
}
