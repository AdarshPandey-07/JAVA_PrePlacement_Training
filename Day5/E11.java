class Person{
    Person(){
        System.out.println("This is a person in class constructor");
    }

}
class Student extends Person{
    Student(){
        super();
        System.out.println("This student class constructor");
    }
}
public class E11 {
    public static void main(String[] args) {
        Student s = new Student();
    }
    
}
