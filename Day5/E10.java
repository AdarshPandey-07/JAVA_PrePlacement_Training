class person{
    void message(){
        System.out.println("I am a person in class");
    }
}
class Student extends person{
    void message(){
        System.out.println("I am a student in class");
    }
    void Display(){
        message();
        super.message();
    }
}


public class E10{
    public static void main(String[] args) {
        Student s = new Student();
        s.Display();
    }
}