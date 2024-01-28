/** Single Inheritance */

class A{
    public void showA(){
        System.out.println("I am in A");
    }
}
class B extends A{
    public void showB(){
        System.out.println("I am in B");
    }


}


public class E1 {
    public static void main(String[] args){
        B obj = new B();
        obj.showA();
        obj.showB();
    }
    
}
