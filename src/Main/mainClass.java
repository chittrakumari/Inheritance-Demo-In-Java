package Main;
import Base.Person;
import Derived.Employee;
import Derived.Student;
import java.util.Scanner;
public class mainClass {
    public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
        System.out.println("enter email");
    String em=obj.nextLine();
        System.out.println("name");
    String nm=obj.nextLine();
        System.out.println("enter roll no");
    int rollNo=obj.nextInt();
        System.out.println("enter semester");
    int sems=obj.nextInt();
    obj.nextLine();
        System.out.println("enter course");
    String cour=obj.nextLine();
    Person object=new Student(em,nm,rollNo,sems,cour);
    object.display();
    Employee emp=new Employee();
    emp.display();
}
}
