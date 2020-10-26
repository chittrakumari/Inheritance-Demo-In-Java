package Derived;
import Base.Person;
public class Student extends Person {
    public int roll;
    public int sem;
    public String course;

    public Student(String email, String name, int roll, int sem, String course) {
        super(email, name);
        this.roll = roll;
        this.sem = sem;
        this.course = course;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public void display(){
        super.display();
        System.out.println("roll: "+roll+" sem: "+"course: "+course);
    }
}
