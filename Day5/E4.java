/**Constructor calling hierarchy
 * 
 */
class A{
    public A(){
        System.out.println( "class A constructor");
    }
    public void showA(){
        System.out.println("class A show");
    }
}
class B extends A{
    public B(){
        System.out.println( "class B constructor");
    }
    public void showB(){
        System.out.println("class B show");
    }
}
public class E4 {
    public static void main(String[] args) {
        B obj = new B();
        obj.showB();
    }
    
}
