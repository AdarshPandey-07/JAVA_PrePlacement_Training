class A{
    public A(){
        System.out.println("Parent Constructor");
    }
    
    public void speedShow(){
        System.out.println("I am parent class speed");
    }
} 

class B extends A{
    public B(){
    super();
    System.out.println("Child Constructor");
}
    
    public void speedShow(){
        System.out.println("I am child class speed");
        super.speedShow();
    }
} 
public class Superconstructor {
     
    public static void main(String[] args) {
        B b = new B();
        b.speedShow();
    }      
}
