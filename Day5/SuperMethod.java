class A{
    public void speedShow(){
        System.out.println("I am parent class speed");
    }
} 

class B extends A{
    public void speedShow(){
        System.out.println("I am child class speed");
        super.speedShow();
    }
} 
public class SuperMethod {
       
    public static void main(String[] args) {
        B b = new B();
        b.speedShow();
    }      
}
