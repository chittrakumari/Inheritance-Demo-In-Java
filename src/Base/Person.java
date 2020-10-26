package Base;
public class Person {
    private String email;
    private String name;
    public Person(){
        name=null;
        email=null;
    }
    public Person(String email,String name){
        this.email=email;
        this.name=name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public void display(){
        System.out.println("name: "+name+" email: "+email);
}
}

