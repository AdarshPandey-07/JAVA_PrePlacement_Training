/** multi level inheritance */

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
class C extends B{
    public void showC(){
        System.out.println("I am in c");
    }
}


public class E2 {
    public static void main(String[] args){
        B obj = new B();
        obj.showA();
        obj.showB();
        C obj1 = new C();
        obj1.showA();
        obj1.showB();
        obj1.showC();
    }
    
}
 
    

