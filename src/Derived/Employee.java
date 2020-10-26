package Derived;
import Base.Person;
public class Employee extends Person {
    private int empSalary;
    private int empId;
    public void setEmpSalary(int sal){
        this.empSalary=sal;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getEmpSalary() {
        return empSalary;
    }
    public int getEmpId() {
        return empId;
    }
    public void display(){
        super.display();
        System.out.println("employeeSalary "+empSalary+"empId "+empId);
}


}
